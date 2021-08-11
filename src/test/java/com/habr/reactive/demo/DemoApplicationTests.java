package com.habr.reactive.demo;

import com.habr.reactive.demo.controllers.UserController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	UserController userController;

	@Test
	void contextLoads() {
		assertNotNull(userController);
	}

}
