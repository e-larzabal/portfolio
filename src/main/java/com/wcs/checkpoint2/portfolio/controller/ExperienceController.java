package com.wcs.checkpoint2.portfolio.controller;

import com.wcs.checkpoint2.portfolio.model.Address;
import com.wcs.checkpoint2.portfolio.model.Experience;
import com.wcs.checkpoint2.portfolio.service.ExperienceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;
import java.util.UUID;

@Controller
public class ExperienceController {

    @Autowired
    private ExperienceService experienceService;

    @GetMapping("/admin/experiences")
    public String getAll(Model model) {
        // find all experiences
        model.addAttribute("experiences", experienceService.list());
        return "experiences";
    }

    @GetMapping("/admin/experience")
    public String getContact(Model model, @RequestParam(required = false) UUID uuid) {
        // find one experience by uuid
        Experience experience = new Experience();
        if (uuid != null){
            Optional<Experience> optionalExperience = experienceService.find(uuid);
            if (optionalExperience.isPresent()) {
                experience = optionalExperience.get();
            }
        }
        model.addAttribute("experience", experience);
        return "experience";
    }

    @PostMapping("/admin/experience")
    public String postContact(@ModelAttribute Experience experience) {

        if (experience.getAddress() == null) {
            Address myAddress = new Address("","","",0);
            experience.setAddress(myAddress);
        } else {
            if (experience.getAddress().getLine1().equals(null)) experience.getAddress().setLine1("");
            if (experience.getAddress().getLine2().equals(null)) experience.getAddress().setLine2("");
            if (experience.getAddress().getZipCode().equals(null)) experience.getAddress().setZipCode(0);
            if (experience.getAddress().getCity().equals(null)) experience.getAddress().setCity("");
        }

        if (experience.getUuid() == null){
            // create a experience
            experienceService.create(experience);
        } else {
            // update a experience
            experienceService.update(experience);
        }

        return "redirect:/admin/experiences";
    }

    @GetMapping("/admin/experience/delete")
    public String deleteExperience(@RequestParam UUID uuid) {
        // delete a experience
        experienceService.delete(uuid);
        return "redirect:/admin/experiences";
    }
}
