# ShopEasy QA – JQL Saved Filters

## 1. Introduction

Jira Query Language (JQL) is used to search, filter, and organize issues in a Jira project.

In the ShopEasy QA project, JQL filters help the QA team track bugs, stories, sprint activities, and test execution issues.

Project Key: `SEQ`

## 2. Saved JQL Filters

### Filter 1: Open Bugs

**Purpose:** Display bugs that are not completed.

```jql
project = SEQ
AND issuetype = Bug
AND statusCategory != Done
ORDER BY priority DESC
```

**Suggested filter name:** `ShopEasy - Open Bugs`

### Filter 2: Critical and High-Priority Bugs

**Purpose:** Identify high-priority defects that require attention.

```jql
project = SEQ
AND issuetype = Bug
AND priority in (Highest, High)
AND status != Closed
ORDER BY priority DESC
```

**Suggested filter name:** `ShopEasy - Critical and High Bugs`

### Filter 3: Bugs by Assignee

**Purpose:** Display bugs grouped and organized by their assigned team members.

```jql
project = SEQ
AND issuetype = Bug
ORDER BY assignee ASC
```

**Suggested filter name:** `ShopEasy - Bugs by Assignee`

### Filter 4: Sprint 1 Stories

**Purpose:** Display stories assigned to Sprint 1.

```jql
project = SEQ
AND issuetype = Story
AND sprint = "SEQ Sprint 1"
ORDER BY status ASC
```

**Suggested filter name:** `ShopEasy - Sprint 1 Stories`

If Jira does not recognize the sprint name, select the actual Sprint 1 value from Jira's autocomplete suggestions.

### Filter 5: Failed Xray Tests

**Purpose:** Identify test cases that have failed during execution.

The exact JQL depends on the Xray version and the fields available in the Jira instance.

Start with:

```jql
project = SEQ
AND issuetype = Test
AND status = Failed
ORDER BY priority DESC
```

If `status = Failed` returns no results or Jira reports an error, check the Xray fields and JQL functions available in your instance. Xray execution results may be stored separately from the Jira issue status, so this query must be verified before treating it as a reliable failed-test report.

**Suggested filter name:** `ShopEasy - Failed Test Cases`

## 3. Creating a Saved Filter in Jira

Follow these steps to create and save a JQL filter:

1. Open the ShopEasy QA Jira project.
2. Navigate to **Filters → Advanced issue search**.
3. Select the JQL search option.
4. Enter the required JQL query.
5. Click **Search** to execute the query.
6. Verify that the returned issues match the filter purpose.
7. Click **Save as**.
8. Enter the suggested filter name.
9. Save the filter.

Repeat the process for each JQL query.

## 4. Managing Saved Filters

After creating the filters:

- Navigate to **Filters → View all filters**.
- Verify that all five filters are available.
- Open each filter and confirm that its results are correct.
- Share filters with the required project users if necessary.
- Update queries when sprint names, statuses, or project requirements change.

## 5. Filter Summary

| No. | Filter Name                       | Purpose                     |
| --- | --------------------------------- | --------------------------- |
| 1   | ShopEasy - Open Bugs              | Track unresolved defects    |
| 2   | ShopEasy - Critical and High Bugs | Track high-priority defects |
| 3   | ShopEasy - Bugs by Assignee       | View defects by assignee    |
| 4   | ShopEasy - Sprint 1 Stories       | Track Sprint 1 stories      |
| 5   | ShopEasy - Failed Test Cases      | Identify failed Xray tests  |

## 6. Conclusion

JQL saved filters provide a reusable way to monitor project activities and retrieve relevant Jira issues.

The five filters documented here cover defect tracking, priority monitoring, assignee-based tracking, sprint monitoring, and test execution monitoring.

The queries should be executed and verified in Jira before being considered fully configured.

---

**End of Document**
