/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.unit_testing_example;

/**
 *
 * @author sandh
 */
public class Employee {
    
    public String empID;
    public int hoursWorked;
    public double salary;
    
    public Employee(String _EmpID, int _HoursWorked, double _Salary){
        this.empID = _EmpID;
        this.hoursWorked = _HoursWorked;
        this.salary = _Salary;        
    }
    
    public double calcSalary(){
        return hoursWorked*salary;
    }
    
    public boolean checkID(){
        return empID.length() > 2;
    }
}
