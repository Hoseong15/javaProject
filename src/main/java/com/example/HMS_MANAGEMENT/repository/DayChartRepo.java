package com.example.HMS_MANAGEMENT.repository;


import com.example.HMS_MANAGEMENT.entity.DayChartEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface DayChartRepo extends JpaRepository<DayChartEntity,Long> {
    List<DayChartEntity> findByDate(LocalDate date);
}
