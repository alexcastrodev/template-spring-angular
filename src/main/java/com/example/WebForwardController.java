package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebForwardController {
    @GetMapping("{path:^(?!api|public|swagger)[^.]*}/**")
    public String handleForward() {
        return "forward:/";
    }
}