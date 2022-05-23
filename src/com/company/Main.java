package com.company;

public class Main {

    public static void main(String[] args) {
        Book book  = Book.Book("War and Peace", "Tolstoy", 1876);
        System.out.println("book.name = " + book.name);
        System.out.println("book.author = " + book.author);
        System.out.println("book.year = " + book.year);

        Author writer = Author.Author("Lev Nikolayevich Tolstoy");








    }
}
