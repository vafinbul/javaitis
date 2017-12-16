package ru.itis.kidstable.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.itis.kidstable.dao.KidsRepository;
import ru.itis.kidstable.model.Kids;

import java.util.List;

@Service
public class KidsServiceImpl implements KidsService{
    @Autowired
    KidsRepository kidsRepository;


    @Override
    public List<Kids> getAllKids() {
        List<Kids> kidsList = (List<Kids>) kidsRepository.findAll();
        return kidsList;
    }
}
