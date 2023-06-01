package com.example.BookstoreExample;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class BookController {

    private final BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @GetMapping("/books")
    public List<Book> getBooks() { return (List<Book>) bookRepository.findAll(); }

    @PostMapping("/books")
    public void addBook(@RequestBody Book book) { bookRepository.save(book); }

    @GetMapping("/book")
    public Optional<Book> getBookByTitle(@RequestParam String title) { return bookRepository.findByTitle(title); }

    @GetMapping("/bookId")
    public Optional<Book> getBookById(@RequestParam long id) { return bookRepository.findById(id); }

}
