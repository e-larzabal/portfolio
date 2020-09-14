package com.wcs.checkpoint2.portfolio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping({"/","/index"})
    public String getIndex() {
        return "index";
    }

    @GetMapping("/menu")
    public String getAdmin() { return "menu"; }

    @GetMapping("/login")
    public String getLogin() { return "login"; }
}
