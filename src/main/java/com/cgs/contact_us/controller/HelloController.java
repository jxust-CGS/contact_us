package com.cgs.contact_us.controller;

import com.cgs.contact_us.bean.Contact;
import com.cgs.contact_us.service.impl.ContactServiesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@EnableAutoConfiguration
@RequestMapping("/contact")
public class HelloController {

    @Autowired
    private ContactServiesImpl contactServies;

    @ResponseBody
    @RequestMapping("/hello")
    public String helloworke(){
        return "hello";
    }

    @RequestMapping("/list")
    public String getAll(ModelMap model){
        List<Contact> contactList = contactServies.getAll();
        model.addAttribute("data",contactList);
        model.addAttribute("id", contactList.get(0).getId());
        return "contact/list";
    }
}
