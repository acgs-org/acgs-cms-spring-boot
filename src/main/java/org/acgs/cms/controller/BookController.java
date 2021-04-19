package org.acgs.cms.controller;

import org.acgs.cms.entity.Book;
import org.acgs.cms.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * @Author John@acgs-org
 * @Date 2021/4/24
 */
@RestController
@RequestMapping("/v1/book")
public class BookController {

    @Autowired
    BookRepository bookRepository;

    @GetMapping("/all")
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Book> getBook(@PathVariable String id) {
        return bookRepository.findById(id);
    }

    @GetMapping("/")
    public Optional<Book> getBook(@RequestBody Book book) {
        return bookRepository.findOne(Example.of(book));
    }

    @PostMapping("/add")
    public Book createBook(@RequestBody Book book) {
        return bookRepository.save(book);
    }
}
