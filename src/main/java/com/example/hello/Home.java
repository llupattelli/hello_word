package com.example.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

import java.util.List;

@RestController
public class Home   {

    @GetMapping("/")
    @ResponseBody
    public String postFoos() {
        return "Hello";
    }




}
