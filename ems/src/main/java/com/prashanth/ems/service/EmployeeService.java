package com.prashanth.ems.service;

import java.util.List;

import com.prashanth.ems.exception.EmployeeNotFoundException;
import com.prashanth.ems.model.Employee;
import com.prashanth.ems.repository.EmployeeRepository;

public class EmployeeService {
    
    private EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }   

    public void addEmployee(Employee employee) {
        employeeRepository.addEmployee(employee);
        System.out.println("Employee added successfully: ");
    }

    public void viewEmployee(int id) throws EmployeeNotFoundException{
        Employee emp = employeeRepository.getEmployeeById(id);
        if (emp == null) {
            throw new EmployeeNotFoundException("Employee with ID " + id + " not found.");
        }
    
        System.out.println("ID: " + emp.getId());
        System.out.println("Name: " + emp.getName());
        System.out.println("Department: " + emp.getDepartment());
        System.out.println("Base Salary: " + emp.getBaseSalary());
    }

    public void viewAllEmployees(){
        List<Employee> employees = employeeRepository.getAllEmployees();
        if(employees.isEmpty()){
            System.out.println("No employees found.");
            return;
        }

        System.out.println("ID | Name | Role | Base Salary | Final Salary");
        for (Employee emp : employees) {
            System.out.println(
                emp.getId() + " | " +
                emp.getName() + " | " +
                emp.getClass().getSimpleName() + " | " +
                emp.getBaseSalary() + " | " +
                emp.calculateSalary()
            );
        }
    }

        public void updateEmployee(int id, String name, String department, double salary){
            boolean updated = employeeRepository.updateEmployee(id, name, department, salary);
            if(updated){
                System.out.println("Employee with ID: "+id+" updated successfully.");
                //System.out.println("Employee updated successfully.");
            } else {
                System.out.println("Employee not found with ID: " + id);
            }
        }

        public void deleteEmployee(int id){
            boolean deleted = employeeRepository.deleteEmployee(id);
            if(deleted){
                System.out.println("Employee with ID: "+id+" deleted successfully.");
            } else {
                System.out.println("Employee not found with ID: " + id);
            }
        }
}
