package com.cgs.contact_us.controller;

import com.cgs.contact_us.bean.Contact;
import com.cgs.contact_us.service.impl.ContactServiesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@EnableAutoConfiguration
@RequestMapping("/contact")
public class HelloController {

    @Autowired
    private ContactServiesImpl contactServies;

    @ResponseBody
    @RequestMapping(value = "/hello.html", method = RequestMethod.GET)
    public String helloworke() {
        return "hello";
    }

    @RequestMapping(value = "/list.html", method = RequestMethod.GET)
    public String list(ModelMap model) {
        return "contact/list";
    }

    @ResponseBody
    @RequestMapping(value = "/list.json", method = RequestMethod.GET)
    public String getAll(ModelMap model) {
        List<Contact> contactList = contactServies.getAll();
        model.addAttribute("data", contactList);
        return "contact/list";
    }

    @RequestMapping(value = "/test.html",method = RequestMethod.GET)
    public void test(){

    }
}
