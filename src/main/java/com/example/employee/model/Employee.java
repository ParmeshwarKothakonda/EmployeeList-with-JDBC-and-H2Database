package com.example.employee.model;

public class Employee{
    private int employeeId;
    private String employeeName;
    private String email;
    private String department;

    public Employee(int employeeId, String employeeName, String email, String department){
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.email = email;
        this.department = department;
    }
    public int getEmployeeId(){ //getter
        return this.employeeId;
    }
    public void setEmployeeId(int employeeId){
        this.employeeId = employeeId;
    }

    public String getEmployeeName(){ //getter
        return this.employeeName;
    }
    public void setEmployeeName(String employeeName){
        this.employeeName = employeeName;
    }

    public String getEmail(){ //getter
        return this.email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    public String getDepartment(){ //getter
        return this.department;
    }
    public void setDepartment(String department){
        this.department = department;
    }
}