package ru.itis.kidstable.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.itis.kidstable.model.Kids;
import ru.itis.kidstable.service.KidsService;

import java.util.List;

@Controller
public class KidsController {
    @Autowired
    KidsService kidsService;

    @RequestMapping(method = RequestMethod.GET, value = "/kids")
    String getKids(Model model) {
        List<Kids> kidsList = kidsService.getAllKids();
        model.addAttribute(kidsList);
        return "kidstable";
    }
}