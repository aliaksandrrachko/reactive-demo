package com.habr.reactive.demo.services;

import com.habr.reactive.demo.api.UserService;
import com.habr.reactive.demo.entities.User;
import com.habr.reactive.demo.repositories.UserRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Flux<User> get() {
        return userRepository.findAll();
    }

    @Override
    public Mono<User> save(User user) {
        return userRepository.save(user);
    }

    @Override
    public Flux<User> getByLastName(String lastName) {
        return userRepository.findAll().filter(user -> user.getLastName().endsWith(lastName));
    }
}
