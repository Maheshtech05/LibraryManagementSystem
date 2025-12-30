import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<Member> members = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully!");
    }

    public void registerMember(Member member) {
        members.add(member);
        System.out.println("Member registered successfully!");
    }

    public void displayAllBooks() {
        System.out.println("\n=== ALL BOOKS ===");
        for (Book b : books) b.display();
    }

    public void displayAvailableBooks() {
        System.out.println("\n=== AVAILABLE BOOKS ===");
        for (Book b : books)
            if (b.isAvailable())
                b.display();
    }

    public void searchBooks(String keyword) {
        System.out.println("\n=== SEARCH RESULTS ===");
        for (Book b : books) {
            if (b.getTitle().toLowerCase().contains(keyword.toLowerCase()) ||
                    b.getAuthor().toLowerCase().contains(keyword.toLowerCase())) {
                b.display();
            }
        }
    }

    public void borrowBook(String memberId, String isbn) {
        Member member = findMember(memberId);
        Book book = findBook(isbn);

        if (member == null || book == null) {
            System.out.println("Member or Book not found!");
            return;
        }

        if (!book.isAvailable()) {
            System.out.println("Book already borrowed!");
            return;
        }

        book.borrowBook();
        member.borrowBook(book);

        System.out.println("Book borrowed successfully!");
        System.out.println("Member: " + member.getName());
        System.out.println("Book: " + book.getTitle());
        System.out.println("Due Date: " + book.getDueDate());
    }

    public void returnBook(String memberId, String isbn) {
        Member member = findMember(memberId);
        Book book = findBook(isbn);

        if (member == null || book == null) {
            System.out.println("Member or Book not found!");
            return;
        }

        int fine = book.returnBook();
        member.returnBook(book);

        System.out.println("Book returned successfully!");
        if (fine > 0)
            System.out.println("Late Fine: ₹" + fine);
        else
            System.out.println("No fine. Thank you!");
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    private Book findBook(String isbn) {
        for (Book b : books)
            if (b.getIsbn().equals(isbn))
                return b;
        return null;
    }

    private Member findMember(String id) {
        for (Member m : members)
            if (m.getMemberId().equals(id))
                return m;
        return null;
    }
}
