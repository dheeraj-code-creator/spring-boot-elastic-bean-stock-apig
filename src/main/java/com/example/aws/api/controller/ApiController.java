package com.example.aws.api.controller;

import com.example.aws.api.entity.Book;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/book")
public class ApiController {

    private List<Book> bookList = new ArrayList<>();

    @PostMapping(value = "/newBook")
    public Book addBook(@RequestBody Book book) {
        bookList.add(book);
        return book;
    }

    @GetMapping(value = "/findAllBooks")
    public List<Book> getAllBooks(){
        return bookList;
    }
}
