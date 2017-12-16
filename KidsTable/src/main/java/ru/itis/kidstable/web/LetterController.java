package ru.itis.kidstable.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import ru.itis.kidstable.model.Kids;

import java.util.List;

@Controller
public class LetterController {
    @RequestMapping(method = RequestMethod.GET, value = "/lettertype")
    String getType(Model model) {
        return "lettertype";
    }

    @RequestMapping(method = RequestMethod.POST, value = "/lettertype")
    String postType(Model model, @RequestParam String type1) {
        model.addAttribute(type1);
        return "redirect:/letter";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/letter")
    String getForm(Model model) {
        return "letter";
    }
}
