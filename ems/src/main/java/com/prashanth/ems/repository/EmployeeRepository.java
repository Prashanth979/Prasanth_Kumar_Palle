package com.prashanth.ems.repository;

import java.util.ArrayList;
import java.util.List;

import com.prashanth.ems.model.Employee;



public class EmployeeRepository {

    private List<Employee> employeeList = new ArrayList<>();

    // CREATE
    public void addEmployee(Employee emp) {
        employeeList.add(emp);
    }


    //Retrieve - all
    public List<Employee> getAllEmployees() {
        return employeeList;
    }

    //Retrieve - by ID
    public Employee getEmployeeById(int id) {
        for (Employee emp : employeeList) {
            if (emp.getId() == id) {
                return emp;
            }
        }
        return null; // Employee not found
    }

    //Update
    public boolean updateEmployee(int id, String name, String department, double salary) {
        Employee emp = getEmployeeById(id);
        if (emp != null) {
            emp.setName(name);
            emp.setDepartment(department);
            emp.setBaseSalary(salary);
            return true; // Update successful
        }
        return false; // Employee not found
    }

    //Delete
    public boolean deleteEmployee(int id) {
        Employee emp = getEmployeeById(id);
        if (emp != null) {
            employeeList.remove(emp);
            return true; // Deletion successful
        }
        return false; // Employee not found
    }
}
