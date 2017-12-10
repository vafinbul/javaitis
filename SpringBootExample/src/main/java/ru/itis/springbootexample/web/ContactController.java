package ru.itis.springbootexample.web;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.itis.springbootexample.model.Contact;
import ru.itis.springbootexample.service.ContactService;

import java.util.List;

@Controller
public class ContactController {
    @Autowired
    ContactService contactService;

    @RequestMapping(method = RequestMethod.GET, value = "/contacts")
    String getContacts(Model model) {
        List<Contact> contactList = contactService.getAllContacts();
        model.addAttribute(contactList);
        return "contacts";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/contacts/{id}")
    String getContact (@PathVariable Long id , Model model) {
        Contact contact = contactService.getContact(id);
        model.addAttribute(contact);
        return "contactById";
    }

    @RequestMapping(method = RequestMethod.GET, params = "name", value = "/contacts")
    List<Contact> getContactsByName (@RequestParam String name) {
        return contactService.getContactsByName(name);
    }
}
