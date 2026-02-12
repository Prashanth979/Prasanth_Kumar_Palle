package com.prashanth.ems.model;

public class PartTimeEmployee extends Employee{
    
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(int id, String name, String department, String role, int hoursWorked, double hourlyRate) {
        super(id, name, department, role, 0);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
    
}
