// LibraryItem.java
// Generic LibraryItem class representing a library item (Book, DVD, Magazine, etc.)
public class LibraryItem<T> {
    private String title;
    private String author;
    private T itemID; // Generic itemID

    // Constructor
    public LibraryItem(String title, String author, T itemID) {
        this.title = title;
        this.author = author;
        this.itemID = itemID;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public T getItemID() {
        return itemID;
    }

    // Override toString() for easy display of item information
    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", ItemID: " + itemID;
    }
}
