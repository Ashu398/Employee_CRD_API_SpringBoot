package com.demo.Ashututorial.tutorial.controllers;

import com.demo.Ashututorial.tutorial.dto.EmployeeDTO;
import com.demo.Ashututorial.tutorial.services.EmployeeService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(path ="/employees")
public class EmployeeController {
    private final EmployeeService employeeService;
    public EmployeeController( EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    @GetMapping
    public List<EmployeeDTO> getAllEmployees() {
        return employeeService.getAllEmployees();

    }
    @GetMapping(path = "/{id}")
    public EmployeeDTO getEmployeeById(@PathVariable("id") Long id) {
    return employeeService.getEmployeeById(id);
    }
    @PostMapping
    public EmployeeDTO createEmployee(@RequestBody EmployeeDTO employeeDTO) {
           return employeeService.createEmployee(employeeDTO);
    }
    @DeleteMapping(path="/{id}")
    public boolean deleteEmployee(@PathVariable("id") Long id) {
       return employeeService.deleteEmployees(id);
    }
}




