# Prasanth_Kumar_Palle
Employee Management System Project using OOPS principles

# 🏢 Employee Management & Payroll System

A console-based Employee Management System built using Java and Object-Oriented Programming principles.

This project demonstrates layered architecture, inheritance, polymorphism, abstraction, and exception handling.

---

## 🚀 Features

### 🔐 Authentication
- Admin login validation
- Custom exception for invalid credentials

### 👨‍💼 Employee Management (CRUD)
- Add Employee
- View Employee by ID
- View All Employees
- Update Employee
- Delete Employee

### 🏢 Department & Role Management
- Departments:
  - Software Development
  - Quality Assurance
  - Sales
  - Marketing
  - HR
- Roles:
  - Developer
  - Tester
  - HR

### 🧾 Employment Types (Inheritance)
- Full Time Employee
- Part Time Employee
- Contract Employee

### 💰 Payroll Management
- Role-based salary calculation
- Full-time bonus
- Allowances
- Tax deduction (10%)
- PF deduction (5%)
- Payroll breakdown display

### 📅 Attendance Management
- Mark attendance
- Track attendance per employee
- Attendance report generation

## 🏗 Architecture

The project follows a layered architecture:

EmsApplication (Entry Point)
↓
Controller Layer (MainMenu)
↓
Service Layer
↓
Repository Layer
↓
Model Layer
↓
Exception Layer

## 🧠 OOP Concepts Implemented

### ✅ Encapsulation
- Private fields with getters and setters in `Employee` class.

### ✅ Inheritance
- `FullTimeEmployee`
- `PartTimeEmployee`
- `ContractEmployee`
  extend the abstract `Employee` class.

### ✅ Polymorphism
- `calculateSalary()` method overridden in each subclass.
- Runtime method dispatch used via `Employee` reference.

### ✅ Abstraction
- Abstract class `Employee`
- Interface `PayrollOperations`

### ✅ Exception Handling
- `InvalidCredentialsException`
- `EmployeeNotFoundException`

