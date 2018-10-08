package com.jessica.domain;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * Created by guanyiting on 2018/6/11 0011.
 * desc:
 */
@Component  //表明当前类是一个JavaBean
@ConfigurationProperties(prefix = "user")
public class UserProperties implements Serializable{
//    private static final long serialVersionUID=1L;
    private String names;
    private Integer age;

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
