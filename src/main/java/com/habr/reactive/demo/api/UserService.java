package com.habr.reactive.demo.api;

import com.habr.reactive.demo.entities.User;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface UserService {

    Flux<User> get();
    Mono<User> save(User user);
    Flux<User> getByLastName(String lastName);
}
