package com.wcs.checkpoint2.portfolio.controller;

import com.wcs.checkpoint2.portfolio.model.Language;
import com.wcs.checkpoint2.portfolio.service.LanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;

@Controller
public class LanguageController {

    @Autowired
    private LanguageService languageService;

    @GetMapping("/languages")
    public String getAll(Model model) {
        // find all languages
        model.addAttribute("languages", languageService.list());
        return "languages";
    }

    @GetMapping("/language")
    public String getLanguage(Model model, @RequestParam(required = false) UUID uuid) {
        // find one language by uuid
        Language language = new Language();
        if (uuid != null) {
            Optional<Language> optionalLanguage = languageService.find(uuid);
            if (optionalLanguage.isPresent()) {
                language = optionalLanguage.get();
            }
        }
        model.addAttribute("language", language);

        return "language";
    }

    @PostMapping("/language")
    public String postLanguage(@ModelAttribute Language language) {

        if (language.getUuid() == null) {
            // create a language
            languageService.create(language);
        } else {
            // update a language
            languageService.update(language);
        }

        return "redirect:/languages";
    }

    @GetMapping("/language/delete")
    public String deleteLanguage(@RequestParam UUID uuid) {
        // delete a language
        languageService.delete(uuid);
        return "redirect:/languages";
    }

}