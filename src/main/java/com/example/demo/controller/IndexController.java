package com.example.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.bean.User;

/**
 * @author zwh
 * @create 2023/02/12
 */
@RestController
public class IndexController {

  @GetMapping("/index")
  public String index(){
    return "欢迎访问首页！";
  }

  @GetMapping("/user")
  public User getUser(){
    User user = new User();
    user.setUserName("李四");
    user.setUserAge(10);
    return user;
  }
}
