package com.example.HMS_MANAGEMENT.control;

import com.example.HMS_MANAGEMENT.dto.CustomerDto;
import com.example.HMS_MANAGEMENT.dto.SalesDto;
import com.example.HMS_MANAGEMENT.entity.CustomerEntity;
import com.example.HMS_MANAGEMENT.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Controller
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    //페이징수
    @GetMapping("/customer/cusList")
    public String cusList(@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "5") int size, Model model) {
        Pageable pageable = PageRequest.of(page, size);
        Page<CustomerEntity> customerPage = customerService.getAllCustomer(pageable);

        model.addAttribute("customers", customerPage.getContent());
        model.addAttribute("totalPages", customerPage.getTotalPages());
        model.addAttribute("currentPage", page);

        return "customer/cusList";

    }
    @GetMapping("/customer/cusReg")
    public String cusReg(Model model) {
        model.addAttribute("customerDto", new CustomerDto());
        return "customer/cusReg";
    }

    // 등록 후 고객정보로 이동 컨트롤러
    @PostMapping("/customer/cusReg")
    public String saveCustomer(@Valid @ModelAttribute("customerDto") CustomerDto customerDto, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("customerDto", customerDto);
            return "customer/cusReg";
        }
        customerService.saveCustomer(customerDto);
        return "redirect:/customer/cusList";
    }

    //고객이용기록 컨트롤러
    @GetMapping("/customer/useList")
    public String useList(Model model) {
        List<CustomerEntity> customers = customerService.getAllCustomer();

        Map<String, List<CustomerEntity>> groupCustomer = customers.stream()
                .collect(Collectors.groupingBy(CustomerEntity::getName));

        model.addAttribute("customers", groupCustomer);
        return "customer/useList";
    }





}