package com.wcs.checkpoint2.portfolio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

    @GetMapping("/index")
    public String getIndex() {
        return "index";
    }

    @GetMapping("/menu")
    public String getAdmin() { return "menu"; }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    //@GetMapping("/login")
    public String login(Model model, String error, String logout) {
        if (error != null)
            model.addAttribute("errorMsg", "Your username and password are invalid.");

        if (logout != null)
            model.addAttribute("msg", "You have been logged out successfully.");

        return "login";
    }

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    //@GetMapping("/logout")
    public String logout(Model model) { return "logout"; }
}
