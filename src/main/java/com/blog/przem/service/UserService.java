package com.blog.przem.service;
import com.blog.przem.entity.User;

import java.util.List;

public interface UserService {

    User findByUserName(String userName);
    void saveUser(User user);
    void deleteUser(String userName);
    List<User> findUsers(String user);
}
