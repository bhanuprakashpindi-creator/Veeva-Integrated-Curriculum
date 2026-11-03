# Sprint 1 – Account and Login

## 1. Sprint Information

| Attribute        | Details                                                         |
| ---------------- | --------------------------------------------------------------- |
| Project          | ShopEasy QA                                                     |
| Project Key      | SEQ                                                             |
| Sprint Name      | Account and Login                                               |
| Sprint Number    | Sprint 1                                                        |
| Duration         | 1 Week                                                          |
| Methodology      | Scrum                                                           |
| Jira Board       | ShopEasy QA Scrum Board                                         |
| Sprint Objective | Validate account management and authentication functionalities. |

## 2. Sprint Objective

The objective of Sprint 1 is to cover the core account management and authentication features of the ShopEasy application.

This Sprint focuses on ensuring that users can register, log in, recover forgotten passwords, and securely manage their sessions.

It also validates account security through temporary account locking after repeated failed login attempts.

## 3. Sprint Scope

The Sprint contains five User Stories under the **Account and Login** Epic.

| Jira Key | User Story        | Requirement |
| -------- | ----------------- | ----------- |
| SEQ-2    | User Registration | REQ-A1      |
| SEQ-3    | User Login        | REQ-A2      |
| SEQ-4    | Account Lock      | REQ-A3      |
| SEQ-5    | Forgot Password   | REQ-A4      |
| SEQ-6    | Logout            | REQ-A5      |

**Total User Stories:** 5

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

### SEQ-3 – User Login

**Description:** Allow registered users to authenticate using their email address and password.

**Key Activities:**

- Validate successful login.
- Verify incorrect credentials.
- Check unregistered email addresses.
- Validate empty login fields.
- Verify appropriate error messages.

**Testing Focus:** Positive and negative authentication testing.

### SEQ-4 – Account Lock

**Description:** Temporarily lock accounts after five consecutive failed login attempts.

**Key Activities:**

- Verify the fifth failed login attempt.
- Check account locking.
- Verify login rejection during the lock period.
- Validate account access after 15 minutes.

**Testing Focus:** Security and time-bound boundary testing.

### SEQ-5 – Forgot Password

**Description:** Allow registered users to recover their passwords using an email reset link.

**Key Activities:**

- Verify password reset email generation.
- Validate reset link functionality.
- Check the 30-minute expiration period.
- Verify that a reset link cannot be reused.

**Testing Focus:** Positive, negative, and time-bound testing.

### SEQ-6 – Logout

**Description:** Allow authenticated users to terminate their sessions securely.

**Key Activities:**

- Verify successful logout.
- Check session termination.
- Test browser Back button behavior after logout.

**Testing Focus:** Session management and security testing.

## 5. Story Point Estimation

Story points are used to represent the relative complexity of the Sprint backlog items.

| Jira Key  | User Story        |          Story Points |
| --------- | ----------------- | --------------------: |
| SEQ-2     | User Registration | As configured in Jira |
| SEQ-3     | User Login        | As configured in Jira |
| SEQ-4     | Account Lock      | As configured in Jira |
| SEQ-5     | Forgot Password   | As configured in Jira |
| SEQ-6     | Logout            | As configured in Jira |
| **Total** | **5 Stories**     |  **Update from Jira** |

_The actual story point values should be taken from the Jira project rather than estimated retrospectively in this document._

## 6. Sprint Testing Activities

Testing activities are managed through Xray.

The following test cases were created for Sprint 1:

| Test Case ID | Jira Test Key | Test Scenario                           |
| ------------ | ------------- | --------------------------------------- |
| TC-01        | SEQ-20        | Valid registration                      |
| TC-02        | SEQ-21        | Invalid email                           |
| TC-03        | SEQ-22        | Invalid password                        |
| TC-04        | SEQ-23        | Duplicate email                         |
| TC-05        | SEQ-24        | Minimum password length                 |
| TC-07        | SEQ-25        | Valid login                             |
| TC-08        | SEQ-27        | Invalid credentials                     |
| TC-09        | SEQ-28        | Unregistered email                      |
| TC-10        | SEQ-29        | Empty email and password                |
| TC-11        | SEQ-30        | Account lock after five failed attempts |
| TC-12        | SEQ-31        | Login blocked during lock period        |
| TC-13        | SEQ-32        | Account unlock after 15 minutes         |
| TC-14        | SEQ-33        | Reset link sent to registered email     |
| TC-15        | SEQ-34        | Password reset using unregistered email |
| TC-16        | SEQ-35        | Reset link expires after 30 minutes     |
| TC-17        | SEQ-36        | Successful logout                       |
| TC-18        | SEQ-37        | Browser Back after logout               |

**Note:** TC-06 is intentionally left unused in the test case numbering.

## 7. Test Management

The following Xray components were created for Sprint 1:

| Component                 | Identifier | Purpose                                                            |
| ------------------------- | ---------- | ------------------------------------------------------------------ |
| Registration Test Set     | TS-01      | Groups registration test cases.                                    |
| Login Test Set            | TS-02      | Groups login test cases.                                           |
| Account Security Test Set | TS-03      | Groups account security, password recovery, and logout test cases. |
| Test Plan                 | TP-01      | Organizes Sprint 1 testing scope.                                  |
| Test Execution            | TE-01      | Records Sprint 1 test execution results.                           |

The Test Plan includes the three Test Sets.

## 8. Test Environment

| Configuration    | Value                  |
| ---------------- | ---------------------- |
| Application      | ShopEasy               |
| Build            | 1.0.3                  |
| Environment      | Staging                |
| Browser          | Google Chrome – Latest |
| Operating System | Windows 11             |

## 9. Sprint Execution and Tracking

Sprint progress is monitored using the Jira Scrum Board.

The following activities are tracked:

- User Story status.
- Sprint backlog progress.
- Completed work.
- Test case creation.
- Test execution results.
- Identified defects.

The Sprint 1 Test Execution is maintained separately in Xray.

## 10. Sprint Deliverables

The expected Sprint 1 deliverables include:

- Five User Stories.
- Registration test cases.
- Login test cases.
- Account security test cases.
- Three Xray Test Sets.
- One Test Plan.
- One Test Execution.
- Defect records for identified issues.

## 11. Conclusion

Sprint 1 focuses on the ShopEasy application's account management and authentication functionalities.

The Sprint establishes the foundation for validating user registration, login security, password recovery, and session management.

Jira Scrum is used to organize the Sprint backlog, while Xray manages the associated test cases and execution activities.

---

**End of Document**
