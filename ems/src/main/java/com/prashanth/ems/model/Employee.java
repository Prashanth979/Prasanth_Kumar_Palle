package com.prashanth.ems.model;

public abstract class Employee {
    
    private int id;
    private String name;
    private String department;
    protected String role;
    protected double baseSalary;


    public Employee(int id, String name, String department,String role, double baseSalary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.role = role;
        this.baseSalary = baseSalary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public String getRole() { 
        return role; 
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    //Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public abstract double calculateSalary(); // Abstract method to be implemented by subclasses
}
