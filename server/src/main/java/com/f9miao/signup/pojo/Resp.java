package com.f9miao.signup.pojo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Resp {

    private Integer code;
    private String msg;

    public Resp(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

}
