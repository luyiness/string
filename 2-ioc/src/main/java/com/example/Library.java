package com.example;

/**
 * @Date:2021/02_11:02 上午
 * @Description：
 */
public class Library {

    private Book book;
    private String name;

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Library() {
    }

    public Library(Book book, String name) {
        this.book = book;
        this.name = name;
    }
}
