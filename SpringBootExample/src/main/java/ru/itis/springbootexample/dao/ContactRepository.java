package ru.itis.springbootexample.dao;

import org.springframework.data.repository.CrudRepository;
import ru.itis.springbootexample.model.Contact;

import java.util.List;

public interface ContactRepository extends CrudRepository<Contact, Long> {
    Contact findById(Long id);
    List<Contact> findAllByName(String name);
}
