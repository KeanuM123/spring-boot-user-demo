package com.example.demo.service;

import com.example.demo.repo.FakeRepoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;

@Service
public class UserServiceImpl implements UserService {

    private final FakeRepoInterface repo;
    private final AtomicLong idGenerator = new AtomicLong();

    @Autowired
    public UserServiceImpl(FakeRepoInterface repo) {
        this.repo = repo;
    }

    @Override
    public void addUser(String name, String surname) {
        long id = idGenerator.incrementAndGet();
        repo.insertUser(id, name, surname);
        System.out.println(name + " added");
    }

    @Override
    public void removeUser(long id) {
        String name = repo.deleteUser(id);
        System.out.println(name + " removed");
    }

    @Override
    public void getUser(long id) {
        String name = repo.findUserById(id);
        System.out.println("hello " + name);
    }
}