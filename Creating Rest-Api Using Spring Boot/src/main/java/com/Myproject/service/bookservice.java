package com.Myproject.service;

import com.Myproject.entities.book;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class bookservice {
    private static List<book> mylist= new ArrayList<book>();
    static {
        mylist.add(new book(2151,"Spring boot Complete","RST"));
        mylist.add(new book(2152,"Java Complete","ABC"));
        mylist.add(new book(2153,"MySQL Complete","XYZ"));
        mylist.add(new book(2154,"HTML Complete","LMN"));
    }

//    Get All Books
    public static List<book> getAllBooks() {
        return mylist;
    }

//    Get Single Book By id
    public book getbookbyid(int bookid) {
        book book = null;
        book= mylist.stream().filter(e->e.getBookid()==bookid).findFirst().get();
        return book;
    }

//    Adding the book
    public void addbook(book b) {
        mylist.add(b);
    }

//    Deleting Single Book
    public void deletebook(int bookid) {
       mylist = (List<book>) mylist.stream().filter(book->book.getBookid()!=bookid).collect(Collectors.toList());
    }

//    Update books
    public void Updatebook(book book,int bookid) {
        mylist= mylist.stream().map(b->{
            if(b.getBookid()==bookid) {
                b.setBookid(b.getBookid());
                b.setAuthor(b.getAuthor());
                b.setTitle(b.getTitle());
            }
            return b;
        }).collect(Collectors.toList());
    }
}
