# Veeva Integrated Curriculum

### A Structured Learning Journey for QA Automation Engineering

Welcome to the **Veeva Integrated Curriculum** repository!

This repository documents my technical learning journey through programming fundamentals, Object-Oriented Programming, Java case studies, application development, Agile project management, and Selenium automation testing.

It contains hands-on exercises, practical assignments, case studies, and projects completed as part of my preparation for a career in **Quality Assurance (QA) Automation Engineering**.

---

## About This Repository

The curriculum is organized into three major training areas:

| Module | Description |
|---|---|
| **Java Training** | Java fundamentals, OOP, file handling, Java Streams, and practical application development. |
| **Jira Training** | Agile Scrum, project planning, requirements management, test cases, bug tracking, JQL, and QA reporting. |
| **Selenium Training** | Web automation fundamentals, Selenium WebDriver, locators, browser interactions, and e-commerce automation projects. |

Each module is maintained in its own directory with separate projects and learning materials.

---

## Learning Objectives

- Strengthen Java programming fundamentals.
- Understand and apply Object-Oriented Programming principles.
- Practise file handling and serialization.
- Work with Java Collections and the Stream API.
- Develop modular applications using layered architecture.
- Understand exception handling and multithreading.
- Build database-driven applications using JDBC and MySQL.
- Understand Agile Scrum and Jira project management.
- Practise test case design and defect management.
- Learn Selenium WebDriver for browser automation.
- Automate real-world e-commerce application workflows.
- Maintain projects and documentation using Git and GitHub.

---

# Repository Structure

The following structure represents the main learning modules and projects. IDE configuration folders and generated build-output folders such as `.idea`, `out`, and `target` are intentionally omitted.

```text
Veeva-Integrated-Curriculum/
│
├── README.md
├───Java-Training
│   ├───.idea
│   ├───ECommerce OOP Based Project
│   │   └───EcommerceProject
│   ├───Files
│   │   └───Case Studies On Files
│   │       ├───.idea
│   │       ├───data
│   │       ├───out
│   │       │   └───production
│   │       │       └───CASE STUDIES
│   │       │           └───Questions_Of_CaseStudies
│   │       └───src
│   │           └───Questions_Of_CaseStudies
│   ├───OOP
│   │   └───OOP CASE STUDY
│   │       ├───ECommerce Managment System
│   │       │   ├───.idea
│   │       │   └───EcommerceProject
│   │       │       ├───.idea
│   │       │       ├───.mvn
│   │       │       ├───src
│   │       │       │   ├───main
│   │       │       │   │   ├───java
│   │       │       │   │   │   └───com
│   │       │       │   │   │       └───ecommerce
│   │       │       │   │   │           ├───config
│   │       │       │   │   │           ├───dao
│   │       │       │   │   │           ├───model
│   │       │       │   │   │           └───service
│   │       │       │   │   └───resources
│   │       │       │   └───test
│   │       │       │       └───java
│   │       │       └───target
│   │       │           ├───classes
│   │       │           │   └───com
│   │       │           │       └───ecommerce
│   │       │           │           ├───config
│   │       │           │           ├───dao
│   │       │           │           ├───model
│   │       │           │           └───service
│   │       │           ├───generated-sources
│   │       │           │   └───annotations
│   │       │           └───maven-status
│   │       │               └───maven-compiler-plugin
│   │       │                   └───compile
│   │       │                       └───default-compile
│   │       ├───Indian Population Directory System
│   │       │   ├───.idea
│   │       │   └───src
│   │       ├───InventoryManagmentSystem
│   │       │   ├───.idea
│   │       │   └───src
│   │       │       ├───model
│   │       │       ├───repository
│   │       │       └───service
│   │       ├───Practice On Threads
│   │       │   ├───.idea
│   │       │   ├───out
│   │       │   │   └───production
│   │       │   │       └───Practice On Threads
│   │       │   └───src
│   │       ├───Product Managment System
│   │       │   ├───.idea
│   │       │   ├───out
│   │       │   │   └───production
│   │       │   │       └───Product Managment System
│   │       │   └───src
│   │       └───VendingMachine
│   │           ├───.idea
│   │           ├───out
│   │           │   └───production
│   │           │       └───VendingMachine
│   │           │           ├───Exceptions
│   │           │           ├───Model
│   │           │           ├───Repository
│   │           │           └───Service
│   │           ├───Output
│   │           └───src
│   │               ├───Exceptions
│   │               ├───Model
│   │               ├───Repository
│   │               └───Service
│   └───Streams
│       ├───.idea
│       ├───Case Studies on Java Streams
│       │   ├───Employee Management And Analytics System
│       │   │   ├───.idea
│       │   │   ├───out
│       │   │   │   └───production
│       │   │   │       └───Employee Management And Analytics System
│       │   │   └───src
│       │   └───Inventory Managment
│       │       ├───.idea
│       │       ├───out
│       │       │   └───production
│       │       │       └───InventoryManagment
│       │       └───src
│       ├───out
│       │   └───production
│       │       └───Java Stream API
│       │           └───CASE_STUDIES
│       └───src
│           ├───.idea
│           ├───CASE_STUDIES
│           └───out
│               └───production
│                   └───Streams
│                       ├───.idea
│                       └───CASE_STUDIES
├───Jira-Training
│   └───ShopEasy-QA
│       ├───01-Project-Overview
│       ├───02-Requirements-and-User-Stories
│       ├───03-Sprint-Planning
│       ├───04-Test-Cases
│       │   ├───Account-and-Login
│       │   ├───Browse-and-Search
│       │   └───Cart-and-Checkout
│       ├───05-Test-Management
│       ├───06-Bug-Management
│       │   └───Screenshots
│       ├───07-JQL-Filters
│       ├───08-Dashboard
│       │   └───Screenshots
│       ├───09-Test-Summary-Report
│       ├───10-Project-Exports
│       └───screenshots
└───Selenium
    ├───.idea
    ├───Case Studies
    │   ├───.idea
    │   ├───.mvn
    │   └───src
    │       ├───main
    │       │   ├───java
    │       │   │   └───com
    │       │   │       └───ecommerce
    │       │   └───resources
    │       └───test
    │           └───java
    ├───Day-1
    │   └───Selenium Basics Practice
    │       ├───.idea
    │       └───src
    ├───Day-2
    │   └───Selenium-Ecommerce-Project
    │       ├───.idea
    │       ├───.mvn
    │       └───src
    │           └───test
    │               └───java
    ├───Day-3
    │   └───E-Commerce Automation
    │       ├───.idea
    │       ├───.mvn
    │       ├───src
    │       │   └───test
    │       │       └───java
    │       └───target
    │           ├───generated-test-sources
    │           │   └───test-annotations
    │           └───test-classes
```

---

# 1. Java Training

The Java Training module focuses on strengthening programming fundamentals through exercises, case studies, and practical application development.

## Topics Covered

- Java Fundamentals
- Variables and Data Types
- Control Statements and Loops
- Classes and Objects
- Object-Oriented Programming
- Encapsulation, Inheritance, Abstraction, and Polymorphism
- Exception Handling
- Collections Framework
- File Handling
- Serialization and Deserialization
- Multithreading
- Java Stream API
- Lambda Expressions
- JDBC and MySQL
- DAO and Layered Architecture

## 1.1 File Handling Case Studies

**Location:** `Java-Training/Files/Case Studies On Files/`

This module contains practical exercises focused on Java file operations and student record management.

### Concepts Practised

- Creating and checking files.
- Working with files and directories.
- Reading and writing text files.
- Using `FileReader` and `FileWriter`.
- Using `BufferedReader` and `BufferedWriter`.
- Appending and updating file content.
- Exception handling.
- Object serialization and deserialization.

The case studies include supporting data files and Java source code.

## 1.2 Object-Oriented Programming Case Studies

**Location:** `Java-Training/OOP/OOP CASE STUDY/`

This module contains practical projects designed to apply OOP concepts to real-world problem statements.

### Projects

| Project | Focus Area |
|---|---|
| ECommerce Management System | E-commerce application development using OOP and layered architecture. |
| Indian Population Directory System | Population directory application. |
| Inventory Management System | Inventory operations using model, repository, and service layers. |
| Practice On Threads | Java multithreading concepts. |
| Product Management System | Product management application. |
| Vending Machine | Vending machine simulation using modular OOP design. |

### Vending Machine

The Vending Machine project focuses on designing a console-based vending machine application.

**Project organization:**

- `Model/` – Represents application entities.
- `Repository/` – Manages product and related data.
- `Service/` – Handles business operations.
- `Exceptions/` – Contains custom exception handling.
- `Output/` – Contains project output or supporting material.

**Concepts practised:**

- Classes and objects.
- Encapsulation.
- Collections.
- Repository and service layers.
- Custom exceptions.
- Payment processing concepts.
- Console-based user interaction.

### Inventory Management System

This project follows a layered structure:

- `model/` – Represents inventory-related objects.
- `repository/` – Manages application data.
- `service/` – Handles inventory business logic.

It provides practice in separating data management from business operations.

### ECommerce Management System

**Location:** `Java-Training/OOP/OOP CASE STUDY/ECommerce Managment System/EcommerceProject/`

This is a Maven-based Java application organized into separate packages.

| Package | Responsibility |
|---|---|
| `config/` | Application configuration |
| `dao/` | Data access operations |
| `model/` | Application entities |
| `service/` | Business logic |

The project helps practise OOP principles, Maven project organization, JDBC concepts, and layered application design.

## 1.3 Java Streams

**Location:** `Java-Training/Streams/`

This module focuses on the Java Stream API and functional-style programming.

### Topics Practised

- Stream creation.
- Intermediate operations.
- Terminal operations.
- `filter()`
- `map()`
- `sorted()`
- `distinct()`
- `collect()`
- `reduce()`
- Lambda expressions.
- Method references.
- Working with collections using streams.

### Java Stream Case Studies

| Case Study | Focus Area |
|---|---|
| Employee Management And Analytics System | Employee data processing and analytics using streams. |
| Inventory Management | Inventory data processing using the Stream API. |

These case studies provide practical experience in processing collections and performing data transformations.

## 1.4 ECommerce OOP Based Project

**Location:** `Java-Training/ECommerce OOP Based Project/EcommerceProject/`

This is another dedicated e-commerce project directory maintained under Java Training.

The project is part of the practical application-development work in the curriculum.

Refer to the project source code and its documentation for implementation details.

---

# 2. Jira Training

The Jira Training module focuses on Agile project management, Scrum workflows, and practical QA project management using Jira.

## Topics Covered

- Jira project creation and configuration.
- Agile Scrum methodology.
- Epics and user stories.
- Tasks and subtasks.
- Product backlog management.
- Sprint planning and execution.
- Test case management.
- Test execution.
- Bug and defect management.
- Jira Query Language (JQL).
- Jira dashboards.
- Test summary reporting.

## Practical Project – ShopEasy QA

**Location:** `Jira-Training/ShopEasy-QA/`

ShopEasy QA is a practical project created to understand how Jira supports software development and quality assurance workflows.

| Field | Details |
|---|---|
| Project Name | ShopEasy QA |
| Application | ShopEasy Online Shopping Application |
| Project Key | SEQ |
| Methodology | Agile Scrum |
| Test Management | Xray |

### Project Modules

1. Account and Login.
2. Browse and Search.
3. Cart and Checkout.

### Documentation Structure

| Folder | Description |
|---|---|
| `01-Project-Overview/` | Project overview and configuration |
| `02-Requirements-and-User-Stories/` | Requirements and user stories |
| `03-Sprint-Planning/` | Sprint planning and management |
| `04-Test-Cases/` | Test cases for application modules |
| `05-Test-Management/` | Test management and execution |
| `06-Bug-Management/` | Bug tracking and defect management |
| `07-JQL-Filters/` | JQL queries and saved filters |
| `08-Dashboard/` | Jira dashboard documentation |
| `09-Test-Summary-Report/` | Test summary documentation |
| `10-Project-Exports/` | Project exports |
| `screenshots/` | Supporting screenshots |

**Project Documentation:** [Explore ShopEasy QA](Jira-Training/ShopEasy-QA/README.md)

---

# 3. Selenium Training

The Selenium Training module focuses on browser automation using Java and Selenium WebDriver.

The training is organized into day-wise learning modules and practical automation projects.

## Topics Covered

- Introduction to Selenium WebDriver.
- Browser setup and WebDriver initialization.
- Locators:
  - ID
  - Name
  - Class Name
  - Tag Name
  - Link Text
  - Partial Link Text
  - CSS Selector
  - XPath
- XPath Axes.
- WebElement methods.
- Browser navigation.
- Handling web elements.
- Mouse and keyboard interactions.
- Scrolling.
- Waits and synchronization.
- Automating e-commerce workflows.

## Day-wise Training

| Module | Focus Area |
|---|---|
| Day 1 | Selenium Basics Practice |
| Day 2 | Selenium E-commerce Project |
| Day 3 | E-Commerce Automation |
| Day 4 | Training workspace for the next learning module |

### Case Studies

**Location:** `Selenium/Case Studies/`

This directory contains a separate case-study project organized as a Java Maven application.

### Practical Automation

The Selenium training includes hands-on automation practice on e-commerce websites.

Activities include:

- Launching browser sessions.
- Opening web applications.
- Locating web elements.
- Validating page titles and URLs.
- Extracting product information.
- Interacting with search fields.
- Navigating between pages.
- Scrolling through web pages.
- Adding products to the cart.
- Automating user workflows.

The objective is to develop practical browser automation skills using Java and Selenium WebDriver.

---

# Learning Approach

The curriculum follows a practical learning process:

```text
       Learn Concepts
             |
             v
      Understand Theory
             |
             v
      Perform Exercises
             |
             v
      Complete Case Studies
             |
             v
      Build Practical Projects
             |
             v
      Practise Automation
             |
             v
      Document the Learning
             |
             v
       Review and Improve
```

---

# Technologies and Tools

| Category | Technologies / Tools |
|---|---|
| Programming Language | Java |
| Build Tool | Maven |
| Database | MySQL |
| Database Connectivity | JDBC |
| Automation Testing | Selenium WebDriver |
| Project Management | Jira |
| Test Management | Xray |
| IDE | IntelliJ IDEA |
| Version Control | Git |
| Repository Hosting | GitHub |

---

# Version Control

Git and GitHub are used to maintain source code, projects, assignments, and documentation.

**GitHub Repository:**

[Veeva Integrated Curriculum](https://github.com/bhanuprakashpindi-creator/Veeva-Integrated-Curriculum)

### Clone the Repository

```bash
git clone https://github.com/bhanuprakashpindi-creator/Veeva-Integrated-Curriculum.git
```

### Navigate to the Repository

```bash
cd Veeva-Integrated-Curriculum
```

---

# Final Objective

The objective of this curriculum is to develop the technical knowledge and practical skills required for a **QA Automation Engineering role**.

By combining Java programming, OOP case studies, application development, Agile project management, test management, and Selenium automation, this repository serves as a record of continuous technical learning and practical development.

---

**Veeva Integrated Curriculum**

*Learn. Practise. Build. Test. Automate. Improve.*
