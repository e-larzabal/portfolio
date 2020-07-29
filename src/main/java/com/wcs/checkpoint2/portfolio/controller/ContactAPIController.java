package com.wcs.checkpoint2.portfolio.controller;

import com.wcs.checkpoint2.portfolio.model.Contact;
import com.wcs.checkpoint2.portfolio.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;
import java.util.UUID;


@Controller
public class ContactAPIController {

    @Autowired
    private ContactService contactService;


//    // CRUD : C
//    @PostMapping("/api/contacts")
//    @ResponseBody
//    public Contact create(@RequestBody Contact contact){
//        return contactService.create(contact);
//    }
//
//    // CRUD : R
//    @GetMapping("/api/contacts/{uuid}")
//    @ResponseBody
//    public Optional<Contact> get(@PathVariable UUID uuid){
//        return contactService.find(uuid);
//    }
//
//    // CRUD : R
//    @GetMapping("/api/contacts")
//    @ResponseBody
//    public List<Contact> list(){
//        return contactService.list();
//    }
//
//    // CRUD : U
//    @PutMapping("/api/contacts")
//    @ResponseBody
//    public Contact update(@RequestBody Contact contact) {
//        //if (player.getUuid() == null) throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "missing uuid");
//        //else return service.update(player);
//        return contactService.update(contact);
//    }
//
//    // CRUD : D
//    @GetMapping("/api/contacts/{uuid}")
//    @ResponseBody
//    public ResponseEntity<Void> delete(@PathVariable UUID uuid){
//        boolean isDeleted = contactService.delete(uuid);
//        if (isDeleted) {
//            return null;
//        } else {
//            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "could not delete player with uuid> " + uuid);
//        }
//    }
}
