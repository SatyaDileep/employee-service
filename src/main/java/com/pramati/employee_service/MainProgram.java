package com.pramati.employee_service;

import com.pramati.employee_service.config.ApplicationConfigUsingFactory;
import com.pramati.employee_service.pojo.Employee;
import com.pramati.employee_service.service.EmployeeService;
import com.pramati.employee_service.service.EmployeeServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;
import java.util.List;

/**
 * Created by satyat on 29/09/16.
 */
public class MainProgram {
    private static EmployeeServiceImpl employeeService;
    public static void main(String[] args) {

        // initialize the beans
        try {
            ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfigUsingFactory.class);

            employeeService = (EmployeeServiceImpl) applicationContext.getBean(EmployeeService.class);
            Employee createdEmp = employeeService.createEmployee(createSampleEmployee());
            System.out.println(createdEmp);
        }
        catch (Exception e){
            System.out.println("Exception occured while initializing beans..! "+e);
        }
    }

    public static Employee createSampleEmployee(){
        return new Employee(){{
           setEmployeeGender("Male");
           setEmployeeName("Satya");
           setEmployeeWorkLocation("Hyderabad");
        }};
    }
}
