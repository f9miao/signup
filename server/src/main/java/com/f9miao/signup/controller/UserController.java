package com.f9miao.signup.controller;

import com.f9miao.signup.exception.RequestFailException;
import com.f9miao.signup.pojo.Resp;
import com.f9miao.signup.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import javax.validation.Valid;

import java.util.Date;

@CrossOrigin
@RestController
public class UserController {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Autowired
    private JavaMailSender mailSender;

    @Value("${spring.mail.username}")
    private String sendFrom;

    @RequestMapping("signup")
    public Resp signup(@RequestBody @Valid User user, BindingResult result){

        if(result.hasErrors()){
            throw new RequestFailException(result.getFieldError().getDefaultMessage());
        }

        // 记录插入数据库
        mongoTemplate.insert(user);

        // 发送邮件
        MimeMessage msg = mailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(msg);
        try {
            helper.setTo(user.getEmail());
            helper.setFrom(sendFrom);
            helper.setSentDate(new Date());
            helper.setSubject("Jswing团队报名成功提醒");
            helper.setText("您已经成功报名,面试的通知会稍后发到此邮箱^_^", true);
            mailSender.send(msg);
        } catch (MessagingException e) {
            e.printStackTrace();
        }

        // 响应
        return new Resp(200,"报名成功");
    }

}
