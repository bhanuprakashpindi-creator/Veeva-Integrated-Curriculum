# ShopEasy QA – Xray Test Sets

## 1. Introduction

Xray Test Sets are used to group related test cases based on their functionality or testing scope.

In the ShopEasy QA project, Test Sets organize the test cases created for the Account and Login module.

This document describes the Test Sets created in Jira and their associated test cases.

## 2. Test Set Overview

Three Test Sets were created for Sprint 1.

| Test Set ID | Test Set Name               | Functional Area                            |
| ----------- | --------------------------- | ------------------------------------------ |
| TS-01       | Registration Test Suite     | User Registration                          |
| TS-02       | Login Test Suite            | User Login                                 |
| TS-03       | Account Security Test Suite | Account Lock, Password Recovery and Logout |

## 3. TS-01 – Registration Test Suite

**Purpose:** Organize test cases related to user registration functionality.

**Related Requirement:** REQ-A1

**Related Jira Story:** SEQ-2 – User Registration

### Included Test Cases

| Test Case ID | Jira Test Key | Scenario                | Category |
| ------------ | ------------- | ----------------------- | -------- |
| TC-01        | SEQ-20        | Valid registration      | Positive |
| TC-02        | SEQ-21        | Invalid email           | Negative |
| TC-03        | SEQ-22        | Invalid password        | Negative |
| TC-04        | SEQ-23        | Duplicate email         | Negative |
| TC-05        | SEQ-24        | Minimum password length | Edge     |

**Total:** 5 Test Cases

## 4. TS-02 – Login Test Suite

**Purpose:** Organize test cases related to user authentication.

**Related Requirement:** REQ-A2

**Related Jira Story:** SEQ-3 – User Login

### Included Test Cases

| Test Case ID | Jira Test Key | Scenario                 | Category |
| ------------ | ------------- | ------------------------ | -------- |
| TC-07        | SEQ-25        | Valid login              | Positive |
| TC-08        | SEQ-27        | Invalid credentials      | Negative |
| TC-09        | SEQ-28        | Unregistered email       | Negative |
| TC-10        | SEQ-29        | Empty email and password | Negative |

**Total:** 4 Test Cases

## 5. TS-03 – Account Security Test Suite

**Purpose:** Organize test cases related to account protection, password recovery, and session management.

**Related Requirements:** REQ-A3, REQ-A4, REQ-A5

**Related Jira Stories:**

- SEQ-4 – Account Lock
- SEQ-5 – Forgot Password
- SEQ-6 – Logout

### Included Test Cases

| Test Case ID | Jira Test Key | Scenario                                | Category |
| ------------ | ------------- | --------------------------------------- | -------- |
| TC-11        | SEQ-30        | Account lock after five failed attempts | Edge     |
| TC-12        | SEQ-31        | Login blocked during lock period        | Negative |
| TC-13        | SEQ-32        | Account unlock after 15 minutes         | Positive |
| TC-14        | SEQ-33        | Reset link sent to registered email     | Positive |
| TC-15        | SEQ-34        | Password reset using unregistered email | Negative |
| TC-16        | SEQ-35        | Reset link expires after 30 minutes     | Edge     |
| TC-17        | SEQ-36        | Successful logout                       | Positive |
| TC-18        | SEQ-37        | Browser Back after logout               | Negative |

**Total:** 8 Test Cases

## 6. Test Set Summary

| Test Set                            | Test Cases     |  Total |
| ----------------------------------- | -------------- | -----: |
| TS-01 – Registration Test Suite     | TC-01 to TC-05 |      5 |
| TS-02 – Login Test Suite            | TC-07 to TC-10 |      4 |
| TS-03 – Account Security Test Suite | TC-11 to TC-18 |      8 |
| **Total**                           |                | **17** |

TC-06 is intentionally unused in the test case numbering.

## 7. Test Set Organization

The Test Sets provide the following benefits:

- Group related test cases.
- Organize testing by functional module.
- Support Test Plan creation.
- Simplify test execution preparation.
- Improve test case management.
- Maintain requirement traceability.

## 8. Relationship with Test Plan

The three Test Sets are included in the Sprint 1 Test Plan.

**Test Plan:** TP-01 – Sprint 1 Account and Login Test Plan

The Test Plan provides a consolidated view of the registration, login, and account security testing scope.

## 9. Conclusion

The Xray Test Sets organize the Sprint 1 test cases into manageable functional groups.

This structure makes it easier to maintain test coverage, prepare Test Plans, and manage execution activities.

---

**End of Document**
