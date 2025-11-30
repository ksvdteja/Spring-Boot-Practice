package com.springboot.tutorial.Spring.Boot.Practice.controllers;

import com.springboot.tutorial.Spring.Boot.Practice.dto.EmployeeDTO;
import com.springboot.tutorial.Spring.Boot.Practice.entities.EmployeeEntity;
import com.springboot.tutorial.Spring.Boot.Practice.services.EmployeeService;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

//    @RequestMapping(path = "/getSecret")
//    public String getSecret() {
//        return "This is the secret";
//    }

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/{employeeId}")
    public EmployeeDTO getEmployeeById(@PathVariable("employeeId") Long id) {
        return employeeService.getEmployeeById(id);
    }

    @GetMapping
    public List<EmployeeDTO> getEmployees(@RequestParam(required = false, name = "inputAge") Integer age, @RequestParam(required = false) String sortBy) {
        return employeeService.getEmployees();
    }

    @PostMapping
    public EmployeeDTO createNewEmployee(@RequestBody EmployeeDTO inputEmployee) {
        return employeeService.createNewEmployee(inputEmployee);
    }

    @PutMapping String updateEmployeeById() {
        return "Hello from put";
    }
}
