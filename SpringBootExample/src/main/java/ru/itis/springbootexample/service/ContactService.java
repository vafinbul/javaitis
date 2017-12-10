package ru.itis.springbootexample.service;

import ru.itis.springbootexample.model.Contact;

import java.util.List;

public interface ContactService {
    List<Contact> getAllContacts();
    Contact getContact(Long id);
    List<Contact> getContactsByName(String name);
}
