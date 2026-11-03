# ShopEasy QA – Jira Project Structure

## 1. Introduction

Jira provides a structured way to organize project activities using different issue types and relationships.

The ShopEasy QA project uses Jira Scrum and Xray to manage application requirements, sprint activities, test cases, test execution, and defects.

This document explains the Jira hierarchy and the relationships between different project issues.

## 2. Project Hierarchy

The ShopEasy QA project follows this organizational structure:

```text
Jira Project: ShopEasy QA (SEQ)
│
├── Epic
│   │
│   ├── User Story
│   │   ├── Sub-task
│   │   └── Sub-task
│   │
│   └── User Story
│
├── Task
│
├── Bug
│
└── Xray Test Management
    │
    ├── Test
    ├── Test Set
    ├── Test Plan
    └── Test Execution
```

**Note:** Xray Test Sets, Test Plans, and Test Executions are related through Xray's test management relationships. They are not all child issues in the Epic hierarchy.

## 3. Epic

An Epic represents a large functional area of the application.

It groups multiple related User Stories under one major objective.

The ShopEasy QA project contains three Epics:

| Epic Key | Epic Name         | Description                                                                         |
| -------- | ----------------- | ----------------------------------------------------------------------------------- |
| SEQ-1    | Account and Login | User registration, authentication, account security, password recovery, and logout. |
| SEQ-7    | Browse And Search | Product listing, searching, filtering, sorting, and product details.                |
| SEQ-13   | Cart and Checkout | Cart management, coupons, checkout, payment, and order confirmation.                |

## 4. User Story

A User Story represents a specific functionality required by an end user.

Each story belongs to an Epic and contains a description and acceptance criteria.

The project contains 16 User Stories.

| Epic              | Story Keys       |  Total |
| ----------------- | ---------------- | -----: |
| Account and Login | SEQ-2 to SEQ-6   |      5 |
| Browse And Search | SEQ-8 to SEQ-12  |      5 |
| Cart and Checkout | SEQ-14 to SEQ-19 |      6 |
| **Total**         |                  | **16** |

## 5. Task

A Task represents a general activity that does not necessarily describe an end-user feature.

Tasks can be used for activities such as:

- Project documentation.
- Requirement analysis.
- Test environment preparation.
- QA process documentation.
- Test reporting.

The project includes a Requirements Register task for maintaining the application's functional requirements.

## 6. Sub-task

A Sub-task represents a smaller activity associated with a parent issue.

It helps divide larger activities into manageable units.

Sub-tasks can be used for:

- Requirement analysis activities.
- Development-related activities.
- Testing preparation.
- Documentation activities.

A Sub-task must be associated with a parent issue.

## 7. Bug

A Bug represents an application defect identified during testing.

Bug issues are used to document unexpected application behavior.

A bug report contains:

- Summary.
- Description.
- Environment.
- Steps to reproduce.
- Expected result.
- Actual result.
- Severity.
- Priority.
- Supporting screenshots.
- Related Test Case and User Story.

Bugs are tracked through the defined defect lifecycle.

## 8. Xray Test Management Issue Types

Xray provides specialized issue types for managing software testing activities.

### 8.1 Test

A Test represents an individual test case.

It contains the test scenario, preconditions, test steps, test data, and expected results.

### 8.2 Test Set

A Test Set groups related Test issues.

It helps organize test cases based on functionality or testing scope.

### 8.3 Test Plan

A Test Plan organizes the testing scope by including relevant Test Sets and Tests.

It helps manage the testing activities associated with a release, sprint, or functional module.

### 8.4 Test Execution

A Test Execution records the results of running selected test cases.

It maintains execution statuses and provides visibility into testing progress.

## 9. Issue Relationships

The main relationships used in the project are:

| Source         | Relationship         | Target              |
| -------------- | -------------------- | ------------------- |
| Epic           | Contains             | User Stories        |
| User Story     | Parent of            | Sub-tasks           |
| Test           | Tests                | User Story          |
| Test Set       | Groups               | Tests               |
| Test Plan      | Organizes            | Tests and Test Sets |
| Test Execution | Records execution of | Tests               |
| Bug            | Linked to            | Failed Test         |
| Bug            | Linked to            | Related User Story  |

These relationships help maintain traceability throughout the QA process.

## 10. Requirement Traceability

The project follows the following traceability flow:

```text
Functional Requirement
        |
        v
      Epic
        |
        v
    User Story
        |
        v
    Xray Test
        |
        v
  Test Execution
        |
        v
  Bug (If Found)
        |
        v
   Retesting
```

This structure helps identify which requirement and functionality are affected by a failed test.

## 11. Logical Identification Convention

The project uses the following identifiers in its documentation:

| Project Item   | Identifier | Example     |
| -------------- | ---------- | ----------- |
| Jira Project   | SEQ        | ShopEasy QA |
| Requirement    | REQ-ID     | REQ-A1      |
| Test Case      | TC-XX      | TC-01       |
| Test Set       | TS-XX      | TS-01       |
| Test Plan      | TP-XX      | TP-01       |
| Test Execution | TE-XX      | TE-01       |
| Bug            | BUG-XX     | BUG-01      |

These identifiers are used for documentation and easier reference. Jira issue keys remain the official issue identifiers.

## 12. Conclusion

The Jira project structure organizes ShopEasy QA activities into manageable components.

Epics and User Stories organize application functionality, while Xray provides dedicated issue types for test design, test grouping, planning, and execution.

Bugs are connected to the affected tests and stories to maintain traceability and support defect management.

---

**End of Document**
