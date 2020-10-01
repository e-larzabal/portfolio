package com.wcs.checkpoint2.portfolio.controller;

import com.wcs.checkpoint2.portfolio.model.Role;
import com.wcs.checkpoint2.portfolio.model.User;
import com.wcs.checkpoint2.portfolio.service.RoleService;
import com.wcs.checkpoint2.portfolio.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private RoleService roleService;

    @GetMapping("/admin/users")
    public String getAll(Model model) {
        // find all users
        model.addAttribute("users", userService.list());
        model.addAttribute("roles", roleService.list());
        return "users";
    }

    @GetMapping("/admin/user")
    public String getUser(Model model, @RequestParam(required = false) UUID uuid) {
        // find one user by uuid
        User user = new User();
        if (uuid != null) {
            Optional<User> optionalUser = userService.find(uuid);
            if (optionalUser.isPresent()) {
                user = optionalUser.get();
            }
        }
        model.addAttribute("user", user);

        // Get list of all roles
        List<Role> roles = roleService.list();
        model.addAttribute("allroles", roles);

        return "user";
    }

    @PostMapping("/admin/user")
    public String postUser(Model model, @ModelAttribute User user) {

        if (user.getUuid() == null) {
            // create a user
            userService.create(user);
        } else {
            // update a user
            userService.update(user);
        }

        return "redirect:/admin/users";
    }

    @GetMapping("/admin/user/delete")
    public String deleteUser(@RequestParam UUID uuid) {

        // delete a user
        userService.delete(uuid);

        return "redirect:/admin/users";
    }
}
