package ru.itis.springbootexample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.itis.springbootexample.dao.ContactRepository;
import ru.itis.springbootexample.model.Contact;

import java.util.List;

@Service
public class ContactServiceImpl implements ContactService{
    @Autowired
    ContactRepository contactRepository;

    @Override
    public List<Contact> getAllContacts() {
        List<Contact> contacts = (List<Contact>) contactRepository.findAll();
        return contacts;
    }

    @Override
    public Contact getContact(Long id) {
        return contactRepository.findById(id);
    }

    @Override
    public List<Contact> getContactsByName(String name) {
        List<Contact> contactList = contactRepository.findAllByName(name);
        if (contactList.isEmpty()) {
            throw new IllegalArgumentException("There're no such contacts with name = " + name);
        }
        return contactList;
    }
}
