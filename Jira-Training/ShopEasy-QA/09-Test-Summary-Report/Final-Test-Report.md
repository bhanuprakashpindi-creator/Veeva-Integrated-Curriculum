# ShopEasy QA – Final Test Summary Report

## 1. Project Information

| Field | Details |
|---|---|
| Project Name | ShopEasy QA |
| Jira Project Key | SEQ |
| Application | ShopEasy Online Shopping Application |
| Application Version | 1.0.3 |
| Project Type | Scrum |
| Testing Tool | Xray for Jira |
| Issue Tracking Tool | Jira |
| Test Environment | Staging |
| Browser | Google Chrome – Latest |
| Operating System | Windows 11 |
| Report Type | Final Test Summary Report |
| Report Status | Draft – Final Execution Verification Pending |

## 2. Executive Summary

The ShopEasy QA project focuses on validating the functionality of an online shopping application.

The project uses Jira Scrum for sprint planning, issue tracking, and project management. Xray is used for test case management, test planning, and test execution.

Testing activities cover three major application modules:

1. Account and Login
2. Product Discovery and Shopping
3. Cart and Checkout

The project is organized into two one-week sprints.

The QA documentation covers project configuration, requirements, user stories, sprint planning, test case design, test sets, test planning, test execution, defect management, JQL filters, and dashboard configuration.

The project contains 49 Jira issues, including 16 User Stories, 23 Test issues, 3 Test Sets, 1 Test Plan, 1 Test Execution, and 1 Bug.

Although the testing documentation and project structure have been prepared, the Jira export does not confirm completed test execution or final defect resolution.

Therefore, the execution results and final QA assessment must be based on verified Jira and Xray records.

## 3. Testing Objectives

The main objectives are:

- Verify user registration and authentication.
- Validate account security and password recovery.
- Verify product listing and search functionality.
- Validate product filtering and sorting.
- Verify product details and stock availability.
- Test cart operations and quantity management.
- Validate coupon functionality.
- Verify checkout and payment processes.
- Identify and report application defects.
- Ensure requirements are covered by test cases.
- Maintain traceability between requirements, user stories, tests, and defects.

## 4. Testing Scope

### 4.1 In-Scope Modules

| Module | Features |
|---|---|
| Account and Login | Registration, login, account lock, forgot password, logout |
| Browse and Search | Product listing, pagination, search, filters, sorting, product details |
| Cart and Checkout | Add to cart, quantity updates, remove items, coupons, checkout, payment and confirmation |

### 4.2 Out-of-Scope Activities

The following activities are not included unless separately planned:

- Performance and load testing.
- Security penetration testing.
- Compatibility testing across all browsers and devices.
- Production environment validation.
- Third-party payment gateway certification.

## 5. Testing Approach

The project follows a structured testing approach.

1. Analyze application requirements.
2. Create Jira Epics and User Stories.
3. Organize work into Scrum Sprints.
4. Design Xray Test Cases.
5. Organize test cases into Test Sets.
6. Create a Test Plan.
7. Create Test Executions.
8. Execute test cases.
9. Report defects in Jira.
10. Retest fixed defects.
11. Prepare the final test summary.

The approach combines positive, negative, and boundary-value testing to validate the major application functionalities.

## 6. Test Environment

| Component | Configuration |
|---|---|
| Application | ShopEasy |
| Version | 1.0.3 |
| Build | 1.0.3 |
| Environment | Staging |
| Browser | Google Chrome – Latest |
| Operating System | Windows 11 |
| Test Management | Xray |
| Issue Tracking | Jira |
| Project Key | SEQ |

## 7. Sprint Summary

The project contains three Epics and 16 User Stories organized into two sprints.

| Sprint | Name | Scope | Documentation Summary |
|---|---|---|---|
| Sprint 1 | Account and Login | Registration, login, security, password recovery, logout | 5 User Stories documented as completed |
| Sprint 2 | Product Discovery and Shopping | Browse, search, cart, checkout and payment | 11 User Stories documented in the completed-project scenario |

### Jira Status Summary

The available Jira export records the following User Story statuses:

| Status | Number of User Stories |
|---|---:|
| Done | 5 |
| In Progress | 5 |
| To Do | 6 |
| **Total** | **16** |

**Note:** The documentation presents Sprint 2 as completed, but the available Jira export still records its stories as In Progress or To Do. The documentation status should not be treated as proof of actual Jira completion.

## 8. Test Case Summary

The project includes test case documentation for all three functional modules.

### 8.1 Documented Test Coverage

| Module | Testing Scope |
|---|---|
| Account and Login | Registration, authentication, account security, password recovery and logout |
| Browse and Search | Product listing, pagination, search, filters, sorting and product details |
| Cart and Checkout | Cart operations, quantity management, coupons, checkout and payment |

### 8.2 Jira Test Issue Summary

The available Jira export contains 23 Xray Test issues.

| Metric | Count |
|---|---:|
| Total Jira Test Issues | 23 |
| Test Issues with Status Done | 0 |
| Test Issues with Status In Progress | 0 |
| Test Issues with Status To Do | 23 |

The documented test case catalogue also contains additional scenarios identified with documentation IDs. These documentation-only test cases should not be counted as Jira Test issues unless they are actually created in Jira.

**Important:** The test case documentation demonstrates designed test coverage. It does not establish that all documented scenarios have been created as Jira Test issues or executed.

## 9. Test Management Summary

The project uses Xray Test Sets, a Test Plan, and a Test Execution to organize testing activities.

### 9.1 Test Sets

| Test Set ID | Jira Issue Key | Name | Test Cases |
|---|---|---|---:|
| TS-01 | SEQ-38 | Registration Test Set | 5 |
| TS-02 | SEQ-39 | Login Test Set | 4 |
| TS-03 | SEQ-40 | Account Security Test Set | 8 |
| **Total** | | **3 Test Sets** | **17** |

### 9.2 Test Plan

| Field | Details |
|---|---|
| Test Plan ID | TP-01 |
| Jira Issue Key | SEQ-41 |
| Name | Sprint 1 Account and Login Test Plan |
| Associated Test Sets | TS-01, TS-02, TS-03 |
| Current Jira Status | To Do |

### 9.3 Test Execution

| Field | Details |
|---|---|
| Test Execution ID | TE-01 |
| Jira Issue Key | SEQ-42 |
| Associated Test Plan | SEQ-41 |
| Current Jira Status | To Do |

The Jira export confirms the creation of these test management issues, but their current statuses do not establish completed execution.

## 10. Test Execution Summary

The Sprint 1 Test Execution issue has been created in Jira. However, the available export does not contain recorded execution results.

The following table reflects the currently available information.

| Metric | Result |
|---|---:|
| Total Jira Test Issues | 23 |
| Passed | 0 recorded |
| Failed | 0 recorded |
| Blocked | 0 recorded |
| Not Run / Pending | 23 |
| Executed | 0 recorded |

### Test Execution Status Definitions

- **Passed:** Actual result matches the expected result.
- **Failed:** Actual result does not match the expected result.
- **Blocked:** Test execution cannot continue because of an external dependency or issue.
- **Not Run:** Test case has not been executed.

**Note:** These figures represent the recorded Jira status information, not independently verified execution results. No final pass or fail percentage should be reported until actual execution data is available.

## 11. Defect Summary

Defects are managed through Jira Bug issues.

The available Jira export contains one Bug issue.

### 11.1 Existing Defect Record

| Field | Details |
|---|---|
| Logical ID | BUG-01 |
| Jira Issue Key | SEQ-43 |
| Related Test Issue | SEQ-27 |
| Related Test Case | TC-08 – Invalid Credentials |
| Current Status | To Do |
| Assignee | Unassigned |
| Resolution | Not recorded |

The export confirms the Bug issue and its relationship with the invalid credentials test. Detailed reproduction steps, actual behavior, severity, and priority should be verified directly in Jira.

### 11.2 Defect Statistics

| Metric | Current Information |
|---|---:|
| Bugs recorded in export | 1 |
| Required minimum | 5 |
| Additional Bugs required | 4 |
| Closed Bugs | 0 recorded |
| Resolved Bugs | 0 recorded |
| Existing Bug pending | 1 |

The assignment requirement specifies at least five Bugs. Additional defects should be recorded only when supported by actual or deliberately controlled test observations. Each Bug should be linked to its corresponding test and affected story.

### 11.3 Defect Severity Classification

| Severity | Description |
|---|---|
| Critical | Major functionality unavailable or serious application failure |
| Major | Important functionality not working correctly |
| Minor | Functionality works with limited issues |
| Trivial | Cosmetic or minor UI issue |

### 11.4 Defect Workflow

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
  +------ Pass ------> Closed
  |
  +------ Fail ------> In Progress
```

## 12. Testing Metrics

The following metrics will be calculated after test execution is completed.

### 12.1 Test Pass Percentage

```text
Pass Percentage = (Passed Tests / Executed Tests) × 100
```

### 12.2 Test Fail Percentage

```text
Fail Percentage = (Failed Tests / Executed Tests) × 100
```

### 12.3 Defect Density

```text
Defect Density = Total Defects / Total User Stories
```

### 12.4 Requirement Coverage

```text
Requirement Coverage =
(Covered Requirements / Total Requirements) × 100
```

### 12.5 Defect Closure Rate

```text
Defect Closure Rate =
(Closed Defects / Total Defects) × 100
```

Actual values must be calculated using verified Jira and Xray data.

## 13. JQL Filters and Dashboard

The project documentation includes a JQL filter section and a proposed ShopEasy QA Dashboard.

### 13.1 JQL Filters

The planned filters support:

- Open and unresolved bugs.
- Bugs grouped by priority.
- User Stories by status.
- Sprint-related issues.
- Test-related issues.

### 13.2 Dashboard Components

The proposed ShopEasy QA Dashboard includes:

| Gadget | Purpose |
|---|---|
| Sprint Burndown | Monitor sprint progress |
| Pie Chart – Bugs by Status | Review defect distribution |
| Created vs Resolved | Monitor issue trends |
| Filter Results – Open Critical Bugs | Track important defects |
| Test Execution Results | Review testing progress |

Dashboard creation, gadget availability, and configuration must be verified in Jira before being marked as completed.

## 14. Project Evidence

The following evidence is recommended for the final submission:

- Jira project overview.
- Epic and User Story hierarchy.
- Sprint 1 and Sprint 2 boards.
- Xray Test Cases.
- Test Sets and Test Plan.
- Test Execution results.
- Jira Bug reports.
- Bug workflow.
- Saved JQL filters.
- ShopEasy QA Dashboard.
- Dashboard screenshots.

Screenshots should be stored in their respective repository folders.

```text
ShopEasy-QA/
├── 06-Bug-Management/
│   └── Screenshots/
├── 07-JQL-Filters/
├── 08-Dashboard/
│   └── Screenshots/
└── 09-Test-Summary-Report/
    └── Final-Test-Report.md
```

## 15. Risks and Recommendations

### 15.1 Identified Risks

- Incomplete test execution may affect the reliability of the final report.
- Missing Jira Test issues may result in insufficient recorded test coverage.
- Insufficient defect records may not satisfy assignment requirements.
- Unverified dashboard gadgets may provide incomplete project visibility.
- Missing screenshots may reduce the available submission evidence.
- Differences between documentation and Jira statuses may affect project reporting accuracy.

### 15.2 Recommendations

- Create the remaining required Jira Test issues.
- Verify all test case and story relationships.
- Execute the planned test cases.
- Record actual Pass, Fail, Blocked, and Not Run results.
- Create and link genuine or controlled test defects.
- Retest fixed defects.
- Verify JQL filters and dashboard gadgets.
- Capture screenshots and calculate final testing metrics.
- Update this report using the final Jira and Xray records.

## 16. Final Test Assessment

**Current Assessment: Pending Final QA Verification**

The ShopEasy QA project has established its Jira project structure, requirements documentation, user stories, sprint planning, test case documentation, and initial Xray test management setup.

The project also includes documentation for defect management, dashboard configuration, and test reporting.

However, the available Jira export does not establish that all planned testing activities have been executed or that all project deliverables have received final verification.

### Final Sign-off

| Approval Item | Current Status |
|---|---|
| Project Configuration | Documented |
| Requirements and User Stories | Documented |
| Sprint Planning | Documented |
| Test Case Design | Documented |
| Test Sets and Test Plan | Created in Jira |
| Test Execution | Pending |
| Defect Management | In Progress |
| JQL Filters | Verification Pending |
| Dashboard Configuration | Verification Pending |
| Test Reporting | Draft |
| Final QA Approval | Pending |

### Final Recommendation

A Go/No-Go decision should be made only after completing the planned testing activities, reviewing outstanding defects, verifying requirement coverage, and evaluating actual execution results.

The final report should be updated with verified Jira and Xray information before submission as a completed test summary.

---

**End of Document**
