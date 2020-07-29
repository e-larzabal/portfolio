package com.wcs.checkpoint2.portfolio.controller;

import com.wcs.checkpoint2.portfolio.model.Contact;
import com.wcs.checkpoint2.portfolio.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@Controller
public class ContactController {

    @Autowired
    private ContactService contactService;

    @GetMapping("/index")
    public String getIndex() {
        return "index";
    }

    @GetMapping("/contacts")
    public String getAll(Model model) {
        model.addAttribute("contacts", contactService.list());
        return "contacts";
    }

    @GetMapping("/contact")
    public String getContact(Model model, @RequestParam Long id) {

        Contact contact = new Contact();
        if (id != null){
            // update a contact
            Optional<Contact> optionalContact = contactService.find(id);
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
            contactUpdated = contactService.update(contact);
        } else {
            contactUpdated= contactService.create(contact);
        }

        return "redirect:/contacts";
    }

}
