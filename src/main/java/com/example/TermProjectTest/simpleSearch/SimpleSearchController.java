package com.example.TermProjectTest.simpleSearch;

import com.example.TermProjectTest.Construction.Construction;
import com.example.TermProjectTest.Floors.Floors;
import com.example.TermProjectTest.FormObject;
import com.example.TermProjectTest.Fossils.Fossils;
import com.example.TermProjectTest.Headwear.Headwear;
import com.example.TermProjectTest.Music.Music;
import com.example.TermProjectTest.Reactions.Reactions;
import com.example.TermProjectTest.Villagers.Villagers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Controller
public class SimpleSearchController {

    @Autowired
    private SimpleSearchService simpleSearchService;

    @RequestMapping(value="/searchResult", method = RequestMethod.POST)
    public String table(@ModelAttribute("search") FormObject search, BindingResult bindingResult, Model model) {
        List<Construction> constructionList = simpleSearchService.containsName(simpleSearchService.constructionRepository, search.getSearch());
        List<Floors> floorsList = simpleSearchService.containsName(simpleSearchService.floorsRepository, search.getSearch());
        List<Fossils> fossilsList = simpleSearchService.containsName(simpleSearchService.fossilsRepository, search.getSearch());
        List<Headwear> headwearList = simpleSearchService.containsName(simpleSearchService.headwearRepository, search.getSearch());
        List<Music> musicList = simpleSearchService.containsName(simpleSearchService.musicRepository, search.getSearch());
        List<Reactions> reactionsList = simpleSearchService.containsName(simpleSearchService.reactionsRepository, search.getSearch());
        List<Villagers> villagersList = simpleSearchService.containsName(simpleSearchService.villagersRepository, search.getSearch());
        model.addAttribute("constructionList", constructionList);
        model.addAttribute("floorsList", floorsList);
        model.addAttribute("fossilsList", fossilsList);
        model.addAttribute("headwearList", headwearList);
        model.addAttribute("musicList", musicList);
        model.addAttribute("reactionsList", reactionsList);
        model.addAttribute("villagersList", villagersList);
        model.addAttribute("search", search);
        return "searchResult";
    }
}
