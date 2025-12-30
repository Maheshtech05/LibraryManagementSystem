# LibraryManagementSystem
Developed a Java Library Management System using OOP concepts, enabling book and member management, borrowing and returning with due date tracking, fine calculation, and report generation.

# Library Management System (Java – Option 3: Advanced)

## Project Overview
The **Library Management System** is a **Java-based, menu-driven console application** designed to manage library operations efficiently.  
This **Option 3 – Advanced Version** includes **book and member management**, **borrowing and returning books**, **due date tracking**, **fine calculation**, **overdue reports**, and **preloaded sample data**.

The project follows **Object-Oriented Programming (OOP)** principles such as encapsulation, modularity, and separation of concerns.

---

## Features
- Add new books to the library
- Register library members
- Display all books
- Display available books only
- Search books by **title or author**
- Borrow books with **automatic due date generation**
- Return books with **fine calculation**
- Generate **overdue books report**
- Preloaded sample books and members
- Menu-driven console interface
- Proper encapsulation using getters and private fields

---

## Technologies Used
- Java (JDK 11 or higher)
- IntelliJ IDEA
- Java Collections (`ArrayList`)
- Java Date-Time API (`LocalDate`, `ChronoUnit`)

---

## Project Structure
Library-Management-System/
│
├── Book.java
├── Member.java
├── Library.java
├── ReportGenerator.java
├── LibrarySystem.java (Main Class)



---

## Class Description

###  Book.java
- Stores book details (ISBN, title, author, genre)
- Tracks availability
- Handles borrow date, due date, and fine calculation

###  Member.java
- Stores member details
- Maintains borrowed books list

###  Library.java
- Core business logic
- Manages books and members
- Implements borrow and return operations

###  ReportGenerator.java
- Generates overdue books report

###  LibrarySystem.java
- Main entry point
- Menu-driven user interface
- Loads sample data at startup

---

##  Borrowing Rules
- Borrow duration: **14 days**
- Late fine: **₹5 per day**
- Fine calculated automatically during return

---

## Sample Data (Preloaded)

The system automatically loads sample data when it starts.

### Sample Members
| Member ID | Name | Contact |
|---------|------|---------|
| M001 | Alice Johnson | 9876543210 |
| M002 | Bob Williams | 9123456789 |

### Sample Books
| ISBN | Title | Author | Genre |
|----|------|--------|-------|
| 978-3-16-148410-0 | Java Programming Guide | John Smith | Programming |
| 978-0-13-468599-1 | Effective Java | Joshua Bloch | Programming |
| 978-0-262-03384-8 | Introduction to Algorithms | Thomas Cormen | Computer Science |
| 978-1-56619-909-4 | Clean Code | Robert C. Martin | Programming |

> This allows immediate testing of **borrow**, **return**, **fine calculation**, and **overdue reports**.

---

## How to Run the Project

### Using IntelliJ IDEA
1. Open the project in IntelliJ IDEA
2. Ensure Java SDK is configured
3. Run `LibrarySystem.java`

### Using Command Line
```bash
javac *.java
java LibrarySystem
