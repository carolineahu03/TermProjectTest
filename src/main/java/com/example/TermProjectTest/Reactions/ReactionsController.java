package com.example.TermProjectTest.Reactions;

import com.example.TermProjectTest.Music.Music;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ReactionsController {

    @Autowired
    private ReactionsService reactionsService;

    @RequestMapping(value="/allReactions")
    public String react(Model model) {
        List<Reactions> reactions = reactionsService.getAll();
        model.addAttribute("reactions", reactions);
        return "allReactions";
    }

    @GetMapping(value="/findReactions")
    public @ResponseBody
    Reactions table2(@RequestParam(value = "id") String reactionsID) {
        Reactions reactions = reactionsService.getID(reactionsID);
        return reactions;
    }

}
