# ShopEasy QA – Xray Test Plan

## 1. Introduction

An Xray Test Plan is used to organize and manage testing activities for a specific project scope or release.

In the ShopEasy QA project, a Test Plan was created to manage the testing scope of Sprint 1, which covers Account and Login functionalities.

This document describes the Test Plan configuration, included Test Sets, testing scope, execution strategy, and completion criteria.

## 2. Test Plan Information

| Attribute | Details |
|---|---|
| Test Plan ID | TP-01 |
| Jira Issue Key | SEQ-41 |
| Test Plan Name | Sprint 1 Account and Login Test Plan |
| Project | ShopEasy QA |
| Project Key | SEQ |
| Sprint | Sprint 1 |
| Testing Tool | Xray |
| Environment | Staging |
| Build Version | 1.0.3 |
| Jira Status | To Do |

## 3. Test Plan Objective

The objective of this Test Plan is to organize and monitor testing activities for the Account and Login module.

The plan covers:

- User Registration
- User Login
- Account Lock
- Forgot Password
- Logout

It provides a consolidated view of the Test Sets and test cases included in Sprint 1.

The Test Plan also establishes the relationship between requirements, User Stories, test cases, and Test Execution.

## 4. Test Sets Included

The following Test Sets are included in the Sprint 1 testing scope.

| Test Set ID | Jira Issue Key | Test Set Name | Functional Area |
|---|---|---|---|
| TS-01 | SEQ-38 | Registration Test Set | User Registration |
| TS-02 | SEQ-39 | Login Test Set | User Login |
| TS-03 | SEQ-40 | Account Security Test Set | Account Lock, Password Recovery and Logout |

**Total Test Sets:** 3.

### Test Set Organization

**TS-01 – Registration Test Set**

Includes:

- TC-01 – Valid registration
- TC-02 – Invalid email
- TC-03 – Invalid password
- TC-04 – Duplicate email
- TC-05 – Minimum password length

**TS-02 – Login Test Set**

Includes:

- TC-07 – Valid login
- TC-08 – Invalid credentials
- TC-09 – Unregistered email
- TC-10 – Empty email and password

**TS-03 – Account Security Test Set**

Includes:

- TC-11 – Account lock after five failed attempts
- TC-12 – Login blocked during lock period
- TC-13 – Account unlock after 15 minutes
- TC-14 – Reset link sent to registered email
- TC-15 – Password reset using unregistered email
- TC-16 – Reset link expires after 30 minutes
- TC-17 – Successful logout
- TC-18 – Browser Back after logout

## 5. Test Coverage

The Test Plan covers the following functional requirements and Jira User Stories.

| Requirement ID | Functional Area | Jira Story | Test Cases |
|---|---|---|---|
| REQ-A1 | User Registration | SEQ-2 | TC-01 to TC-05 |
| REQ-A2 | User Login | SEQ-3 | TC-07 to TC-10 |
| REQ-A3 | Account Lock | SEQ-4 | TC-11 to TC-13 |
| REQ-A4 | Forgot Password | SEQ-5 | TC-14 to TC-16 |
| REQ-A5 | Logout | SEQ-6 | TC-17 to TC-18 |

### Test Coverage Summary

| Functional Area | Test Cases |
|---|---:|
| User Registration | 5 |
| User Login | 4 |
| Account Lock | 3 |
| Forgot Password | 3 |
| Logout | 2 |
| **Total** | **17** |

The test cases cover positive, negative, boundary, authentication, and security scenarios.

## 6. Test Environment

| Configuration | Details |
|---|---|
| Application | ShopEasy |
| Build | 1.0.3 |
| Environment | Staging |
| Browser | Google Chrome – Latest |
| Operating System | Windows 11 |
| Testing Approach | Manual Functional Testing |
| Test Management Tool | Xray |

## 7. Entry Criteria

Testing can begin when:

- The required application build is available.
- The staging environment is accessible.
- Relevant User Stories and acceptance criteria are available.
- Test cases have been created.
- Required test data is prepared.
- Test Sets have been organized.
- The Test Execution is available.

## 8. Exit Criteria

Testing can be considered complete when:

- All planned test cases have been executed or their remaining status documented.
- Execution results have been recorded.
- Failed tests have been investigated.
- Identified defects have been reported.
- Defects have been linked to their corresponding test cases.
- Test coverage has been reviewed.
- Testing results have been documented.
- The final execution summary has been prepared.

## 9. Test Execution Strategy

The Test Plan organizes the testing scope, while Test Executions record the actual results of running individual test cases.

The planned execution process is:

1. Open the Sprint 1 Test Plan.
2. Review the included Test Sets.
3. Confirm the test cases available for execution.
4. Open the corresponding Test Execution.
5. Execute each test case.
6. Compare actual results with expected results.
7. Record the execution status.
8. Link any identified defects to the failed tests.
9. Retest failed test cases after defect resolution.
10. Review the execution summary.

### Associated Test Execution

| Attribute | Details |
|---|---|
| Test Execution ID | TE-01 |
| Jira Issue Key | SEQ-42 |
| Test Execution Name | Sprint 1 Account and Login Execution |
| Related Test Plan | TP-01 |
| Test Plan Jira Key | SEQ-41 |
| Planned Test Cases | 17 |

## 10. Test Deliverables

The following deliverables are associated with this Test Plan:

- Three Sprint 1 Test Sets.
- Seventeen Xray Test Cases.
- One Xray Test Plan.
- One Test Execution.
- Defect reports.
- Test execution records.
- Requirement traceability documentation.
- Final testing summary.

## 11. Test Plan Relationships

The Test Plan is connected to the other Xray components through the following structure:

```text
TP-01 – Sprint 1 Account and Login Test Plan
Jira Key: SEQ-41
│
├── TS-01 – Registration Test Set
│   Jira Key: SEQ-38
│   ├── TC-01 – Valid Registration
│   ├── TC-02 – Invalid Email
│   ├── TC-03 – Invalid Password
│   ├── TC-04 – Duplicate Email
│   └── TC-05 – Minimum Password Length
│
├── TS-02 – Login Test Set
│   Jira Key: SEQ-39
│   ├── TC-07 – Valid Login
│   ├── TC-08 – Invalid Credentials
│   ├── TC-09 – Unregistered Email
│   └── TC-10 – Empty Email and Password
│
└── TS-03 – Account Security Test Set
    Jira Key: SEQ-40
    ├── TC-11 – Account Lock
    ├── TC-12 – Login During Lock Period
    ├── TC-13 – Account Unlock
    ├── TC-14 – Reset Link Sent
    ├── TC-15 – Unregistered Email Reset
    ├── TC-16 – Reset Link Expiration
    ├── TC-17 – Successful Logout
    └── TC-18 – Browser Back After Logout

Associated Test Execution:
TE-01 – Sprint 1 Account and Login Execution
Jira Key: SEQ-42
```

The Test Plan organizes the testing scope, and the associated Test Execution is used to record the results of executing the planned tests.

## 12. Test Plan Status and Tracking

The Test Plan and its associated Xray components are tracked through Jira.

| Component | Jira Key | Purpose |
|---|---|---|
| Test Plan | SEQ-41 | Organizes Sprint 1 testing scope |
| Registration Test Set | SEQ-38 | Groups registration scenarios |
| Login Test Set | SEQ-39 | Groups login scenarios |
| Account Security Test Set | SEQ-40 | Groups security and account recovery scenarios |
| Test Execution | SEQ-42 | Manages test execution results |

The Test Plan provides the organization and traceability needed to manage the Sprint 1 testing activities.

## 13. Conclusion

The Sprint 1 Test Plan provides a structured approach to managing Account and Login testing activities.

It organizes three Test Sets containing 17 test cases across five functional requirements and five Jira User Stories.

The Test Plan establishes a clear relationship between requirements, test scenarios, Test Sets, and Test Execution.

Together, these Xray components provide a structured foundation for test management, execution tracking, defect reporting, and requirement traceability throughout the ShopEasy QA project.

---

**End of Document**
