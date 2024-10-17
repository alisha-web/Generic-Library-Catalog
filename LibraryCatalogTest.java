// LibraryCatalogTest.java
import java.util.Scanner;

public class LibraryCatalogTest {
    public static void main(String[] args) {
        // Create a catalog for LibraryItem objects with String as itemID type
        LibraryCatalog<LibraryItem<String>> catalog = new LibraryCatalog<>();

        // Scanner for user input
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            // User interface options
            System.out.println("\nLibrary Catalog Management System");
            System.out.println("1. Add a new item");
            System.out.println("2. Remove an item");
            System.out.println("3. View catalog");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1: // Add a new item
                    System.out.print("Enter title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter itemID: ");
                    String itemID = scanner.nextLine();

                    LibraryItem<String> newItem = new LibraryItem<>(title, author, itemID);
                    catalog.addItem(newItem);
                    break;

                case 2: // Remove an item
                    System.out.print("Enter itemID to remove: ");
                    String removeID = scanner.nextLine();
                    LibraryItem<String> itemToRemove = new LibraryItem<>("", "", removeID);
                    catalog.removeItem(itemToRemove);
                    break;

                case 3: // View catalog
                    catalog.showCatalog();
                    break;

                case 4: // Exit
                    System.out.println("Exiting the system.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}
