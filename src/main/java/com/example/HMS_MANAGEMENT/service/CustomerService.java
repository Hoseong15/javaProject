package com.example.HMS_MANAGEMENT.service;

import com.example.HMS_MANAGEMENT.dto.CustomerDto;
import com.example.HMS_MANAGEMENT.entity.CustomerEntity;
import com.example.HMS_MANAGEMENT.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public void saveCustomer(CustomerDto customerDto) {
        String formatPhoneNumber = formatPhoneNumber(customerDto.getTel());

        CustomerEntity customerEntity = new CustomerEntity();
        customerEntity.setName(customerDto.getName());
        customerEntity.setFirstVisit(customerDto.getFirstVisit());
        customerEntity.setTel(formatPhoneNumber);
        customerEntity.setRecord(customerDto.getRecord());
        customerEntity.setFrequentDesigner(customerDto.getFrequentDesigner());
        customerRepository.save(customerEntity);
    }

    //고객정보 페이징
    public Page<CustomerEntity> getAllCustomer(Pageable pageable){
        return customerRepository.findAll(pageable);
    }


    //휴대폰 번호 하이푼 코드
    public String formatPhoneNumber(String phoneNumber) {
        String digits = phoneNumber.replaceAll("\\D", "");
        if (digits.length() < 10) {
            throw new IllegalArgumentException("유효한 전화번호가 아닙니다.");
        }
        String areaCode = digits.substring(0, 3);
        String firstPart = digits.substring(3, 7);
        String secondPart = digits.substring(7, 11);
        return String.format("%s-%s-%s", areaCode, firstPart, secondPart);
    }

    //고객에 맞는 이용기록 보여주기
    public List<CustomerDto> getCustomer(){
        List<CustomerEntity> customerEntities = customerRepository.findAll();
        List<CustomerDto> customer = new ArrayList<>();

        for(CustomerEntity entity : customerEntities){
            CustomerDto dto = new CustomerDto();
            dto.setName(entity.getName());
            dto.setFrequentDesigner(entity.getFrequentDesigner());
            dto.setRecord(entity.getRecord());;
            dto.setRecord(entity.getRecord());
        }
        return customer;
    }


    public List<CustomerEntity> getAllCustomer(){
        return customerRepository.findAll();
    }



}
