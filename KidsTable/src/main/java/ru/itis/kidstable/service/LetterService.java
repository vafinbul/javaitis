package ru.itis.kidstable.service;


import ru.itis.kidstable.model.Letter;

import java.util.List;

public interface LetterService {
    Letter addLetter(Letter letter);
    List<Letter> getByName(String name);
}
