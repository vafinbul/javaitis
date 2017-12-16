package ru.itis.kidstable.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.itis.kidstable.dao.KidsRepository;

@Service
public class LetterServiceImpl {
    @Autowired
    KidsRepository kidsRepository;
}
