package com.cgs.contact_us.service.impl;

import com.cgs.contact_us.Dao.ContactDao;
import com.cgs.contact_us.bean.Contact;
import com.cgs.contact_us.service.ContactServies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactServiesImpl implements ContactServies{

    @Autowired
    private ContactDao contactDao;

    @Override
    public List<Contact> getAll() {
        return contactDao.getAllContact();
    }

    @Override
    public Contact findById(String id) {
        return contactDao.findById(id);
    }

    @Override
    public Contact find(Contact contact) {
        return contactDao.find(contact);
    }

    @Override
    public Contact modify(Contact contact) {
        if(null==contact||null==contact.getId()||"".equals(contact.getId())){
            contactDao.insert(contact);
        }else{
            contactDao.update(contact);
        }
        return contact;
    }

    @Override
    public Integer deleteById(String id) {
        return contactDao.deleteById(id);
    }

}
