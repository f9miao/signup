package com.f9miao.signup.controller;

import com.f9miao.signup.pojo.Resp;
import com.f9miao.signup.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@RestController
public class AdminController {

    @Autowired
    private MongoTemplate mongoTemplate;

    @GetMapping("list_all")
    private List<User> listAll(){
        List<User> list = mongoTemplate.findAll(User.class, "user");
        return list;
    }

    @GetMapping("ping")
    private List<Resp> ping(){
        List<Resp> list = new ArrayList<>();
        list.add(new Resp(200, "PONG1"));
        list.add(new Resp(200, "PONG2"));
        list.add(new Resp(200, "PONG3"));
        return list;
    }

}
