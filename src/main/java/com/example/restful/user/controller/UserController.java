package com.example.restful.user.controller;

import com.example.restful.user.pojo.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {
 private List<User> userList = new ArrayList<>();

 @GetMapping("/")
 public List<User>getUserList(){
     return userList;
 }

    @PostMapping("/")
    public String createUser(User user) {
        userList.add(user);
        return "success";
    }

}
