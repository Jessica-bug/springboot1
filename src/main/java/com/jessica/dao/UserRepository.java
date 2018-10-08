package com.jessica.dao;

import com.jessica.domain.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.annotation.Resource;
import javax.persistence.GeneratedValue;
import java.util.Optional;


/**
 * Created by guanyiting on 2018/7/24 0024.
 * desc: 继承JpaRepository接口关联数据库操作
 */
public interface UserRepository extends JpaRepository<User, Long> {

    User findByUserNameOrEmail(String userName, String email);

    //如果使用Long id，则与CrudRepository中的findById冲突，只能使用long类型
    User findById(long id);

    @Override
    Page<User> findAll(Pageable pageable);

    @Override
    User save(User s);


    @Override
    void deleteById(Long aLong);
}
