package com.books;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// Book class to hold book details
class Book {
    private String isbn;
    private double price;
    private String authorName;
    private int quantity;

    public Book(String isbn, double price, String authorName, int quantity) {
        this.isbn = isbn;
        this.price = price;
        this.authorName = authorName;
        this.quantity = quantity;
    }

    // toString method to display book details
    @Override
    public String toString() {
        return "ISBN: " + isbn + ", Price: " + price + ", Author: " + authorName + ", Quantity: " + quantity;
    }
}

public class Library {
    public static void main(String[] args) {
        ArrayList<Book> bookList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== Library Menu =====");
            System.out.println("1. Add New Book");
            System.out.println("2. Display All Books (Forward)");
            System.out.println("3. Display All Books (Reverse)");
            System.out.println("4. Delete Book at Index");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume leftover newline

            switch (choice) {
                case 1:
                    // Add new book
                    System.out.print("Enter ISBN: ");
                    String isbn = sc.nextLine();
                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();
                    sc.nextLine(); // consume newline
                    System.out.print("Enter Author Name: ");
                    String authorName = sc.nextLine();
                    System.out.print("Enter Quantity: ");
                    int quantity = sc.nextInt();

                    bookList.add(new Book(isbn, price, authorName, quantity));
                    System.out.println("Book added successfully.");
                    break;

                case 2:
                    // Display all books (forward)
                    System.out.println("\n--- Book List (Forward) ---");
                    if (bookList.isEmpty()) {
                        System.out.println("No books found.");
                    } else {
                        for (Book b : bookList) {
                            System.out.println(b);
                        }
                    }
                    break;

                case 3:
                    // Display all books (reverse)
                    System.out.println("\n--- Book List (Reverse) ---");
                    if (bookList.isEmpty()) {
                        System.out.println("No books found.");
                    } else {
                        for (int i = bookList.size() - 1; i >= 0; i--) {
                            System.out.println(bookList.get(i));
                        }
                    }
                    break;

                case 4:
                    // Delete book at given index
                    System.out.print("Enter index to delete (starting from 0): ");
                    int index = sc.nextInt();
                    if (index >= 0 && index < bookList.size()) {
                        bookList.remove(index);
                        System.out.println("Book removed successfully.");
                    } else {
                        System.out.println("Invalid index!");
                    }
                    break;

                case 5:
                    System.out.println("Exiting... Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
                    break;
            }

        } while (choice != 5);

        sc.close();
    }
}
