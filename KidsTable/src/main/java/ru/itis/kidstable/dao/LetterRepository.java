package ru.itis.kidstable.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.itis.kidstable.model.Letter;

@Repository
public interface LetterRepository extends CrudRepository <Letter ,Long> {

}
