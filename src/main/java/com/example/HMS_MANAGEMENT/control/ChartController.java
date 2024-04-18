package com.example.HMS_MANAGEMENT.control;

import com.example.HMS_MANAGEMENT.dto.DayChartDto;
import com.example.HMS_MANAGEMENT.entity.DayChartEntity;
import com.example.HMS_MANAGEMENT.service.DayChartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class ChartController {
    @Autowired
    private DayChartService dayChartService;

    @GetMapping("/sales")
    public String cusList(){
        return "sales/salesPage";
    }
    @GetMapping("/sales/monPage")
    public String monPage(){
        return "sales/monPage";
    }

    @GetMapping("/sales/dayPage")
    public String dayPage(Model model){

        List<DayChartDto> dayChartData = dayChartService.getAllDayCharts();
        model.addAttribute("dayChartData",dayChartData);
        return "sales/dayPage";
    }
    @GetMapping("/sales/weekPage")
    public String weekPage(Model model){
        // 주간일자 반복
        List<String> weekDayList = dayChartService.getWeekDay();
        List<String> firstFourWeekDays = weekDayList.stream().limit(4).collect(Collectors.toList());
        model.addAttribute("weekDayList", firstFourWeekDays);

//        List<String> dayList = dayChartService.dayWeek();
//        List<String> aaa = dayList.stream().limit(2).collect(Collectors.toList());
//        model.addAttribute("dayList", dayList);

        List<DayChartDto> dayChartData = dayChartService.getAllDayCharts();
        model.addAttribute("dayChartData", dayChartData);


        return "sales/weekPage";
    }




}