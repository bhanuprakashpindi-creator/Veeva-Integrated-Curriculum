# ShopEasy QA – Project Scope

## 1. Introduction

This document defines the scope of the ShopEasy QA project. It identifies the application functionalities covered by testing, the testing objectives, the testing approach, and the activities included in the project.

The project focuses on functional testing of an online shopping application using Jira and Xray.

## 2. Project Objectives

The primary objectives are:

- Validate the functional requirements of the ShopEasy application.
- Verify that application features behave according to their acceptance criteria.
- Design positive, negative, and boundary test scenarios.
- Organize testing activities using Xray.
- Execute test cases and record their results.
- Identify and report application defects.
- Maintain traceability between requirements, stories, tests, and bugs.
- Monitor testing progress through Jira dashboards.
- Prepare a final Test Summary Report.

## 3. Application Scope

The application is divided into three major functional modules.

### 3.1 Account and Login

The following functionalities are included:

| Feature           | Description                                                     |
| ----------------- | --------------------------------------------------------------- |
| User Registration | Create a new account using personal details.                    |
| User Login        | Authenticate users using email and password.                    |
| Account Lock      | Temporarily lock accounts after repeated failed login attempts. |
| Forgot Password   | Recover accounts using email-based password reset.              |
| Logout            | Terminate authenticated user sessions securely.                 |

### 3.2 Browse and Search

The following functionalities are included:

| Feature         | Description                                            |
| --------------- | ------------------------------------------------------ |
| Product List    | Display products with pagination.                      |
| Product Search  | Search products using keywords.                        |
| Product Filters | Filter products by category and price.                 |
| Product Sorting | Sort products by price and name.                       |
| Product Details | Display detailed product information and availability. |

### 3.3 Cart and Checkout

The following functionalities are included:

| Feature                  | Description                                             |
| ------------------------ | ------------------------------------------------------- |
| Add to Cart              | Add available products to the shopping cart.            |
| Quantity Management      | Update product quantities.                              |
| Remove Item              | Remove selected products from the cart.                 |
| Coupon                   | Apply eligible discount coupons.                        |
| Checkout                 | Submit shipping details and proceed with checkout.      |
| Payment and Confirmation | Select a payment method and receive order confirmation. |

## 4. Testing Scope

The following testing activities are included:

### Functional Testing

Verify that application functionalities satisfy their specified requirements.

### Positive Testing

Verify that valid inputs and expected user actions produce successful results.

### Negative Testing

Verify that invalid inputs and unsupported user actions are handled correctly.

### Boundary Value Testing

Verify behavior at important limits, including:

- Password minimum length.
- Five consecutive failed login attempts.
- 15-minute account lock duration.
- 30-minute password reset link validity.
- 12 products per listing page.
- Cart quantity between 1 and 10.
- Minimum coupon eligibility of Rs. 1,000.
- 10-digit phone number.
- 6-digit pin code.

### Defect Testing

Identify, document, track, and retest defects discovered during test execution.

### Regression Testing

Verify that previously working functionalities continue to behave correctly after defect fixes or changes.

## 5. Test Environment

| Configuration      | Details                |
| ------------------ | ---------------------- |
| Application        | ShopEasy               |
| Build Version      | 1.0.3                  |
| Environment        | Staging                |
| Browser            | Google Chrome – Latest |
| Operating System   | Windows 11             |
| Testing Tool       | Xray                   |
| Project Management | Jira                   |

## 6. Test Management Scope

The project uses Jira and Xray to organize testing activities.

The following activities are included:

1. Creating Xray Test Cases.
2. Categorizing test cases as Positive, Negative, and Edge.
3. Linking test cases to Jira User Stories.
4. Organizing test cases into Test Sets.
5. Creating Test Plans.
6. Creating Test Executions.
7. Recording Pass, Fail, Blocked, and other applicable execution statuses.
8. Linking defects to failed tests and related User Stories.

## 7. Defect Management Scope

Defect management includes:

- Defect identification.
- Bug creation in Jira.
- Severity and priority assignment.
- Reproduction steps.
- Expected and actual results.
- Screenshot attachments.
- Linking defects to related test cases and stories.
- Defect status tracking.
- Retesting and closure.

## 8. Out of Scope

The following activities are not included in the current project scope:

- Performance and load testing.
- Security penetration testing.
- Compatibility testing across multiple operating systems.
- Mobile application testing.
- Accessibility testing.
- Database-level testing.
- API automation testing.
- Automated UI test development.
- Production deployment validation.

These activities may be considered in future testing phases.

## 9. Deliverables

The expected project deliverables include:

| Deliverable            | Description                                   |
| ---------------------- | --------------------------------------------- |
| Jira Project           | Configured ShopEasy QA project.               |
| Epics and User Stories | Functional requirements organized in Jira.    |
| Sprint Plans           | Two Scrum sprint plans.                       |
| Xray Test Cases        | Functional test scenarios.                    |
| Test Sets              | Organized collections of test cases.          |
| Test Plan              | Defined testing scope and coverage.           |
| Test Execution         | Recorded test execution results.              |
| Bug Reports            | Documented application defects.               |
| JQL Filters            | Saved Jira queries.                           |
| QA Dashboard           | Centralized testing and defect monitoring.    |
| Test Summary Report    | Final testing results and recommendations.    |
| GitHub Documentation   | Supporting project documentation and exports. |

## 10. Project Completion Criteria

The project will be considered complete when:

- All planned requirements have corresponding test coverage.
- Test cases have been organized and linked to relevant stories.
- Planned test executions have been completed and results recorded.
- Identified defects have been documented and tracked.
- Required JQL filters and dashboard gadgets have been configured.
- The final Test Summary Report has been prepared.
- Project documentation has been organized in GitHub.

## 11. Conclusion

The ShopEasy QA project covers the functional testing and test management activities of an online shopping application.

A clearly defined scope helps maintain testing focus, establish deliverables, and ensure that the project activities are aligned with the specified requirements.

---

**End of Document**
