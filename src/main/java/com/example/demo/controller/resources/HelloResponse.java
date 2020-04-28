package com.example.demo.controller.resources;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class HelloResponse {
    private final String message;

    public static HelloResponse of() {
        return new HelloResponse("Hello World");
    }
}
