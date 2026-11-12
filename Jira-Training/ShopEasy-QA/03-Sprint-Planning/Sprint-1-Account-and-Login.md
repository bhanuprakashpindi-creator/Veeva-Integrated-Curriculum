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
| Current Status | User Stories Completed |

## 2. Sprint Objective

The objective of Sprint 1 was to cover the core account management and authentication features of the ShopEasy application.

This Sprint focused on user registration, login, password recovery, and secure session management.

It also included account security through temporary account locking after repeated failed login attempts.

All five User Stories included in this Sprint are currently marked Done in Jira.

## 3. Sprint Scope

The Sprint contains five User Stories under the **Account and Login** Epic.

| Jira Key | User Story | Requirement | Current Status |
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

**Key Activities:**

- Validate mandatory registration fields.
- Verify email format.
- Check duplicate email addresses.
- Validate password requirements.
- Verify successful account creation.

**Testing Focus:** Positive, negative, and boundary testing.

**Jira Status:** Done.

### SEQ-3 – User Login

**Description:** Allow registered users to authenticate using their email address and password.

**Key Activities:**

- Validate successful login.
- Verify incorrect credentials.
- Check unregistered email addresses.
- Validate empty login fields.
- Verify appropriate error messages.

**Testing Focus:** Positive and negative authentication testing.

**Jira Status:** Done.

### SEQ-4 – Account Lock

**Description:** Temporarily lock accounts after five consecutive failed login attempts.

**Key Activities:**

- Verify the fifth failed login attempt.
- Check account locking.
- Verify login rejection during the lock period.
- Validate account access after 15 minutes.

**Testing Focus:** Security and time-bound boundary testing.

**Jira Status:** Done.

### SEQ-5 – Forgot Password

**Description:** Allow registered users to recover their passwords using an email reset link.

**Key Activities:**

- Verify password reset email generation.
- Validate reset link functionality.
- Check the 30-minute expiration period.
- Verify that a reset link cannot be reused.

**Testing Focus:** Positive, negative, and time-bound testing.

**Jira Status:** Done.

### SEQ-6 – Logout

**Description:** Allow authenticated users to terminate their sessions securely.

**Key Activities:**

- Verify successful logout.
- Check session termination.
- Test browser Back button behavior after logout.

**Testing Focus:** Session management and security testing.

**Jira Status:** Done.

## 5. Story Point Estimation

Story points are used to represent the relative complexity of Sprint backlog items.

| Jira Key | User Story | Story Points |
|---|---|---|
| SEQ-2 | User Registration | As configured in Jira |
| SEQ-3 | User Login | As configured in Jira |
| SEQ-4 | Account Lock | As configured in Jira |
| SEQ-5 | Forgot Password | As configured in Jira |
| SEQ-6 | Logout | As configured in Jira |
| **Total** | **5 Stories** | **Refer to Jira** |

The actual story point values should be taken from Jira rather than estimated retrospectively.

## 6. Sprint Testing Activities

Testing activities are organized through Xray.

The following test cases have been created for the Account and Login functionality.

| Test Case ID | Jira Test Key | Test Scenario | Status |
|---|---|---|---|
| TC-01 | SEQ-20 | Valid registration | To Do |
| TC-02 | SEQ-21 | Invalid email | To Do |
| TC-03 | SEQ-22 | Invalid password | To Do |
| TC-04 | SEQ-23 | Duplicate email | To Do |
| TC-05 | SEQ-24 | Minimum password length | To Do |
| TC-07 | SEQ-25 | Valid login | To Do |
| TC-08 | SEQ-27 | Invalid credentials | To Do |
| TC-09 | SEQ-28 | Unregistered email | To Do |
| TC-10 | SEQ-29 | Empty email and password | To Do |
| TC-11 | SEQ-30 | Account lock after five failed attempts | To Do |
| TC-12 | SEQ-31 | Login blocked during lock period | To Do |
| TC-13 | SEQ-32 | Account unlock after 15 minutes | To Do |
| TC-14 | SEQ-33 | Reset link sent to registered email | To Do |
| TC-15 | SEQ-34 | Password reset using unregistered email | To Do |
| TC-16 | SEQ-35 | Reset link expires after 30 minutes | To Do |
| TC-17 | SEQ-36 | Successful logout | To Do |
| TC-18 | SEQ-37 | Browser Back after logout | To Do |

**Total Test Cases:** 17.

**Note:** TC-06 is intentionally left unused in the test case numbering.

Although the test cases have been created, their current Jira status is To Do. Therefore, test execution and result recording are still pending.

## 7. Test Management

The following Xray components were created for Sprint 1.

| Component | Jira Key | Purpose | Status |
|---|---|---|---|
| Registration Test Set | SEQ-38 | Groups registration test cases. | To Do |
| Login Test Set | SEQ-39 | Groups login test cases. | To Do |
| Account Security Test Set | SEQ-40 | Groups account security, password recovery, and logout test cases. | To Do |
| Test Plan | SEQ-41 | Organizes Sprint 1 testing scope. | To Do |
| Test Execution | SEQ-42 | Records Sprint 1 test execution results. | To Do |

The Test Plan includes the three Test Sets.

**Current progress:**

- Three Test Sets created.
- One Test Plan created.
- One Test Execution created.
- Test execution results are not yet recorded in the exported Jira data.

## 8. Test Environment

| Configuration | Value |
|---|---|
| Application | ShopEasy |
| Build | 1.0.3 |
| Environment | Staging |
| Browser | Google Chrome – Latest |
| Operating System | Windows 11 |

## 9. Sprint Execution and Tracking

Sprint progress is monitored using the Jira Scrum Board.

The following activities are tracked:

- User Story status.
- Sprint backlog progress.
- Completed work.
- Test case creation.
- Test execution results.
- Identified defects.

### Current Sprint Progress

| Activity | Total | Completed / Current Status |
|---|---:|---|
| User Stories | 5 | 5 Done |
| Xray Test Cases | 17 | 17 To Do |
| Test Sets | 3 | 3 To Do |
| Test Plan | 1 | To Do |
| Test Execution | 1 | To Do |

The five User Stories have been completed in Jira. Test execution remains pending according to the current issue statuses.

## 10. Sprint Deliverables

The following Sprint 1 components have been created:

- Five User Stories under Account and Login.
- Seventeen Xray Test Cases.
- Three Xray Test Sets.
- One Test Plan.
- One Test Execution.
- One Bug issue in the project.

The Bug issue is tracked separately through the Bug Management documentation.

## 11. Conclusion

Sprint 1 focused on the ShopEasy application's account management and authentication functionalities.

All five User Stories under Account and Login have reached the Done status in Jira.

The Sprint also established the initial Xray testing structure, including 17 Test Cases, three Test Sets, one Test Plan, and one Test Execution.

Although the planning and test design components have been created, test execution and result recording remain pending.

---

**End of Document**
