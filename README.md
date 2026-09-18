# Campus Skill Exchange

## Project Overview

Campus Skill Exchange is a console-based Java application designed to help college students exchange skills with each other.

Students can create their profiles, add skills they can teach, add skills they want to learn, find compatible skill matches, send exchange requests, complete exchanges, and provide ratings and feedback.

---

## Problem Statement

Students in a college campus have different skills and knowledge that they can share with their peers. However, there is no simple and organized way to find students who can teach the skills they want to learn.

Campus Skill Exchange provides a simple system for students to discover compatible skill partners and exchange knowledge.

---

## Objectives

- Register students and maintain their basic information.
- Add skills that students can teach.
- Add skills that students want to learn.
- Find compatible skill matches.
- Send and manage skill exchange requests.
- Track completed exchanges.
- Provide ratings and feedback.
- Store student information using file handling.
- Handle invalid inputs using validation and exception handling.

---

## Main Features

### 1. Student Registration

Students can register using their Student ID, name, course, and year.

### 2. Skill Management

Students can add:

- Skills they can teach
- Skills they want to learn

Each skill contains a name and category.

### 3. Skill Matching

The system compares students' offered and wanted skills to identify possible mutual skill exchanges.

### 4. Exchange Requests

Students can send skill exchange requests to other students.

Request statuses include:

- Pending
- Accepted
- Rejected
- Completed

### 5. Exchange History

Completed exchanges can be viewed through the exchange history module.

### 6. Rating and Feedback

Students can provide a rating from 1 to 5 and written feedback after completing an exchange.

### 7. File Persistence

Student information is stored in `students.txt` and loaded when the application starts.

### 8. Input Validation

The system handles invalid menu choices, empty input, invalid numbers, duplicate Student IDs, invalid ratings, and invalid request IDs.

---

## Project Workflow

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

---

## Technologies Used

- Java
- Object-Oriented Programming
- ArrayList
- File Handling
- Exception Handling
- Visual Studio Code
- GitHub

---

## Installation and Run Instructions

### Prerequisites

- Java Development Kit (JDK)
- Visual Studio Code
- Java Extension Pack for Visual Studio Code

### Steps to Run

1. Download or clone the Campus Skill Exchange project from GitHub.
2. Open the project folder in Visual Studio Code.
3. Open the `src` folder.
4. Make sure all Java files and `students.txt` are present.
5. Open `Main.java`.
6. Run `Main.java` using the Run option in Visual Studio Code.
7. The main menu will appear in the console.
8. Select the required option by entering the menu number.

The application uses `students.txt` to store student information.

---

## Testing Instructions

The application can be tested through the console menu.

The following features can be tested:

1. Register a new student using valid details.
2. Try empty or invalid inputs to check input validation.
3. View registered students.
4. Find mutual skill matches between students.
5. Send an exchange request.
6. View exchange requests.
7. Accept an exchange request.
8. Reject an exchange request.
9. Complete an accepted exchange.
10. Give a rating and feedback.
11. View exchange history.
12. Restart the application and verify that student information is loaded from `students.txt`.

### Expected Result

All valid operations should execute successfully.

For invalid inputs, the system should display an appropriate error message and continue running without terminating unexpectedly.

---

## Project Structure

```text
CampusSkillExchange
│
├── src
│   ├── Main.java
│   ├── Student.java
│   ├── Skill.java
│   ├── SkillMatcher.java
│   ├── ExchangeRequest.java
│   ├── ExchangeManager.java
│   ├── Rating.java
│   ├── RatingManager.java
│   ├── ExchangeHistory.java
│   ├── HistoryManager.java
│   ├── FileManager.java
│   └── students.txt
│
├── README.md
├── statement.md
├── architecture.md
├── use_case_diagram.md
├── class_diagram.md
└── sequence_diagram.md
