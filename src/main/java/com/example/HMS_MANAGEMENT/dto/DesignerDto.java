package com.example.HMS_MANAGEMENT.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.List;

@Getter @Setter
public class DesignerDto {

    private Long id;
    @NotNull(message = "이름을 입력 해주세요.")
    @NotEmpty(message = "이름을 입력 해주세요.")
    private String name;
    @NotNull(message = "전화번호를 입력 해주세요.")
    @NotEmpty(message = "전화번호를 입력 해주세요.")
    private String tel;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @NotNull(message = "등록일을 선택 해주세요.")
    private LocalDate date;
    @NotNull(message = "월급을 입력 해주세요.")
    private Integer sal;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @NotNull(message = "월급 지급일을 선택 해주세요.")
    private LocalDate salDate;
    private List<String> dayOffList;
}
