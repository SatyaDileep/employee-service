package com.pramati.employee_service.service;

import com.pramati.employee_service.controller.EmployeeController;
import com.pramati.employee_service.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by satyat on 29/09/16.
 */
@Service("basic-service")
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeController employeeController;

    public Employee createEmployee(Employee employee){
        return employeeController.createEmployee(employee);
    }
}
