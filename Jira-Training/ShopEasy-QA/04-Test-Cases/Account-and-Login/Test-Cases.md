# ShopEasy QA – Account and Login Test Cases

## 1. Overview

This document contains the Xray test cases created for the Account and Login module of the ShopEasy application.

The test cases cover user registration, authentication, account security, password recovery, and logout functionality.

Each test case is associated with a Jira Test issue and its corresponding User Story.

## 2. Test Environment

| Configuration        | Details                |
| -------------------- | ---------------------- |
| Application          | ShopEasy               |
| Build                | 1.0.3                  |
| Environment          | Staging                |
| Browser              | Google Chrome – Latest |
| Operating System     | Windows 11             |
| Test Management Tool | Xray                   |

## 3. Test Case Summary

| Test Case ID | Jira Key | Scenario                                | Category | Requirement |
| ------------ | -------- | --------------------------------------- | -------- | ----------- |
| TC-01        | SEQ-20   | Valid registration                      | Positive | REQ-A1      |
| TC-02        | SEQ-21   | Invalid email                           | Negative | REQ-A1      |
| TC-03        | SEQ-22   | Invalid password                        | Negative | REQ-A1      |
| TC-04        | SEQ-23   | Duplicate email                         | Negative | REQ-A1      |
| TC-05        | SEQ-24   | Minimum password length                 | Edge     | REQ-A1      |
| TC-07        | SEQ-25   | Valid login                             | Positive | REQ-A2      |
| TC-08        | SEQ-27   | Invalid credentials                     | Negative | REQ-A2      |
| TC-09        | SEQ-28   | Unregistered email                      | Negative | REQ-A2      |
| TC-10        | SEQ-29   | Empty email and password                | Negative | REQ-A2      |
| TC-11        | SEQ-30   | Account lock after five failed attempts | Edge     | REQ-A3      |
| TC-12        | SEQ-31   | Login blocked during lock period        | Negative | REQ-A3      |
| TC-13        | SEQ-32   | Account unlock after 15 minutes         | Positive | REQ-A3      |
| TC-14        | SEQ-33   | Reset link sent to registered email     | Positive | REQ-A4      |
| TC-15        | SEQ-34   | Password reset using unregistered email | Negative | REQ-A4      |
| TC-16        | SEQ-35   | Reset link expires after 30 minutes     | Edge     | REQ-A4      |
| TC-17        | SEQ-36   | Successful logout                       | Positive | REQ-A5      |
| TC-18        | SEQ-37   | Browser Back after logout               | Negative | REQ-A5      |

**Total documented test cases:** 17

**Numbering note:** TC-06 is intentionally unused.

---

## 4. User Registration – REQ-A1

### TC-01 – Valid Registration

| Field         | Details  |
| ------------- | -------- |
| Jira Test Key | SEQ-20   |
| Category      | Positive |
| Priority      | High     |
| Requirement   | REQ-A1   |
| Related Story | SEQ-2    |

**Preconditions:**

- User is on the registration page.
- The email address has not been registered previously.

**Test Data:**

| Field     | Value                                                   |
| --------- | ------------------------------------------------------- |
| Full Name | Test User                                               |
| Email     | [testuser01@example.com](mailto:testuser01@example.com) |
| Password  | Test@1234                                               |

**Test Steps:**

1. Open the registration page.
2. Enter a valid full name.
3. Enter a unique email address.
4. Enter a password meeting the password policy.
5. Submit the registration form.

**Expected Result:**

- The application should accept the valid details.
- A new user account should be created successfully.
- An appropriate registration success message should be displayed.

### TC-02 – Invalid Email

| Field         | Details  |
| ------------- | -------- |
| Jira Test Key | SEQ-21   |
| Category      | Negative |
| Priority      | High     |
| Requirement   | REQ-A1   |
| Related Story | SEQ-2    |

**Preconditions:**

- User is on the registration page.

**Test Data:**

| Field     | Value               |
| --------- | ------------------- |
| Full Name | Test User           |
| Email     | testuserexample.com |
| Password  | Test@1234           |

**Test Steps:**

1. Open the registration page.
2. Enter a valid full name.
3. Enter an invalid email address.
4. Enter a valid password.
5. Submit the registration form.

**Expected Result:**

The application should reject the invalid email address and display an appropriate validation message.

### TC-03 – Invalid Password

| Field         | Details  |
| ------------- | -------- |
| Jira Test Key | SEQ-22   |
| Category      | Negative |
| Priority      | High     |
| Requirement   | REQ-A1   |
| Related Story | SEQ-2    |

**Preconditions:**

- User is on the registration page.

**Test Data:**

| Field     | Value                                                   |
| --------- | ------------------------------------------------------- |
| Full Name | Test User                                               |
| Email     | [testuser02@example.com](mailto:testuser02@example.com) |
| Password  | password                                                |

**Test Steps:**

1. Open the registration page.
2. Enter a valid full name.
3. Enter a unique email address.
4. Enter a password that does not satisfy the password policy.
5. Submit the registration form.

**Expected Result:**

The application should reject the password because it does not contain the required number and special character.

### TC-04 – Duplicate Email

| Field         | Details  |
| ------------- | -------- |
| Jira Test Key | SEQ-23   |
| Category      | Negative |
| Priority      | High     |
| Requirement   | REQ-A1   |
| Related Story | SEQ-2    |

**Preconditions:**

- An account already exists with the test email address.
- User is on the registration page.

**Test Data:**

| Field     | Value                                                       |
| --------- | ----------------------------------------------------------- |
| Full Name | Another User                                                |
| Email     | [existinguser@example.com](mailto:existinguser@example.com) |
| Password  | Test@1234                                                   |

**Test Steps:**

1. Open the registration page.
2. Enter a valid full name.
3. Enter an email address already registered.
4. Enter a valid password.
5. Submit the registration form.

**Expected Result:**

The application should prevent duplicate account registration and display an appropriate message.

### TC-05 – Minimum Password Length

| Field         | Details |
| ------------- | ------- |
| Jira Test Key | SEQ-24  |
| Category      | Edge    |
| Priority      | Medium  |
| Requirement   | REQ-A1  |
| Related Story | SEQ-2   |

**Preconditions:**

- User is on the registration page.
- The email address is unique.

**Test Data:**

| Field     | Value                                                       |
| --------- | ----------------------------------------------------------- |
| Full Name | Boundary User                                               |
| Email     | [boundaryuser@example.com](mailto:boundaryuser@example.com) |
| Password  | Abcde@12                                                    |

**Test Steps:**

1. Open the registration page.
2. Enter a valid full name.
3. Enter a unique email address.
4. Enter a password containing exactly eight characters, including a number and special character.
5. Submit the registration form.

**Expected Result:**

The application should accept the password because it satisfies the minimum length and composition requirements.

---

## 5. User Login – REQ-A2

### TC-07 – Valid Login

| Field         | Details  |
| ------------- | -------- |
| Jira Test Key | SEQ-25   |
| Category      | Positive |
| Priority      | High     |
| Requirement   | REQ-A2   |
| Related Story | SEQ-3    |

**Preconditions:**

- A registered user account exists.
- The account is not locked.

**Test Data:**

| Field    | Value                                                           |
| -------- | --------------------------------------------------------------- |
| Email    | [registereduser@example.com](mailto:registereduser@example.com) |
| Password | Test@1234                                                       |

**Test Steps:**

1. Open the login page.
2. Enter the registered email address.
3. Enter the correct password.
4. Select Login.

**Expected Result:**

The application should authenticate the user and redirect them to the home page.

### TC-08 – Invalid Credentials

| Field         | Details  |
| ------------- | -------- |
| Jira Test Key | SEQ-27   |
| Category      | Negative |
| Priority      | High     |
| Requirement   | REQ-A2   |
| Related Story | SEQ-3    |

**Preconditions:**

- A registered user account exists.
- The account is not locked.

**Test Steps:**

1. Open the login page.
2. Enter the registered email address.
3. Enter an incorrect password.
4. Select Login.

**Expected Result:**

The application should reject the login attempt and display:

`Invalid email or password`

### TC-09 – Unregistered Email

| Field         | Details  |
| ------------- | -------- |
| Jira Test Key | SEQ-28   |
| Category      | Negative |
| Priority      | Medium   |
| Requirement   | REQ-A2   |
| Related Story | SEQ-3    |

**Preconditions:**

- The test email address is not registered.

**Test Steps:**

1. Open the login page.
2. Enter an unregistered email address.
3. Enter a password.
4. Select Login.

**Expected Result:**

The application should reject the login attempt and display:

`Invalid email or password`

### TC-10 – Empty Email and Password

| Field         | Details  |
| ------------- | -------- |
| Jira Test Key | SEQ-29   |
| Category      | Negative |
| Priority      | Medium   |
| Requirement   | REQ-A2   |
| Related Story | SEQ-3    |

**Preconditions:**

- User is on the login page.

**Test Steps:**

1. Open the login page.
2. Leave the email field empty.
3. Leave the password field empty.
4. Select Login.

**Expected Result:**

The application should prevent login and display appropriate mandatory-field validation messages.

---

## 6. Account Lock – REQ-A3

### TC-11 – Account Lock After Five Failed Attempts

| Field         | Details |
| ------------- | ------- |
| Jira Test Key | SEQ-30  |
| Category      | Edge    |
| Priority      | High    |
| Requirement   | REQ-A3  |
| Related Story | SEQ-4   |

**Preconditions:**

- A registered account exists.
- The account is not locked.
- The failed-attempt counter is reset.

**Test Steps:**

1. Open the login page.
2. Enter the registered email address.
3. Enter an incorrect password.
4. Repeat the incorrect login attempt until five consecutive failures occur.

**Expected Result:**

The application should lock the account for 15 minutes after the fifth consecutive failed login attempt.

### TC-12 – Login Blocked During Lock Period

| Field         | Details  |
| ------------- | -------- |
| Jira Test Key | SEQ-31   |
| Category      | Negative |
| Priority      | High     |
| Requirement   | REQ-A3   |
| Related Story | SEQ-4    |

**Preconditions:**

- The account is already locked after five consecutive failed attempts.
- The 15-minute lock period has not expired.

**Test Steps:**

1. Open the login page.
2. Enter the registered email address.
3. Enter the correct password.
4. Select Login during the lock period.

**Expected Result:**

The application should reject the login attempt even when the correct password is provided.

### TC-13 – Account Unlock After 15 Minutes

| Field         | Details  |
| ------------- | -------- |
| Jira Test Key | SEQ-32   |
| Category      | Positive |
| Priority      | High     |
| Requirement   | REQ-A3   |
| Related Story | SEQ-4    |

**Preconditions:**

- The account has been locked for 15 minutes.
- The lock period has expired.

**Test Steps:**

1. Wait until the 15-minute lock period expires.
2. Open the login page.
3. Enter the registered email address.
4. Enter the correct password.
5. Select Login.

**Expected Result:**

The application should allow the user to log in after the lock period expires.

---

## 7. Forgot Password – REQ-A4

### TC-14 – Reset Link Sent to Registered Email

| Field         | Details  |
| ------------- | -------- |
| Jira Test Key | SEQ-33   |
| Category      | Positive |
| Priority      | High     |
| Requirement   | REQ-A4   |
| Related Story | SEQ-5    |

**Preconditions:**

- A registered user account exists.
- User can access the registered email inbox.

**Test Steps:**

1. Open the login page.
2. Select Forgot Password.
3. Enter the registered email address.
4. Submit the request.
5. Check the registered email inbox.

**Expected Result:**

The application should send a password reset link to the registered email address.

### TC-15 – Password Reset Using Unregistered Email

| Field         | Details  |
| ------------- | -------- |
| Jira Test Key | SEQ-34   |
| Category      | Negative |
| Priority      | Medium   |
| Requirement   | REQ-A4   |
| Related Story | SEQ-5    |

**Preconditions:**

- The entered email address is not registered.

**Test Steps:**

1. Open the Forgot Password page.
2. Enter an unregistered email address.
3. Submit the request.

**Expected Result:**

The application should not send a password reset link to an unregistered email address.

### TC-16 – Reset Link Expires After 30 Minutes

| Field         | Details |
| ------------- | ------- |
| Jira Test Key | SEQ-35  |
| Category      | Edge    |
| Priority      | High    |
| Requirement   | REQ-A4  |
| Related Story | SEQ-5   |

**Preconditions:**

- A valid password reset link has been generated.
- More than 30 minutes have elapsed since its generation.

**Test Steps:**

1. Open the password reset link after 30 minutes.
2. Attempt to enter a new password.
3. Submit the password reset form.

**Expected Result:**

The application should reject the expired reset link and prevent the password from being changed.

---

## 8. Logout – REQ-A5

### TC-17 – Successful Logout

| Field         | Details  |
| ------------- | -------- |
| Jira Test Key | SEQ-36   |
| Category      | Positive |
| Priority      | High     |
| Requirement   | REQ-A5   |
| Related Story | SEQ-6    |

**Preconditions:**

- User is successfully logged in.

**Test Steps:**

1. Open the authenticated application.
2. Select the Logout option.
3. Observe the application response.

**Expected Result:**

The application should terminate the user session and redirect the user to an appropriate page.

### TC-18 – Browser Back After Logout

| Field         | Details  |
| ------------- | -------- |
| Jira Test Key | SEQ-37   |
| Category      | Negative |
| Priority      | High     |
| Requirement   | REQ-A5   |
| Related Story | SEQ-6    |

**Preconditions:**

- User is logged in.
- User has already logged out successfully.

**Test Steps:**

1. Log in to the application.
2. Navigate to an authenticated account page.
3. Select Logout.
4. Press the browser Back button.

**Expected Result:**

The application should not display protected account information after logout. The user should be redirected to the login page or another appropriate unauthenticated page.

---

## 9. Test Coverage Summary

| Requirement | Test Cases     | Coverage          |
| ----------- | -------------- | ----------------- |
| REQ-A1      | TC-01 to TC-05 | Registration      |
| REQ-A2      | TC-07 to TC-10 | Login             |
| REQ-A3      | TC-11 to TC-13 | Account Security  |
| REQ-A4      | TC-14 to TC-16 | Password Recovery |
| REQ-A5      | TC-17 to TC-18 | Logout            |

## 10. Test Case Design Techniques

The following testing techniques are represented:

- Positive Testing
- Negative Testing
- Boundary Value Analysis
- Input Validation Testing
- Authentication Testing
- Session Management Testing
- Time-based Validation Testing

## 11. Conclusion

The Account and Login test cases cover the core authentication and account management functionalities of ShopEasy.

The test scenarios are organized by requirement and linked to their corresponding Jira User Stories to maintain traceability.

---

**End of Document**
