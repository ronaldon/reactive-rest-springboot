package com.example.projectname.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Slf4j
@RestController
public class PersonController {

    @PostMapping("/person")
    Mono<Void> create(@RequestBody String requestBody) {
        
        log.info("Creating person... {}", requestBody);
        
        return Mono.empty();
        
    }

    @GetMapping("/person")
    Flux<String> list() {
        return Flux.just("Person A", "Person B", "Person C");
    }

    @GetMapping("/person/{id}")
    Mono<String> findById(@PathVariable String id) {
        return Mono.fromCallable(() -> "Person A");
    }
    
}
