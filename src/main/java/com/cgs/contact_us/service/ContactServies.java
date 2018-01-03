package com.cgs.contact_us.service;

import com.cgs.contact_us.bean.Contact;

import java.util.List;

public interface ContactServies {
    List<Contact> getAll();
    Contact findById(String id);
    Contact find(Contact contact);
    Contact modify(Contact contact);
    Integer deleteById(String id);
}
