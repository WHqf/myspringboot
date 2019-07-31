package com.qianfeng.demo1.controller;

import com.qianfeng.demo1.entity.TUser;
import com.qianfeng.demo1.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * @Author henggege
 * @Date 2019/7/30 0030
 */
@Controller
@RequestMapping("user")
public class usercontroller {
    @Autowired
    private IUserService userService;
    @RequestMapping("getId")
    public String getId(Integer id, Model model){
       TUser user = userService.selectByPrimaryKey(id);

       model.addAttribute("user",user);
        return "hello";
    }

}
