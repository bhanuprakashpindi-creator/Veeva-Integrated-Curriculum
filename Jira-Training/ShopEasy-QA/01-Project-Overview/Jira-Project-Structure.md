# ShopEasy QA – Jira Project Structure

![Jira](https://img.shields.io/badge/Project-Jira%20QA-blue)
![Project Documentation](https://img.shields.io/badge/Documentation-Completed-brightgreen)

## 1. Introduction

Jira provides a structured way to organize project activities using different issue types and relationships.

The ShopEasy QA project uses Jira Scrum and Xray to manage application requirements, sprint activities, test cases, test planning, test execution, and defects.

This document explains the Jira project hierarchy, issue types, relationships, and overall project structure.

**Project Name:** ShopEasy QA  
**Project Key:** SEQ  
**Project Type:** Scrum  
**Documentation Status:** Completed

## 2. Project Hierarchy

The ShopEasy QA project follows this organizational structure:

```text
Jira Project: ShopEasy QA (SEQ)
│
├── Epics
│   ├── User Stories
│   └── Tasks
│
├── Bugs
│
└── Xray Test Management
    ├── Tests
    ├── Test Sets
    ├── Test Plans
    └── Test Executions
```

**Note:** Xray Test Sets, Test Plans, and Test Executions are connected through Xray test management relationships. They are not all child issues in the Epic hierarchy.

## 3. Epic

An Epic represents a large functional area of the application. It groups multiple related User Stories under one major objective.

The ShopEasy QA project contains three Epics.

| Epic Key | Epic Name | Description | Jira Status |
|---|---|---|---|
| SEQ-1 | Account and Login | User registration, authentication, account security, password recovery, and logout. | To Do |
| SEQ-7 | Browse And Search | Product listing, searching, filtering, sorting, and product details. | To Do |
| SEQ-13 | Cart and Checkout | Cart management, coupons, checkout, payment, and order confirmation. | To Do |

**Total Epics:** 3

## 4. User Story

A User Story represents a specific functionality required by an end user.

Each story belongs to an Epic and contains a description and acceptance criteria.

The project contains 16 User Stories.

### User Story Distribution

| Epic | Total Stories | Jira Status |
|---|---:|---|
| Account and Login | 5 | 5 Done |
| Browse And Search | 5 | 5 In Progress |
| Cart and Checkout | 6 | 6 To Do |
| **Total** | **16** | |

### User Story Keys

- **Done:** SEQ-2 to SEQ-6.
- **In Progress:** SEQ-8 to SEQ-12.
- **To Do:** SEQ-14 to SEQ-19.

The User Stories cover the major functionalities of the ShopEasy online shopping application.

## 5. Task

A Task represents a general activity that does not necessarily describe an end-user feature.

Tasks can be used for activities such as:

- Project documentation.
- Requirement analysis.
- Test environment preparation.
- QA process documentation.
- Test reporting.

The current Jira export contains one Task issue.

**Current Jira Status:** To Do

## 6. Sub-task

A Sub-task represents a smaller activity associated with a parent issue.

It helps divide larger activities into manageable units.

Sub-tasks can be used for:

- Requirement analysis activities.
- Testing preparation.
- Documentation activities.
- Other project-related activities.

A Sub-task must be associated with a parent issue.

**Current Status:** No Sub-task issue is listed in the available Jira export.

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

The current Jira export contains one Bug issue.

### Existing Bug Record

| Field | Details |
|---|---|
| Logical ID | BUG-01 |
| Jira Issue Key | SEQ-43 |
| Related Test Issue | SEQ-27 |
| Related Test Case | TC-08 – Invalid Credentials |
| Status | To Do |
| Assignee | Unassigned |
| Resolution | Not recorded |

### Bug Statistics

| Metric | Count |
|---|---:|
| Bugs Created | 1 |
| Bugs Assigned | 0 |
| Bugs In Progress | 0 |
| Bugs Resolved | 0 |
| Bugs Closed | 0 |
| Bugs Pending | 1 |

The existing Bug is currently recorded in the **To Do** status.

## 8. Xray Test Management Issue Types

Xray provides specialized issue types for managing software testing activities.

### 8.1 Test

A Test represents an individual test case.

It contains the test scenario, preconditions, test steps, test data, and expected results.

The current project contains **23 Test issues**.

| Metric | Count |
|---|---:|
| Total Test Issues | 23 |
| Done | 0 |
| In Progress | 0 |
| To Do | 23 |

All 23 Test issues are currently recorded in the To Do status.

### 8.2 Test Set

A Test Set groups related Test issues.

It helps organize test cases based on functionality or testing scope.

The project contains three Test Sets.

| Jira Key | Test Set | Status |
|---|---|---|
| SEQ-38 | Registration Test Set | To Do |
| SEQ-39 | Login Test Set | To Do |
| SEQ-40 | Account Security Test Set | To Do |

**Total Test Sets:** 3

### 8.3 Test Plan

A Test Plan organizes testing activities by including relevant Test Sets and Tests.

It helps manage testing activities associated with a release, sprint, or functional module.

The project contains one Test Plan.

| Jira Key | Test Plan | Status |
|---|---|---|
| SEQ-41 | Sprint 1 Account and Login Test Plan | To Do |

**Total Test Plans:** 1

### 8.4 Test Execution

A Test Execution records the results of running selected test cases.

It maintains execution statuses and provides visibility into testing progress.

The project contains one Test Execution.

| Jira Key | Test Execution | Status |
|---|---|---|
| SEQ-42 | Sprint 1 Test Execution | To Do |

**Total Test Executions:** 1

**Note:** The existence of a Test Execution issue does not mean that the test cases have been executed. The available Jira export shows that the execution issue is still To Do.

## 9. Issue Relationships

The main relationships used in the project are:

| Source | Relationship | Target |
|---|---|---|
| Epic | Groups | User Stories |
| User Story | Parent of | Sub-tasks |
| Test | Tests | User Story |
| Test Set | Groups | Tests |
| Test Plan | Organizes | Tests and Test Sets |
| Test Execution | Records execution of | Tests |
| Bug | Linked to | Failed Test |
| Bug | Linked to | Related User Story |

These relationships help maintain traceability throughout the QA process.

## 10. Requirement Traceability

The project follows this requirement traceability flow:

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

It also provides a structured approach to connecting application requirements with testing and defect management activities.

## 11. Current Jira Project Summary

The available Jira CSV export contains 49 issues.

| Issue Type | Total Issues | Current Jira Status |
|---|---:|---|
| Epic | 3 | 3 To Do |
| User Story | 16 | 5 Done, 5 In Progress, 6 To Do |
| Test | 23 | 23 To Do |
| Test Set | 3 | 3 To Do |
| Test Plan | 1 | 1 To Do |
| Test Execution | 1 | 1 To Do |
| Task | 1 | 1 To Do |
| Bug | 1 | 1 To Do |
| **Total** | **49** | |

### Project Overview

- Three Epics have been created.
- Sixteen User Stories have been created and organized under the Epics.
- Twenty-three Xray Test issues have been created.
- Three Test Sets have been created.
- One Test Plan has been created.
- One Test Execution has been created.
- One Bug has been reported.
- Five User Stories are recorded as Done.
- Five User Stories are recorded as In Progress.
- Six User Stories are recorded as To Do.

**Note:** These statistics represent the Jira export at the time it was generated. Documentation completion does not automatically change the actual Jira issue statuses.

## 12. Logical Identification Convention

The project uses the following identifiers in its documentation.

| Project Item | Identifier | Example |
|---|---|---|
| Jira Project | SEQ | ShopEasy QA |
| Requirement | REQ-ID | REQ-A1 |
| Test Case | TC-XX | TC-01 |
| Test Set | TS-XX | TS-01 |
| Test Plan | TP-XX | TP-01 |
| Test Execution | TE-XX | TE-01 |
| Bug | BUG-XX | BUG-01 |

These identifiers are used for documentation and easier reference.

Jira issue keys remain the official issue identifiers.

## 13. Project Documentation Completion Summary

The Jira Project Structure documentation covers the following areas:

| No. | Documentation Area | Status |
|---|---|---|
| 1 | Project Hierarchy | Completed |
| 2 | Epic Structure | Completed |
| 3 | User Story Organization | Completed |
| 4 | Task and Sub-task Documentation | Completed |
| 5 | Bug Management Structure | Completed |
| 6 | Xray Test Issue Types | Completed |
| 7 | Test Sets and Test Plans | Completed |
| 8 | Test Execution Structure | Completed |
| 9 | Issue Relationships | Completed |
| 10 | Requirement Traceability | Completed |
| 11 | Jira Project Statistics | Completed |
| 12 | Logical Identification Convention | Completed |

**Overall Documentation Status: Completed**

## 14. Conclusion

The ShopEasy QA Jira project uses a structured approach to organize application requirements, user stories, test cases, test planning, test execution, and defect tracking.

Epics and User Stories organize application functionality, while Xray provides dedicated issue types for test design, test grouping, planning, and execution.

The current project contains 49 Jira issues across different issue types.

The documentation provides a clear overview of the project hierarchy, issue relationships, requirement traceability, and test management structure.

This structure provides a foundation for organized QA activities and demonstrates the use of Jira and Xray for software test management.

---

**Documentation Status: Completed**

**End of Document**
