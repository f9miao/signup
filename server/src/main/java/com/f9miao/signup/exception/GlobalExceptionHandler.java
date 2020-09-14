package com.f9miao.signup.exception;

import com.f9miao.signup.pojo.Resp;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ResponseStatus(HttpStatus.OK)
    @ExceptionHandler(RequestFailException.class)
    @ResponseBody
    private Resp exception(Exception e){
        return new Resp(HttpStatus.BAD_REQUEST.value(), e.getMessage());
    }

}
