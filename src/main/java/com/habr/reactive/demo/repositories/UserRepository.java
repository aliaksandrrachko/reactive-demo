package com.habr.reactive.demo.repositories;

import com.habr.reactive.demo.entities.User;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface UserRepository extends ReactiveMongoRepository<User, String> {
}
