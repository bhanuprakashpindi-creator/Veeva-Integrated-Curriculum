# Veeva Integrated Curriculum

### A Structured Learning Journey for QA Automation Engineering

Welcome to the **Veeva Integrated Curriculum** repository!

This repository documents my technical learning journey, hands-on training, programming exercises, case studies, assignments, and practical projects as I prepare for a career in **Quality Assurance (QA) Automation Engineering**.

The curriculum combines programming fundamentals, Object-Oriented Programming, database concepts, application development, Agile project management, and software quality assurance practices.

---

## About This Repository

The repository is organized into two main training areas:

- **Java Training** – Java programming exercises, file-handling case studies, OOP practice, and an Ecommerce application.
- **Jira Training** – Agile Scrum practice and the ShopEasy QA project, including requirements, sprint planning, test cases, test management, bug management, JQL, dashboards, and reporting documentation.

Each module is maintained in its own folder so that learning materials, source code, and project documentation are easy to find.

## Learning Objectives

- Strengthen Java programming fundamentals.
- Apply Object-Oriented Programming principles.
- Practise file handling and CRUD operations.
- Understand Java Collections and common programming techniques.
- Develop database-driven applications using JDBC and MySQL.
- Understand DAO and layered application design.
- Learn Agile Scrum and Jira project management.
- Practise test case design and test management using Xray.
- Understand defect tracking, JQL, and QA reporting.
- Maintain source code and technical documentation using Git and GitHub.

---

## Repository Structure

The following is a simplified view of the current repository. Generated folders such as `.idea`, `out`, and `target` are omitted from this documentation view.

```text
Veeva-Integrated-Curriculum/
│
├── README.md
│
├── Java-Training/
│   │
│   ├── Case Studies on Files/
│   │   ├── README.md
│   │   ├── data/
│   │   │   ├── Student.txt
│   │   │   ├── Student_Case02.txt
│   │   │   └── Student_Case03.txt
│   │   └── src/
│   │       ├── Case01.java
│   │       ├── Case02.java
│   │       ├── Case03.java
│   │       └── Questions_Of_CaseStudies/
│   │
│   ├── ECommerce OOP Based Project/
│   │   └── EcommerceProject/
│   │       ├── pom.xml
│   │       └── src/
│   │           └── main/
│   │               └── java/
│   │                   └── com/ecommerce/
│   │                       ├── Main.java
│   │                       ├── HomeMenu.java
│   │                       ├── LoginForm.java
│   │                       ├── RegistrationForm.java
│   │                       ├── config/
│   │                       │   └── DBConnection.java
│   │                       ├── dao/
│   │                       │   ├── CustomerDAO.java
│   │                       │   └── ProductDAO.java
│   │                       ├── model/
│   │                       │   ├── Cart.java
│   │                       │   ├── CartItem.java
│   │                       │   ├── Customer.java
│   │                       │   ├── Order.java
│   │                       │   └── Product.java
│   │                       └── service/
│   │                           └── OrderService.java
│   │
│   └── InventoryManagment/
│       └── src/
│           ├── Inventory.java
│           ├── InventoryManagment.java
│           └── Product.java
│
└── Jira-Training/
    ├── Jira_Hierarchical_Structure.docx
    │
    └── ShopEasy-QA/
        ├── README.md
        ├── 01-Project-Overview/
        ├── 02-Requirements-and-User-Stories/
        ├── 03-Sprint-Planning/
        ├── 04-Test-Cases/
        ├── 05-Test-Management/
        ├── 06-Bug-Management/
        ├── 07-JQL-Filters/
        ├── 08-Dashboard/
        ├── 09-Test-Summary-Report/
        └── 10-Project-Exports/
```

---

# Training Modules

## 1. Java Training

The Java Training module focuses on learning Java through programming exercises, case studies, and application development.

### Topics Practised

- Java fundamentals.
- Classes and objects.
- Object-Oriented Programming.
- Encapsulation, inheritance, abstraction, and polymorphism.
- Exception handling.
- Collections Framework.
- File handling.
- Text-file operations.
- Object serialization and deserialization.
- CRUD operations.
- JDBC and database connectivity.
- DAO pattern.

### 1.1 Case Studies on Files

**Location:** `Java-Training/Case Studies on Files/`

This module contains three Java case studies focused on file operations and student record management.

#### Case Study 01 – Introduction to File Handling

**Objective:** Practise basic file operations using Java.

**Concepts include:**

- Creating and checking files.
- Working with files and directories.
- Checking read and write permissions.
- Retrieving absolute and relative paths.

#### Case Study 02 – Student Management System Using Text Files

**Objective:** Develop a console-based student record management program using text-file storage.

**Features:**

- Add student records.
- View student records.
- Search by roll number or name.
- Update student records.
- Delete student records.

**Concepts include:**

- `FileReader` and `FileWriter`.
- `BufferedReader` and `BufferedWriter`.
- Append operations.
- Temporary-file handling.
- Exception handling.

#### Case Study 03 – Student Management System Using Serialization

**Objective:** Practise storing and retrieving student objects through Java serialization.

**Features:**

- Add student records.
- View student records.
- Search by roll number or name.
- Update student records.
- Delete student records.

**Concepts include:**

- `Serializable` interface.
- `ObjectOutputStream`.
- `ObjectInputStream`.
- `ArrayList`.
- Object serialization and deserialization.

---

### 1.2 Ecommerce Application – OOP Based Project

**Location:** `Java-Training/ECommerce OOP Based Project/EcommerceProject/`

**Objective:** Develop a console-based Ecommerce application using Java, Object-Oriented Programming, and database connectivity.

**Technologies and tools:**

- Java.
- Maven.
- MySQL.
- JDBC.
- IntelliJ IDEA.

**Application areas represented in the source structure:**

- Customer registration.
- Customer login.
- Product management.
- Shopping cart and cart items.
- Order creation and order management.

**Project organization:**

| Package / File | Responsibility |
|---|---|
| `Main.java` | Application entry point |
| `HomeMenu.java` | Main menu |
| `LoginForm.java` | Login-related functionality |
| `RegistrationForm.java` | Registration-related functionality |
| `config/` | Database configuration |
| `dao/` | Data access objects |
| `model/` | Application model classes |
| `service/` | Service-layer functionality |

**Concepts practised:**

- Object-Oriented Programming.
- Classes and objects.
- Encapsulation.
- JDBC and database connectivity.
- DAO pattern.
- CRUD operations.
- Collections.
- Separation of application responsibilities.

The application is being developed incrementally. Refer to its source code and project-level documentation for the implementation details and current functionality.

---

### 1.3 OOP Case Study 04 – Inventory Management System

**Location:** `Java-Training/InventoryManagment/`

**Objective:** Apply OOP principles to build modular Java classes for managing an inventory.

The console-based application allows a user to perform inventory operations repeatedly until choosing the exit option. Data is maintained in memory during program execution; permanent storage is not required.

**Operations:**

- Add a product with its name, price, and quantity.
- Remove a product from the inventory.
- Check the available quantity of a product.
- Update product quantity.
- Display all products.
- Continue selecting operations through a menu until exit.

**Java classes:**

| Class | Responsibility |
|---|---|
| `Product` | Stores product details such as name, price, and quantity. |
| `Inventory` | Maintains the product collection and provides inventory operations. |
| `InventoryManagment` | Contains the console menu and application entry point. |

**Concepts practised:**

- Classes and objects.
- Encapsulation using private fields, getters, and setters.
- ArrayList and the Collections Framework.
- Loops and switch statements.
- Stream API and lambda expressions.
- In-memory data management.
- CRUD-style operations.

**Implementation note:** The current implementation contains the three classes listed above. The case study asks for the console interface to be handled by `InventoryManagement` and inventory operations by `Inventory`. Separating console input/output from the inventory logic remains a recommended improvement. The source folder currently uses the spelling `InventoryManagment`.

---

## 2. Jira Training

The Jira Training module focuses on Agile project management and practical Scrum workflows using Jira.

### Topics Covered

- Jira project creation and configuration.
- Scrum project management.
- Epics and user stories.
- Tasks and subtasks.
- Product backlog management.
- Sprint planning and execution.
- Issue tracking.
- Bug management and defect lifecycle.
- Jira Query Language (JQL).
- Jira dashboards.
- QA project documentation.

### Practical Project – ShopEasy QA

**Location:** `Jira-Training/ShopEasy-QA/`

| Field | Details |
|---|---|
| Project Name | ShopEasy QA |
| Application | ShopEasy Online Shopping Application |
| Jira Project Key | SEQ |
| Methodology | Agile Scrum |
| Test Management Tool | Xray |

ShopEasy QA is a practical project used to understand how Jira and Xray support requirements management, sprint planning, test management, and defect tracking.

### Project Modules

1. Account and Login.
2. Product Discovery and Shopping.
3. Cart and Checkout.

### Documentation Structure

| Folder | Documentation |
|---|---|
| `01-Project-Overview/` | Project scope, configuration, and Jira project structure |
| `02-Requirements-and-User-Stories/` | Requirements register and user stories |
| `03-Sprint-Planning/` | Sprint overview and sprint-wise planning |
| `04-Test-Cases/` | Test cases for application modules |
| `05-Test-Management/` | Test plan, test sets, and test execution |
| `06-Bug-Management/` | Bug reports and defect lifecycle |
| `07-JQL-Filters/` | Saved JQL filters |
| `08-Dashboard/` | Dashboard configuration and supporting screenshots |
| `09-Test-Summary-Report/` | Final test report |
| `10-Project-Exports/` | Export information |

**Project Documentation:** [Explore ShopEasy QA](Jira-Training/ShopEasy-QA/README.md)

The folder structure identifies the documentation maintained for the project. Refer to the individual files for the details and actual status of each activity.

---

# Learning Approach

The curriculum follows a practical learning cycle:

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
      Document the Learning
             |
             v
       Review and Improve
```

---

# Current Learning Progress

| Module | Focus Area | Status |
|---|---|---|
| Java – File Handling | Three file-handling case studies | Practised |
| Java – Inventory Management | OOP-based inventory case study | Implemented; separation of UI and business logic can be improved |
| Java – Ecommerce | OOP-based application using JDBC and MySQL | In Progress |
| Jira – ShopEasy QA | Agile Scrum and QA project documentation | In Progress |
| Additional Training | Upcoming technical topics and tools | Planned |

Statuses are intended to reflect actual progress. Planned or pending work should not be treated as completed.

---

# Documentation Standards

- Use Markdown for technical documentation.
- Keep source code and project documentation organized.
- Include objectives, requirements, and concepts for each case study.
- Use meaningful file and folder names.
- Include screenshots or supporting evidence where relevant.
- Track source-code and documentation changes using Git.
- Update progress tables when work is completed.
- Clearly identify completed, in-progress, and planned activities.

---

# Version Control

Git and GitHub are used to maintain source code, assignments, and documentation.

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

The objective of this curriculum is to build the technical knowledge and practical skills required for a **QA Automation Engineering role**.

Through Java programming, database practice, application development, Agile project management, test case design, defect tracking, and practical assignments, this repository serves as a record of my continuous technical learning and development.

---

**Veeva Integrated Curriculum**

*Learn. Practise. Build. Test. Improve.*
