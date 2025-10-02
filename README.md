# Java JDBC – Employee Database Application

NAME : MURALA AYYAPPA

## Project Overview

This project is part of a Java Developer Internship task. The objective is to build a simple Employee Database Management Application using JDBC (Java Database Connectivity).

The application connects Java with a relational database (MySQL/PostgreSQL) and performs CRUD operations:

* Create – Add new employee records.
* Read – View employee details.
* Update – Modify existing records.
* Delete – Remove employee entries.

By completing this project, you will gain practical experience in database connectivity, SQL operations, and exception handling in Java.

---

## Tools & Technologies

* Programming Language: Java
* Database: MySQL or PostgreSQL
* Driver: JDBC driver (MySQL Connector/J or PostgreSQL JDBC Driver)
* IDE/Text Editor: VS Code, IntelliJ, or Eclipse
* Build Tool: JDK & javac

---

## Key Concepts Implemented

* JDBC Connection: Establishing a secure connection between Java and the database.
* PreparedStatement: Used for parameterized SQL queries to prevent SQL injection.
* ResultSet: Handling query results.
* CRUD Operations: Core database manipulations.
* Exception Handling: Managing SQLExceptions effectively.
* DriverManager: Registering and managing drivers.
* Auto-Commit: Controlling database transactions manually when needed.


## Setup Instructions

### 1. Database Setup

1. Install MySQL or PostgreSQL.
2. Create a database:
   CREATE DATABASE employee_db;
3. Create a table:
   CREATE TABLE employees (
   id INT PRIMARY KEY AUTO_INCREMENT,
   name VARCHAR(50) NOT NULL,
   designation VARCHAR(50),
   salary DOUBLE
   );

---

### 2. Add JDBC Driver

* Download MySQL Connector/J or PostgreSQL JDBC driver.
* Place it in the lib/ folder.
* Add it to the classpath when compiling/running.



## Features Implemented

* Add Employee – Insert new employee records into the database.
* View Employees – Retrieve and display all employees.
* Update Employee – Modify details like designation or salary.
* Delete Employee – Remove an employee by ID.

---

## Learning Outcomes

By completing this project, you will:

* Understand how to connect Java applications to databases using JDBC.
* Learn to work with PreparedStatement and ResultSet effectively.
* Gain knowledge about SQL queries in Java programs.
* Master CRUD operations in a real-world context.
* Improve debugging skills and exception handling.

OUTPUT : 
