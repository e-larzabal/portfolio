package com.wcs.checkpoint2.portfolio.controller;

import com.wcs.checkpoint2.portfolio.model.Formation;
import com.wcs.checkpoint2.portfolio.model.Language;
import com.wcs.checkpoint2.portfolio.repository.FormationRepository;
import com.wcs.checkpoint2.portfolio.repository.LanguageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class LanguageController {

    @Autowired
    private LanguageRepository languageRepository;

    @GetMapping("/languages")
    public String getAll(Model model) {
        // find all languages
        model.addAttribute("languages", languageRepository.findAll());
        return "languages";
    }

    @GetMapping("/language")
    public String getLanguage(Model model, @RequestParam(required = false) Long id) {
        // find one language by id
        Language language = new Language();
        if (id != null) {
            Optional<Language> optionalLanguage = languageRepository.findById(id);
            if (optionalLanguage.isPresent()) {
                language = optionalLanguage.get();
            }
        }
        model.addAttribute("language", language);

        return "language";
    }

    @PostMapping("/language")
    public String postLanguage(@ModelAttribute Language language) {
        // create or update a language
        languageRepository.save(language);

        return "redirect:/languages";
    }

    @GetMapping("/language/delete")
    public String deleteLanguage(@RequestParam Long id) {
        // delete a language
        languageRepository.deleteById(id);
        return "redirect:/languages";
    }

}
