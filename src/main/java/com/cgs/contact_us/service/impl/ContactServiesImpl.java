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
}
