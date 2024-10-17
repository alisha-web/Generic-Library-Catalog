// LibraryCatalog.java
import java.util.ArrayList;
import java.util.List;

// Generic LibraryCatalog class for managing a collection of library items
public class LibraryCatalog<T> {
    private List<T> items; // List to store library items

    // Constructor
    public LibraryCatalog() {
        items = new ArrayList<>();
    }

    // Method to add a new item to the catalog
    public void addItem(T item) {
        items.add(item);
        System.out.println("Item added successfully: " + item);
    }

    // Method to remove an item from the catalog
    public void removeItem(T item) {
        if (items.remove(item)) {
            System.out.println("Item removed successfully: " + item);
        } else {
            System.out.println("Error: Item not found in the catalog.");
        }
    }

    // Method to display all items in the catalog
    public void showCatalog() {
        if (items.isEmpty()) {
            System.out.println("The catalog is empty.");
        } else {
            System.out.println("Library Catalog:");
            items.forEach(System.out::println);
        }
    }

    // Method to get item details by index
    public T getItemDetails(int index) {
        if (index >= 0 && index < items.size()) {
            return items.get(index);
        }
        System.out.println("Error: Invalid item index.");
        return null;
    }
}
