package com.wcs.checkpoint2.portfolio.controller;

import com.wcs.checkpoint2.portfolio.model.Address;
import com.wcs.checkpoint2.portfolio.model.Contact;
import com.wcs.checkpoint2.portfolio.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;


@Controller
public class ContactController {

    @Autowired
    private ContactService contactService;

    @GetMapping("/admin/contacts")
    public String getAll(Model model) {
        // find all contacts
        model.addAttribute("contacts", contactService.list());
        return "contacts";
    }

    @GetMapping("/admin/contact")
    public String getContact(Model model, @RequestParam(required = false) UUID uuid) {
        // find one contact by uuid
        Contact contact = new Contact();
        if (uuid != null){
            Optional<Contact> optionalContact = contactService.find(uuid);
            if (optionalContact.isPresent()) {
                contact = optionalContact.get();
            }
        }
        model.addAttribute("contact", contact);
        return "contact";
    }

    @PostMapping("/admin/contact")
    public String postContact(@ModelAttribute Contact contact) {

        if (contact.getAddress() == null) {
            Address myAddress = new Address("","","",0,"");
            contact.setAddress(myAddress);
        } else {
            if (contact.getAddress().getLine1().equals(null)) contact.getAddress().setLine1("");
            if (contact.getAddress().getLine2().equals(null)) contact.getAddress().setLine2("");
            if (contact.getAddress().getZipCode().equals(null)) contact.getAddress().setZipCode(0);
            if (contact.getAddress().getCity().equals(null)) contact.getAddress().setCity("");
            if (contact.getAddress().getCountry().equals(null)) contact.getAddress().setCountry("");
        }

        if (contact.getUuid() == null){
            // create a contact
            contactService.create(contact);
        } else {
            // update a contact
            contactService.update(contact);
        }

        return "redirect:/admin/contacts";
    }

    @GetMapping("/admin/contact/delete")
    public String deleteContact(@RequestParam UUID uuid) {
        // delete a contact
        contactService.delete(uuid);
        return "redirect:/admin/contacts";
    }
}
