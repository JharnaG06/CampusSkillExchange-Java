# System Architecture

## Architecture Type

Campus Skill Exchange follows a modular object-oriented
architecture. The application is divided into separate Java
classes, where each class has a specific responsibility.

## Main Components

### 1. Main.java
Acts as the main controller of the application.

Responsibilities:
- Display main menu
- Take user input
- Connect different modules
- Control application workflow

### 2. Student.java
Stores student profile information.

### 3. Skill.java
Stores skill name and skill category.

### 4. SkillMatcher.java
Compares offered and wanted skills to identify compatible
skill matches.

### 5. ExchangeRequest.java
Represents an exchange request between two students.

### 6. ExchangeManager.java
Manages exchange requests and their statuses.

### 7. Rating.java
Stores rating and feedback information.

### 8. RatingManager.java
Manages ratings and feedback.

### 9. ExchangeHistory.java
Represents information about a completed exchange.

### 10. HistoryManager.java
Stores and displays completed exchange history.

### 11. FileManager.java
Saves and loads student information using file handling.

## Data Storage

Student information is stored in:

students.txt

The application loads the saved student information when it
starts and saves updated student information after registration.

## Technology

- Java
- Object-Oriented Programming
- ArrayList
- File Handling
- Exception Handling
- VS Code