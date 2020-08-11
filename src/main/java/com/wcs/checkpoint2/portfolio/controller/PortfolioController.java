package com.wcs.checkpoint2.portfolio.controller;

import com.wcs.checkpoint2.portfolio.model.Contact;
import com.wcs.checkpoint2.portfolio.model.Formation;
import com.wcs.checkpoint2.portfolio.service.ContactService;
import com.wcs.checkpoint2.portfolio.service.FormationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class PortfolioController {

    @Autowired
    private ContactService contactService;

    @Autowired
    private FormationService formationService;

    @GetMapping("/portfolio")
    public String getPortfolio(Model model) {

        // Contact : firstname, ... , address
        List<Contact> contacts = contactService.list();
        if (contacts.size() > 0){
            model.addAttribute("contact",contacts.get(0));
        }

        // Formations
        List<Formation> formations = formationService.list();
        model.addAttribute("formations",formations);

        return "portfolio";
    }
}
