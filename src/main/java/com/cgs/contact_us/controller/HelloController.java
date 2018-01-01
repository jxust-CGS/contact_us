package com.cgs.contact_us.controller;

import com.cgs.contact_us.service.impl.ContactServiesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@RequestMapping("/contact")
public class HelloController {

    @Autowired
    private ContactServiesImpl contactServies;

    @RequestMapping("/hello")
    public String helloworke(){
        return "hello";
    }

    @RequestMapping(method = RequestMethod.GET)
    public String getAll(ModelMap modelmap){
        modelmap.addAttribute("data",contactServies.getAll());
        return "list";
    }
}
