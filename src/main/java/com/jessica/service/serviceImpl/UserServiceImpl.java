package com.jessica.service.serviceImpl;

import com.jessica.dao.UserRepository;
import com.jessica.domain.User;
import com.jessica.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Created by guanyiting on 2018/7/26 0026.
 * desc:
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User findById(long id) {
        return userRepository.findById(id);
    }

    @Override
    public void delUser(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public void addUser(User user) {
        userRepository.save(user);
    }
}
