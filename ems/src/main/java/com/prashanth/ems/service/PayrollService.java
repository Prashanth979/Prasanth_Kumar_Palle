package com.prashanth.ems.service;

import com.prashanth.ems.model.Employee;

public class PayrollService implements PayrollOperations {

    private static final double TAX_PERCENTAGE = 10;   // 10% tax
    private static final double PF_PERCENTAGE = 5;     // 5% PF

    @Override
    public double calculateSalary(Employee employee) {

        double baseSalary = employee.getBaseSalary();

        // Role-based allowance via polymorphism
        double roleAllowance = employee.calculateSalary() - baseSalary;

        // Additional fixed allowance
        double travelAllowance = 2000;

        // Gross Salary
        double grossSalary = baseSalary + roleAllowance + travelAllowance;

        // Deductions
        double tax = (grossSalary * TAX_PERCENTAGE) / 100;
        double pf = (grossSalary * PF_PERCENTAGE) / 100;

        double totalDeductions = tax + pf;

        double netSalary = grossSalary - totalDeductions;

        // Payroll Breakdown Display
        System.out.println("\n----- Payroll Breakdown -----");
        System.out.println("Base Salary      : " + baseSalary);
        System.out.println("Role Allowance   : " + roleAllowance);
        System.out.println("Travel Allowance : " + travelAllowance);
        System.out.println("Gross Salary     : " + grossSalary);
        System.out.println("Tax Deduction    : " + tax);
        System.out.println("PF Deduction     : " + pf);
        System.out.println("Net Salary       : " + netSalary);
        System.out.println("-----------------------------\n");

        return netSalary;
    
    }
    
}
