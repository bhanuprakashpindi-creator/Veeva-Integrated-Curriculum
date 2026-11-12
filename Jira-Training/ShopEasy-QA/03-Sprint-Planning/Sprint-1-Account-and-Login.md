# Sprint 1 – Account and Login

## 1. Sprint Information

| Attribute | Details |
|---|---|
| Project | ShopEasy QA |
| Project Key | SEQ |
| Sprint Name | Account and Login |
| Sprint Number | Sprint 1 |
| Duration | 1 Week |
| Methodology | Scrum |
| Jira Board | ShopEasy QA Scrum Board |
| Sprint Objective | Validate account management and authentication functionalities. |
| Sprint Status | Completed |

## 2. Sprint Objective

The objective of Sprint 1 was to validate the core account management and authentication features of the ShopEasy application.

This Sprint focused on:

- User registration.
- User login and authentication.
- Account locking after repeated failed login attempts.
- Password recovery through email reset links.
- Secure logout and session management.

All five User Stories included in this Sprint were completed. Functional, negative, boundary, and security test scenarios were documented and included in the Sprint testing scope.

## 3. Sprint Scope

The Sprint contains five User Stories under the **Account and Login** Epic.

| Jira Key | User Story | Requirement | Status |
|---|---|---|---|
| SEQ-2 | User Registration | REQ-A1 | Done |
| SEQ-3 | User Login | REQ-A2 | Done |
| SEQ-4 | Account Lock | REQ-A3 | Done |
| SEQ-5 | Forgot Password | REQ-A4 | Done |
| SEQ-6 | Logout | REQ-A5 | Done |
| **Total** | **5 User Stories** | | **5 Done** |

## 4. Sprint Backlog

### SEQ-2 – User Registration

**Description:** Allow new users to create accounts using their personal information.

**Completed Activities:**

- Validated mandatory registration fields.
- Verified email format.
- Checked duplicate email addresses.
- Validated password requirements.
- Included successful account creation scenarios.

**Testing Coverage:** Positive, negative, and boundary testing.

**Jira Status:** Done.

### SEQ-3 – User Login

**Description:** Allow registered users to authenticate using their email address and password.

**Completed Activities:**

- Validated successful login.
- Verified incorrect credentials.
- Checked unregistered email addresses.
- Validated empty login fields.
- Included appropriate error-message scenarios.

**Testing Coverage:** Positive and negative authentication testing.

**Jira Status:** Done.

### SEQ-4 – Account Lock

**Description:** Temporarily lock accounts after five consecutive failed login attempts.

**Completed Activities:**

- Verified the fifth failed login attempt.
- Covered account-locking scenarios.
- Included login rejection during the lock period.
- Covered account access after 15 minutes.

**Testing Coverage:** Security and time-bound boundary testing.

**Jira Status:** Done.

### SEQ-5 – Forgot Password

**Description:** Allow registered users to recover their passwords using an email reset link.

**Completed Activities:**

- Covered password reset email generation.
- Validated reset link functionality.
- Included the 30-minute expiration scenario.
- Covered prevention of reset-link reuse.

**Testing Coverage:** Positive, negative, and time-bound testing.

**Jira Status:** Done.

### SEQ-6 – Logout

**Description:** Allow authenticated users to terminate their sessions securely.

**Completed Activities:**

- Validated successful logout.
- Covered session termination.
- Tested browser Back button behavior after logout.

**Testing Coverage:** Session management and security testing.

**Jira Status:** Done.

## 5. Story Point Estimation

Story points represent the relative complexity of Sprint backlog items.

| Jira Key | User Story | Story Points |
|---|---|---|
| SEQ-2 | User Registration | As configured in Jira |
| SEQ-3 | User Login | As configured in Jira |
| SEQ-4 | Account Lock | As configured in Jira |
| SEQ-5 | Forgot Password | As configured in Jira |
| SEQ-6 | Logout | As configured in Jira |
| **Total** | **5 Stories** | **Refer to Jira** |

The actual story point values are maintained in Jira.

## 6. Sprint Testing Activities

Testing activities were organized using Xray. A total of 17 test cases were documented for the Account and Login functionality.

| Test Case ID | Jira Test Key | Test Scenario | Test Type |
|---|---|---|---|
| TC-01 | SEQ-20 | Valid registration | Positive |
| TC-02 | SEQ-21 | Invalid email | Negative |
| TC-03 | SEQ-22 | Invalid password | Negative |
| TC-04 | SEQ-23 | Duplicate email | Negative |
| TC-05 | SEQ-24 | Minimum password length | Boundary |
| TC-07 | SEQ-25 | Valid login | Positive |
| TC-08 | SEQ-27 | Invalid credentials | Negative |
| TC-09 | SEQ-28 | Unregistered email | Negative |
| TC-10 | SEQ-29 | Empty email and password | Negative |
| TC-11 | SEQ-30 | Account lock after five failed attempts | Security |
| TC-12 | SEQ-31 | Login blocked during lock period | Security |
| TC-13 | SEQ-32 | Account unlock after 15 minutes | Boundary |
| TC-14 | SEQ-33 | Reset link sent to registered email | Positive |
| TC-15 | SEQ-34 | Password reset using unregistered email | Negative |
| TC-16 | SEQ-35 | Reset link expires after 30 minutes | Boundary |
| TC-17 | SEQ-36 | Successful logout | Positive |
| TC-18 | SEQ-37 | Browser Back after logout | Security |

**Total Test Cases:** 17.

**Note:** TC-06 is intentionally left unused in the test case numbering.

### Testing Coverage

The Sprint testing scope covered:

- Registration field validation.
- Login authentication.
- Invalid credential handling.
- Account security and temporary locking.
- Password recovery and reset-link expiration.
- Logout and session termination.

## 7. Test Management

The following Xray components were created to organize Sprint 1 testing.

| Component | Jira Key | Purpose |
|---|---|---|
| Registration Test Set | SEQ-38 | Groups registration test cases. |
| Login Test Set | SEQ-39 | Groups login test cases. |
| Account Security Test Set | SEQ-40 | Groups account security, password recovery, and logout test cases. |
| Test Plan | SEQ-41 | Organizes Sprint 1 testing scope. |
| Test Execution | SEQ-42 | Manages Sprint 1 test execution. |

### Test Management Activities

The following activities were included in the Sprint testing workflow:

1. Created three Test Sets to organize test scenarios.
2. Grouped relevant test cases according to functionality.
3. Created a Test Plan for Sprint 1.
4. Included the Test Sets in the testing plan.
5. Created a Test Execution to manage execution activities.
6. Organized testing coverage for all five User Stories.

## 8. Test Environment

| Configuration | Value |
|---|---|
| Application | ShopEasy |
| Build | 1.0.3 |
| Environment | Staging |
| Browser | Google Chrome – Latest |
| Operating System | Windows 11 |

## 9. Sprint Execution and Tracking

Sprint progress was organized and monitored using the Jira Scrum Board.

The following activities were included in Sprint tracking:

- User Story status monitoring.
- Sprint backlog management.
- Story completion tracking.
- Test case design and organization.
- Test execution management.
- Defect identification and tracking.

### Sprint Completion Summary

| Activity | Total | Completion Summary |
|---|---:|---|
| User Stories | 5 | 5 Done |
| Test Cases | 17 | Documented |
| Test Sets | 3 | Created |
| Test Plan | 1 | Created |
| Test Execution | 1 | Created |

All five User Stories reached the Done status. The Xray components established the test management structure for the Sprint.

## 10. Sprint Deliverables

The following deliverables were included in Sprint 1:

- Five completed User Stories under Account and Login.
- Seventeen documented Test Cases.
- Three Xray Test Sets.
- One Xray Test Plan.
- One Xray Test Execution.
- Account and authentication testing documentation.
- Defect tracking documentation.

The Bug issue was maintained separately through the Bug Management documentation.

## 11. Conclusion

Sprint 1 successfully covered the ShopEasy application's account management and authentication functionalities.

All five User Stories under the Account and Login Epic reached the Done status.

A structured testing approach was established using 17 test cases, three Test Sets, one Test Plan, and one Test Execution.

The Sprint covered registration, authentication, account security, password recovery, and session management.

With the completion of the Sprint scope and its supporting QA documentation, the Account and Login module was finalized as the first completed phase of the ShopEasy QA project.

---

**End of Document**
