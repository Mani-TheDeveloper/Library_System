# Library Management System

A Java-based Library Management System built using JDBC for database connectivity with Oracle DB 23c, and AWT for the graphical user interface (GUI). This project allows for managing library operations such as user registration, book management, borrowing and returning books.

## Features
- **Graphical User Interface (GUI)**: Designed using AWT for managing users, books, borrowing, and returning operations.
- **Database Integration**: The system uses Oracle DB 23c with full support for CRUD operations (Create, Read, Update, Delete) on books, users, and loans.
- **Automatic Loan ID**: The `LOANID` is auto-generated using an identity column for easy tracking of loan transactions.
- **Modular Design**: The project is divided into clear modules for database operations, GUI components, and application logic.

## Project Structure
```
LibraryManagementSystem/
├── src/
│   └── com/
│       └── library/
│           └── management/
│               ├── db/ - Handles database operations
│               │    ├── BookTable.java - Manages book data operations
│               │    ├── LibraryDB.java - Central database connection handling
│               │    ├── LoanTable.java - Manages loan data (borrow/return)
│               │    └── UserTable.java - Manages user data
│               ├── gui/ - Implements GUI components
│               │    ├── BookPanel.java - GUI for managing books
│               │    ├── BorrowPanel.java - GUI for borrowing books
│               │    ├── Gui.java - Main GUI framework
│               │    ├── Panels.java - Panel utilities and common layout logic
│               │    ├── ReturnPanel.java - GUI for returning books
│               │    └── UserPanel.java - GUI for managing users
│   ├── App.java - Main application entry point
│   ├── main.sql - SQL scripts for database initialization
│   └── README.md - Documentation
```

## Screenshots

[User Registration](https://raw.githubusercontent.com/Mani-TheDeveloper/Library_System/refs/heads/main/ScreenShots/userRegistration.png)
[Book Registration](https://raw.githubusercontent.com/Mani-TheDeveloper/Library_System/refs/heads/main/ScreenShots/bookRegistration.png)
[Borrow Book](https://raw.githubusercontent.com/Mani-TheDeveloper/Library_System/refs/heads/main/ScreenShots/borrowBook.png)
[Return Book](https://raw.githubusercontent.com/Mani-TheDeveloper/Library_System/refs/heads/main/ScreenShots/returnBook.png)

## Prerequisites
- **Java JDK 17+**
- **Oracle Database 23c**
- **OJDBC 17 library (included in the lib/ folder)**

## Setup and Run

- **Import the project into your IDE (e.g., Eclipse, IntelliJ).**

- **Set up the database:**

Use the provided main.sql script to initialize the database tables in your Oracle database.
Ensure that the database connection details in LibraryDB.java are correct for your Oracle DB setup.

- **Run the application:**

Execute the App.java file to launch the Library Management System.

## Usage

- **User Management** : Add, edit, delete, or view users.
- **Book Management** : Add, edit, delete, or view books.
- **Borrow and Return Books** : Track books being borrowed and returned using the loan functionality.

## Author

[Mani Shankar](https://www.linkedin.com/in/mani-shankar-amudalapalli/)

Java Developer passionate about building scalable, user-friendly software.
LinkedIn: [My LinkedIn](https://www.linkedin.com/in/mani-shankar-amudalapalli/)
GitHub: [My GitHub](https://github.com/Mani-TheDeveloper)
