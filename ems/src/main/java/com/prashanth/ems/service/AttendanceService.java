package com.prashanth.ems.service;

import java.util.HashMap;
import java.util.Map;

import com.prashanth.ems.model.Employee;
import com.prashanth.ems.repository.EmployeeRepository;

public class AttendanceService {
    
    private Map<Integer, Integer> attendanceMap = new HashMap<>();
    private EmployeeRepository repository;

    public AttendanceService(EmployeeRepository repository) {
        this.repository = repository;
    }
    // Mark Attendance
    public void markAttendance(int employeeId) {

        Employee emp = repository.getEmployeeById(employeeId);

        if (emp == null) {
            System.out.println("Employee not found. Cannot mark attendance.");
            return;
        }

        attendanceMap.put(employeeId,
                attendanceMap.getOrDefault(employeeId, 0) + 1);

        System.out.println("Attendance marked for " + emp.getName());
    }

    // Get attendance for one employee
    public int getAttendance(int employeeId) {
        return attendanceMap.getOrDefault(employeeId, 0);
    }

    // View attendance report
    public void viewAttendanceReport() {

        if (attendanceMap.isEmpty()) {
            System.out.println("No attendance records found.");
            return;
        }

        System.out.println("\n--- Attendance Report ---");
        for (Map.Entry<Integer, Integer> entry : attendanceMap.entrySet()) {
            System.out.println("Employee ID: " + entry.getKey()
                    + " | Days Present: " + entry.getValue());
        }

        System.out.println("--------------------------\n");
    }
}
