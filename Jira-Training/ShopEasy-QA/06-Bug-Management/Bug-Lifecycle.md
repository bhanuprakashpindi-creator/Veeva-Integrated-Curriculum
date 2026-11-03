# ShopEasy QA – Bug Lifecycle

## 1. Introduction

The Bug Lifecycle describes the sequence of stages a defect passes through from identification to resolution and closure.

In the ShopEasy QA project, Jira is used to manage defects and track their progress through a defined workflow.

The workflow ensures that every reported defect is investigated, corrected, retested, and properly closed.

## 2. Bug Workflow

The project follows this defect lifecycle:

```text
       Open
         |
         v
    In Progress
         |
         v
       Fixed
         |
         v
       Retest
       /    \
      /      \
   Pass      Fail
    |          |
    v          v
  Closed   In Progress
```

## 3. Bug Lifecycle Stages

### 3.1 Open

A defect enters the Open status when it is identified and reported by the QA team.

**Activities:**

- Create a Jira Bug issue.
- Provide a descriptive summary.
- Document reproduction steps.
- Record expected and actual results.
- Assign severity and priority.
- Attach supporting screenshots.
- Link the related Test Case and User Story.

### 3.2 In Progress

A defect moves to In Progress when a developer starts investigating or fixing it.

**Activities:**

- Analyze the reported issue.
- Identify the root cause.
- Investigate affected functionality.
- Implement the required correction.

### 3.3 Fixed

A defect moves to Fixed after the developer completes the correction.

**Activities:**

- Implement the fix.
- Perform developer-side verification.
- Update the defect with relevant information.
- Make the corrected build available for QA retesting.

### 3.4 Retest

The QA team verifies whether the reported defect has been resolved.

**Activities:**

- Review the original defect.
- Reproduce the original test conditions.
- Execute the associated test case again.
- Compare actual and expected results.
- Record the retesting outcome.

**Possible outcomes:**

- **Retest Passed:** Move the Bug to Closed.
- **Retest Failed:** Move the Bug back to In Progress and add a comment explaining why the defect still exists.

### 3.5 Closed

A defect moves to Closed when QA successfully verifies the correction.

**Activities:**

- Confirm that the defect is resolved.
- Verify the expected application behavior.
- Record the successful retest result.
- Close the Jira Bug issue.

## 4. Workflow Transitions

| Current Status | Next Status | Condition                            |
| -------------- | ----------- | ------------------------------------ |
| Open           | In Progress | Developer starts investigation.      |
| In Progress    | Fixed       | Developer completes the fix.         |
| Fixed          | Retest      | Defect is ready for QA verification. |
| Retest         | Closed      | Retesting is successful.             |
| Retest         | In Progress | Retesting fails.                     |

## 5. Defect Retesting Process

Retesting is performed to confirm that a previously reported defect has been corrected.

The process is:

1. Open the Bug issue in Jira.
2. Review its original description and reproduction steps.
3. Confirm that the corrected build is available.
4. Execute the associated Xray Test Case.
5. Compare the actual result with the expected result.
6. Record the execution outcome.
7. Update the Bug status according to the result.

### Successful Retest

When the application behaves as expected:

```text
Fixed → Retest → Closed
```

### Failed Retest

When the original defect still exists:

```text
Fixed → Retest → In Progress
```

A comment should be added explaining the failed retest and the observed behavior.

## 6. Bug and Test Case Relationship

Every defect should maintain a relationship with its corresponding failed test case.

The relationship is:

```text
Jira User Story
       |
       v
   Xray Test
       |
       v
 Test Execution
       |
       v
   Failed Result
       |
       v
   Jira Bug
       |
       v
 Developer Fix
       |
       v
     Retest
       |
       v
 Closed / In Progress
```

This relationship maintains traceability between application requirements, testing activities, and defects.

## 7. Defect Management Best Practices

- Report defects as soon as they are identified.
- Provide clear and reproducible steps.
- Include supporting screenshots.
- Assign appropriate severity and priority.
- Link defects to the related test cases and stories.
- Maintain comments during investigation and retesting.
- Do not close defects without successful verification.
- Return unresolved defects to In Progress.

## 8. Conclusion

The Bug Lifecycle establishes a systematic process for managing application defects.

The defined workflow helps the QA and development teams coordinate defect investigation, correction, retesting, and closure.

Jira provides visibility into defect status, while Xray supports test execution and retesting activities.

---

**End of Document**
