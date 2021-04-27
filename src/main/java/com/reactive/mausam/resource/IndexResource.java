package com.reactive.mausam.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import static com.reactive.mausam.resource.ResourceConstants.API;

@RestController
@RequestMapping(API)
public class IndexResource {
    @GetMapping
    public Mono<String> status(){
        return Mono.just("Up and Running...");

    }
}
