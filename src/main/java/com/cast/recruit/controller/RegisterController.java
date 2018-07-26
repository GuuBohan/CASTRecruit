package com.cast.recruit.controller;

import com.cast.recruit.data.UserRepository;
import com.cast.recruit.model.User;
import com.cast.recruit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

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
        return "register";
    }

    @RequestMapping(method = RequestMethod.POST)
    public User processRegister(User user){
//        model.addAttribute("newUser",new User());
//        if (errors.hasErrors())
//            return "register";
//        userService.register(user);
        return userService.register(user);
    }
//
//    @RequestMapping(method = RequestMethod.GET)
//    public User register(User user){
//        user.setStudentID(request.getParameter("studentID"));
//        user.setStudentName(request.getParameter("studentName"));
//        user.setStudentSex(request.getParameter("studentSex"));
//        return userService.register(user);
//    }

}
