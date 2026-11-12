# ShopEasy QA – Dashboard Configuration

## 1. Introduction

The ShopEasy QA Dashboard provides a centralized view of project progress, sprint activities, defects, and test management information.

The dashboard is designed to help the QA team monitor sprint progress, identify important defects, track issue trends, and review test execution results.

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
- Track testing progress.
- Provide a centralized view of QA activities.
- Support project monitoring and decision-making.

## 3. Dashboard Gadgets

The following gadgets are included in the proposed ShopEasy QA Dashboard configuration.

### 3.1 Sprint Burndown

**Purpose:** Monitor the remaining work during an active sprint.

**Information displayed:**

- Remaining story points.
- Completed work.
- Sprint progress over time.
- Work remaining until the sprint ends.

**Expected benefit:** Helps understand whether the sprint is progressing according to its planned schedule.

**Configuration:**

- Select the active sprint.
- Configure the estimation statistic.
- Display the remaining work throughout the sprint.

### 3.2 Pie Chart – Bugs by Status

**Purpose:** Display the distribution of bugs based on their current status.

**Suggested configuration:**

- Project: SEQ
- Issue Type: Bug
- Statistic Type: Status

**Expected categories:** Categories depend on the actual Jira workflow configuration.

Typical categories include:

- To Do
- In Progress
- Done

**Expected benefit:** Helps identify the distribution of defects across their workflow stages.

**Related Jira Bug:** SEQ-43

The project export contains one Bug issue, currently recorded as To Do.

### 3.3 Created vs Resolved Chart

**Purpose:** Compare the number of issues created with the number of issues resolved over time.

**Suggested configuration:**

- Project: SEQ
- Period: Weekly
- Display: Created and Resolved issues

**Expected benefit:**

- Monitor issue creation trends.
- Track issue resolution trends.
- Understand whether unresolved issues are accumulating.
- Review project progress over time.

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

**Expected benefit:** Provides quick access to defects that require attention.

**Note:** The current Jira export contains one Bug issue (SEQ-43). Its priority should be verified in Jira before determining whether it appears in this filter.

### 3.5 Test Execution Results

**Purpose:** Display the results of Xray test execution.

**Expected information:**

- Total tests.
- Passed tests.
- Failed tests.
- Blocked tests.
- Tests not yet executed.

**Related Jira Issues:**

| Component | Jira Issue Key |
|---|---|
| Test Plan | SEQ-41 |
| Test Execution | SEQ-42 |
| Registration Test Set | SEQ-38 |
| Login Test Set | SEQ-39 |
| Account Security Test Set | SEQ-40 |

**Expected benefit:** Helps evaluate testing progress and identify areas requiring additional attention.

The available Jira export records the Test Plan, Test Execution, Test Sets, and associated test issues as To Do. Actual execution statistics must therefore be taken from updated Xray execution results.

## 4. Dashboard Creation Steps

The following steps describe the dashboard setup process in Jira.

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
13. Verify that each gadget displays the expected information.

## 5. Recommended Dashboard Layout

The following layout is recommended for the ShopEasy QA Dashboard.

| Position | Gadget | Purpose |
|---|---|---|
| Top Left | Sprint Burndown | Sprint progress |
| Top Right | Pie Chart – Bugs by Status | Defect distribution |
| Middle Left | Created vs Resolved | Issue trends |
| Middle Right | Filter Results – Open Critical Bugs | Priority defect tracking |
| Bottom | Test Execution Results | Testing progress |

The layout provides a consolidated view of sprint activities, defects, and test management information.

## 6. Dashboard Configuration Summary

The following table tracks the dashboard components and their verification status.

| No. | Dashboard Component | Configuration Status |
|---|---|---|
| 1 | ShopEasy QA Dashboard creation | To be verified in Jira |
| 2 | Sprint Burndown gadget | To be verified in Jira |
| 3 | Bugs by Status gadget | Configuration to be verified |
| 4 | Created vs Resolved gadget | Configuration to be verified |
| 5 | Open Critical Bugs gadget | Saved filter and gadget to be verified |
| 6 | Test Execution Results gadget | Xray gadget availability to be verified |
| 7 | Dashboard layout and arrangement | To be verified in Jira |
| 8 | Dashboard screenshots | Evidence to be added |

**Verification note:** The dashboard configuration and gadget availability should be confirmed in Jira before marking these activities as completed.

## 7. Dashboard Screenshots

Screenshots provide visual evidence of the dashboard configuration.

The following screenshots are recommended:

- Complete ShopEasy QA Dashboard.
- Sprint Burndown gadget.
- Bugs by Status chart.
- Created vs Resolved chart.
- Open Critical Bugs list.
- Test Execution Results.

Store the screenshots in the following directory:

```text
08-Dashboard/
└── Screenshots/
```

### Suggested Screenshot Names

```text
dashboard-overview.png
sprint-burndown.png
bugs-by-status.png
created-vs-resolved.png
open-critical-bugs.png
test-execution-results.png
```

Screenshots should show the actual Jira dashboard and its configured gadgets.

## 8. Dashboard Benefits

The ShopEasy QA Dashboard provides the following benefits:

- Centralized monitoring of QA activities.
- Better visibility into sprint progress.
- Easier identification of unresolved defects.
- Monitoring of issue creation and resolution trends.
- Improved visibility into test execution progress.
- Faster access to important project information.
- Support for QA reporting and project reviews.

## 9. Conclusion

The ShopEasy QA Dashboard is designed to provide a centralized monitoring interface for sprint progress, defect management, and test execution.

The proposed gadgets cover sprint monitoring, defect distribution, issue trends, priority defect tracking, and Xray test execution.

Together, these components provide a structured view of QA activities and help identify project risks.

The dashboard configuration should be verified in Jira, with screenshots maintained as supporting project evidence.

---

**End of Document**
