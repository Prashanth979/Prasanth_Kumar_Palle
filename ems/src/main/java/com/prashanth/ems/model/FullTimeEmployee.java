package com.prashanth.ems.model;

public class FullTimeEmployee extends Employee {

    public FullTimeEmployee(int id, String name, String department, String role, double baseSalary) {
        super(id, name, department, role, baseSalary);
    }

    @Override
    public double calculateSalary() {

        double roleAllowance = 0;

        if (role.equalsIgnoreCase("Developer"))
            roleAllowance = 10000;
        else if (role.equalsIgnoreCase("Tester"))
            roleAllowance = 5000;
        else if (role.equalsIgnoreCase("HR"))
            roleAllowance = 3000;

        double fullTimeBonus = 5000;

        return baseSalary + roleAllowance + fullTimeBonus;
    }

}
