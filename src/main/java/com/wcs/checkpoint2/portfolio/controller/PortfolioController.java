package com.wcs.checkpoint2.portfolio.controller;

import com.wcs.checkpoint2.portfolio.model.*;
import com.wcs.checkpoint2.portfolio.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collections;
import java.util.List;

@Controller
public class PortfolioController {

    @Autowired
    private ContactService contactService;

    @Autowired
    private FormationService formationService;

    @Autowired
    private ExperienceService experienceService;

    @Autowired
    private LanguageService languageService;

    @Autowired
    private ToolService toolService;

    @Autowired
    private ProjectService projectService;

    @GetMapping("/portfolio")
    public String getPortfolio(Model model) {

        // Contact : firstname, ... , address
        List<Contact> contacts = contactService.list();
        if (contacts.size() > 0){
            model.addAttribute("contact",contacts.get(0));
        }

        // Formations
        List<Formation> formations = formationService.list();
        Collections.sort(formations);
        model.addAttribute("formations",formations);

        // Experiences
        List<Experience> experiences = experienceService.list();
        Collections.sort(experiences);
        model.addAttribute("experiences",experiences);

        // Languages
        List<Language> languages = languageService.list();
        model.addAttribute("languages",languages);

        // Tools
        List<Tool> tools = toolService.list();
        model.addAttribute("tools",tools);

        // Projects
        List<Project> projects = projectService.list();
        model.addAttribute("projects",projects);

        return "portfolio";
    }
}
