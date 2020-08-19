package com.wcs.checkpoint2.portfolio.controller;

import com.wcs.checkpoint2.portfolio.model.Skill;
import com.wcs.checkpoint2.portfolio.service.SkillService;
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
public class SkillController {
    @Autowired
    private SkillService skillService;

    @GetMapping("/skills")
    public String getAll(Model model) {
        // find all skills
        model.addAttribute("skills", skillService.list());
        return "skills";
    }

    @GetMapping("/skill")
    public String getSkill(Model model, @RequestParam(required = false) UUID uuid) {
        // find one skill by uuid
        Skill skill = new Skill();
        if (uuid != null) {
            Optional<Skill> optionalSkill = skillService.find(uuid);
            if (optionalSkill.isPresent()) {
                skill = optionalSkill.get();
            }
        }
        model.addAttribute("skill", skill);
        return "skill";
    }

    @PostMapping("/skill")
    public String postSkill(@ModelAttribute Skill skill) {

        if (skill.getUuid() == null) {
            // create a skill
            skillService.create(skill);
        } else {
            // update a skill
            skillService.update(skill);
        }

        return "redirect:/skills";
    }

    @GetMapping("/skill/delete")
    public String deleteSkill(@RequestParam UUID uuid) {
        // delete a skill
        skillService.delete(uuid);
        return "redirect:/skills";
    }
}
