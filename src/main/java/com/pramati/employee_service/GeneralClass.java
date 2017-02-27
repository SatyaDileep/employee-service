package com.pramati.employee_service;

import com.pramati.employee_service.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by satyat on 06/10/16.
 */
@Component
public class GeneralClass {

    @Autowired
    @Qualifier("basic-service")
    private EmployeeService employeeService;

    public void someMethod(){
        System.out.println("Hello "+employeeService);
    }
}
