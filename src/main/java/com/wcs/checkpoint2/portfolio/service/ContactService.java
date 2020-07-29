package com.wcs.checkpoint2.portfolio.service;

import com.wcs.checkpoint2.portfolio.dao.BaseDao;
import com.wcs.checkpoint2.portfolio.dao.ContactDao;
import com.wcs.checkpoint2.portfolio.model.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ContactService extends AbstractBaseService<Contact> {

    @Autowired
    private ContactDao contactDao;

    // CRUD : C
    public Contact create(Contact contact) { return super.create(contact); }

    // CRUD : R
    @Override
    public Optional<Contact> find(Long id){ return super.find(id);}

    // CRUD : R
    @Override
    public BaseDao<Contact> getDao() {
        return contactDao;
    }

    // CRUD : U
    public Contact update(Contact contact) {
        System.out.println(contact.toString());
        return super.update(contact);
    }

    // CRUD : D
    public boolean delete(Long id) { return super.delete(id); }

}
