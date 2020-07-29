package com.wcs.checkpoint2.portfolio.controller;

import com.wcs.checkpoint2.portfolio.model.Contact;
import com.wcs.checkpoint2.portfolio.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@Controller
public class ContactController {

    @Autowired
    private ContactRepository contactRepository;

    @GetMapping({"/","/index"})
    public String getIndex() {
        return "index";
    }

    @GetMapping("/contacts")
    // find all contacts
    public String getAll(Model model) {
        model.addAttribute("contacts", contactRepository.findAll());
        return "contacts";
    }

    @GetMapping("/contact")
    public String getContact(Model model, @RequestParam Long id) {
        // find one contact by id
        Contact contact = new Contact();
        if (id != null){
            // update a contact
            Optional<Contact> optionalContact = contactRepository.findById(id);
            if (optionalContact.isPresent()) {
                // update a contact
                contact = optionalContact.get();
            }
        }

        model.addAttribute("contact", contact);
        return "contact";
    }

    @PostMapping("/contact")
    public String postContact(@ModelAttribute Contact contact) {

        Long id = contact.getId();
        Contact contactUpdated = new Contact();
        if (id != null){
            contactUpdated = contactRepository.save(contact);
        } else {
            //contactUpdated= contactRepository.create(contact);
        }

        return "redirect:/contacts";
    }

}
