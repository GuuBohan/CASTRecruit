package com.cast.recruit.controller;

import com.cast.recruit.data.UserRepository;
import com.cast.recruit.model.User;
import com.cast.recruit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created By GuuBohan.
 * On 2018/7/26
 */
//@RestController
//@RequestMapping("/list")
//public class ListController {
////    private UserService userService;
////
////    @Autowired
////    private ListController(UserService userService){ this.userService = userService;}
//    @Autowired
//    private UserRepository userRepository;
//
//    @RequestMapping(method = RequestMethod.GET)
//    public List<User> userList(){
//        return userRepository.findAll();
//    }
//}
