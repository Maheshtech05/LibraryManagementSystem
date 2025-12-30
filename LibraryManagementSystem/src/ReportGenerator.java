import java.time.LocalDate;

public class ReportGenerator {

    public static void overdueReport(Library library) {
        System.out.println("\n=== OVERDUE BOOKS REPORT ===");
        boolean found = false;

        for (Book b : library.getBooks()) {
            if (!b.isAvailable() && b.getDueDate().isBefore(LocalDate.now())) {
                b.display();
                found = true;
            }
        }

        if (!found)
            System.out.println("No overdue books.");
    }
}
