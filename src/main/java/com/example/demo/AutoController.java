package com.example.demo;

import com.example.SayHello;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class AutoController {

    @Resource
    private SayHello sh;
    @RequestMapping("/hello")
    @ResponseBody
    public  String hello(){
      return sh.sayHello();
    }

}
