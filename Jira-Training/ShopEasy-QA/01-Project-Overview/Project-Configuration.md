# ShopEasy QA – Project Configuration

## 1. Overview

ShopEasy QA is a Jira Scrum project created to manage the testing activities of an online shopping application.

The project uses Jira for Agile project management and Xray for test management. It provides a structured environment for managing Epics, User Stories, Sprints, Test Cases, Test Plans, Test Executions, and Bugs.

## 2. Project Details

| Configuration           | Value                                |
| ----------------------- | ------------------------------------ |
| Project Name            | ShopEasy QA                          |
| Project Key             | SEQ                                  |
| Project Type            | Scrum                                |
| Project Management Tool | Jira                                 |
| Test Management Tool    | Xray                                 |
| Application             | ShopEasy Online Shopping Application |
| Application Version     | 1.0.3                                |
| Environment             | Staging                              |
| Browser                 | Google Chrome – Latest               |
| Operating System        | Windows 11                           |

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

| Issue Type     | Purpose                                                  |
| -------------- | -------------------------------------------------------- |
| Epic           | Represents a major functional module.                    |
| Story          | Represents a user requirement or functionality.          |
| Task           | Represents general project activities.                   |
| Bug            | Represents an identified application defect.             |
| Sub-task       | Represents a smaller activity under a parent issue.      |
| Test           | Represents an individual test case managed through Xray. |
| Test Set       | Groups related test cases.                               |
| Test Plan      | Organizes testing scope and test sets.                   |
| Test Execution | Records the execution of test cases.                     |

## 5. Epic Configuration

Three major Epics were created to organize the application functionality.

| Epic Key | Epic Name         | Description                                                                           |
| -------- | ----------------- | ------------------------------------------------------------------------------------- |
| SEQ-1    | Account and Login | Covers registration, authentication, account security, password recovery, and logout. |
| SEQ-7    | Browse And Search | Covers product listing, search, filtering, sorting, and product details.              |
| SEQ-13   | Cart and Checkout | Covers cart operations, coupons, checkout, payment, and order confirmation.           |

## 6. User Story Configuration

A total of 16 User Stories were created and organized under the three Epics.

| Epic              | Story Keys       | Story Count |
| ----------------- | ---------------- | ----------: |
| Account and Login | SEQ-2 to SEQ-6   |           5 |
| Browse And Search | SEQ-8 to SEQ-12  |           5 |
| Cart and Checkout | SEQ-14 to SEQ-19 |           6 |
| **Total**         |                  |      **16** |

Each User Story contains:

- Story summary.
- User story description.
- Acceptance criteria.
- Requirement reference.
- Epic association.

## 7. Xray Configuration

Xray was used to manage the testing activities within the Jira project.

The following Xray components were created:

| Component      | Logical Identifier | Description                        |
| -------------- | ------------------ | ---------------------------------- |
| Test Cases     | TC-01 onwards      | Individual test scenarios.         |
| Test Sets      | TS-01 onwards      | Collections of related test cases. |
| Test Plan      | TP-01              | Sprint 1 testing scope.            |
| Test Execution | TE-01              | Sprint 1 test execution record.    |

Test cases are associated with their relevant User Stories to maintain traceability between requirements and testing activities.

## 8. Sprint Configuration

Two Scrum sprints were planned for the project.

| Sprint   | Name                           | Functional Scope                                                      |
| -------- | ------------------------------ | --------------------------------------------------------------------- |
| Sprint 1 | Account and Login              | Registration, login, account security, password recovery, and logout. |
| Sprint 2 | Product Discovery and Shopping | Product browsing, search, filters, sorting, cart, and checkout.       |

Each sprint contains the User Stories assigned to its functional scope.

Detailed sprint information is maintained in the Sprint Planning documentation.

## 9. Defect Management Configuration

Jira Bug issues are used to record application defects discovered during testing.

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

The intended defect workflow is:

**Open → In Progress → Fixed → Retest → Closed**

A defect that fails retesting is returned to In Progress.

## 10. Identification Convention

To maintain consistency across documentation and testing activities, the following logical identifiers are used.

| Item           | Naming Convention | Example |
| -------------- | ----------------- | ------- |
| Jira Project   | Project Key       | SEQ     |
| Requirements   | REQ-ID            | REQ-A1  |
| Test Cases     | TC-XX             | TC-01   |
| Test Sets      | TS-XX             | TS-01   |
| Test Plan      | TP-XX             | TP-01   |
| Test Execution | TE-XX             | TE-01   |
| Bugs           | BUG-XX            | BUG-01  |

These are documentation identifiers. Jira issue keys remain unchanged.

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

## 12. Conclusion

The Jira project configuration establishes the foundation for managing the ShopEasy QA activities.

The combination of Jira Scrum and Xray provides a structured approach to organizing requirements, planning work, designing tests, recording execution results, and tracking defects.

---

**End of Document**
