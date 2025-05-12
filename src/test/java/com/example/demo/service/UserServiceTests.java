package com.example.demo.service;

import com.example.demo.repo.FakeRepo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test; 

public class UserServiceTests {

    private UserService userService;

    @BeforeEach
    void setUp() {
        userService = new UserServiceImpl(new FakeRepo());
    }

    @Test
    void testAddUser() {
        userService.addUser("Keanu", "Moodley");
    }

    @Test
    void testGetUser() {
        userService.addUser("Bob", "Jones");
        userService.getUser(1);
    }

    @Test
    void testRemoveUser() {
        userService.addUser("Charlie", "Brown");
        userService.removeUser(1);
    }
}
