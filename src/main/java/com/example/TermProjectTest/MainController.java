package com.example.TermProjectTest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path="/")
public class MainController {
    @GetMapping(value="/")
    public String home(Model model) {
        FormObject searchObject = new FormObject();
        model.addAttribute("search", searchObject);
        return "index";
    }

    @GetMapping(value="/index")
    public String index(Model model) {
        FormObject searchObject = new FormObject();
        model.addAttribute("search", searchObject);
        return "index";
    }
}
