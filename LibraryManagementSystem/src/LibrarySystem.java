import java.util.Scanner;

public class LibrarySystem {

    static Scanner sc = new Scanner(System.in);
    static Library library = new Library();

    public static void main(String[] args) {

        preloadSampleData();   // ✅ SAMPLE DATA LOADED

        int choice;
        do {
            System.out.println("\n=== LIBRARY MANAGEMENT SYSTEM ===");
            System.out.println("1. Add New Book");
            System.out.println("2. Register New Member");
            System.out.println("3. Display All Books");
            System.out.println("4. Display Available Books");
            System.out.println("5. Search Books");
            System.out.println("6. Borrow Book");
            System.out.println("7. Return Book");
            System.out.println("8. Overdue Books Report");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> addBook();
                case 2 -> registerMember();
                case 3 -> library.displayAllBooks();
                case 4 -> library.displayAvailableBooks();
                case 5 -> searchBooks();
                case 6 -> borrowBook();
                case 7 -> returnBook();
                case 8 -> ReportGenerator.overdueReport(library);
                case 9 -> System.out.println("Exiting system...");
                default -> System.out.println("Invalid choice!");
            }
        } while (choice != 9);
    }

    static void preloadSampleData() {

        // Sample Members
        library.registerMember(new Member("M001", "Alice Johnson", "9876543210"));
        library.registerMember(new Member("M002", "Bob Williams", "9123456789"));

        // Sample Books
        library.addBook(new Book("978-3-16-148410-0",
                "Java Programming Guide", "John Smith", "Programming"));

        library.addBook(new Book("978-0-13-468599-1",
                "Effective Java", "Joshua Bloch", "Programming"));

        library.addBook(new Book("978-0-262-03384-8",
                "Introduction to Algorithms", "Thomas Cormen", "Computer Science"));

        library.addBook(new Book("978-1-56619-909-4",
                "Clean Code", "Robert C. Martin", "Programming"));
    }

    static void addBook() {
        System.out.print("Enter ISBN: ");
        String isbn = sc.nextLine();
        System.out.print("Enter Title: ");
        String title = sc.nextLine();
        System.out.print("Enter Author: ");
        String author = sc.nextLine();
        System.out.print("Enter Genre: ");
        String genre = sc.nextLine();

        library.addBook(new Book(isbn, title, author, genre));
    }

    static void registerMember() {
        System.out.print("Enter Member ID: ");
        String id = sc.nextLine();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Contact: ");
        String contact = sc.nextLine();

        library.registerMember(new Member(id, name, contact));
    }

    static void searchBooks() {
        System.out.print("Enter search keyword: ");
        library.searchBooks(sc.nextLine());
    }

    static void borrowBook() {
        System.out.print("Enter Member ID: ");
        String memberId = sc.nextLine();
        System.out.print("Enter Book ISBN: ");
        String isbn = sc.nextLine();
        library.borrowBook(memberId, isbn);
    }

    static void returnBook() {
        System.out.print("Enter Member ID: ");
        String memberId = sc.nextLine();
        System.out.print("Enter Book ISBN: ");
        String isbn = sc.nextLine();
        library.returnBook(memberId, isbn);
    }
}
