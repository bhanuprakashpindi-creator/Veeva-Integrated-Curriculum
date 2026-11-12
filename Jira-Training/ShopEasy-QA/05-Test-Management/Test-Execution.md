# ShopEasy QA – Xray Test Execution

## 1. Introduction

Xray Test Execution is used to record, manage, and monitor the results of executing test cases.

In the ShopEasy QA project, a Test Execution was created to track the testing activities associated with Sprint 1 – Account and Login.

This document describes the Test Execution configuration, test case organization, execution process, status management, defect handling, and reporting approach.

## 2. Test Execution Information

| Attribute | Details |
|---|---|
| Test Execution ID | TE-01 |
| Jira Issue Key | SEQ-42 |
| Test Execution Name | Sprint 1 Account and Login Execution |
| Project | ShopEasy QA |
| Project Key | SEQ |
| Sprint | Sprint 1 |
| Test Plan ID | TP-01 |
| Test Plan Jira Key | SEQ-41 |
| Environment | Staging |
| Build Version | 1.0.3 |
| Execution Status | To Do |

## 3. Execution Objective

The objective of this Test Execution is to verify the functionality of the Account and Login module against the defined requirements and acceptance criteria.

The execution scope covers:

- User Registration
- User Login
- Account Lock
- Forgot Password
- Logout

The Test Execution provides a centralized location to organize test cases, record execution results, identify defects, and monitor testing progress.

## 4. Test Cases Included

The following 17 test cases are included in the Sprint 1 testing scope.

| Test Case ID | Jira Test Key | Test Scenario | Requirement |
|---|---|---|---|
| TC-01 | SEQ-20 | Valid registration | REQ-A1 |
| TC-02 | SEQ-21 | Invalid email | REQ-A1 |
| TC-03 | SEQ-22 | Invalid password | REQ-A1 |
| TC-04 | SEQ-23 | Duplicate email | REQ-A1 |
| TC-05 | SEQ-24 | Minimum password length | REQ-A1 |
| TC-07 | SEQ-25 | Valid login | REQ-A2 |
| TC-08 | SEQ-27 | Invalid credentials | REQ-A2 |
| TC-09 | SEQ-28 | Unregistered email | REQ-A2 |
| TC-10 | SEQ-29 | Empty email and password | REQ-A2 |
| TC-11 | SEQ-30 | Account lock after five failed attempts | REQ-A3 |
| TC-12 | SEQ-31 | Login blocked during lock period | REQ-A3 |
| TC-13 | SEQ-32 | Account unlock after 15 minutes | REQ-A3 |
| TC-14 | SEQ-33 | Reset link sent to registered email | REQ-A4 |
| TC-15 | SEQ-34 | Password reset using unregistered email | REQ-A4 |
| TC-16 | SEQ-35 | Reset link expires after 30 minutes | REQ-A4 |
| TC-17 | SEQ-36 | Successful logout | REQ-A5 |
| TC-18 | SEQ-37 | Browser Back after logout | REQ-A5 |

**Total Test Cases:** 17.

**Note:** TC-06 is intentionally unused.

## 5. Test Environment

| Configuration | Details |
|---|---|
| Application | ShopEasy |
| Build Version | 1.0.3 |
| Environment | Staging |
| Browser | Google Chrome – Latest |
| Operating System | Windows 11 |
| Testing Type | Manual Functional Testing |
| Test Management Tool | Xray |

## 6. Test Execution Process

The following process is used to execute test cases through Xray.

1. Open the Sprint 1 Test Execution in Jira.
2. Review the test cases included in the execution.
3. Select an individual test case.
4. Review its preconditions and test data.
5. Perform the documented test steps.
6. Compare the actual application behavior with the expected result.
7. Record the execution status.
8. Add execution comments or evidence when required.
9. Create a Bug issue when unexpected behavior is identified.
10. Link the Bug to the failed Test Case and related User Story.
11. Retest the failed test case after the defect is resolved.
12. Review the final execution results.

## 7. Test Execution Statuses

The following statuses are used to represent test execution results.

| Status | Meaning |
|---|---|
| PASS | Actual behavior matches the expected result. |
| FAIL | Actual behavior does not match the expected result. |
| BLOCKED | Testing cannot proceed because of an external dependency or blocking issue. |
| TODO | Test case has not yet been executed. |
| EXECUTING | Test case execution is currently in progress. |

The available statuses may vary depending on the Xray configuration.

## 8. Execution Result Recording

Each executed test case should contain the following information:

- Test Case ID.
- Jira Test Key.
- Execution status.
- Actual result.
- Execution comments.
- Supporting evidence, if applicable.
- Related Bug, when the test fails.

Execution results must be based on the actual observed application behavior.

### Result Recording Example

| Field | Example |
|---|---|
| Test Case ID | TC-01 |
| Test Scenario | Valid registration |
| Expected Result | User account should be created successfully. |
| Actual Result | Recorded after execution. |
| Status | PASS / FAIL / BLOCKED |
| Comments | Execution observations. |

## 9. Defect Handling During Execution

When a test case fails, the following defect management process is followed:

1. Review the expected and actual results.
2. Identify the unexpected behavior.
3. Create a Jira Bug issue.
4. Assign severity and priority.
5. Attach supporting evidence.
6. Link the Bug to the failed Xray Test.
7. Link the Bug to the related User Story.
8. Track the defect through its lifecycle.
9. Retest after the fix is available.
10. Close the defect after successful verification.

The project's identified Bug is maintained separately in the Bug Management documentation.

## 10. Execution Metrics

The following metrics are used to evaluate testing progress.

### Total Executed

Total number of test cases with a recorded execution result.

**Formula:**

`Executed = Passed + Failed + Blocked`

### Pass Percentage

Percentage of executed test cases that passed.

**Formula:**

`Pass % = (Passed / Executed) × 100`

### Fail Percentage

Percentage of executed test cases that failed.

**Formula:**

`Fail % = (Failed / Executed) × 100`

### Blocked Percentage

Percentage of executed test cases that were blocked.

**Formula:**

`Blocked % = (Blocked / Executed) × 100`

### Execution Coverage

Percentage of planned test cases that have an execution result.

**Formula:**

`Execution Coverage = (Executed / Planned Test Cases) × 100`

## 11. Current Execution Status

The Test Execution issue was created in Jira to organize Sprint 1 testing activities.

However, the available Jira export shows that the Test Execution and its associated test issues have not yet received execution results.

### Current Status Summary

| Metric | Current Value |
|---|---:|
| Planned Test Cases | 17 |
| Passed | 0 recorded |
| Failed | 0 recorded |
| Blocked | 0 recorded |
| Not Run | 17 |
| Execution Status | To Do |
| Execution Coverage | 0% recorded |

**Important:** These values represent the available Jira issue status information. They do not establish that the test cases were executed and passed.

## 12. Execution Completion Criteria

The Test Execution can be considered complete when:

- All planned test cases have been executed or their remaining status documented.
- Actual results have been recorded.
- Failed test cases have corresponding defect records where applicable.
- Defects have been linked to their related tests.
- Retesting has been completed for resolved defects.
- Execution metrics have been reviewed.
- The final execution summary has been prepared.

## 13. Test Execution Deliverables

The following components are maintained as part of Sprint 1 Test Execution:

| Deliverable | Jira Key | Purpose |
|---|---|---|
| Test Execution | SEQ-42 | Manages Sprint 1 test execution. |
| Test Plan | SEQ-41 | Organizes the testing scope. |
| Registration Test Set | SEQ-38 | Groups registration test cases. |
| Login Test Set | SEQ-39 | Groups login test cases. |
| Account Security Test Set | SEQ-40 | Groups security, password recovery, and logout test cases. |
| Test Cases | SEQ-20 to SEQ-37, excluding SEQ-26 | Defines individual test scenarios. |

## 14. Conclusion

Xray Test Execution provides a structured method for recording and monitoring software testing results.

The Sprint 1 Test Execution organizes 17 test cases covering Account and Login functionality.

It supports test result recording, defect identification, retesting, execution monitoring, and requirement traceability.

The Test Execution, Test Plan, and Test Sets provide the foundation for managing the testing activities associated with the Account and Login module.

---

**End of Document**
