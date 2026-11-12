# ShopEasy QA – Project Export and Evidence Information

## 1. Introduction

This document describes the export files, project backup information, and supporting evidence maintained for the ShopEasy QA project.

Jira exports and supporting documents help preserve project information and provide evidence of the activities performed during project planning, test management, and defect tracking.

This document also describes the export structure, evidence requirements, validation checklist, and repository submission structure.

## 2. Project Export Details

| Field | Details |
|---|---|
| Project Name | ShopEasy QA |
| Jira Project Key | SEQ |
| Export Format | CSV |
| Export File | shopeasy-jira-complete-export.csv |
| Export Location | 10-Project-Exports |
| Source Application | Jira |
| Test Management | Xray |
| Documentation Status | Completed |

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

### 3.1 Export Issue Summary

The available Jira project export contains 49 issues.

| Issue Type | Number of Issues |
|---|---:|
| Epic | 3 |
| User Story | 16 |
| Test | 23 |
| Test Set | 3 |
| Test Plan | 1 |
| Test Execution | 1 |
| Task | 1 |
| Bug | 1 |
| **Total** | **49** |

### 3.2 Jira Issue Status Summary

| Issue Type | Status | Count |
|---|---|---:|
| Epic | To Do | 3 |
| User Story | Done | 5 |
| User Story | In Progress | 5 |
| User Story | To Do | 6 |
| Test | To Do | 23 |
| Test Set | To Do | 3 |
| Test Plan | To Do | 1 |
| Test Execution | To Do | 1 |
| Task | To Do | 1 |
| Bug | To Do | 1 |

These figures represent the statuses recorded in the available Jira export.

### 3.3 Export File Location

```text
10-Project-Exports/
└── shopeasy-jira-complete-export.csv
```

### Important Note

A Jira CSV export is not a complete backup of the project.

Some Xray information, including detailed test steps, test execution results, attachments, and certain relationships, may not be fully represented in the CSV.

Additional evidence is maintained separately.

## 4. Supporting Project Documentation

The following documents are maintained in the ShopEasy QA repository.

| Folder | Documentation | Status |
|---|---|---|
| 01-Project-Overview | Project configuration, scope, Jira structure | Completed |
| 02-Requirements-and-User-Stories | Requirements register and user stories | Completed |
| 03-Sprint-Planning | Sprint overview and sprint details | Completed |
| 04-Test-Cases | Test cases for all application modules | Completed |
| 05-Test-Management | Test Sets, Test Plan, Test Execution | Completed |
| 06-Bug-Management | Bug reports and bug lifecycle | Completed |
| 07-JQL-Filters | Saved JQL queries | Completed |
| 08-Dashboard | Dashboard configuration | Completed |
| 09-Test-Summary-Report | Final test summary report | Completed |
| 10-Project-Exports | Jira exports and export information | Completed |

## 5. Screenshots and Evidence

The ShopEasy QA project documentation and project deliverables have been organized for final submission.

Screenshots will be added to provide visual evidence of the Jira and Xray configurations.

### 5.1 Evidence Checklist

| No. | Evidence | Suggested Filename | Status |
|---|---|---|---|
| 1 | Jira Project Overview | jira-project-overview.png | Completed – Screenshot to be added |
| 2 | Epic and Story Hierarchy | jira-epics-stories.png | Completed – Screenshot to be added |
| 3 | Sprint 1 Board | sprint-1-board.png | Completed – Screenshot to be added |
| 4 | Sprint 2 Board | sprint-2-board.png | Completed – Screenshot to be added |
| 5 | Xray Test Cases | xray-test-cases.png | Completed – Screenshot to be added |
| 6 | Xray Test Sets | xray-test-sets.png | Completed – Screenshot to be added |
| 7 | Xray Test Plan | xray-test-plan.png | Completed – Screenshot to be added |
| 8 | Xray Test Execution | xray-test-execution.png | Completed – Screenshot to be added |
| 9 | Jira Bug Reports | jira-bug-reports.png | Completed – Screenshot to be added |
| 10 | Jira Bug Workflow | jira-bug-workflow.png | Completed – Screenshot to be added |
| 11 | Saved JQL Filters | jira-saved-filters.png | Completed – Screenshot to be added |
| 12 | QA Dashboard | shopeasy-qa-dashboard.png | Completed – Screenshot to be added |

### 5.2 Evidence Storage Locations

Screenshots should be stored in the appropriate folders.

```text
ShopEasy-QA/
│
├── 06-Bug-Management/
│   └── Screenshots/
│
└── 08-Dashboard/
    └── Screenshots/
```

Other project evidence can be organized under the relevant documentation folders if required.

### 5.3 Suggested Screenshot Names

```text
jira-project-overview.png
jira-epics-stories.png
sprint-1-board.png
sprint-2-board.png
xray-test-cases.png
xray-test-sets.png
xray-test-plan.png
xray-test-execution.png
jira-bug-reports.png
jira-bug-workflow.png
jira-saved-filters.png
shopeasy-qa-dashboard.png
```

Screenshots should show the actual Jira or Xray interface and should be readable enough to demonstrate the relevant project configuration.

## 6. Export Validation Checklist

The following documentation and repository preparation activities are marked complete.

- [x] Jira CSV export prepared.
- [x] Project issue information documented.
- [x] Jira issue types and project structure documented.
- [x] Project documentation organized.
- [x] Test case documentation prepared.
- [x] Xray Test Sets documented.
- [x] Xray Test Plan documented.
- [x] Xray Test Execution documented.
- [x] Bug management documentation prepared.
- [x] JQL filter documentation prepared.
- [x] Dashboard configuration documented.
- [x] Final test summary report prepared.
- [x] Repository folder structure organized.
- [ ] Add Jira project screenshots.
- [ ] Add Xray test management screenshots.
- [ ] Add bug tracking screenshots.
- [ ] Add dashboard screenshots.
- [ ] Perform final screenshot and repository verification.
- [ ] Verify that no confidential information is published.

**Overall Documentation Status:** Completed.

**Remaining Activity:** Add screenshots and perform final repository verification.

## 7. Export Limitations

The following limitations should be considered:

1. CSV exports may not preserve every Jira configuration.
2. Xray test steps may require separate documentation or export.
3. Test execution results may need separate evidence.
4. Attachments and screenshots may not be included in the CSV.
5. Jira workflows and dashboard configurations may require screenshots or separate documentation.
6. Importing a CSV into another Jira project does not necessarily restore the original project configuration.
7. Documentation-only test cases should not be treated as actual Jira Test issues.
8. Jira issue statuses in the export represent the status at the time the export was generated.

## 8. Repository Submission Structure

The final GitHub repository should contain the following structure:

```text
ShopEasy-QA/
│
├── README.md
│
├── 01-Project-Overview/
│   ├── Project-Configuration.md
│   ├── Project-Scope.md
│   └── Jira-Project-Structure.md
│
├── 02-Requirements-and-User-Stories/
│   ├── Requirements-Register.md
│   └── User-Stories.md
│
├── 03-Sprint-Planning/
│   ├── Sprint-Overview.md
│   ├── Sprint-1-Account-and-Login.md
│   └── Sprint-2-Product-Discovery-and-Shopping.md
│
├── 04-Test-Cases/
│   ├── Account-and-Login/
│   ├── Browse-and-Search/
│   └── Cart-and-Checkout/
│
├── 05-Test-Management/
│   ├── Test-Sets.md
│   ├── Test-Plan.md
│   └── Test-Execution.md
│
├── 06-Bug-Management/
│   ├── Bug-Reports.md
│   ├── Bug-Lifecycle.md
│   └── Screenshots/
│
├── 07-JQL-Filters/
│   └── Saved-Filters.md
│
├── 08-Dashboard/
│   ├── Dashboard-Configuration.md
│   └── Screenshots/
│
├── 09-Test-Summary-Report/
│   └── Final-Test-Report.md
│
└── 10-Project-Exports/
    ├── shopeasy-jira-complete-export.csv
    └── Export-Information.md
```

Only sanitized exports and non-confidential project evidence should be published.

## 9. GitHub Submission Guidelines

Before publishing the project to GitHub:

- Ensure all Markdown documents are properly formatted.
- Verify that the folder structure matches the repository documentation.
- Include the Jira CSV export if it is safe to publish.
- Add screenshots to their respective folders.
- Check that all referenced files exist.
- Remove unnecessary temporary files.
- Exclude passwords, access tokens, and confidential information.
- Verify that the README provides a clear introduction to the project.
- Check that all documentation is consistent with the available Jira records.

The repository should provide a clear overview of the ShopEasy QA project and its documentation.

## 10. Project Completion Summary

The ShopEasy QA documentation package has been organized into ten major sections.

| No. | Project Area | Documentation Status |
|---|---|---|
| 1 | Project Overview | Completed |
| 2 | Requirements and User Stories | Completed |
| 3 | Sprint Planning | Completed |
| 4 | Test Cases | Completed |
| 5 | Test Management | Completed |
| 6 | Bug Management | Completed |
| 7 | JQL Filters | Completed |
| 8 | Dashboard Configuration | Completed |
| 9 | Final Test Summary Report | Completed |
| 10 | Project Exports and Evidence Information | Completed |

The remaining submission activity is to add the actual screenshots and verify the final GitHub repository.

## 11. Conclusion

The project export and evidence structure provides a centralized location for maintaining Jira exports, testing documentation, and supporting screenshots.

The Jira CSV export preserves issue information for the ShopEasy QA project, while the Markdown documents describe the project structure, requirements, test management, defect management, and reporting activities.

The ShopEasy QA documentation package is prepared for submission. Adding screenshots and completing the final repository verification will provide the supporting visual evidence for the project.

---

**End of Document**
