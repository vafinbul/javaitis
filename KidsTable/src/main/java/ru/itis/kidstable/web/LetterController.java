package ru.itis.kidstable.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import ru.itis.kidstable.dao.LetterRepository;
import ru.itis.kidstable.model.Kids;
import ru.itis.kidstable.model.Letter;
import ru.itis.kidstable.service.LetterService;

import java.util.List;

@Controller
public class LetterController {

    @Autowired
    LetterService letterService;

    @RequestMapping(method = RequestMethod.GET, value = "/letter")
    String getForm(Model model) {
        return "letter";
    }

    @RequestMapping(method = RequestMethod.POST, value = "/letter")
    String getLetter(@RequestParam String name, @RequestParam String email,@RequestParam int age,@RequestParam String letterText) {
        Letter letter = new Letter();
        letter.setAge(age);
        letter.setEmail(email);
        letter.setLetter(letterText);
        letter.setName(name);
        letterService.addLetter(letter);
        return "redirect:/thanks";
    }
    @RequestMapping(method = RequestMethod.GET, value = "/thanks")
    String thanks(Model model) {
        return "letterthanks";//redirect on thanks page
    }

    @RequestMapping(method = RequestMethod.GET, value = "/letter/{name}")
    String getContact (@PathVariable String name , Model model) {
        List<Letter> letterList = letterService.getByName(name);
        model.addAttribute(letterList);//FIXME НАДО ДОБАВИТЬ РЕДИРЕКТ НА ПИСЬМО ПО ID
        return "mailtable";
    }

}