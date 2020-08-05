package com.wcs.checkpoint2.portfolio.controller;

import com.wcs.checkpoint2.portfolio.model.Address;
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

            if (contact.getAddress() == null) {
                Address myAddress = new Address("","","",0);
                contact.setAddress(myAddress);
            } else {
                if (contact.getAddress().getLine1().equals(null)) contact.getAddress().setLine1("");
                if (contact.getAddress().getLine2().equals(null)) contact.getAddress().setLine2("");
                if (contact.getAddress().getZipCode().equals(null)) contact.getAddress().setZipCode(0);
                if (contact.getAddress().getCity().equals(null)) contact.getAddress().setCity("");
            }

            contactUpdated = contactRepository.save(contact);
        } else {
            //contactUpdated= contactRepository.create(contact);
        }

        return "redirect:/contacts";
    }

}
