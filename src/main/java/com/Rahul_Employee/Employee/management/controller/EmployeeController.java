package com.Rahul_Employee.Employee.management.controller;

import com.Rahul_Employee.Employee.management.model.Employee;
import com.Rahul_Employee.Employee.management.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1")
public class EmployeeController {
    @Autowired
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("/employeeSave")
    public Employee createEmployee(@RequestBody Employee employee){
        return employeeService.createEmployee(employee);
    }

    @GetMapping("/getEmployeeList")
    public List<Employee> getAllEmployee(){

        return employeeService.getAllEmployee();
    }
}
