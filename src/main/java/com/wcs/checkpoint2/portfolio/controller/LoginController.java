package com.wcs.checkpoint2.portfolio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/index")
    public String getIndex() {
        return "index";
    }

    @GetMapping("/menu")
    public String getAdmin() { return "menu"; }

    @GetMapping("/login")
    public String login(Model model, String error, String logout) {

        if (error != null) {
            model.addAttribute("errorMsg", "Your username and password are invalid.");
            return "login";
        }

        if (logout != null) {
            model.addAttribute("msg", "You have been logged out successfully.");
            return "menu";
        }

        return "login";
    }

    @GetMapping("/logout")
    public String logout() { return "logout"; }
}
