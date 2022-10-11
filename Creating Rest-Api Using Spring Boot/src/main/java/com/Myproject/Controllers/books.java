package com.Myproject.Controllers;

import com.Myproject.entities.book;
import com.Myproject.service.bookservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class books {
    @Autowired
    private bookservice Bookservice;

    @GetMapping("/books")
    public List<book> mybooks() {
        return bookservice.getAllBooks();
    }

    @GetMapping("/books/{id}")
    public book getbook(@PathVariable ("id") int bookid) {
        return Bookservice.getbookbyid(bookid);
    }

    @PostMapping("/books")
    public book addBook(@RequestBody book book) {
        this.Bookservice.addbook(book);
        return book;
    }

    @DeleteMapping("/books/{id}")
    public void deletebook(@PathVariable("id") int bookid) {
        Bookservice.deletebook(bookid);
    }

    @PutMapping("/books/{bid}")
    public book Updatebook(@RequestBody book book,@PathVariable("bid") int bookid) {
        this.Bookservice.Updatebook(book,bookid);
        return book;
    }
}
