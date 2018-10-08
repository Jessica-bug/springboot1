package com.jessica.service;

import com.jessica.domain.User;

import java.util.List;
import java.util.Optional;

/**
 * Created by guanyiting on 2018/7/26 0026.
 * desc:
 */
public interface UserService {
    List<User> findAll();

    User findById(long id);

    void delUser(Long id);

    void addUser(User user);
}
