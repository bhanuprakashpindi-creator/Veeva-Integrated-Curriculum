# Veeva Integrated Curriculum

### A Structured Learning Journey for QA Automation Engineering

Welcome to the **Veeva Integrated Curriculum** repository!

This repository documents my technical learning journey, hands-on training, programming exercises, assignments, and practical projects while preparing for a career in **Quality Assurance (QA) Automation Engineering**.

The curriculum focuses on developing programming fundamentals, problem-solving abilities, database knowledge, software testing skills, Agile methodologies, and practical experience with industry tools.

---

## About This Repository

The Veeva Integrated Curriculum combines theoretical learning with practical implementation.

It is organized into different training modules, with each module containing exercises, case studies, assignments, and project documentation.

### Learning Objectives

* Strengthen Java programming fundamentals.
* Understand Object-Oriented Programming.
* Practise Data Structures and Algorithms.
* Learn SQL and database management.
* Develop practical application-building experience.
* Understand software testing methodologies.
* Learn Agile Scrum and Jira project management.
* Practise test case design and test management using Xray.
* Develop debugging and problem-solving skills.
* Maintain professional technical documentation using Git and GitHub.

---

## Technology Stack and Tools

| Category              | Technologies / Tools   |
| --------------------- | ---------------------- |
| Programming Languages | Java, SQL              |
| Database              | MySQL                  |
| Backend Concepts      | JDBC, DAO Pattern, OOP |
| Build Tool            | Maven                  |
| Version Control       | Git, GitHub            |
| IDE                   | IntelliJ IDEA, VS Code |
| Project Management    | Jira                   |
| Agile Methodology     | Scrum                  |
| Test Management       | Xray                   |
| Documentation         | Markdown               |
| Operating System      | Windows                |

Additional technologies will be included as the curriculum progresses.

---

# Repository Structure

```text
Veeva-Integrated-Curriculum/
│
├── Java-Training/
│   │
│   ├── Case Studies on Files/
│   │   ├── data/
│   │   ├── src/
│   │   └── README.md
│   │
│   └── ECommerce OOP Based Project/
│       └── EcommerceProject/
│           ├── pom.xml
│           ├── .gitignore
│           └── src/
│               └── main/
│                   └── java/
│                       └── com/ecommerce/
│
├── Jira-Training/
│   │
│   └── ShopEasy-QA/
│       ├── 01-Project-Overview/
│       ├── 02-Requirements-and-User-Stories/
│       ├── 03-Sprint-Planning/
│       ├── 04-Test-Cases/
│       ├── 05-Test-Management/
│       ├── 06-Bug-Management/
│       ├── 07-JQL-Filters/
│       ├── 08-Dashboard/
│       ├── 09-Test-Summary-Report/
│       ├── 10-Project-Exports/
│       └── README.md
│
└── README.md
```

The structure will expand as additional training modules and practical projects are completed.

---

# Training Modules

## 1. Java Training

The Java Training module focuses on developing programming skills through practical exercises, case studies, and application development.

### Topics Covered

* Java Fundamentals
* Object-Oriented Programming
* Classes and Objects
* Inheritance and Polymorphism
* Abstraction and Encapsulation
* Exception Handling
* Collections Framework
* File Handling
* Text File Operations
* Object Serialization and Deserialization
* JDBC and Database Connectivity
* DAO Pattern
* CRUD Operations

### 1.1 Case Studies on File Handling

This module contains three practical Java case studies focused on file operations and student record management.

#### Case Study 01 – Introduction to File Handling

**Objective:** Understand the Java `File` class and perform basic file operations.

**Concepts:**

* Creating and checking files.
* Identifying files and directories.
* Checking read and write permissions.
* Retrieving absolute and relative paths.
* Creating files and managing permissions.

#### Case Study 02 – Student Management System Using Text Files

**Objective:** Develop a console-based Student Management System using text-file storage.

**Features:**

* Add Student Record.
* View All Student Records.
* Search Student by Roll Number.
* Search Student by Name.
* Update Student Record.
* Delete Student Record.

**Concepts:**

* FileReader and FileWriter.
* BufferedReader and BufferedWriter.
* Append operations.
* Temporary file handling.
* Exception handling.

#### Case Study 03 – Student Management System Using Serialization

**Objective:** Implement student record management using Java Object Serialization and Deserialization.

**Features:**

* Add Student Record.
* View All Student Records.
* Search Student by Roll Number.
* Search Student by Name.
* Update Student Record.
* Delete Student Record.

**Concepts:**

* Serializable interface.
* ObjectOutputStream.
* ObjectInputStream.
* ArrayList.
* Object Serialization and Deserialization.

---

### 1.2 Ecommerce Application – OOP Based Project

**Project Name:** Ecommerce OOP Based Project

**Objective:** Develop a console-based Ecommerce application using Java Object-Oriented Programming principles and database connectivity.

The project focuses on implementing the fundamental operations of an online shopping application.

**Technologies:**

* Java
* Maven
* MySQL
* JDBC
* IntelliJ IDEA

**Application Features:**

* Customer Registration.
* Customer Login.
* Product Management.
* Product Listing.
* Shopping Cart.
* Cart Item Management.
* Checkout.
* Order Creation.
* Order Management.

**Important Concepts:**

* Object-Oriented Programming.
* Classes and Objects.
* Encapsulation.
* Model Classes.
* DAO (Data Access Object) Pattern.
* Database Connectivity.
* CRUD Operations.
* Collections Framework.
* Separation of Application Logic.

**Project Structure:**

The application follows a package-based structure:

```text
EcommerceProject/
│
├── pom.xml
│
└── src/
    └── main/
        └── java/
            └── com/
                └── ecommerce/
                    ├── Main.java
                    ├── HomeMenu.java
                    ├── LoginForm.java
                    ├── RegistrationForm.java
                    │
                    ├── config/
                    │   └── DBConnection.java
                    │
                    ├── dao/
                    │   ├── CustomerDAO.java
                    │   └── ProductDAO.java
                    │
                    ├── model/
                    │   ├── Customer.java
                    │   ├── Product.java
                    │   ├── Cart.java
                    │   ├── CartItem.java
                    │   └── Order.java
                    │
                    └── service/
                        └── OrderService.java
```

The application is being developed incrementally, with additional functionality added as the project progresses.

---

## 2. Jira Training

The Jira Training module focuses on understanding Agile project management and practical Scrum implementation using Jira.

### Topics Covered

* Jira Project Creation and Configuration.
* Scrum Project Management.
* Epics and User Stories.
* Tasks and Subtasks.
* Product Backlog Management.
* Sprint Planning.
* Sprint Execution.
* Issue Tracking.
* Bug Management.
* Jira Query Language (JQL).
* Jira Dashboards.
* Project Documentation.

### Practical Project – ShopEasy QA

| Field            | Details                              |
| ---------------- | ------------------------------------ |
| Project Name     | ShopEasy QA                          |
| Application      | ShopEasy Online Shopping Application |
| Jira Project Key | SEQ                                  |
| Methodology      | Agile Scrum                          |
| Test Management  | Xray                                 |

ShopEasy QA is a practical QA project created to understand how Jira and Xray support software testing activities.

### Project Modules

1. Account and Login.
2. Product Discovery and Shopping.
3. Cart and Checkout.

### Project Activities

* Created a Jira Scrum project.
* Created Epics and User Stories.
* Organized requirements into two sprints.
* Created and documented Xray Test Cases.
* Organized Test Cases into Test Sets.
* Created a Test Plan and Test Execution.
* Documented Bug Management and defect lifecycle.
* Prepared JQL queries for issue tracking.
* Documented QA dashboard configuration.
* Prepared a Test Summary Report.

**Project Documentation:**

[Explore ShopEasy QA](Jira-Training/ShopEasy-QA/README.md)

---

# Learning Approach

The curriculum follows a practical learning approach:

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
     Complete Assignments
             |
             v
     Build Practical Projects
             |
             v
     Document the Learning
             |
             v
      Track Improvements
```

Each module is maintained with relevant exercises, implementation details, and supporting documentation.

---

# Repository Documentation Standards

To maintain consistency:

* Use Markdown for technical documentation.
* Organize materials into meaningful folders.
* Include objectives and concepts for practical exercises.
* Document project requirements and implementation details.
* Maintain clear file and folder names.
* Include screenshots and supporting evidence where relevant.
* Use Git commits to track changes.
* Keep project documentation updated.
* Clearly distinguish completed and pending activities.

---

# Current Learning Progress

| Module                 | Focus Area                                       | Status      |
| ---------------------- | ------------------------------------------------ | ----------- |
| Java Training          | Java fundamentals and file handling case studies | In Progress |
| Java Ecommerce Project | OOP-based Ecommerce application                  | In Progress |
| Jira Training          | Agile Scrum and Jira project management          | In Progress |
| ShopEasy QA            | Practical QA project using Jira and Xray         | In Progress |
| Additional Modules     | Upcoming technical training                      | Planned     |

Progress will be updated as training activities and assignments are completed.

---

# Version Control

Git and GitHub are used to maintain source code, assignments, documentation, and project progress.

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

The ultimate objective of this curriculum is to develop the technical knowledge and practical skills required for a **QA Automation Engineering role**.

Through Java programming, database practice, application development, Agile project management, test case design, defect tracking, and practical assignments, this repository serves as a continuous record of my technical learning and development.

---

**Veeva Integrated Curriculum**

*Learn. Practise. Build. Test. Improve.*
