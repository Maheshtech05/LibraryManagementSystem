# Test Cases – Library Management System (Option 3)

## Test Case 1: Display All Books
**Action:** Select option 3  
**Expected Result:**  
All books are displayed with correct status (Available / Borrowed)

---

## Test Case 2: Search Book by Title
**Input:**  
Search keyword: Java

**Expected Result:**  
Books with "Java" in the title are displayed

---

## Test Case 3: Borrow Book (Valid Case)
**Input:**  
Member ID: M001  
Book ISBN: 978-0-13-468599-1

**Expected Result:**
- Book borrowed successfully
- Due date displayed (14 days from borrow date)
- Book status changes to Borrowed

---

## Test Case 4: Borrow Book (Already Borrowed)
**Input:**  
Member ID: M002  
Book ISBN: 978-0-13-468599-1

**Expected Result:**  
Error message: Book already borrowed

---

## Test Case 5: Return Book (Before Due Date)
**Input:**  
Member ID: M001  
Book ISBN: 978-0-13-468599-1

**Expected Result:**
- Book returned successfully
- No fine applied

---

## Test Case 6: Return Book (After Due Date)
**Condition:**  
Return the book after the due date

**Expected Result:**
- Late fine calculated
- Fine = ₹5 × number of late days

---

## Test Case 7: Overdue Books Report
**Action:** Select option 8

**Expected Result:**
- Displays all overdue books
- Shows due date information

---

## Test Case 8: Invalid Member ID
**Input:**  
Member ID: M999

**Expected Result:**  
Error message: Member not found

---

## Test Case 9: Invalid Book ISBN
**Input:**  
ISBN: 000-0-00-000000-0

**Expected Result:**  
Error message: Book not found

---

## Test Case 10: Exit System
**Action:** Select option 9

**Expected Result:**  
Application exits successfully
