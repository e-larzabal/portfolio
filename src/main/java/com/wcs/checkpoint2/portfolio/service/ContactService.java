package com.wcs.checkpoint2.portfolio.service;

import com.wcs.checkpoint2.portfolio.dao.BaseDao;
import com.wcs.checkpoint2.portfolio.dao.ContactDao;
import com.wcs.checkpoint2.portfolio.model.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactService extends AbstractBaseService<Contact> {

    @Autowired
    private ContactDao contactDao;

    @Override
    public BaseDao<Contact> getDao() { return contactDao; }

  /*  // CRUD : C
    public Contact create(Contact contact) { return super.create(contact); }

    // CRUD : R
    @Override
    public Optional<Contact> find(UUID uuid){ return super.find(uuid);}

    // CRUD : U
    public Contact update(Contact contact) {
        return super.update(contact);
    }

    // CRUD : D
    public boolean delete(UUID uuid) { return super.delete(uuid); }*/

}
