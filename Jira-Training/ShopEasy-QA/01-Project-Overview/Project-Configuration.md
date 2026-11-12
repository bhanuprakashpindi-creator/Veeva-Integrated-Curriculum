# ShopEasy QA – Project Configuration

## 1. Overview

ShopEasy QA is a Jira Scrum project created to manage the testing activities of an online shopping application.

The project uses Jira for Agile project management and Xray for test management. It provides a structured environment for managing Epics, User Stories, Sprints, Test Cases, Test Plans, Test Executions, and Bugs.

This document describes the project configuration, issue types, functional modules, testing components, and current project setup.

## 2. Project Details

| Configuration | Value |
|---|---|
| Project Name | ShopEasy QA |
| Project Key | SEQ |
| Project Type | Scrum |
| Project Management Tool | Jira |
| Test Management Tool | Xray |
| Application | ShopEasy Online Shopping Application |
| Application Version | 1.0.3 |
| Environment | Staging |
| Browser | Google Chrome – Latest |
| Operating System | Windows 11 |

## 3. Project Configuration

The project was configured using the Jira Scrum project template.

The following project settings were established:

- Project name and project key.
- Scrum-based project management.
- Issue types for organizing project activities.
- Epic hierarchy for grouping related functionality.
- User Stories for representing application requirements.
- Sprint planning for organizing development and testing work.
- Xray integration for test management.

## 4. Issue Types

The project uses different Jira issue types to represent various work items.

| Issue Type | Purpose |
|---|---|
| Epic | Represents a major functional module. |
| Story | Represents a user requirement or functionality. |
| Task | Represents general project activities. |
| Bug | Represents an identified application defect. |
| Sub-task | Represents a smaller activity under a parent issue. |
| Test | Represents an individual test case managed through Xray. |
| Test Set | Groups related test cases. |
| Test Plan | Organizes testing scope and test sets. |
| Test Execution | Records the execution of test cases. |

The latest Jira export confirms that the project contains Epics, Stories, Tasks, Bugs, Tests, Test Sets, a Test Plan, and a Test Execution. No Sub-task issue is listed in the export.

## 5. Epic Configuration

Three major Epics were created to organize the application functionality.

| Epic Key | Epic Name | Description | Current Status |
|---|---|---|---|
| SEQ-1 | Account and Login | Covers registration, authentication, account security, password recovery, and logout. | To Do |
| SEQ-7 | Browse And Search | Covers product listing, search, filtering, sorting, and product details. | To Do |
| SEQ-13 | Cart and Checkout | Covers cart operations, coupons, checkout, payment, and order confirmation. | To Do |

## 6. User Story Configuration

A total of 16 User Stories were created and organized under the three Epics.

| Epic | Story Keys | Story Count | Current Progress |
|---|---|---:|---|
| Account and Login | SEQ-2 to SEQ-6 | 5 | 5 Done |
| Browse And Search | SEQ-8 to SEQ-12 | 5 | 5 In Progress |
| Cart and Checkout | SEQ-14 to SEQ-19 | 6 | 6 To Do |
| **Total** | | **16** | |

Each User Story contains:

- Story summary.
- User story description.
- Acceptance criteria.
- Requirement reference.
- Epic association.

## 7. Xray Configuration

Xray was used to manage the testing activities within the Jira project.

The following Xray components have been created:

| Component | Logical Identifier | Total Created | Current Status |
|---|---|---:|---|
| Test Cases | TC-XX | 23 | 23 To Do |
| Test Sets | TS-XX | 3 | 3 To Do |
| Test Plan | TP-01 | 1 | To Do |
| Test Execution | TE-01 | 1 | To Do |

### Test Set Configuration

Three Test Sets were created to organize related test cases.

| Jira Key | Test Set |
|---|---|
| SEQ-38 | Registration Test Suite |
| SEQ-39 | Login Test Suite |
| SEQ-40 | Account Security Test Suite |

### Test Plan Configuration

One Test Plan was created for Sprint 1 testing activities.

| Jira Key | Test Plan | Status |
|---|---|---|
| SEQ-41 | Sprint 1 Test Plan | To Do |

### Test Execution Configuration

One Test Execution was created to record Sprint 1 test execution activities.

| Jira Key | Test Execution | Status |
|---|---|---|
| SEQ-42 | Sprint 1 Test Execution | To Do |

**Note:** Creating Test Cases, Test Sets, a Test Plan, and a Test Execution does not mean that test execution has been completed. The current export shows all these issues in the To Do status.

## 8. Sprint Configuration

The project uses Scrum sprint planning to organize User Stories into manageable work periods.

The functional scope is divided into the following areas:

| Sprint | Name | Functional Scope |
|---|---|---|
| Sprint 1 | Account and Login | Registration, login, account security, password recovery, and logout. |
| Product Discovery & Shopping | Product Discovery and Shopping | Product browsing, search, filters, sorting, cart, and checkout. |

### Current User Story Progress

- Account and Login: All five User Stories are Done.
- Browse And Search: All five User Stories are In Progress.
- Cart and Checkout: All six User Stories are To Do.

Detailed sprint information is maintained in the Sprint Planning documentation.

## 9. Defect Management Configuration

Jira Bug issues are used to record application defects identified during testing.

The bug reporting structure includes:

- Summary and description.
- Environment.
- Steps to reproduce.
- Expected result.
- Actual result.
- Severity.
- Priority.
- Supporting screenshots.
- Related Test Case.
- Related User Story.

### Current Bug Summary

The latest Jira export contains one Bug issue.

| Metric | Count |
|---|---:|
| Bugs Created | 1 |
| Bugs Assigned | 0 |
| Bugs In Progress | 0 |
| Bugs Resolved | 0 |
| Bugs Closed | 0 |
| Bugs Pending | 1 |

The existing Bug issue is currently in the To Do status.

### Intended Defect Workflow

**Open → In Progress → Fixed → Retest → Closed**

A defect that fails retesting can be returned to In Progress.

The workflow describes the intended defect management process. The current export does not show completed defect resolution or closure.

## 10. Identification Convention

To maintain consistency across documentation and testing activities, the following logical identifiers are used.

| Item | Naming Convention | Example |
|---|---|---|
| Jira Project | Project Key | SEQ |
| Requirements | REQ-ID | REQ-A1 |
| Test Cases | TC-XX | TC-01 |
| Test Sets | TS-XX | TS-01 |
| Test Plan | TP-XX | TP-01 |
| Test Execution | TE-XX | TE-01 |
| Bugs | BUG-XX | BUG-01 |

These are documentation identifiers. Jira issue keys remain unchanged and serve as the official issue identifiers.

## 11. Project Organization

The GitHub repository maintains the supporting documentation for the Jira project.

The documentation is organized into the following areas:

1. Project Overview
2. Requirements and User Stories
3. Sprint Planning
4. Test Cases
5. Test Management
6. Bug Management
7. JQL Filters
8. Dashboard
9. Test Summary Report
10. Project Exports

## 12. Current Project Summary

The latest Jira export contains 49 issues.

| Issue Type | Total |
|---|---:|
| Epics | 3 |
| User Stories | 16 |
| Tests | 23 |
| Test Sets | 3 |
| Test Plans | 1 |
| Test Executions | 1 |
| Tasks | 1 |
| Bugs | 1 |
| **Total** | **49** |

The project has established its main functional modules, User Stories, and initial Xray test management structure.

User Story progress currently varies across the three functional areas, while the Xray testing and defect management issues remain in the To Do status.

## 13. Conclusion

The Jira project configuration establishes the foundation for managing ShopEasy QA activities.

The combination of Jira Scrum and Xray provides a structured approach to organizing requirements, planning work, designing tests, managing test sets, recording execution activities, and tracking defects.

The project currently contains 49 Jira issues across different issue types, providing an organized foundation for continued QA practice and project management.

---

**End of Document**
