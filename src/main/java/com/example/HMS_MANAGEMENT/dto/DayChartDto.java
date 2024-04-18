package com.example.HMS_MANAGEMENT.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class DayChartDto {

    private Long id;

    private Integer procedureCost; // 시술수입

    private Integer productSale; // 상품판매금액

    private Integer income; // 수입합계

    private Integer salary; // 월급

    private Integer purchase; // 상품구입금액

    private Integer spending; // 지출합계

    private Integer weekIncome; // 주간수입합계


    private LocalDate date;



}
