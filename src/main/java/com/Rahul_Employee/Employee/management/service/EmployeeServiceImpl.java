package com.Rahul_Employee.Employee.management.service;

import com.Rahul_Employee.Employee.management.entity.EmployeeEntity;
import com.Rahul_Employee.Employee.management.model.Employee;
import com.Rahul_Employee.Employee.management.repository.EmployeeRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }


    @Override
    public Employee createEmployee(Employee employee) {
        //as data is coming as emplyee(model) => we have convert it into employeeEntity object
        //so we will use BeanUtils.copyProperties
        EmployeeEntity employeeEntity =new EmployeeEntity();

        BeanUtils.copyProperties(employee,employeeEntity);
        employeeRepository.save(employeeEntity);
        return employee;
    }
}