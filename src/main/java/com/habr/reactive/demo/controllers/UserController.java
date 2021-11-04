package com.habr.reactive.demo.controllers;

import com.habr.reactive.demo.api.UserService;
import com.habr.reactive.demo.entities.User;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

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
