# User Guide – Library Management System

## Introduction
This guide explains how to use the **Library Management System (Option 3 – Advanced)**.  
The system is menu-driven and runs in the console, allowing users to manage books, members, borrowing, returns, fines, and reports.

---

## Starting the Application
1. Compile and run `LibrarySystem.java`
2. The system loads **sample books and members automatically**
3. The main menu is displayed

---

## Main Menu Options
1. Add New Book
2. Register New Member
3. Display All Books
4. Display Available Books
5. Search Books
6. Borrow Book
7. Return Book
8. Overdue Books Report
9. Exit


---

## Menu Option Details

### 1. Add New Book
- Enter ISBN, title, author, and genre
- Book is added to the library and marked as **Available**

---

### 2. Register New Member
- Enter member ID, name, and contact number
- Member is registered and can borrow books

---

### 3. Display All Books
- Shows all books in the library
- Displays book status (Available / Borrowed)
- Shows due date if a book is borrowed

---

### 4. Display Available Books
- Displays only books that are currently available for borrowing

---

### 5. Search Books
- Search using **title or author keyword**
- Case-insensitive search
- Displays matching results with full details

---

### 6. Borrow Book
- Enter Member ID and Book ISBN
- System checks:
    - Member exists
    - Book exists
    - Book availability
- Borrow date is set automatically
- Due date is calculated as **14 days from borrow date**

---

### 7. Return Book
- Enter Member ID and Book ISBN
- System calculates fine if returned late
- Fine rule:
    - ₹5 per day after due date
- Book status changes back to **Available**

---

### 8. Overdue Books Report
- Displays all books whose due date has passed
- Helps track overdue items in the library

---

### 9. Exit
- Safely exits the application

---

## Borrowing Rules
- Maximum borrow duration: **14 days**
- Late fine: **₹5 per day**
- Fine calculated automatically on return

---

## Sample Data
The system starts with preloaded data:
- Sample members (e.g., M001, M002)
- Sample books (Java Programming Guide, Effective Java, etc.)

This allows immediate testing of all features.

---

## Error Handling
- Prevents borrowing of unavailable books
- Displays messages for invalid member IDs or ISBNs
- Ensures smooth and safe user interaction

---

## Conclusion
The Library Management System is easy to use and provides all essential library operations through a simple console interface.  
This guide helps users understand and operate the system effectively without prior technical knowledge.
