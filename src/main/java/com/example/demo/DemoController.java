package com.example.demo;

import java.util.Collection;
import java.util.Collections;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/test")
public class DemoController {

    @GetMapping
    public Collection<String> get() {
        return Collections.singletonList("This is a test");
    }
}
