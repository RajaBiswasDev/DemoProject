package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/message")
   String getMessage(){
        return "Hello there buddy, change done in iteration 1 !";
    }
}
