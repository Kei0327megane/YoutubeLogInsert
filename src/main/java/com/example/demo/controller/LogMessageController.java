package com.example.demo.controller;

import com.example.demo.controller.resources.LogRequest;
import com.example.demo.controller.resources.LogResponse;
import com.example.demo.repository.LogTableRepository;
import com.example.demo.repository.resources.LogTableEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.ZonedDateTime;

@RestController
@RequestMapping("log")
public class LogMessageController {

    @Autowired
    private LogTableRepository logTableRepository;

    @PostMapping
    @CrossOrigin(origins = {"http://localhost:3000"})
    public void postLog(@RequestBody LogRequest logRequest) {
        ZonedDateTime now = ZonedDateTime.now();
        logTableRepository.save(LogTableEntity.of(logRequest.getKeyword(), now));
    }
}
