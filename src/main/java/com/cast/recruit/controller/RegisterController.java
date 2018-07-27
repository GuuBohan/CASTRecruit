package com.cast.recruit.controller;

import com.cast.recruit.model.User;
import com.cast.recruit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created By GuuBohan.
 * On 2018/7/22
 */
@RestController
@RequestMapping("/register")
public class RegisterController {
    private UserService userService;

    @Autowired
    private RegisterController(UserService userService){this.userService = userService;}

    @RequestMapping(method = RequestMethod.GET)
    public String register(){
        return "index";
    }

    @RequestMapping(method = RequestMethod.POST)
    public User processRegister(User user){
//        if (errors.hasErrors())
//            return "index";
        return userService.register(user);
    }

}
