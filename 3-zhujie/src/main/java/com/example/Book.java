package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * @Date:2021/02_12:04 下午
 * @Description：
 */

@Repository
public class Book {

//    @Autowired
//    private User user;

    @Resource(name = "user")
    private User user;

    @Value("fuck")
    private String name;

//    public Book() {
//        user.toString();
//    }

}
