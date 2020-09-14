package com.f9miao.signup.pojo;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

@Getter
@Setter
@Document(collection = "user")
public class User {

    @Id
    private String id;

    @Field("nickname")
    @NotEmpty(message = "请填写姓名")
    private String nickname;

    @Field("classname")
    @NotEmpty(message = "请填写班级")
    private String classname;

    @Field("email")
    @Indexed(unique = true)
    @NotEmpty(message = "请填写邮箱")
    @Email(message = "这不是一个有效的邮箱")
    private String email;

    @Field("department")
    @NotEmpty(message = "选择你的意向")
    private String department;

    @Field("introduction")
    @NotEmpty(message = "自我介绍一下咯^_^")
    private String introduction;

    @Field("understand")
    @NotEmpty(message = "好好想一想咯, 实在不会可以百度鸭╰(￣▽￣)╭")
    private String understand;

}
