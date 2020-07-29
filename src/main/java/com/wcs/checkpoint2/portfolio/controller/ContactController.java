package com.wcs.checkpoint2.portfolio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ContactController {

    //@Autowired
    //private ContactService contactService;

    @GetMapping("/home/")
    public String goHome() {

        return "index";
    }























   /* // CRUD : C
    @PostMapping("/contacts")
    @ResponseBody
    public Contact create(@RequestBody Contact contact){
        return contactService.create(contact);
    }

    // CRUD : R
    @GetMapping("/contacts/{uuid}")
    @ResponseBody
    public Optional<Contact> get(@PathVariable UUID uuid){
        return contactService.find(uuid);
    }

    // CRUD : R
    @GetMapping("/contacts")
    @ResponseBody
    public List<Contact> list(){
        return contactService.list();
    }

    // CRUD : U
    @PutMapping("/contacts")
    @ResponseBody
    public Contact update(@RequestBody Contact contact) {
        //if (player.getUuid() == null) throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "missing uuid");
        //else return service.update(player);
        return contactService.update(contact);
    }

    // CRUD : D
    @GetMapping("/contacts/{uuid}")
    @ResponseBody
    public ResponseEntity<Void> delete(@PathVariable UUID uuid){
        boolean isDeleted = contactService.delete(uuid);
        if (isDeleted) {
            return null;
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "could not delete player with uuid> " + uuid);
        }
    }*/
}
