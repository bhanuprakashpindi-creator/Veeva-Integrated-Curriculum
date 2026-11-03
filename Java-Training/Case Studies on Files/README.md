# Java Case Studies on Files

This folder contains Java practice programs focused on **File Handling, Text File Operations, Object Serialization, and Student Record Management**.

The case studies demonstrate how Java can create, read, write, update, delete, and manage data using file-based storage.

## Technologies Used

* Java
* JDK 21
* IntelliJ IDEA
* Java I/O (`java.io`)
* Collections Framework (`ArrayList`)
* Object Serialization

## Project Structure

```text
Case Studies on Files/
│
├── data/
│   ├── Student.txt
│   ├── Student_Case02.txt
│   └── Student_Case03.txt
│
├── src/
│   ├── Case01.java
│   ├── Case02.java
│   ├── Case03.java
│   │
│   └── Questions_Of_CaseStudies/
│       ├── Question01.txt
│       ├── Question02.txt
│       └── Question03.txt
│
└── README.md
```

## Case Studies

### Case 01 – Introduction to File Handling

**Objective:** Understand the Java `File` class and basic file operations.

**Concepts Covered:**

* Creating a File object.
* Checking whether a file exists.
* Identifying files and directories.
* Checking read and write permissions.
* Retrieving relative and absolute file paths.
* Creating a new file.
* Setting file permissions.

**Source File:** `src/Case01.java`

**Data File:** `data/Student.txt`

### Case 02 – Student Management System Using Text Files

**Objective:** Develop a console-based Student Management System using text-file storage.

**Concepts Covered:**

* FileReader and FileWriter.
* BufferedReader and BufferedWriter.
* Reading and writing text files.
* Append mode for storing records.
* Searching records using Roll Number and Name.
* Updating records using a temporary file.
* Deleting records using a temporary file.
* Exception handling.

**Features:**

1. Add Student Record
2. View All Student Records
3. Search Student by Roll Number
4. Search Student by Name
5. Update Student Record
6. Delete Student Record
7. Exit Application

The application calculates the student's total marks and grade based on the entered subject marks.

**Source File:** `src/Case02.java`

**Data File:** `data/Student_Case02.txt`

### Case 03 – Student Management System Using Serialization

**Objective:** Implement student record management using Java Object Serialization and Deserialization.

**Concepts Covered:**

* Serializable interface.
* ObjectOutputStream.
* ObjectInputStream.
* Serialization and Deserialization.
* ArrayList for storing multiple Student objects.
* Reading and writing objects to files.
* CRUD operations using serialized data.

**Features:**

1. Add Student Record
2. View All Student Records
3. Search Student by Roll Number
4. Search Student by Name
5. Update Student Record
6. Delete Student Record
7. Exit Application

Student records are stored as a serialized `ArrayList<Student>`.

**Source File:** `src/Case03.java`

**Data File:** `data/Student_Case03.txt`

## How to Run

1. Clone or download the repository.
2. Open the `Case Studies on Files` folder in IntelliJ IDEA.
3. Make sure JDK 21 is configured.
4. Navigate to the `src` directory.
5. Open the required Java file.
6. Run its `main()` method.

Run each case study separately.

**Note:** Run the programs with the project folder as the working directory because the programs use relative paths beginning with `data/`.

## Learning Outcomes

After completing these case studies, the following concepts can be practised:

* Working with files and directories in Java.
* Reading and writing data using character streams.
* Understanding buffered file operations.
* Implementing CRUD operations with file storage.
* Managing records using temporary files.
* Understanding object serialization and deserialization.
* Using ArrayList to manage multiple objects.
* Handling file-related exceptions.

---

**Repository:** [Veeva Integrated Curriculum](https://github.com/bhanuprakashpindi-creator/Veeva-Integrated-Curriculum)
