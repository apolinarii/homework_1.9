package com.company;

public class Book {
    String name;
    String author;
    int year;

    public static Book Book(String name, String author, int year) {
        Book book = new Book();
        book.name = name;
        book.author = author;
        book.year = year;
        return book;
    }







}
