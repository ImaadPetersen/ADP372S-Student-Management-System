
# ADP372S Mini Assignment 1
## Student Management System

Author: Imaad Petersen  
Course: ADP372S  

---

## Project Overview

This project demonstrates the use of:

- Builder Design Pattern
- Inheritance and Polymorphism
- Application of SOLID Principles
- Clean and modular Java code

The system models different types of students:
- UndergraduateStudent
- GraduateStudent

Each student type calculates tuition differently and is created using the Builder pattern.

---

## Design Patterns Used

### Builder Pattern

The Builder pattern is used to create student objects that have required and optional attributes.

For example, scholarship amount and stipend are optional values. Instead of creating multiple constructors, the Builder pattern allows flexible object creation in a readable way.

Example:

UndergraduateStudent student = new UndergraduateStudent.Builder(...)
    .setCreditHours(6)
    .setScholarshipAmount(3000)
    .build();

This improves readability and keeps constructors simple.

---

## SOLID Principles Applied

### 1. Single Responsibility Principle (SRP)

Each class in the system has one clear responsibility.

- The Student class defines common attributes for all students.
- UndergraduateStudent handles undergraduate-specific data and tuition calculation.
- GraduateStudent handles graduate-specific data and tuition calculation.
- The Builder classes are responsible only for constructing objects.

This separation makes the system easier to maintain and modify.

---

### 2. Open/Closed Principle (OCP)

The system is open for extension but closed for modification.

If a new type of student (for example, PartTimeStudent) needs to be added, a new class can simply extend the Student class and implement the required methods.

No existing classes need to be modified, which keeps the system stable and scalable.

---

## How to Run

1. Open the project in any Java IDE.
2. Run Main.java.
3. The student details will display in the console.
