package com.example.HMS_MANAGEMENT.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import java.time.LocalDate;

@Entity
@Getter
@Setter
public class DayChartEntity {

    @Id
    @Column(name = "dayChartId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private Integer procedureCost; // 시술수입

    @Column
    private Integer productSale; // 상품판매금액

    @Column
    private Integer income; // 수입합계

    @Column
    private Integer salary; // 월급

    @Column
    private Integer purchase; // 상품구입금액

    @Column
    private Integer spending; // 지출합계

    @Column
    private Integer weekIncome; // 주간수입합계


    @Column
    private LocalDate date;


}
