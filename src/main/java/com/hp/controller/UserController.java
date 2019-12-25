package com.hp.controller;

import com.hp.pojo.User;
import com.hp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.persistence.GeneratedValue;
import java.util.List;

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("word")
    public  @ResponseBody String sayHello(){
       System.out.println("我就是我");
        return "success";
    }

    //根据id查询
    @GetMapping("/{id}")   //id == i  id等于页面获取的值 @RequestMapping(value = "user/{id}",method = post)
    @ResponseBody
    public User queryUserById(@PathVariable("id") Long i){
       User user =  userService.queryUserById(i);
        return user;
    }

    //删除
    @GetMapping("/del/{ids}")
    @ResponseBody
    public String deleteById(@PathVariable("ids") Long id){
        userService.deleteById(id);
        return  "del success";
    }

    //全查
    @GetMapping("list")
    public String queryAllUser(Model model){
        List<User> userList = userService.queryAllUser();
        model.addAttribute("userList",userList);
        return  "item";
    }



}
