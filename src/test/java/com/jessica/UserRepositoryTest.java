package com.jessica;

import com.jessica.dao.UserRepository;
import com.jessica.domain.User;
import javafx.application.Application;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by guanyiting on 2018/7/25 0025.
 * desc:
 */
@RunWith(SpringJUnit4ClassRunner.class)//SpringRunner.class
@SpringBootTest
public class UserRepositoryTest {
    @Autowired
    private UserRepository userRepository;

    @Test
    public void test1(){
        User user=new User();
        user.setUserName("lili");
        user.setEmail("lili@163.com");
        user.setPasswd("abdf12j");
        userRepository.save(user);
        userRepository.save(new User("jim","idfh23j","jim@github.com","employee"));

        Assert.assertEquals(2,userRepository.findAll().size());
        Assert.assertEquals("jim",userRepository.findByUserNameOrEmail("jim","jim@github.com").getUserName());

        userRepository.delete(user);

    }
}
