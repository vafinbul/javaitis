package ru.itis.kidstable.dao;

import org.springframework.data.repository.CrudRepository;
import ru.itis.kidstable.model.Kids;

import java.util.List;

public interface ContactRepository extends CrudRepository<Kids, Long> {

}

