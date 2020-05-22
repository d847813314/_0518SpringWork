package com.swjd.controller;

import com.swjd.bean.User;
import com.swjd.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class UserController {
    @Autowired
    UserService userService;
    //去到登录页面
    @RequestMapping("/toLogin")
    public String toLogin(Model model){
        User user=new User();
        model.addAttribute("user",user);
        return "login";
    }

    //实现登录功能
    @RequestMapping("/doLogin")
   public String doLogin(User user, Model model, HttpSession session){
    //调用Service的方法
        User u=userService.login(user);
        if (u!=null){
            //账号密码正确
            if (u.getFlag().equals("1")){
                //可以登录成功的
                session.setAttribute("activeName",u.getuName());
                return "redirect:/customerController/toMain";
            }else {
                //账号被冻结
                model.addAttribute("errorMsg","账号被冻结，请联系客服");
                model.addAttribute("user",user);
                return "login";
            }
        }else {
            //账号密码不正确
            model.addAttribute("errorMsg","账号或密码不正确");
            model.addAttribute("user",user);
            return "login";
        }
}
    //提供一个方法能够访问我的淘宝
@RequestMapping("/toMy")
    public String toMy(){
        return "myTaoBao";
}
    //提供一个方法，能访问购物车
    @RequestMapping("/toCar")
    public String toCar(){
        return "shoppingCar";
    }
}
