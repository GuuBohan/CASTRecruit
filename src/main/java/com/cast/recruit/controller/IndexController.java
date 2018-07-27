package com.cast.recruit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created By GuuBohan.
 * On 2018/7/23
 */
@Controller
@RequestMapping("/index")
public class IndexController {
//    private UserService userService;
//
//    @Autowired
//    private IndexController(UserService userService){ this.userService = userService;}

    @RequestMapping(method = RequestMethod.GET)
    public String index(){ return "index";}

//    @RequestMapping(method = RequestMethod.POST)
//    public String register(User user){
//        userService.register(user);
//        return "成功";
//    }


}
