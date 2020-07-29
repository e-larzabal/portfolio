package com.wcs.checkpoint2.portfolio.controller;

import com.wcs.checkpoint2.portfolio.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class ContactController {

    @Autowired
    private ContactService contactService;

    @GetMapping("/index")
    public String getIndex() {
        return "index";
    }

    @GetMapping("/contacts")
    public String goAll(Model model) {
        model.addAttribute("contacts", contactService.list());
        return "contacts";
    }


}
