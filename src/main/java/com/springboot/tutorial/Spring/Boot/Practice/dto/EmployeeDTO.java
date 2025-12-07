package com.springboot.tutorial.Spring.Boot.Practice.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.springboot.tutorial.Spring.Boot.Practice.annotations.EmployeeRoleValidation;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDTO {
    private Long id;

    @NotBlank(message = "Name of the employee cannot be empty")
    @Size(min = 3, max = 10, message =  "Number of characters in name should be in the range: [3, 10]")
    private String name;

    @Email(message = "Email should be a valid email")
    private String email;

    @Max(value = 80, message = "Age cannot be greater than 80")
    @Min(value = 18, message = "Age cannot be less than 18")
    private Integer age;

    @PastOrPresent(message = "Date of joining field in Employee cannot be in the future")
    private LocalDate dateOfJoining;

    @NotBlank(message = "Role of employee cannot be Blank")
    //@Pattern(regexp = "^(ADMIN|USER)$", message = "Role of employeee should be ADMIN Or User")
    @EmployeeRoleValidation
    private String role; //ADMIN, USER

    @AssertTrue(message = "Employee should be active")
    @JsonProperty("isActive")
    private Boolean isActive;

    @NotNull(message = "Salary of employee should not be null")
    @Positive(message = "Salary of employee should be positive")
    @Digits(integer = 6, fraction = 2)
    private Double salary;
}
