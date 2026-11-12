# ShopEasy QA – Jira Test Management Project

![Jira](https://img.shields.io/badge/Project-Jira%20QA-blue)
![Testing](https://img.shields.io/badge/Testing-Manual%20Testing-green)
![Test Management](https://img.shields.io/badge/Test%20Management-Xray-purple)
![Documentation](https://img.shields.io/badge/Documentation-Completed-brightgreen)

## Project Overview

**ShopEasy QA** is a Jira-based software testing and test management project designed around an online shopping application.

The project demonstrates how software testing activities can be planned, organized, managed, and monitored using **Jira Scrum** and the **Xray Test Management** application.

It covers the complete QA documentation workflow, including:

- Requirement analysis
- User story creation and management
- Epic creation and sprint planning
- Functional test case design
- Test Sets and Test Plan organization
- Test execution planning and tracking
- Defect reporting and lifecycle management
- JQL queries and saved filters
- QA dashboard configuration
- Test summary reporting
- Project documentation and exports

The project connects requirements, user stories, test cases, test plans, executions, and defects to demonstrate requirement traceability and structured QA management.

> **Documentation Status: Completed**
>
> The project documentation has been prepared. Actual Jira issue statuses and test execution results are reported separately to maintain accuracy.

---

## Project Information

| Attribute | Details |
|---|---|
| Project Name | ShopEasy QA |
| Project Key | SEQ |
| Project Type | Scrum |
| Application | ShopEasy Online Shopping Application |
| Testing Approach | Manual Testing |
| Project Management Tool | Jira |
| Test Management Tool | Xray |
| Test Environment | Staging |
| Application Build | 1.0.3 |
| Browser | Google Chrome – Latest |
| Operating System | Windows 11 |

---

## Project Objectives

- Understand Jira project configuration and Scrum project management.
- Organize application requirements using Epics and User Stories.
- Plan and manage work using Scrum sprints.
- Design functional test cases using Xray.
- Organize test cases into Test Sets and Test Plans.
- Understand and document test execution workflows.
- Identify, report, and track software defects.
- Create and use JQL filters for issue tracking.
- Configure a QA dashboard to monitor project progress.
- Prepare a Test Summary Report.
- Maintain requirement traceability throughout the testing process.

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

The project uses a hierarchical structure to organize requirements and testing activities.

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

### Jira Issue Summary

The Jira project export contains 49 issues.

| Issue Type | Total |
|---|---:|
| Epics | 3 |
| User Stories | 16 |
| Test Issues | 23 |
| Test Sets | 3 |
| Test Plan | 1 |
| Test Execution | 1 |
| Task | 1 |
| Bug | 1 |
| **Total** | **49** |

### User Story Status Summary

| Status | Count |
|---|---:|
| Done | 5 |
| In Progress | 5 |
| To Do | 6 |
| **Total** | **16** |

The five completed stories belong to the Account and Login module.

The remaining story statuses are retained according to the Jira export.

---

## Sprint Planning

The project is organized into two Scrum sprints.

| Sprint | Name | Scope |
|---|---|---|
| Sprint 1 | Account and Login | Registration, login, account security, password recovery and logout |
| Sprint 2 | Product Discovery and Shopping | Product browsing, search, filters, sorting, cart and checkout |

### Sprint 1 – Account and Login

Scope:

- User Registration
- User Login
- Account Lock
- Forgot Password
- Logout

### Sprint 2 – Product Discovery and Shopping

Scope:

- Product Listing
- Search
- Filters
- Sorting
- Product Details
- Add to Cart
- Quantity Management
- Remove Cart Item
- Coupon
- Checkout
- Payment and Confirmation

Sprint documentation includes objectives, story coverage, testing activities, and completion criteria.

---

## Requirements and User Stories

Requirements are organized into three major functional areas.

| Requirement Group | Description |
|---|---|
| REQ-A | Account and Login |
| REQ-B | Browse and Search |
| REQ-C | Cart and Checkout |

Each requirement is broken down into user stories and associated acceptance criteria.

The documentation maintains traceability between requirements, user stories, and test scenarios.

Refer to:

- `02-Requirements-and-User-Stories/Requirements-Register.md`
- `02-Requirements-and-User-Stories/User-Stories.md`

---

## Test Management with Xray

Xray is used to organize test cases and manage test planning and execution activities within Jira.

### Test Management Components

| Component | Identifier | Purpose |
|---|---|---|
| Test Cases | TC-01 onwards | Define individual test scenarios |
| Test Sets | TS-01 onwards | Group related test cases |
| Test Plan | TP-01 | Organize testing scope |
| Test Execution | TE-01 | Record test execution results |
| Bug Reports | BUG-01 onwards | Track identified defects |

### Test Sets

The project includes three Test Sets:

| Test Set | Jira Key | Purpose |
|---|---|---|
| TS-01 – Registration Test Set | SEQ-38 | Registration scenarios |
| TS-02 – Login Test Set | SEQ-39 | Login scenarios |
| TS-03 – Account Security Test Set | SEQ-40 | Account security and recovery scenarios |

### Test Plan and Execution

| Component | Identifier | Jira Key |
|---|---|---|
| Test Plan | TP-01 | SEQ-41 |
| Test Execution | TE-01 | SEQ-42 |

### Test Case Categories

Test scenarios are designed to cover:

- **Positive Testing:** Verify expected behavior using valid inputs.
- **Negative Testing:** Verify application behavior using invalid inputs.
- **Edge and Boundary Testing:** Verify behavior at minimum, maximum, and boundary conditions.

Test cases are mapped to requirements and user stories wherever applicable to maintain traceability.

---

## Test Case Documentation

Test cases are documented for all three application modules.

| Module | Documentation |
|---|---|
| Account and Login | `04-Test-Cases/Account-and-Login/Test-Cases.md` |
| Browse and Search | `04-Test-Cases/Browse-and-Search/Test-Cases.md` |
| Cart and Checkout | `04-Test-Cases/Cart-and-Checkout/Test-Cases.md` |

Each test case document includes relevant details such as:

- Test Case ID
- Test Scenario
- Requirement Reference
- Preconditions
- Test Steps
- Test Data
- Expected Result
- Priority
- Traceability information

Some additional scenarios are maintained with documentation IDs. These should not be interpreted as separate Jira Test issues unless corresponding Jira issues exist.

---

## Test Environment

| Configuration | Details |
|---|---|
| Environment | Staging |
| Build Version | 1.0.3 |
| Browser | Google Chrome – Latest |
| Operating System | Windows 11 |
| Application | ShopEasy |
| Testing Type | Functional Testing |

---

## Test Execution Management

Test execution is organized through the Xray Test Execution issue.

The execution documentation describes:

- Test execution workflow
- Test status tracking
- Recording actual results
- Capturing execution evidence
- Defect creation and linking
- Test execution metrics
- Entry and exit criteria

### Test Execution Status

According to the Jira project export, the Test Execution issue **SEQ-42** is currently in the **To Do** status.

No completed pass/fail execution results are claimed in this documentation.

Execution results should be updated in Jira after the corresponding test cases have actually been executed.

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

### Existing Bug Record

| Attribute | Details |
|---|---|
| Bug ID | BUG-01 |
| Jira Key | SEQ-43 |
| Related Test | SEQ-27 |
| Test Scenario | Invalid login credentials |
| Jira Status | To Do |

The bug record is included in the project documentation. Its actual resolution and retesting status must be verified in Jira.

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

If a defect fails retesting, it is returned to In Progress for further investigation and correction.

Refer to:

- `06-Bug-Management/Bug-Reports.md`
- `06-Bug-Management/Bug-Lifecycle.md`

---

## JQL and Saved Filters

Jira Query Language (JQL) is used to search, filter, and monitor project issues.

The project documentation covers filters for:

- Open bugs
- High-priority defects
- Bugs grouped by assignee
- Failed test cases
- Sprint-specific user stories

These filters support defect tracking, sprint monitoring, and test management.

Refer to:

`07-JQL-Filters/Saved-Filters.md`

---

## QA Dashboard

The project includes documentation for a Jira dashboard named **ShopEasy QA Dashboard**.

The dashboard is designed to provide a centralized view of project quality and progress.

### Dashboard Gadgets

| Gadget | Purpose |
|---|---|
| Sprint Burndown | Monitor sprint progress |
| Pie Chart | Visualize bugs by status or priority |
| Created vs Resolved | Track defect trends |
| Filter Results | Display critical open defects |
| Test Execution Results | Monitor test execution outcomes |

Dashboard configuration and screenshot evidence are maintained separately.

Refer to:

`08-Dashboard/Dashboard-Configuration.md`

---

## Test Reporting

A final Test Summary Report is included in the project documentation.

The report covers:

- Testing overview and scope
- Test environment
- Test case summary
- Passed, failed, blocked, and not-run cases
- Defects by severity and status
- Test execution metrics
- Requirement coverage
- Testing risks
- Final Go/No-Go recommendation

Execution metrics and final recommendations must be based on actual recorded test results.

Refer to:

`09-Test-Summary-Report/Final-Test-Report.md`

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

| Tool | Usage |
|---|---|
| Jira | Project and issue management |
| Jira Scrum | Sprint planning and tracking |
| Xray | Test case and test execution management |
| JQL | Issue searching and filtering |
| Git | Version control |
| GitHub | Project documentation and portfolio |

---

## Project Statistics

Based on the Jira project export:

| Metric | Count |
|---|---:|
| Total Jira Issues | 49 |
| Epics | 3 |
| User Stories | 16 |
| Test Issues | 23 |
| Test Sets | 3 |
| Test Plans | 1 |
| Test Executions | 1 |
| Tasks | 1 |
| Bugs | 1 |

### User Story Distribution

| Status | Count |
|---|---:|
| Done | 5 |
| In Progress | 5 |
| To Do | 6 |

The Jira export records the current issue statuses. Documentation completion does not automatically change the status of Jira issues or indicate that test execution has taken place.

---

## Project Completion Status

The project documentation deliverables have been prepared and organized.

| Activity | Documentation Status |
|---|---|
| Jira Project Configuration | Completed |
| Epic and User Story Documentation | Completed |
| Requirements Documentation | Completed |
| Project Scope Documentation | Completed |
| Sprint Planning Documentation | Completed |
| Test Case Documentation | Completed |
| Test Sets Documentation | Completed |
| Test Plan Documentation | Completed |
| Test Execution Documentation | Completed |
| Bug Management Documentation | Completed |
| JQL Filter Documentation | Completed |
| Dashboard Configuration Documentation | Completed |
| Final Test Summary Report | Completed |
| Jira Export Documentation | Completed |
| Screenshot Evidence | To Be Added |

**Overall Documentation Status: Completed**

> Note: This table represents the completion of the repository documentation. Actual Jira workflow statuses, test execution results, defect resolution, and dashboard configuration should be verified independently in Jira.

---

## Screenshots and Evidence

Screenshots will be added to the corresponding folders to demonstrate the Jira project setup and its activities.

| Evidence | Folder | Status |
|---|---|---|
| Jira Project Overview | Project Overview | To Be Added |
| Epic and User Story Structure | Project Overview | To Be Added |
| Sprint Board | Sprint Planning | To Be Added |
| Test Cases in Xray | Test Cases | To Be Added |
| Test Sets and Test Plan | Test Management | To Be Added |
| Test Execution | Test Management | To Be Added |
| Bug Report | Bug Management/Screenshots | To Be Added |
| JQL Filters | JQL Filters | To Be Added |
| QA Dashboard | Dashboard/Screenshots | To Be Added |
| Jira Export | Project Exports | To Be Added |

Screenshots should be added only after capturing the corresponding views from Jira.

---

## Author

**Bhanuprakash Pindi**

GitHub: [bhanuprakashpindi-creator](https://github.com/bhanuprakashpindi-creator)

---

## Conclusion

The ShopEasy QA project demonstrates a structured approach to software testing and test management using Jira and Xray.

It brings together requirement management, Agile sprint planning, test case design, test planning, execution management, defect tracking, JQL filtering, dashboard documentation, and QA reporting.

The repository serves as a practical portfolio demonstration of Jira-based QA documentation and test management skills.

**Project Documentation: Completed**
