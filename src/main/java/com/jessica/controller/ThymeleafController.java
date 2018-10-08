package com.jessica.controller;

import com.jessica.domain.User;
import com.jessica.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by guanyiting on 2018/7/26 0026.
 * desc:
 */
@Controller
@RequestMapping("/thymeleaf")
public class ThymeleafController {
    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public String index(Model model, @RequestParam(value = "name",required = false,defaultValue = "")String name){
        model.addAttribute("name",name);
        return "redirect:/thymeleaf/findList";
    }

    @RequestMapping("/findList")
    public String findList(Model model){
        List<User> users=userService.findAll();
        model.addAttribute("users",users);
        return "user/userList";
    }

    @RequestMapping("/toAdd")
    public String toAdd(){
        return "user/userAdd";
    }

    @RequestMapping("addUser")
    public String addUser(User user){
        userService.addUser(user);
        return "redirect:/thymeleaf/findList";
    }

    @RequestMapping("/toEdit")
    public String toEdit(Model model,@RequestParam(value = "id",required = false,defaultValue = "")Long id){
        User user=userService.findById(id);
        model.addAttribute("user",user);
        return "user/userEdit";
    }

    @RequestMapping("/editUser")
    public String editUser(User user){
        userService.addUser(user);
        return "redirect:/thymeleaf/findList";
    }

    @RequestMapping("/delUser")
    public String delUser(Long id){
        userService.delUser(id);
        return "redirect:/thymeleaf/findList";
    }
}
