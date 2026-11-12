# ShopEasy QA – Bug Reports

## 1. Introduction

Bug management is an important part of the software testing process.

In the ShopEasy QA project, Jira is used to record, prioritize, track, and manage application defects identified during testing.

Each Bug issue contains information about the unexpected behavior, reproduction steps, expected results, actual results, severity, and priority.

Bugs are linked to their corresponding Xray Test Cases and Jira User Stories wherever applicable to maintain traceability.

This document describes the bug reporting process, defect classification, reporting format, and existing defect record in the ShopEasy project.

## 2. Bug Reporting Objectives

The objectives of bug reporting are:

- Identify unexpected application behavior.
- Document defects in a consistent format.
- Provide clear reproduction steps.
- Compare expected and actual results.
- Assign appropriate severity and priority.
- Attach screenshots as supporting evidence.
- Link defects to related test cases.
- Track defects through their lifecycle.
- Support retesting and defect closure.

## 3. Bug Report Information

Each bug report should contain the following information:

| Field | Description |
|---|---|
| Bug ID | Logical identifier such as BUG-01. |
| Jira Issue Key | Official Jira Bug issue key. |
| Summary | Short description of the defect. |
| Description | Detailed explanation of the issue. |
| Environment | Application environment where the issue occurred. |
| Preconditions | Conditions required to reproduce the issue. |
| Steps to Reproduce | Numbered steps to reproduce the defect. |
| Expected Result | Behavior specified by the requirement. |
| Actual Result | Behavior observed during testing. |
| Severity | Impact of the defect on the application. |
| Priority | Urgency of fixing the defect. |
| Attachment | Screenshot or other supporting evidence. |
| Related Test | Xray Test Case associated with the defect. |
| Related Story | Jira User Story associated with the defect. |
| Status | Current state of the defect. |

## 4. Bug Severity Classification

Severity represents the impact of a defect on application functionality.

| Severity | Description |
|---|---|
| Critical | Defect causes a major system failure or makes a critical application function unusable. |
| Major | Defect significantly affects important application functionality. |
| Minor | Defect affects limited functionality but does not prevent normal application usage. |
| Trivial | Minor cosmetic or user interface issue with minimal functional impact. |

## 5. Bug Priority Classification

Priority indicates how urgently a defect should be addressed.

| Priority | Description |
|---|---|
| Highest | Requires immediate attention. |
| High | Should be fixed as soon as possible. |
| Medium | Should be addressed during normal development activities. |
| Low | Can be addressed when higher-priority issues are resolved. |

## 6. Bug Reporting Template

The following format is used when creating a Bug issue in Jira.

### Bug Identification

| Field | Value |
|---|---|
| Bug ID | BUG-XX |
| Jira Issue Key | SEQ-XX |
| Summary | Enter defect summary |
| Environment | Staging |
| Build | 1.0.3 |
| Browser | Google Chrome – Latest |
| Operating System | Windows 11 |

### Preconditions

Describe the conditions required before reproducing the defect.

### Steps to Reproduce

1. Open the ShopEasy application.
2. Navigate to the affected functionality.
3. Perform the required action.
4. Observe the application behavior.

### Expected Result

Describe the expected behavior according to the relevant functional requirement.

Include the corresponding Requirement ID.

### Actual Result

Describe the actual behavior observed during testing.

### Defect Classification

| Field | Value |
|---|---|
| Severity | Critical / Major / Minor / Trivial |
| Priority | Highest / High / Medium / Low |
| Status | Open |

### Supporting Evidence

Attach screenshots or other relevant evidence demonstrating the defect.

### Issue Relationships

Link the Bug to:

- The related Xray Test Case.
- The affected Jira User Story, where applicable.
- The relevant Requirement ID in the documentation.

## 7. Existing Bug Records

The Jira project export contains one Bug issue.

| Logical ID | Jira Issue Key | Related Test | Current Status | Assignee | Resolution |
|---|---|---|---|---|---|
| BUG-01 | SEQ-43 | SEQ-27 (TC-08) | To Do | Unassigned | Not recorded |

### Existing Bug Record Details

**Logical ID:** BUG-01

**Jira Issue Key:** SEQ-43

**Related Test Case:** TC-08 – Invalid credentials

**Related Jira Test Issue:** SEQ-27

**Current Status:** To Do

**Assignee:** No assignee recorded in the export.

**Resolution:** No resolution recorded in the export.

The Jira export confirms the existence of this Bug issue and its relationship with the invalid credentials test. The detailed defect description, reproduction steps, severity, priority, and supporting evidence should be verified directly from the Jira issue.

**Note:** The Jira issue key and status above are based on the available project export. No additional defect details or resolution results are assumed.

## 8. Bug-to-Test Traceability

Each defect should be associated with the test case that identified it.

The relationship is:

**Requirement → User Story → Xray Test → Failed Execution → Bug**

For the existing ShopEasy Bug record, the available Jira relationship is:

```text
TC-08 – Invalid Credentials
        |
        | Jira Test Issue: SEQ-27
        |
        v
BUG-01 – Existing Defect
        |
        | Jira Bug Issue: SEQ-43
        |
        v
Defect Investigation and Resolution
```

This relationship helps identify the affected requirement and provides a record of how the defect is associated with testing activities.

## 9. Bug Retesting

After a developer fixes a reported defect, the QA team performs retesting.

The retesting process includes:

1. Review the defect and its original reproduction steps.
2. Verify that the reported issue has been fixed.
3. Execute the associated test case again.
4. Compare the actual result with the expected result.
5. Update the Bug status.
6. Close the defect if retesting is successful.
7. Return the defect to In Progress if the issue still exists.

Retesting results should be recorded in the corresponding Jira and Xray issues.

## 10. Bug Reporting Best Practices

- Use clear and descriptive summaries.
- Provide reproducible steps.
- Include relevant test data.
- Specify the corresponding requirement.
- Avoid ambiguous descriptions.
- Assign severity based on functional impact.
- Assign priority based on urgency.
- Attach clear screenshots.
- Link bugs to related tests and stories.
- Update defect status after every retesting activity.
- Record the final resolution accurately.

## 11. Conclusion

Bug reporting provides a structured method for documenting unexpected application behavior.

In the ShopEasy QA project, Jira Bug issues and Xray test management support defect tracking and test traceability.

The project export contains one Bug issue, SEQ-43, associated with the invalid credentials test issue SEQ-27.

Maintaining clear bug reports, appropriate severity and priority classifications, and traceability between requirements, tests, and defects supports systematic defect investigation, retesting, and closure.

---

**End of Document**
