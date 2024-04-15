package com.example.HMS_MANAGEMENT.repository;

import com.example.HMS_MANAGEMENT.entity.SalesEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalesRepository extends JpaRepository<SalesEntity, Long> {
}
