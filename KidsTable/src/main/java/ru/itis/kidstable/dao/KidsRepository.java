package ru.itis.kidstable.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.itis.kidstable.model.Kids;

import java.util.List;

@Repository
public interface KidsRepository extends CrudRepository<Kids, Long> {

}
