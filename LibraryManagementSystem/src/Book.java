import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Book {

    private String isbn;
    private String title;
    private String author;
    private String genre;
    private boolean available;

    private LocalDate borrowDate;
    private LocalDate dueDate;

    public Book(String isbn, String title, String author, String genre) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.available = true;
    }

    public String getIsbn() { return isbn; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getGenre() { return genre; }
    public boolean isAvailable() { return available; }
    public LocalDate getDueDate() { return dueDate; }

    public void borrowBook() {
        available = false;
        borrowDate = LocalDate.now();
        dueDate = borrowDate.plusDays(14);
    }

    public int returnBook() {
        available = true;
        int fine = 0;

        if (LocalDate.now().isAfter(dueDate)) {
            long daysLate = ChronoUnit.DAYS.between(dueDate, LocalDate.now());
            fine = (int) daysLate * 5;
        }

        borrowDate = null;
        dueDate = null;
        return fine;
    }

    public void display() {
        System.out.println("ISBN: " + isbn);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Genre: " + genre);
        System.out.println("Status: " + (available ? "Available" : "Borrowed"));
        if (!available)
            System.out.println("Due Date: " + dueDate);
        System.out.println("----------------------------------------");
    }
}
