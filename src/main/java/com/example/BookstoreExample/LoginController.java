package com.example.BookstoreExample;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@CrossOrigin(origins = "http://localhost:4200")
public class LoginController {

    @GetMapping("/login")
    public String getBooks() {
        return "login";
    }
}
