package com.jessica.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by guanyiting on 2018/7/24 0024.
 * desc:创建一个实体类自动关联数据库表
 * */
@Entity
public class User implements Serializable {
    private static final long serialVersionUID=1L;

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String userName;

    @Column(nullable = false)
    private String passwd;

    @Column
    private String email;

    @Column
    private String identity;

    @Transient//加Transient注解不将此属性映射成列
    public List<User> users=new ArrayList<>();

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }


    public User() {
    }

    public User(String userName, String passwd, String email, String identity) {
        this.userName = userName;
        this.passwd = passwd;
        this.email = email;
        this.identity = identity;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", passwd='" + passwd + '\'' +
                ", email='" + email + '\'' +
                ", identity='" + identity + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
