package com.f9miao.signup.controller;

import com.f9miao.signup.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AdminController {

    @Autowired
    private MongoTemplate mongoTemplate;

    @RequestMapping("list_all")
    private List<User> listAll(){
        List<User> list = mongoTemplate.findAll(User.class, "user");
        return list;
    }

}
