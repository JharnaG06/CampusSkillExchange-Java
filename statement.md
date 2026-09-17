# Campus Skill Exchange

## 1. Problem Statement

In a college campus, students possess different skills and knowledge
that they can teach to other students. However, students often do not
have a simple and organized way to find peers who can teach the skills
they want to learn.

Campus Skill Exchange is designed to solve this problem by providing
a simple console-based system where students can register their
profiles, list the skills they can teach, list the skills they want
to learn, find compatible skill matches, and exchange skills with
other students.

The system also manages exchange requests, completed exchanges,
ratings, feedback, and student data storage.

---

## 2. Objectives

The main objectives of Campus Skill Exchange are:

1. To provide a simple platform for students to register their
   skill profiles.

2. To allow students to specify the skills they can teach.

3. To allow students to specify the skills they want to learn.

4. To identify compatible students using skill matching.

5. To allow students to send skill exchange requests.

6. To manage exchange requests using different statuses.

7. To maintain a history of completed skill exchanges.

8. To allow students to provide ratings and feedback.

9. To store student information using file handling.

10. To provide input validation and error handling for reliable
    program execution.

---

## 3. Scope of the Project

The current version of the project focuses on a console-based
peer-to-peer skill exchange system for college students.

The system covers:

- Student registration
- Student profile information
- Skill management
- Skill matching
- Exchange requests
- Request acceptance and rejection
- Exchange completion
- Exchange history
- Ratings and feedback
- File-based student data storage
- Input validation
- Exception handling

The current version does not include an online database,
graphical user interface, authentication system, or real-time
communication.

---

## 4. Functional Requirements

### FR1 — Student Registration

The system shall allow a student to register using:

- Student ID
- Name
- Course
- Year

The system shall prevent duplicate Student IDs.

---

### FR2 — Skill Management

The system shall allow students to add:

- Skills they can teach
- Skills they want to learn

Each skill shall contain:

- Skill name
- Skill category

---

### FR3 — View Students

The system shall display registered student information,
including their offered and wanted skills.

---

### FR4 — Skill Matching

The system shall compare the skills offered by one student
with the skills wanted by another student.

The system shall also check the reverse direction to identify
mutual skill exchange opportunities.

---

### FR5 — Exchange Request

The system shall allow one student to send a skill exchange
request to another student.

Each request shall contain:

- Request ID
- Sender
- Receiver
- Skill offered
- Skill wanted
- Request status

---

### FR6 — Request Management

The system shall allow an exchange request to move through
the following statuses:

- Pending
- Accepted
- Rejected
- Completed

Only a pending request can be accepted or rejected.

Only an accepted request can be completed.

---

### FR7 — Exchange History

The system shall maintain information about completed
skill exchanges.

---

### FR8 — Rating and Feedback

The system shall allow students to provide a rating from
1 to 5 and written feedback after an exchange is completed.

---

### FR9 — File Persistence

The system shall save student information in a text file.

The system shall load previously saved student information
when the application starts.

---

### FR10 — Input Validation

The system shall validate user inputs such as:

- Empty text input
- Invalid numerical input
- Invalid year
- Invalid rating
- Invalid menu choice
- Duplicate Student ID
- Invalid Request ID

---

## 5. Non-Functional Requirements

### NFR1 — Usability

The system should provide a simple menu-driven interface that
is easy for students to understand and operate.

---

### NFR2 — Reliability

The system should handle invalid inputs and unexpected input
formats without terminating unexpectedly.

---

### NFR3 — Maintainability

The project should use separate Java classes for different
functional responsibilities so that the code can be maintained
and extended easily.

---

### NFR4 — Performance

The system should provide quick responses for normal campus-sized
student and skill data.

---

### NFR5 — Error Handling

The system should display meaningful error messages when the
user enters invalid information or attempts an invalid operation.

---

### NFR6 — Data Persistence

Student information should remain available after the application
is closed and restarted by using file-based storage.

---

## 6. Major Project Modules

The project is divided into the following major modules:

### Module 1 — Student Management

Responsible for registering and displaying students.

Main class:

`Student.java`

---

### Module 2 — Skill Management

Responsible for storing the skills students can teach and
the skills they want to learn.

Main class:

`Skill.java`

---

### Module 3 — Skill Matching

Responsible for comparing students' offered and wanted skills
to identify compatible skill exchanges.

Main class:

`SkillMatcher.java`

---

### Module 4 — Exchange Request Management

Responsible for creating and managing exchange requests.

Main classes:

- `ExchangeRequest.java`
- `ExchangeManager.java`

---

### Module 5 — Rating and Feedback

Responsible for storing and displaying ratings and feedback.

Main classes:

- `Rating.java`
- `RatingManager.java`

---

### Module 6 — Exchange History

Responsible for maintaining completed exchange information.

Main classes:

- `ExchangeHistory.java`
- `HistoryManager.java`

---

### Module 7 — File Management

Responsible for saving and loading student information.

Main class:

`FileManager.java`

---

### Module 8 — Application Control

Responsible for displaying the main menu and connecting all
project modules.

Main class:

`Main.java`

---

## 7. Expected Outcome

The expected outcome of the project is a functional console-based
system that helps students discover compatible skill exchange
opportunities.

The system should allow a complete workflow:

Student Registration
        ↓
Add Skills
        ↓
Find Skill Matches
        ↓
Send Exchange Request
        ↓
Accept / Reject Request
        ↓
Complete Exchange
        ↓
Exchange History
        ↓
Rating and Feedback

The project demonstrates the use of Java programming concepts
including classes and objects, ArrayList, methods, file handling,
exception handling, loops, conditional statements, and input
validation.