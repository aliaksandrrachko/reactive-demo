package com.habr.reactive.demo.controllers;

import com.habr.reactive.demo.api.UserService;
import com.habr.reactive.demo.entities.User;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/users")
@AllArgsConstructor
public class UserController {

    private UserService userService;

    @PostMapping
    public Mono<User> post(@RequestBody User user) {
        return userService.save(user);
    }

    @GetMapping
    public Flux<User> get() {
        return userService.get();
    }

    @GetMapping("/{lastName}")
    public Flux<User> getByLastName(@PathVariable(name = "lastName") String lastName) {
        return userService.getByLastName(lastName);
    }
}
