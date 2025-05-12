package com.example.demo.repo;

import com.example.demo.model.User;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class FakeRepo implements FakeRepoInterface {
    private final List<User> users = new ArrayList<>();

    @Override
    public String insertUser(long id, String name, String surname) {
        users.add(new User(id, name, surname));
        return name;
    }

    @Override
    public String findUserById(long id) {
        for (User user : users) {
            if (user.getId() == id) {
                return user.getName();
            }
        }
        return null;
    }

    @Override
    public String deleteUser(long id) {
        Iterator<User> iterator = users.iterator();
        while (iterator.hasNext()) {
            User u = iterator.next();
            if (u.getId() == id) {
                iterator.remove();
                return u.getName();
            }
        }
        return null;
    }
}