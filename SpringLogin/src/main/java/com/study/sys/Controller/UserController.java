package com.study.sys.Controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.study.sys.Entity.UserEntity;
import com.study.sys.Service.UserService;

@Controller
@RequestMapping("user")
public class UserController extends ModelAndView {

    @Autowired
    private UserService userService;

    @RequestMapping
    public String userAdd() {
        return "user/userAdd";
    }

    @RequestMapping
    public String addUser(UserEntity user) {
        userService.addUser(user);
        return "user/userAdd";
    }

    @RequestMapping
    public String userList(HttpServletRequest req) {
        req.setAttribute("list", userService.userList());
        return "user/userList";
    }
}