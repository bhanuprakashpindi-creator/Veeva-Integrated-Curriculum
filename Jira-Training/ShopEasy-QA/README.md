# ShopEasy QA – Jira Test Management Project

![Jira](https://img.shields.io/badge/Project-Jira%20QA-blue)
![Testing](https://img.shields.io/badge/Testing-Manual%20Testing-green)
![Test Management](https://img.shields.io/badge/Test%20Management-Xray-purple)
![Status](https://img.shields.io/badge/Status-In%20Progress-orange)

## Project Overview

**ShopEasy QA** is a Jira-based software testing and test management project designed around an online shopping application.

The project demonstrates how software testing activities can be planned, organized, executed, and tracked using **Jira Scrum** and the **Xray Test Management** application.

It covers requirement analysis, user story management, sprint planning, test case design, test planning, test execution, defect tracking, JQL filtering, and QA reporting.

The project follows a structured testing workflow that connects requirements to test cases, executions, and defects.

---

## Project Information

| Attribute               | Details                              |
| ----------------------- | ------------------------------------ |
| Project Name            | ShopEasy QA                          |
| Project Key             | SEQ                                  |
| Project Type            | Scrum                                |
| Application             | ShopEasy Online Shopping Application |
| Testing Approach        | Manual Testing                       |
| Project Management Tool | Jira                                 |
| Test Management Tool    | Xray                                 |
| Test Environment        | Staging                              |
| Application Build       | 1.0.3                                |
| Browser                 | Google Chrome – Latest               |
| Operating System        | Windows 11                           |

---

## Project Objectives

- Understand Jira project configuration and Scrum project management.
- Organize application requirements using Epics and User Stories.
- Plan and manage work using Scrum sprints.
- Design functional test cases using Xray.
- Organize test cases into Test Sets and Test Plans.
- Execute test cases and record testing results.
- Identify, report, and track software defects.
- Create and use JQL filters for issue tracking.
- Configure a QA dashboard to monitor project progress.
- Prepare a final Test Summary Report.

---

## Application Modules

The ShopEasy application is divided into three major functional modules.

### 1. Account and Login

Features covered:

- User Registration
- User Login
- Account Lock
- Forgot Password
- Logout

### 2. Browse and Search

Features covered:

- Product Listing
- Product Search
- Product Filters
- Product Sorting
- Product Details

### 3. Cart and Checkout

Features covered:

- Add to Cart
- Update Product Quantity
- Remove Cart Item
- Apply Coupon
- Checkout
- Payment and Order Confirmation

---

## Jira Project Structure

The project uses a hierarchical structure to organize development and testing activities.

```text
ShopEasy QA (SEQ)
│
├── Epic 1: Account and Login
│   ├── SEQ-2  User Registration
│   ├── SEQ-3  User Login
│   ├── SEQ-4  Account Lock
│   ├── SEQ-5  Forgot Password
│   └── SEQ-6  Logout
│
├── Epic 2: Browse and Search
│   ├── SEQ-8  Products List
│   ├── SEQ-9  Search
│   ├── SEQ-10 Filters
│   ├── SEQ-11 Sorting
│   └── SEQ-12 Product Details
│
└── Epic 3: Cart and Checkout
    ├── SEQ-14 Add To Cart
    ├── SEQ-15 Quantity
    ├── SEQ-16 Remove Item
    ├── SEQ-17 Coupon
    ├── SEQ-18 Checkout
    └── SEQ-19 Payment and Confirmation
```

**Project scope:** 3 Epics and 16 User Stories.

---

## Sprint Planning

The project is organized into two Scrum sprints.

| Sprint   | Name                           | Scope                                                               |
| -------- | ------------------------------ | ------------------------------------------------------------------- |
| Sprint 1 | Account and Login              | Registration, login, account security, password recovery and logout |
| Sprint 2 | Product Discovery and Shopping | Product browsing, search, filters, sorting, cart and checkout       |

Each sprint is planned to cover its assigned stories and corresponding testing activities.

---

## Test Management with Xray

Xray is used to organize and manage testing activities within Jira.

The project includes the following test management components:

| Component      | Identifier     | Purpose                          |
| -------------- | -------------- | -------------------------------- |
| Test Cases     | TC-01 onwards  | Define individual test scenarios |
| Test Sets      | TS-01 onwards  | Group related test cases         |
| Test Plan      | TP-01          | Organize testing scope           |
| Test Execution | TE-01          | Record test execution results    |
| Bug Reports    | BUG-01 onwards | Track identified defects         |

### Test Case Categories

Test cases are designed to cover three categories:

- **Positive Testing:** Verify expected behavior using valid inputs.
- **Negative Testing:** Verify application behavior using invalid inputs.
- **Edge and Boundary Testing:** Verify behavior at minimum, maximum, and boundary conditions.

Test cases are linked to their corresponding Jira User Stories to maintain requirement traceability.

---

## Test Environment

| Configuration    | Details                |
| ---------------- | ---------------------- |
| Environment      | Staging                |
| Build Version    | 1.0.3                  |
| Browser          | Google Chrome – Latest |
| Operating System | Windows 11             |
| Application      | ShopEasy               |
| Testing Type     | Functional Testing     |

---

## Defect Management

Defects identified during testing are recorded as Jira Bug issues.

Each bug report is intended to contain:

- Bug ID and summary
- Environment details
- Preconditions
- Steps to reproduce
- Expected result
- Actual result
- Severity and priority
- Screenshot or supporting evidence
- Related Test Case and User Story

### Bug Lifecycle

```text
Open
  |
  v
In Progress
  |
  v
Fixed
  |
  v
Retest
  |
  v
Closed
```

If a defect fails retesting, it is returned to **In Progress** for further investigation and correction.

---

## JQL and Saved Filters

Jira Query Language (JQL) is used to search, filter, and monitor project issues.

The project includes filters for:

- Open bugs
- High-priority defects
- Bugs grouped by assignee
- Failed test cases
- Sprint-specific user stories

These filters support defect tracking, sprint monitoring, and test management.

---

## QA Dashboard

A Jira dashboard named **ShopEasy QA Dashboard** is planned to provide a centralized view of project quality and progress.

The dashboard includes the following reporting areas:

| Gadget                 | Purpose                              |
| ---------------------- | ------------------------------------ |
| Sprint Burndown        | Monitor sprint progress              |
| Pie Chart              | Visualize bugs by status or priority |
| Created vs Resolved    | Track defect trends                  |
| Filter Results         | Display critical open defects        |
| Test Execution Results | Monitor test execution outcomes      |

Dashboard screenshots will be maintained in the repository.

---

## Test Reporting

A final Test Summary Report will document:

- Testing overview and scope
- Test environment
- Total test cases
- Passed, failed, blocked, and not-run cases
- Defects by severity and status
- Test execution metrics
- Requirement coverage
- Testing risks
- Final Go/No-Go recommendation

Execution metrics will be calculated from the recorded test results.

---

## Repository Structure

```text
ShopEasy-QA/
│
├── README.md
│
├── 01-Project-Overview/
│   ├── Project-Configuration.md
│   ├── Project-Scope.md
│   └── Jira-Project-Structure.md
│
├── 02-Requirements-and-User-Stories/
│   ├── Requirements-Register.md
│   └── User-Stories.md
│
├── 03-Sprint-Planning/
│   ├── Sprint-Overview.md
│   ├── Sprint-1-Account-and-Login.md
│   └── Sprint-2-Product-Discovery-and-Shopping.md
│
├── 04-Test-Cases/
│   ├── Account-and-Login/
│   │   └── Test-Cases.md
│   ├── Browse-and-Search/
│   │   └── Test-Cases.md
│   └── Cart-and-Checkout/
│       └── Test-Cases.md
│
├── 05-Test-Management/
│   ├── Test-Sets.md
│   ├── Test-Plan.md
│   └── Test-Execution.md
│
├── 06-Bug-Management/
│   ├── Bug-Reports.md
│   ├── Bug-Lifecycle.md
│   └── Screenshots/
│
├── 07-JQL-Filters/
│   └── Saved-Filters.md
│
├── 08-Dashboard/
│   ├── Dashboard-Configuration.md
│   └── Screenshots/
│
├── 09-Test-Summary-Report/
│   └── Final-Test-Report.md
│
└── 10-Project-Exports/
    ├── shopeasy-jira-complete-export.csv
    └── Export-Information.md
```

---

## Tools and Technologies

| Tool       | Usage                                   |
| ---------- | --------------------------------------- |
| Jira       | Project and issue management            |
| Jira Scrum | Sprint planning and tracking            |
| Xray       | Test case and test execution management |
| JQL        | Issue searching and filtering           |
| Git        | Version control                         |
| GitHub     | Project documentation and portfolio     |

---

## Project Progress

The project is being documented and completed in stages.

| Activity                     | Status      |
| ---------------------------- | ----------- |
| Jira Project Configuration   | Completed   |
| Epic and User Story Creation | Completed   |
| Requirements Documentation   | Completed   |
| Sprint Planning              | In Progress |
| Test Case Creation           | In Progress |
| Test Sets and Test Plan      | Created     |
| Test Execution               | In Progress |
| Bug Management               | In Progress |
| JQL Filters                  | Pending     |
| Dashboard Configuration      | Pending     |
| Final Test Summary Report    | Pending     |

_Progress statuses should be updated as the corresponding Jira activities are completed._

---

## Author

**Bhanuprakash Pindi**

GitHub: [bhanuprakashpindi-creator](https://github.com/bhanuprakashpindi-creator)

---

## Conclusion

The ShopEasy QA project demonstrates a structured approach to managing software testing activities using Jira and Xray.

It brings together requirement management, Agile sprint planning, test design, test execution, defect tracking, and QA reporting in a single project.

The repository serves as a practical demonstration of Jira-based QA and test management skills.
