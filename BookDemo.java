import java.util.*;

class Book {
    private String name;
    private String author;
    private double price;
    private int numPages;

    // Constructor to initialize the book details
    public Book(String name, String author, double price, int numPages) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.numPages = numPages;
    }

    // Method to set book details
    public void setDetails(String name, String author, double price, int numPages) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.numPages = numPages;
    }

    // Method to get book name
    public String getName() {
        return name;
    }

    // Method to get author
    public String getAuthor() {
        return author;
    }

    // Method to get price
    public double getPrice() {
        return price;
    }

    // Method to get number of pages
    public int getNumPages() {
        return numPages;
    }
    
    public String toString() {
        return "Book Name: " + name + "\n" +
               "Author: " + author + "\n" +
               "Price: Rs                                                                                                               " + price + "\n" +
               "Number of Pages: " + numPages;
    }
}



public class BookDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of books you want to create:");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        Book[] books = new Book[n]; // Array to hold book objects

        // Loop to create n book objects
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for book " + (i + 1) + ":");

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Author: ");
            String author = scanner.nextLine();

            System.out.print("Price: ");
            double price = scanner.nextDouble();

            System.out.print("Number of Pages: ");
            int numPages = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            // Create a new book object and store it in the array
            books[i] = new Book(name, author, price, numPages);
        }

        // Display the details of each book
        System.out.println("\nBook Details:");
        for (Book book : books) {
            System.out.println(book);
            System.out.println(); // Blank line for better readability
        }

        scanner.close();
    }
}

