package com.springboot.dxctest.buis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.dxctest.buis.dao.CustomerInfoDao;
import com.springboot.dxctest.buis.redis.RedisUtils;

import javax.servlet.http.HttpServletRequest;

@EnableAutoConfiguration
@RestController
public class HelloController {
	
	  @Autowired
	  private CustomerInfoDao customerInfoDao;
	  
	  @Autowired
	    private RedisUtils redisUtils;

    @RequestMapping("hello")
    String home(HttpServletRequest request) {
        int count = 105;
        CustomerInfoEntity c =  customerInfoDao.selectById(1);
        return "欢迎您" +  c.getUserName() + "，这是您的手机号码是  " + c.getUserMobile();
    }
    
    @RequestMapping("hello2")
    String home2(HttpServletRequest request) {
        int count = 105;
        if (redisUtils.get("test") == null ) {
        	System.out.println("nofind value in reids");
        	
        	redisUtils.set("test", "asdasdasdasd");
            return "nofind value in reids您" ;

        } else {
        	System.out.println(redisUtils.get("test"));
            return "find value in reids " + redisUtils.get("test") ;
        	
        }
    }

}
