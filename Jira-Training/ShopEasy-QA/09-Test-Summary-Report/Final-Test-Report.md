# ShopEasy QA – Final Test Summary Report

## 1. Project Information

| Field               | Details                              |
| ------------------- | ------------------------------------ |
| Project Name        | ShopEasy QA                          |
| Jira Project Key    | SEQ                                  |
| Application         | ShopEasy Online Shopping Application |
| Application Version | 1.0.3                                |
| Project Type        | Scrum                                |
| Testing Tool        | Xray for Jira                        |
| Issue Tracking Tool | Jira                                 |
| Test Environment    | Staging                              |
| Browser             | Google Chrome – Latest               |
| Operating System    | Windows 11                           |
| Report Type         | Final Test Summary Report            |
| Report Status       | Draft – Testing Activities Pending   |

## 2. Executive Summary

The ShopEasy QA project focuses on validating the functionality of an online shopping application.

The project uses Jira Scrum for sprint planning, issue tracking, and project management. Xray is used for test case management, test planning, and test execution.

Testing activities cover three major application modules:

1. Account and Login
2. Product Discovery and Shopping
3. Cart and Checkout

The project is divided into two one-week sprints.

The Jira project structure, requirements documentation, user stories, sprint planning, and initial Xray test management setup have been documented.

However, complete test execution, defect reporting, dashboard configuration, and final result collection are still pending verification.

Therefore, this document is currently a draft and should be updated after all testing activities are completed.

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

## 4. Testing Scope

### 4.1 In-Scope Modules

| Module            | Features                                                                                 |
| ----------------- | ---------------------------------------------------------------------------------------- |
| Account and Login | Registration, login, account lock, forgot password, logout                               |
| Browse and Search | Product listing, pagination, search, filters, sorting, product details                   |
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
4. Create Xray Test Cases.
5. Organize test cases into Test Sets.
6. Create a Test Plan.
7. Create Test Executions.
8. Execute test cases.
9. Report defects in Jira.
10. Retest fixed defects.
11. Prepare the final test summary.

## 6. Test Environment

| Component        | Configuration          |
| ---------------- | ---------------------- |
| Application      | ShopEasy               |
| Version          | 1.0.3                  |
| Build            | 1.0.3                  |
| Environment      | Staging                |
| Browser          | Google Chrome – Latest |
| Operating System | Windows 11             |
| Test Management  | Xray                   |
| Issue Tracking   | Jira                   |
| Project Key      | SEQ                    |

## 7. Sprint Summary

| Sprint   | Name                           | Scope                                                    | Status                                    |
| -------- | ------------------------------ | -------------------------------------------------------- | ----------------------------------------- |
| Sprint 1 | Account and Login              | Registration, login, security, password recovery, logout | Started; story completion recorded        |
| Sprint 2 | Product Discovery and Shopping | Browse, search, cart, checkout and payment               | Started; completion requires verification |

The Jira project contains 16 User Stories across the three Epics.

## 8. Test Case Summary

The project contains Xray Test issues for functional testing.

| Module            | Test Case Range | Documentation Status                               |
| ----------------- | --------------- | -------------------------------------------------- |
| Account and Login | TC-01 to TC-18  | Documented, with TC-06 intentionally missing       |
| Browse and Search | TC-19 to TC-28  | Documented; only TC-19 and TC-20 confirmed created |
| Cart and Checkout | TC-29 to TC-40  | Planned and documented                             |

**Important:** The current Jira export contains 19 Test issues. The documented test case catalogue must not be treated as proof that every planned test has been created in Jira.

The assignment requires at least 25 test cases. Additional Jira Test issues and their execution details are still required.

## 9. Test Execution Summary

The Sprint 1 Test Execution has been created, but complete execution results have not yet been verified.

The following table must be updated after executing the test cases.

| Metric           |                     Result |
| ---------------- | -------------------------: |
| Total Test Cases | Pending final verification |
| Passed           |                    Pending |
| Failed           |                    Pending |
| Blocked          |                    Pending |
| Not Run          |                    Pending |
| Executed         |                    Pending |

### Test Execution Status Definitions

- **Passed:** Actual result matches the expected result.
- **Failed:** Actual result does not match the expected result.
- **Blocked:** Test execution cannot continue because of an external dependency or issue.
- **Not Run:** Test case has not been executed.

No final pass or fail percentage should be reported until execution data is available.

## 10. Defect Summary

Defects are managed through Jira Bug issues.

The current Jira export contains one Bug issue.

The assignment requires at least five Bugs, so additional genuine or controlled test defects must be recorded and linked to their corresponding failed tests and stories.

| Metric                   | Current Information  |
| ------------------------ | -------------------- |
| Bugs recorded in export  | 1                    |
| Required minimum         | 5                    |
| Additional Bugs required | 4                    |
| Closed Bugs              | Pending verification |
| Open Bugs                | Pending verification |
| Retested Bugs            | Pending verification |

### Defect Severity Classification

| Severity | Description                                                    |
| -------- | -------------------------------------------------------------- |
| Critical | Major functionality unavailable or serious application failure |
| Major    | Important functionality not working correctly                  |
| Minor    | Functionality works with limited issues                        |
| Trivial  | Cosmetic or minor UI issue                                     |

### Defect Workflow

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

## 11. Testing Metrics

The following metrics will be calculated after test execution is completed.

### 11.1 Test Pass Percentage

```text
Pass Percentage = (Passed Tests / Executed Tests) × 100
```

### 11.2 Test Fail Percentage

```text
Fail Percentage = (Failed Tests / Executed Tests) × 100
```

### 11.3 Defect Density

```text
Defect Density = Total Defects / Total User Stories
```

### 11.4 Requirement Coverage

```text
Requirement Coverage =
(Covered Requirements / Total Requirements) × 100
```

### 11.5 Defect Closure Rate

```text
Defect Closure Rate =
(Closed Defects / Total Defects) × 100
```

Actual values must be calculated using verified Jira and Xray data.

## 12. Risks and Pending Activities

| No. | Activity                               | Current Status       |
| --- | -------------------------------------- | -------------------- |
| 1   | Complete minimum 25 Jira Test issues   | Pending              |
| 2   | Verify all test case and story links   | Pending verification |
| 3   | Complete Sprint 1 test execution       | Pending              |
| 4   | Complete Sprint 2 test execution       | Pending              |
| 5   | Record at least five Bugs              | Pending              |
| 6   | Attach defect screenshots              | Pending              |
| 7   | Configure and verify Jira Bug workflow | Pending verification |
| 8   | Create and verify five JQL filters     | Pending verification |
| 9   | Configure dashboard gadgets            | Pending              |
| 10  | Capture dashboard screenshots          | Pending              |
| 11  | Calculate final testing metrics        | Pending              |
| 12  | Prepare final test execution evidence  | Pending              |

## 13. Dashboard and Test Evidence

The following evidence should be included in the final submission:

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

Screenshots should be stored in the appropriate repository folders.

## 14. Risks and Recommendations

### Identified Risks

- Incomplete test execution may affect the reliability of the final report.
- Missing test cases may result in insufficient requirement coverage.
- Insufficient defect records may not satisfy assignment requirements.
- Unverified dashboard gadgets may provide incomplete project visibility.
- Missing screenshots may reduce the available submission evidence.

### Recommendations

- Complete the remaining Jira Test issues.
- Execute all planned test cases.
- Record actual Pass, Fail, Blocked, and Not Run results.
- Create and link the required defect records.
- Retest fixed defects.
- Verify the JQL filters and dashboard gadgets.
- Capture screenshots and calculate final testing metrics.

## 15. Final Test Assessment

**Current Assessment: Not Ready for Final Sign-off**

The project has established its Jira structure, requirements, user stories, sprint planning, and initial Xray test management setup.

However, the final testing assessment cannot be completed until the outstanding test execution, defect management, dashboard, and evidence activities are verified.

### Final Sign-off

| Approval Item     | Status              |
| ----------------- | ------------------- |
| Test Planning     | Partially Completed |
| Test Case Design  | In Progress         |
| Test Execution    | Pending             |
| Defect Management | In Progress         |
| Test Reporting    | Draft               |
| Final QA Approval | Pending             |

**Final Recommendation:** A Go/No-Go decision should be made only after completing the planned testing activities, reviewing outstanding defects, and evaluating the actual execution results.

---

**End of Document**
