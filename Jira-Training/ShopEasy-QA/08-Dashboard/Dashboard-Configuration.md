# ShopEasy QA – Dashboard Configuration

## 1. Introduction

The ShopEasy QA Dashboard provides a centralized view of project progress, sprint activities, defects, and test execution results.

The dashboard is intended to help the QA team monitor testing progress, identify critical defects, and understand the overall quality of the ShopEasy application.

**Dashboard Name:** ShopEasy QA Dashboard
**Project Key:** SEQ
**Project Type:** Scrum

## 2. Dashboard Objectives

The dashboard is designed to:

- Monitor sprint progress.
- Track open and unresolved defects.
- Identify critical and high-priority bugs.
- Monitor created and resolved issues.
- Review Xray test execution results.
- Provide a centralized view of QA activities.

## 3. Dashboard Gadgets

The following gadgets are planned for the ShopEasy QA Dashboard.

### 3.1 Sprint Burndown

**Purpose:** Monitor the remaining work during an active sprint.

**Information displayed:**

- Remaining story points.
- Completed work.
- Sprint progress over time.
- Work remaining until the sprint ends.

**Expected benefit:** Helps understand whether the sprint is progressing according to its plan.

**Implementation status:** To be verified in Jira.

### 3.2 Pie Chart – Bugs by Status

**Purpose:** Display the distribution of bugs based on their current status.

**Suggested configuration:**

- Project: SEQ
- Issue Type: Bug
- Statistic Type: Status

**Expected categories:**

- Open
- In Progress
- Fixed
- Retest
- Closed

**Expected benefit:** Helps identify how many defects are unresolved, being fixed, or closed.

**Implementation status:** Planned.

### 3.3 Created vs Resolved Chart

**Purpose:** Compare the number of issues created with the number of issues resolved over time.

**Suggested configuration:**

- Project: SEQ
- Period: Weekly
- Display: Created and Resolved issues

**Expected benefit:** Helps monitor whether the team is resolving issues at a suitable rate.

**Implementation status:** Planned.

### 3.4 Filter Results – Open Critical Bugs

**Purpose:** Display unresolved critical and high-priority bugs.

**JQL filter:**

```jql
project = SEQ
AND issuetype = Bug
AND priority in (Highest, High)
AND statusCategory != Done
ORDER BY priority DESC
```

**Suggested columns:**

- Issue Key
- Summary
- Priority
- Status
- Assignee
- Created Date

**Expected benefit:** Provides quick access to defects that need immediate attention.

**Implementation status:** Planned. The saved filter must be created and selected in the gadget.

### 3.5 Test Execution Results

**Purpose:** Display the results of Xray test execution.

**Expected information:**

- Total tests.
- Passed tests.
- Failed tests.
- Blocked tests.
- Tests not yet executed.

**Expected benefit:** Helps evaluate the testing progress and identify areas requiring additional attention.

**Implementation status:** Planned. Configure an available Xray gadget or an appropriate Jira chart after verifying the installed Xray dashboard gadgets.

## 4. Dashboard Creation Steps

1. Open Jira.
2. Navigate to **Dashboards**.
3. Select **Create dashboard**.
4. Enter the name `ShopEasy QA Dashboard`.
5. Add a description explaining its purpose.
6. Save the dashboard.
7. Select **Add gadget**.
8. Search for the required gadgets.
9. Add the available gadgets.
10. Configure each gadget using the appropriate project, saved filter, and display settings.
11. Arrange the gadgets for easy visibility.
12. Save the dashboard configuration.

## 5. Recommended Dashboard Layout

The following layout is proposed:

| Position     | Gadget                              | Purpose                  |
| ------------ | ----------------------------------- | ------------------------ |
| Top Left     | Sprint Burndown                     | Sprint progress          |
| Top Right    | Pie Chart – Bugs by Status          | Defect distribution      |
| Middle Left  | Created vs Resolved                 | Issue trends             |
| Middle Right | Filter Results – Open Critical Bugs | Priority defect tracking |
| Bottom       | Test Execution Results              | Testing progress         |

## 6. Dashboard Status Tracking

The following table distinguishes planned configuration from verified implementation.

| No. | Dashboard Component              | Status               |
| --- | -------------------------------- | -------------------- |
| 1   | ShopEasy QA Dashboard creation   | To be verified       |
| 2   | Sprint Burndown gadget           | To be verified       |
| 3   | Bugs by Status gadget            | Planned              |
| 4   | Created vs Resolved gadget       | Planned              |
| 5   | Open Critical Bugs gadget        | Planned              |
| 6   | Test Execution Results gadget    | Planned              |
| 7   | Dashboard layout and arrangement | Pending verification |
| 8   | Dashboard screenshot             | Pending              |

Update this table after completing and verifying each activity in Jira.

## 7. Dashboard Screenshots

Screenshots should be captured after the dashboard is configured.

Recommended screenshots:

- Complete ShopEasy QA Dashboard.
- Sprint Burndown gadget.
- Bugs by Status chart.
- Created vs Resolved chart.
- Open Critical Bugs list.
- Test Execution Results.

Store the screenshots in:

```text
08-Dashboard/
└── Screenshots/
```

Suggested screenshot names:

```text
dashboard-overview.png
sprint-burndown.png
bugs-by-status.png
created-vs-resolved.png
open-critical-bugs.png
test-execution-results.png
```

## 8. Conclusion

The ShopEasy QA Dashboard is intended to provide a centralized monitoring interface for sprint progress, defect management, and test execution.

The proposed gadgets will help the QA team identify project risks, monitor unresolved defects, and evaluate testing progress.

Dashboard components must be configured and verified in Jira before being reported as completed.

---

**End of Document**
