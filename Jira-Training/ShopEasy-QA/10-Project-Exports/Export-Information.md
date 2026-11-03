# ShopEasy QA – Project Export and Evidence Information

## 1. Introduction

This document describes the export files, project backup information, and supporting evidence maintained for the ShopEasy QA project.

Jira exports and supporting documents help preserve project information and provide evidence of the activities performed during project development and testing.

## 2. Project Export Details

| Field              | Details                           |
| ------------------ | --------------------------------- |
| Project Name       | ShopEasy QA                       |
| Jira Project Key   | SEQ                               |
| Export Format      | CSV                               |
| Export File        | shopeasy-jira-complete-export.csv |
| Export Location    | 10-Project-Exports                |
| Source Application | Jira                              |
| Test Management    | Xray                              |

## 3. Jira CSV Export

The Jira CSV export contains issue information from the ShopEasy QA project.

The export includes information such as:

- Jira Issue Key.
- Issue Type.
- Summary.
- Description.
- Status.
- Priority.
- Assignee.
- Reporter.
- Epic information.
- Sprint information.
- Labels.
- Issue relationships.

**File location:**

```text
10-Project-Exports/
└── shopeasy-jira-complete-export.csv
```

### Important Note

A Jira CSV export is not a complete backup of the project.

Some Xray information, including detailed test steps, test execution results, attachments, and certain relationships, may not be fully represented in the CSV.

Additional evidence should be maintained separately.

## 4. Supporting Project Documentation

The following documents are maintained in the ShopEasy QA repository.

| Folder                           | Documentation                                |
| -------------------------------- | -------------------------------------------- |
| 01-Project-Overview              | Project configuration, scope, Jira structure |
| 02-Requirements-and-User-Stories | Requirements register and user stories       |
| 03-Sprint-Planning               | Sprint overview and sprint details           |
| 04-Test-Cases                    | Test cases for all application modules       |
| 05-Test-Management               | Test Sets, Test Plan, Test Execution         |
| 06-Bug-Management                | Bug reports and bug lifecycle                |
| 07-JQL-Filters                   | Saved JQL queries                            |
| 08-Dashboard                     | Dashboard configuration                      |
| 09-Test-Summary-Report           | Final test summary report                    |
| 10-Project-Exports               | Jira exports and export information          |

## 5. Screenshots and Evidence

Screenshots should be maintained to demonstrate the actual Jira and Xray configurations.

### Recommended Evidence

| No. | Evidence                 | Suggested Filename        | Status  |
| --- | ------------------------ | ------------------------- | ------- |
| 1   | Jira Project Overview    | jira-project-overview.png | Pending |
| 2   | Epic and Story Hierarchy | jira-epics-stories.png    | Pending |
| 3   | Sprint 1 Board           | sprint-1-board.png        | Pending |
| 4   | Sprint 2 Board           | sprint-2-board.png        | Pending |
| 5   | Xray Test Cases          | xray-test-cases.png       | Pending |
| 6   | Xray Test Sets           | xray-test-sets.png        | Pending |
| 7   | Xray Test Plan           | xray-test-plan.png        | Pending |
| 8   | Xray Test Execution      | xray-test-execution.png   | Pending |
| 9   | Jira Bug Reports         | jira-bug-reports.png      | Pending |
| 10  | Jira Bug Workflow        | jira-bug-workflow.png     | Pending |
| 11  | Saved JQL Filters        | jira-saved-filters.png    | Pending |
| 12  | QA Dashboard             | shopeasy-qa-dashboard.png | Pending |

Save screenshots in the appropriate folders:

```text
06-Bug-Management/Screenshots/
08-Dashboard/Screenshots/
```

Other project evidence can be organized under the relevant documentation folders if required.

## 6. Export Validation Checklist

Before submitting the project:

- [ ] Verify that the CSV file opens correctly.
- [ ] Verify that the export contains the expected Jira issues.
- [ ] Check that issue keys and issue types are readable.
- [ ] Verify that project documentation is present.
- [ ] Capture Jira project screenshots.
- [ ] Capture Xray test management screenshots.
- [ ] Capture test execution evidence.
- [ ] Capture bug tracking evidence.
- [ ] Capture dashboard evidence.
- [ ] Remove passwords, personal information, tokens, and other sensitive data from exported files.
- [ ] Verify that no confidential information is committed to the public GitHub repository.

## 7. Export Limitations

The following limitations should be considered:

1. CSV exports may not preserve every Jira configuration.
2. Xray test steps may require separate documentation or export.
3. Test execution results may need separate evidence.
4. Attachments and screenshots may not be included in the CSV.
5. Jira workflows and dashboard configurations may require screenshots or separate documentation.
6. Importing a CSV into another Jira project does not necessarily restore the original project configuration.

## 8. Repository Submission Structure

The final GitHub repository should contain:

```text
ShopEasy-QA/
│
├── README.md
│
├── 01-Project-Overview/
├── 02-Requirements-and-User-Stories/
├── 03-Sprint-Planning/
├── 04-Test-Cases/
├── 05-Test-Management/
├── 06-Bug-Management/
├── 07-JQL-Filters/
├── 08-Dashboard/
├── 09-Test-Summary-Report/
└── 10-Project-Exports/
```

Only sanitized exports and non-confidential project evidence should be published.

## 9. Conclusion

The project export and evidence structure provides a centralized location for maintaining Jira exports, testing documentation, and supporting screenshots.

Maintaining these materials helps demonstrate project implementation, testing activities, defect management, and final QA assessment.

---

**End of Document**
