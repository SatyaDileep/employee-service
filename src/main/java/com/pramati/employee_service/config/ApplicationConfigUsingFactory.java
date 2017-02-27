package com.pramati.employee_service.config;

import com.pramati.employee_service.controller.EmployeeController;
import com.pramati.employee_service.controller.EmployeeControllerImpl;
import com.pramati.employee_service.repository.EmployeeRepository;
import com.pramati.employee_service.repository.EmployeeRepositoryImpl;
import com.pramati.employee_service.service.EmployeeService;
import com.pramati.employee_service.service.EmployeeServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by satyat on 29/09/16.
 * @configuration is used to specify that this class contains configuration details of beans.
 */
@Configuration
public class ApplicationConfigUsingFactory {

    /*@Bean
    public EmployeeService getEmployeeServiceBean(){
        return new EmployeeServiceImpl();
    }*/

    @Bean
    public EmployeeController getEmployeeControllerBean(){
        return new EmployeeControllerImpl();
    }

    @Bean
    public EmployeeRepository getEmployeeRepositoryBean(){
        return new EmployeeRepositoryImpl();
    }
}
