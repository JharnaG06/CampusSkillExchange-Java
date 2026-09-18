# Campus Skill Exchange

## Project Overview

Campus Skill Exchange is a console-based Java application designed to help college students exchange skills and knowledge with each other.

Students in a college environment have different skills, interests, and areas of knowledge. Some students may be good at programming, designing, communication, video editing, or other activities, while they may want to learn a different skill from another student.

The Campus Skill Exchange system provides a simple and organized way for students to discover such opportunities.

Students can create their profiles, add skills they can teach, add skills they want to learn, find compatible skill matches, send exchange requests, manage the exchange process, complete exchanges, and provide ratings and feedback.

The project is developed as a console-based Java application and focuses on applying Java programming concepts to a practical campus-related problem.

---

## Problem Statement

Students in a college campus have different skills and knowledge that they can share with their peers. However, there is no simple and organized way to find students who can teach the skills they want to learn.

For example, one student may know Java and want to learn video editing, while another student may know video editing and want to learn Java. Without an organized system, it can be difficult for these students to discover each other.

Campus Skill Exchange provides a simple system for students to discover compatible skill partners and exchange knowledge.

The system focuses on identifying mutual skill matches, managing exchange requests, tracking completed exchanges, and collecting feedback.

---

## Objectives

The main objectives of the Campus Skill Exchange project are:

- Register students and maintain their basic information.
- Allow students to add skills that they can teach.
- Allow students to add skills that they want to learn.
- Find compatible skill matches between students.
- Provide a structured process for skill exchange requests.
- Allow users to accept, reject, and complete exchange requests.
- Maintain a history of completed skill exchanges.
- Allow students to provide ratings and feedback.
- Store student information using file handling.
- Validate user inputs and handle common errors.
- Apply Java programming concepts to a practical real-world problem.
- Demonstrate modular and organized programming using multiple Java classes.

---

## Target Users

The main target users of the system are:

- College students who want to learn new skills.
- Students who want to share their existing knowledge.
- Students looking for peer-to-peer learning opportunities.
- Students who want to exchange skills instead of relying only on formal learning resources.

The current version is designed as a basic prototype for a campus environment.

---

## Main Features

### 1. Student Registration

Students can register using their basic information.

The registration module collects:

- Student ID
- Student Name
- Course
- Year

The system also checks for duplicate Student IDs before registering a new student.

---

### 2. Student Details

Registered students can be viewed through the application.

The system displays the available student information and helps users identify students who may be suitable skill exchange partners.

---

### 3. Skill Management

Students can maintain two types of skill information:

- Skills they can teach
- Skills they want to learn

Each skill contains:

- Skill Name
- Skill Category

This information is used later by the skill matching module.

---

### 4. Skill Matching

The Skill Matching module compares the skills offered and wanted by different students.

For example:

- Student A can teach Java and wants Video Editing.
- Student B can teach Video Editing and wants Java.

The system identifies this as a mutual skill match.

The matching process is case-insensitive so that differences in uppercase and lowercase do not prevent a match.

---

### 5. Exchange Requests

After finding a suitable skill match, a student can send an exchange request to another student.

Each request contains information such as:

- Request ID
- Sender
- Receiver
- Skill Offered
- Skill Wanted
- Request Status

The initial status of a new request is:

`Pending`

---

### 6. Request Management

The Exchange Management module allows requests to move through different stages.

Supported request statuses are:

- Pending
- Accepted
- Rejected
- Completed

A pending request can be accepted or rejected.

An accepted request can later be marked as completed after the skill exchange has taken place.

---

### 7. Exchange Completion

Once an exchange request has been accepted and the skill-sharing activity is completed, the request can be marked as completed.

Completed exchanges are then recorded in the exchange history.

This creates a structured workflow from the initial request to the completion of the exchange.

---

### 8. Exchange History

The Exchange History module maintains information about completed exchanges.

It records details such as:

- Request ID
- Students involved
- Skills exchanged

This allows completed skill exchanges to be viewed later.

---

### 9. Rating and Feedback

After completing a skill exchange, students can provide feedback.

The rating system allows a score from:

`1 to 5`

Students can also provide written feedback about the exchange.

The Rating Manager is responsible for storing and displaying ratings and feedback.

---

### 10. File Persistence

Student information is stored in a text file named:

`students.txt`

The FileManager class is responsible for saving and loading student information.

This allows registered student information to remain available when the application is started again.

---

### 11. Input Validation

The application validates user input to make the system more reliable.

The system handles cases such as:

- Empty input
- Invalid menu choices
- Invalid numbers
- Invalid year values
- Duplicate Student IDs
- Invalid rating values
- Invalid request IDs
- Sending a request to the same student

---

### 12. Exception Handling

The project uses exception handling to manage common runtime and file-related errors.

File operations are handled using appropriate exception handling so that the application can display an error message instead of stopping unexpectedly.

---

## Project Workflow

The overall workflow of the Campus Skill Exchange system is:

Student Registration

        ↓

Add Offered & Wanted Skills

        ↓

Find Skill Matches

        ↓

Send Exchange Request

        ↓

Pending

        ↓

Accept / Reject

        ↓

Complete Exchange

        ↓

Exchange History

        ↓

Rating & Feedback

        ↓

Exit

The workflow provides a logical sequence from creating a student profile to completing a skill exchange.

---

## Functional Modules

The major functional modules of the project are:

### Student Management

Handles student registration and student information.

### Skill Management

Stores the skills students can teach and the skills they want to learn.

### Skill Matching

Compares student skills and identifies mutual skill exchange opportunities.

### Exchange Management

Handles sending, viewing, accepting, rejecting, and completing exchange requests.

### Exchange History

Stores and displays information about completed exchanges.

### Rating and Feedback

Allows students to provide ratings and written feedback.

### File Management

Saves and loads student information using a text file.

---

## Technologies Used

- Java
- Object-Oriented Programming
- ArrayList
- File Handling
- Exception Handling
- Input Validation
- Modular Programming
- Visual Studio Code
- GitHub

---

## Development Environment

The project was developed and tested using:

- Visual Studio Code
- Java Development Kit (JDK)
- Java Extension Pack for Visual Studio Code
- GitHub for source code and project documentation

---

## Installation and Run Instructions

### Prerequisites

The following are required to run the project:

- Java Development Kit (JDK)
- Visual Studio Code
- Java Extension Pack for Visual Studio Code

### Steps to Run

1. Download or clone the Campus Skill Exchange repository from GitHub.
2. Open the downloaded project folder in Visual Studio Code.
3. Open the `src` folder.
4. Make sure all Java files and `students.txt` are present.
5. Open the terminal inside the `src` folder.
6. Compile all Java files using:

```text
javac *.java
