package com.example.TermProjectTest.Construction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ConstructionController {
    @Autowired
    private ConstructionService constructionService;

    @RequestMapping(value="/allConstruction")
    public String table(Model model) {
        List<Construction> constructions = constructionService.getAll();
        model.addAttribute("constructions", constructions);
        return "allConstruction";
    }

    @GetMapping(value="/findConstruction")
    public @ResponseBody Construction table2(@RequestParam(value = "id") String constructionID) {
        Construction construction = constructionService.getID(constructionID);
        return construction;
    }
}
