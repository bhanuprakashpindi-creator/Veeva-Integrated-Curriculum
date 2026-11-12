# ShopEasy QA – Xray Test Sets

## 1. Introduction

Xray Test Sets are used to group related test cases based on their functionality or testing scope.

In the ShopEasy QA project, three Test Sets were created to organize the test cases associated with the Account and Login module.

This document describes the Test Sets, their Jira issue keys, associated test cases, functional requirements, and relationship with the Test Plan.

## 2. Test Set Overview

Three Test Sets were created for Sprint 1.

| Test Set ID | Jira Issue Key | Test Set Name | Functional Area |
|---|---|---|---|
| TS-01 | SEQ-38 | Registration Test Set | User Registration |
| TS-02 | SEQ-39 | Login Test Set | User Login |
| TS-03 | SEQ-40 | Account Security Test Set | Account Lock, Password Recovery and Logout |

**Total Test Sets:** 3.

**Total Test Cases:** 17.

## 3. TS-01 – Registration Test Set

**Jira Issue Key:** SEQ-38

**Purpose:** Organize test cases related to user registration functionality.

**Related Requirement:** REQ-A1

**Related Jira Story:** SEQ-2 – User Registration

### Included Test Cases

| Test Case ID | Jira Test Key | Scenario | Category |
|---|---|---|---|
| TC-01 | SEQ-20 | Valid registration | Positive |
| TC-02 | SEQ-21 | Invalid email | Negative |
| TC-03 | SEQ-22 | Invalid password | Negative |
| TC-04 | SEQ-23 | Duplicate email | Negative |
| TC-05 | SEQ-24 | Minimum password length | Edge |

**Total:** 5 Test Cases.

### Testing Coverage

The Registration Test Set covers:

- Valid user registration.
- Email format validation.
- Password policy validation.
- Duplicate email prevention.
- Minimum password length validation.

## 4. TS-02 – Login Test Set

**Jira Issue Key:** SEQ-39

**Purpose:** Organize test cases related to user authentication.

**Related Requirement:** REQ-A2

**Related Jira Story:** SEQ-3 – User Login

### Included Test Cases

| Test Case ID | Jira Test Key | Scenario | Category |
|---|---|---|---|
| TC-07 | SEQ-25 | Valid login | Positive |
| TC-08 | SEQ-27 | Invalid credentials | Negative |
| TC-09 | SEQ-28 | Unregistered email | Negative |
| TC-10 | SEQ-29 | Empty email and password | Negative |

**Total:** 4 Test Cases.

### Testing Coverage

The Login Test Set covers:

- Successful user authentication.
- Invalid password handling.
- Unregistered email validation.
- Mandatory login field validation.

## 5. TS-03 – Account Security Test Set

**Jira Issue Key:** SEQ-40

**Purpose:** Organize test cases related to account protection, password recovery, and session management.

**Related Requirements:** REQ-A3, REQ-A4, REQ-A5

**Related Jira Stories:**

- SEQ-4 – Account Lock
- SEQ-5 – Forgot Password
- SEQ-6 – Logout

### Included Test Cases

| Test Case ID | Jira Test Key | Scenario | Category |
|---|---|---|---|
| TC-11 | SEQ-30 | Account lock after five failed attempts | Edge |
| TC-12 | SEQ-31 | Login blocked during lock period | Negative |
| TC-13 | SEQ-32 | Account unlock after 15 minutes | Positive |
| TC-14 | SEQ-33 | Reset link sent to registered email | Positive |
| TC-15 | SEQ-34 | Password reset using unregistered email | Negative |
| TC-16 | SEQ-35 | Reset link expires after 30 minutes | Edge |
| TC-17 | SEQ-36 | Successful logout | Positive |
| TC-18 | SEQ-37 | Browser Back after logout | Negative |

**Total:** 8 Test Cases.

### Testing Coverage

The Account Security Test Set covers:

- Account locking after repeated failed login attempts.
- Login prevention during the lock period.
- Account unlocking after 15 minutes.
- Password reset email generation.
- Password reset validation.
- Reset link expiration.
- Secure logout.
- Session management after logout.

## 6. Test Set Summary

| Test Set | Jira Key | Test Cases | Total |
|---|---|---|---:|
| TS-01 – Registration Test Set | SEQ-38 | TC-01 to TC-05 | 5 |
| TS-02 – Login Test Set | SEQ-39 | TC-07 to TC-10 | 4 |
| TS-03 – Account Security Test Set | SEQ-40 | TC-11 to TC-18 | 8 |
| **Total** | | | **17** |

**Note:** TC-06 is intentionally unused in the test case numbering.

## 7. Test Set Organization

The Test Sets provide the following benefits:

- Group related test cases.
- Organize testing by functional module.
- Simplify test case management.
- Support Test Plan creation.
- Simplify Test Execution preparation.
- Improve test coverage organization.
- Maintain requirement traceability.

## 8. Relationship with Test Plan

The three Test Sets are included in the Sprint 1 Test Plan.

**Test Plan:** TP-01 – Sprint 1 Account and Login Test Plan

**Jira Issue Key:** SEQ-41

The Test Plan provides a consolidated view of the registration, login, and account security testing scope.

### Test Plan Structure

```text
TP-01 – Sprint 1 Account and Login Test Plan
Jira Key: SEQ-41
│
├── TS-01 – Registration Test Set
│   Jira Key: SEQ-38
│   └── 5 Test Cases
│
├── TS-02 – Login Test Set
│   Jira Key: SEQ-39
│   └── 4 Test Cases
│
└── TS-03 – Account Security Test Set
    Jira Key: SEQ-40
    └── 8 Test Cases
```

## 9. Relationship with Test Execution

The Test Sets are organized under the Test Plan, while the Test Execution is used to manage and record test execution results.

| Component | ID | Jira Issue Key |
|---|---|---|
| Test Plan | TP-01 | SEQ-41 |
| Registration Test Set | TS-01 | SEQ-38 |
| Login Test Set | TS-02 | SEQ-39 |
| Account Security Test Set | TS-03 | SEQ-40 |
| Test Execution | TE-01 | SEQ-42 |

The associated Test Execution contains the Sprint 1 testing scope and provides a location for recording individual test results.

## 10. Conclusion

The Xray Test Sets organize the Sprint 1 test cases into three functional groups.

A total of 17 test cases are distributed across Registration, Login, and Account Security.

Each Test Set is associated with its corresponding Jira User Stories and functional requirements.

The Test Sets are organized under the Sprint 1 Test Plan and support the associated Test Execution.

This structure simplifies test case management, improves requirement traceability, and provides a systematic approach to organizing QA activities in the ShopEasy project.

---

**End of Document**
