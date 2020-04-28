package com.example.demo.controller;

import com.example.demo.controller.resources.HelloResponse;
import com.example.demo.controller.resources.LogResponse;
import com.example.demo.repository.LogTableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
@CrossOrigin(origins = {"http://localhost:3000"})
public class TestController {

    @GetMapping
    public HelloResponse getHello() {
        return HelloResponse.of();
    }
}
