# ShopEasy QA – Xray Test Plan

## 1. Introduction

An Xray Test Plan is used to organize and manage the testing activities for a specific project scope or release.

In the ShopEasy QA project, a Test Plan was created to manage the testing scope of Sprint 1, which covers Account and Login functionalities.

This document describes the Test Plan configuration, included Test Sets, testing scope, and execution criteria.

## 2. Test Plan Information

| Attribute      | Details                              |
| -------------- | ------------------------------------ |
| Test Plan ID   | TP-01                                |
| Jira Issue Key | Verify in Jira                       |
| Test Plan Name | Sprint 1 Account and Login Test Plan |
| Project        | ShopEasy QA                          |
| Project Key    | SEQ                                  |
| Sprint         | Sprint 1                             |
| Testing Tool   | Xray                                 |
| Environment    | Staging                              |
| Build Version  | 1.0.3                                |

## 3. Test Plan Objective

The objective of this Test Plan is to organize and monitor testing activities for the Account and Login module.

The plan covers:

- User Registration
- User Login
- Account Lock
- Forgot Password
- Logout

It provides a consolidated view of the Test Sets and test cases included in Sprint 1.

## 4. Test Sets Included

The following Test Sets are included in the Test Plan.

| Test Set ID | Test Set Name               | Functional Area                            |
| ----------- | --------------------------- | ------------------------------------------ |
| TS-01       | Registration Test Suite     | User Registration                          |
| TS-02       | Login Test Suite            | User Login                                 |
| TS-03       | Account Security Test Suite | Account Lock, Password Recovery and Logout |

**Total Test Sets:** 3

## 5. Test Coverage

The Test Plan covers the following requirements:

| Requirement ID | Functional Area   | Jira Story |
| -------------- | ----------------- | ---------- |
| REQ-A1         | User Registration | SEQ-2      |
| REQ-A2         | User Login        | SEQ-3      |
| REQ-A3         | Account Lock      | SEQ-4      |
| REQ-A4         | Forgot Password   | SEQ-5      |
| REQ-A5         | Logout            | SEQ-6      |

The test cases are designed to cover positive, negative, and boundary conditions.

## 6. Test Environment

| Configuration    | Details                   |
| ---------------- | ------------------------- |
| Application      | ShopEasy                  |
| Build            | 1.0.3                     |
| Environment      | Staging                   |
| Browser          | Google Chrome – Latest    |
| Operating System | Windows 11                |
| Testing Approach | Manual Functional Testing |

## 7. Entry Criteria

Testing can begin when:

- The required application build is available.
- The staging environment is accessible.
- Relevant User Stories and acceptance criteria are available.
- Test cases have been created.
- Required test data is prepared.
- Test Sets have been organized.

## 8. Exit Criteria

Testing can be considered complete when:

- All planned test cases have been executed or their remaining status documented.
- Execution results have been recorded.
- Failed tests have been investigated.
- Identified defects have been reported.
- Test coverage has been reviewed.
- Testing results have been documented.

## 9. Test Execution Strategy

The Test Plan organizes the testing scope, while Test Executions record the actual results of running individual test cases.

The planned execution process is:

1. Open the Sprint 1 Test Plan.
2. Review the included Test Sets.
3. Confirm the test cases available for execution.
4. Create or open the corresponding Test Execution.
5. Execute each test case.
6. Record the actual result and execution status.
7. Link any identified defects to the failed tests.
8. Review the execution summary.

## 10. Test Deliverables

The following deliverables are associated with this Test Plan:

- Sprint 1 Test Sets.
- Xray Test Cases.
- Test Execution records.
- Defect reports.
- Test execution results.
- Requirement traceability records.

## 11. Test Plan Relationships

The Test Plan is connected to the other Xray components through the following structure:

```text
TP-01
Sprint 1 Account and Login Test Plan
│
├── TS-01 Registration Test Suite
│   └── Registration Test Cases
│
├── TS-02 Login Test Suite
│   └── Login Test Cases
│
└── TS-03 Account Security Test Suite
    ├── Account Lock Test Cases
    ├── Password Recovery Test Cases
    └── Logout Test Cases
```

The associated Test Execution records the results of executing the planned tests.

## 12. Conclusion

The Sprint 1 Test Plan provides a structured approach to managing Account and Login testing activities.

It groups related Test Sets, establishes the testing scope, and provides a foundation for recording execution results through Xray.

---

**End of Document**
