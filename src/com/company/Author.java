package com.company;

public class Author {
    String writer;

    public static Author Author(String name){
        Author author = new Author();
        author.writer = name;
        return author;
    }
}
