package com.pramati.employee_service;

import com.pramati.employee_service.config.ApplicationConfigUsingComponentScan;
import com.pramati.employee_service.pojo.Employee;
import com.pramati.employee_service.service.EmployeeService;
import com.pramati.employee_service.service.EmployeeServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by satyat on 06/10/16.
 */
public class TestingComponentScan {


    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfigUsingComponentScan.class);
        for (String s : applicationContext.getBeanDefinitionNames()){
            System.out.println(s);
        }
        applicationContext.getBean(GeneralClass.class).someMethod();
    }
}
