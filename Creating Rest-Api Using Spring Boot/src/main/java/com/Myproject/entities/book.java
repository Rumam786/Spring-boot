package com.Myproject.entities;

public class book {
    private int bookid;
    private String title;
    private String author;

    public book(int bookid, String title, String author) {
        this.bookid = bookid;
        this.title = title;
        this.author = author;
    }

    public book() {
    }

    public int getBookid() {
        return bookid;
    }

    public void setBookid(int bookid) {
        this.bookid = bookid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "book{" +
                "bookid=" + bookid +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
