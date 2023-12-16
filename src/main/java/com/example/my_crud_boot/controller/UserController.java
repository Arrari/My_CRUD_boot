package com.example.my_crud_boot.controller;

import com.example.my_crud_boot.model.User;
import com.example.my_crud_boot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping("/users")
    public String findAll(Model model) {
        model.addAttribute("users", userService.getAllUsers());
        return "user-list";
    }

    @GetMapping(value = {"/newUser","/user-create"})
    public String createUserForm(User user) {
        return "user-create";
    }
    @PostMapping("/user-create")
    public String createUser(User user) {
        userService.addUser(user);
        return "redirect:/users";
    }

    @GetMapping("user-show/{id}")
    public String showUserForEditOrDelete(@PathVariable("id") int id, Model model){
        model.addAttribute("user",userService.getUserById(id));
        return "user-show";
    }

    @PostMapping("/user-update")
    public String updateUser(User user) {
        userService.updateUser(user);
        return "redirect:/users";
    }
    @DeleteMapping("/user-delete/{id}")
    public String deleteUser(@PathVariable("id") int id) {
        userService.deleteUserById(id);
        return "redirect:/users";
    }


}
