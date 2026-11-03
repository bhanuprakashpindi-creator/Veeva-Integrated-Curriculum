# ShopEasy QA – Sprint Overview

## 1. Introduction

The ShopEasy QA project follows the Scrum framework to organize application development and testing activities into manageable iterations called Sprints.

The project is divided into two one-week Sprints. Each Sprint focuses on a specific group of application functionalities.

Sprint planning helps organize User Stories, establish priorities, estimate work, and monitor progress throughout the project.

## 2. Sprint Configuration

| Configuration     | Details          |
| ----------------- | ---------------- |
| Project           | ShopEasy QA      |
| Project Key       | SEQ              |
| Methodology       | Agile Scrum      |
| Number of Sprints | 2                |
| Sprint Duration   | 1 Week Each      |
| Tracking Tool     | Jira Scrum Board |

## 3. Sprint Structure

The project contains two Sprints.

| Sprint    | Sprint Name                    | Functional Module                           | Stories |
| --------- | ------------------------------ | ------------------------------------------- | ------: |
| Sprint 1  | Account and Login              | Account Management and Authentication       |       5 |
| Sprint 2  | Product Discovery and Shopping | Product Browsing, Search, Cart and Checkout |      11 |
| **Total** |                                |                                             |  **16** |

## 4. Sprint 1 – Account and Login

**Sprint Name:** Account and Login

**Objective:** Complete the account management and authentication functionalities.

### Sprint Scope

| Jira Key | User Story        |
| -------- | ----------------- |
| SEQ-2    | User Registration |
| SEQ-3    | User Login        |
| SEQ-4    | Account Lock      |
| SEQ-5    | Forgot Password   |
| SEQ-6    | Logout            |

### Sprint Objective

- Validate user registration.
- Verify authentication functionality.
- Test account lock behavior.
- Validate password recovery.
- Verify secure logout functionality.

## 5. Sprint 2 – Product Discovery and Shopping

**Sprint Name:** Product Discovery & Shopping

**Objective:** Complete the product browsing, shopping cart, and checkout functionalities.

### Sprint Scope

| Jira Key | User Story               |
| -------- | ------------------------ |
| SEQ-8    | Products List            |
| SEQ-9    | Search                   |
| SEQ-10   | Filters                  |
| SEQ-11   | Sorting                  |
| SEQ-12   | Product Details          |
| SEQ-14   | Add To Cart              |
| SEQ-15   | Quantity                 |
| SEQ-16   | Remove Item              |
| SEQ-17   | Coupon                   |
| SEQ-18   | Checkout                 |
| SEQ-19   | Payment and Confirmation |

### Sprint Objective

- Verify product listing and pagination.
- Validate product search and filtering.
- Verify product sorting and details.
- Test shopping cart operations.
- Validate coupon functionality.
- Verify checkout and payment processes.

## 6. Sprint Planning Activities

The following activities are considered during Sprint Planning:

1. Review the project backlog.
2. Identify User Stories for the Sprint.
3. Review acceptance criteria.
4. Estimate story points.
5. Prioritize the selected stories.
6. Add the selected stories to the Sprint.
7. Define the Sprint objective.
8. Start the Sprint using the Jira Scrum Board.

## 7. Story Point Estimation

Story points are used to estimate the relative complexity and effort associated with User Stories.

The project uses the following estimation scale:

| Story Points | Complexity |
| -----------: | ---------- |
|            1 | Very Low   |
|            2 | Low        |
|            3 | Medium     |
|            5 | High       |
|            8 | Very High  |

Story point estimates are maintained in Jira.

## 8. Sprint Monitoring

Sprint progress is monitored using the Jira Scrum Board.

The following activities are tracked:

- Sprint backlog.
- Story status.
- Work in progress.
- Completed stories.
- Remaining work.
- Sprint Burndown Chart.

## 9. Testing Activities Across Sprints

Testing activities are organized according to the functionalities included in each Sprint.

| Testing Activity          | Sprint 1 | Sprint 2 |
| ------------------------- | -------- | -------- |
| Registration Testing      | Yes      | No       |
| Login Testing             | Yes      | No       |
| Account Security Testing  | Yes      | No       |
| Password Recovery Testing | Yes      | No       |
| Logout Testing            | Yes      | No       |
| Product Listing Testing   | No       | Yes      |
| Search and Filter Testing | No       | Yes      |
| Sorting Testing           | No       | Yes      |
| Cart Testing              | No       | Yes      |
| Checkout Testing          | No       | Yes      |
| Payment Testing           | No       | Yes      |

Xray is used to organize test cases, Test Sets, Test Plans, and Test Executions.

## 10. Sprint Completion

A Sprint is considered complete when its planned work has been reviewed and the relevant activities have been updated in Jira.

Sprint completion should include:

- Review of completed User Stories.
- Verification of acceptance criteria.
- Review of associated test cases.
- Recording of testing results.
- Documentation of identified defects.
- Updating the Sprint status.

## 11. Conclusion

The two-Sprint structure provides a systematic approach to organizing the ShopEasy QA project.

Sprint 1 focuses on account management and authentication, while Sprint 2 covers product discovery and the shopping process.

This division makes the project easier to plan, monitor, and test using Jira Scrum and Xray.

---

**End of Document**
