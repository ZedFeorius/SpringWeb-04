package com.zedfeorius.springweb04.controller;

import com.zedfeorius.springweb04.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ZedFeorius
 * @version 1.0.0
 * @date 09 27 2022  14:05:32
 * @packageName com.zedfeorius.springweb04.controller
 * @className UserController
 * @describe TODO
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/getUserList")
    public String getUserList(Model model){
        model.addAttribute("userList",userService.getUserList());
        return "user/show";
    }
}
