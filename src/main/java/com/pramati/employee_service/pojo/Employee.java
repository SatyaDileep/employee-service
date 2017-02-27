package com.pramati.employee_service.pojo;

/**
 * Created by satyat on 29/09/16.
 */
public class Employee {
    private String employeeName;
    private String employeeGender;
    private String employeeWorkLocation;

    public String getEmployeeWorkLocation() {
        return employeeWorkLocation;
    }

    public void setEmployeeWorkLocation(String employeeWorkLocation) {
        this.employeeWorkLocation = employeeWorkLocation;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeGender() {
        return employeeGender;
    }

    public void setEmployeeGender(String employeeGender) {
        this.employeeGender = employeeGender;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeName='" + employeeName + '\'' +
                ", employeeGender='" + employeeGender + '\'' +
                ", employeeWorkLocation='" + employeeWorkLocation + '\'' +
                '}';
    }
}
