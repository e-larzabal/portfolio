package com.wcs.checkpoint2.portfolio.controller;

import com.wcs.checkpoint2.portfolio.model.Formation;
import com.wcs.checkpoint2.portfolio.repository.FormationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class FormationController {

    @Autowired
    private FormationRepository formationRepository;

    @GetMapping("/formations")
    public String getAll(Model model) {
        // find all formations
        model.addAttribute("formations", formationRepository.findAll());
        return "formations";
    }

    @GetMapping("/formation")
    public String getFormation(Model model, @RequestParam Long id) {
        // find one formation by id
        Formation formation = new Formation();
        if (id != null) {
            // update a formation
            Optional<Formation> optionalFormation = formationRepository.findById(id);
            if (optionalFormation.isPresent()) {
                // update a formation
                formation = optionalFormation.get();
            }
        }
        model.addAttribute("formation", formation);
        return "formation";
    }

    @PostMapping("/formation")
    public String postFormation(@ModelAttribute Formation formation) {
        // create or update a formation
        formationRepository.save(formation);
        return "redirect:/formations";
    }

    @GetMapping("/formation/delete")
    public String deleteFormation(@RequestParam Long id) {
        // delete a formation
        formationRepository.deleteById(id);
        return "redirect:/formations";
    }

}
