package com.example.HMS_MANAGEMENT.service;

import com.example.HMS_MANAGEMENT.dto.DayChartDto;
import com.example.HMS_MANAGEMENT.entity.DayChartEntity;
import com.example.HMS_MANAGEMENT.repository.DayChartRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Service
public class DayChartService {

    @Autowired
    private DayChartRepo dayChartRepo;

    //일별차트에서 상세보기 클릭했을때
    public List<DayChartDto> getAllDayCharts() {
        List<DayChartEntity> entities = dayChartRepo.findAll();
        return entities.stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());


    }

    // 수입현황, 지출현황 코드
    public DayChartDto convertToDto(DayChartEntity entity) {
        DayChartDto dto = new DayChartDto();
        dto.setId(entity.getId());
        dto.setProcedureCost(entity.getProcedureCost());
        dto.setProductSale(entity.getProductSale());
        dto.setSalary(entity.getSalary());
        dto.setPurchase(entity.getPurchase());

        dto.setIncome(entity.getProcedureCost() + entity.getProductSale());
        dto.setSpending(entity.getSalary() + entity.getPurchase());

        dto.setWeekIncome(entity.getIncome() + entity.getSpending()); // 주간수입합계 설정
        return dto;
    }

    public List<String> getWeekDay() {
        return Arrays.asList("2024.03.31~2024.04.06", "2024.04.07~2024.04.13", "2024.04.14~2024.04.20",
                "2024.04.21~2024.04.27", "2024.04.28~2024.05.04");
    }
//    public List<String> dayWeek(){
//        return Arrays.asList("3.31","4.01","4.02");
//    }


}
