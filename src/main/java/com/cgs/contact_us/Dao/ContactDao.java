package com.cgs.contact_us.Dao;

import com.cgs.contact_us.bean.Contact;

import java.util.List;


public interface ContactDao {
    List<Contact> getAllContact();
    Contact findById(String id);
    Contact find(Contact contact);
    Contact insert(Contact contact);
    Contact update(Contact contact);
    Integer deleteById(String id);
}
