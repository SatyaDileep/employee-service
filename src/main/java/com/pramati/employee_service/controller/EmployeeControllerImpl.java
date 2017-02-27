package com.pramati.employee_service.controller;

import com.pramati.employee_service.pojo.Employee;
import com.pramati.employee_service.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by satyat on 29/09/16.
 */
public class EmployeeControllerImpl implements EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee createEmployee(Employee employee){
        return employeeRepository.createEmployee(employee);
    }
}
