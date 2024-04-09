package com.example.HMS_MANAGEMENT.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SalesController {

    @GetMapping("/sales")
    public String cusList(){
        return "sales/salesPage";
    }
    @GetMapping("/sales/monPage")
    public String monPage(){
        return "sales/monPage";
    }

    @GetMapping("/sales/dayPage")
    public String dayPage(){
        return "sales/dayPage";
    }

    @GetMapping("/sales/weekPage")
    public String weekPage(){
        return "sales/weekPage";
    }
}
