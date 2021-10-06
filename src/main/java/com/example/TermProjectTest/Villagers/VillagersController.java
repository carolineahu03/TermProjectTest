package com.example.TermProjectTest.Villagers;

import com.example.TermProjectTest.Reactions.Reactions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class VillagersController {
    @Autowired
    private VillagersService villagersService;

    @RequestMapping(value="/allVillagers")
    public String villagers(Model model) {
        List<Villagers> villagers = villagersService.getAll();
        model.addAttribute("villagers", villagers);
        return "allVillagers";
    }

    @GetMapping(value="/findVillagers")
    public @ResponseBody
    Villagers table2(@RequestParam(value = "id") String villagersID) {
        Villagers villagers = villagersService.getID(villagersID);
        return villagers;
    }
}
