package com.springboot.dxctest;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@EnableAutoConfiguration
@RestController
public class HelloController {

    @RequestMapping("hello")
    String home(HttpServletRequest request) {
        String userName = "Gavin";
        int count = 105;
        return "欢迎您" + userName + "，这是您的第 " + count + " 次登录";
    }

}
