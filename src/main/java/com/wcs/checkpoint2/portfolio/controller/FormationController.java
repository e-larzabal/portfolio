package com.wcs.checkpoint2.portfolio.controller;

import com.wcs.checkpoint2.portfolio.model.Formation;
import com.wcs.checkpoint2.portfolio.service.FormationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;

@Controller
public class FormationController {

    @Autowired
    private FormationService formationService;

    @GetMapping("/formations")
    public String getAll(Model model) {
        // find all formations
        model.addAttribute("formations", formationService.list());
        return "formations";
    }

   @GetMapping("/formation")
    public String getFormation(Model model, @RequestParam(required = false) UUID uuid) {
        // find one formation by uuid
        Formation formation = new Formation();
        if (uuid != null) {
            Optional<Formation> optionalFormation = formationService.find(uuid);
            if (optionalFormation.isPresent()) {
                formation = optionalFormation.get();
            }
        }
        model.addAttribute("formation", formation);
        return "formation";
    }

    @PostMapping("/formation")
    public String postFormation(@ModelAttribute Formation formation) {

        if (formation.getUuid() == null) {
            // create a formation
            formationService.create(formation);
        } else {
            // update a formation
            formationService.update(formation);
        }

        return "redirect:/formations";
    }

   @GetMapping("/formation/delete")
    public String deleteFormation(@RequestParam UUID uuid) {
        // delete a formation
       formationService.delete(uuid);
        return "redirect:/formations";
    }
}
