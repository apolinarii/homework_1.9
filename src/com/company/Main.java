package com.company;

public class Main {

    public static void main(String[] args) {
        Book book  = new Book("War and Peace", "Tolstoy", 1876);
        System.out.println("book.get.name = " + book.getName());
        System.out.println("book.get.author = " + book.getAuthor());
        System.out.println("book.get.year = " + book.getYear());

        Book book1 = new Book("1984","Orwell", 1949 );
        Book book2 = new Book("Lolita","Nabokov", 1955 );


        Author writer = new Author("Lev Nikolayevich Tolstoy");
        Author writer1 = new Author("George Orwell");
        Author write2 = new Author("Vladimir Vladimirovich Nabokov");








    }
}
