package com.prashanth.ems.model;

public class ContractEmployee extends Employee {

    public ContractEmployee(int id, String name, String department, String role, double baseSalary) {
        super(id, name, department, role, baseSalary);
    }

    @Override
    public double calculateSalary() {

        double roleAllowance = 0;

        if (role.equalsIgnoreCase("Developer"))
            roleAllowance = 8000;
        else if (role.equalsIgnoreCase("Tester"))
            roleAllowance = 4000;
        else if (role.equalsIgnoreCase("HR"))
            roleAllowance = 2000;

        return baseSalary + roleAllowance;
    }

}
