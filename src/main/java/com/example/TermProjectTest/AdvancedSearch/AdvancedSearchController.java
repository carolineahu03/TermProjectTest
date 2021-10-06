package com.example.TermProjectTest.AdvancedSearch;

import com.example.TermProjectTest.Construction.Construction;
import com.example.TermProjectTest.Construction.ConstructionRepository;
import com.example.TermProjectTest.Floors.FloorsRepository;
import com.example.TermProjectTest.FormObject;
import com.example.TermProjectTest.Fossils.FossilsRepository;
import com.example.TermProjectTest.GenericTable;
import com.example.TermProjectTest.Headwear.HeadwearRepository;
import com.example.TermProjectTest.Music.MusicRepository;
import com.example.TermProjectTest.Reactions.ReactionsRepository;
import com.example.TermProjectTest.Villagers.VillagersRepository;
import com.example.TermProjectTest.simpleSearch.SimpleSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

@Controller
public class AdvancedSearchController {

    @Autowired
    private AdvancedSearchService advancedSearchService;

    @GetMapping(value = "/advancedSearch")
    public String advanced1(@ModelAttribute("advSearch") FormObject advSearch, BindingResult bindingResult, Model model) {
        List<String> categories = asList("Construction", "Floors", "Fossils", "Headwear", "Music", "Reactions", "Villagers");
        List<String> attributes = asList("Name", "Image", "Purchase_Price", "Category", "Source", "Unique_Entry_ID");
        model.addAttribute("attributes", attributes);
        model.addAttribute("categories", categories);
        model.addAttribute("advSearch", advSearch);
        return "advancedSearch";
    }

    @PostMapping(value = "/advancedSearch2")
    public String advanced2(@ModelAttribute("advSearch") FormObject advSearch, BindingResult bindingResult, Model model) {
        String selectedCategory = advSearch.getCategory();
        try {
            Class<?> table = Class.forName("com.example.TermProjectTest." + selectedCategory + "." + selectedCategory);
            List<Method> methods =  Arrays.asList(table.getDeclaredMethods());
            List<String> stringMethods = new ArrayList<>(methods.size());
            methods.forEach(p -> stringMethods.add(p.toGenericString()));
            List<String> methodsString = new ArrayList<>(stringMethods.size());
            stringMethods.forEach(p -> methodsString.add(p.substring(p.indexOf("get") + 3, p.indexOf('('))));
            List<String> sortedMethods = methodsString.stream().sorted().collect(Collectors.toList());
            model.addAttribute("attributes", sortedMethods);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        model.addAttribute("advSearch", advSearch);
        return "advancedSearch2";
    }

    @PostMapping(value = "/advancedSearchResults")
    public String advancedResults(@ModelAttribute("advSearch") FormObject advSearch, BindingResult bindingResult, Model model) {
        List<? extends GenericTable> results = advancedSearchService.findRepo(advSearch.getCategory()).findAll(Sort.by("name"));
        if (!advSearch.getAdvIncluding().equals("")) {
            results = advancedSearchService.findIncluding(results, advSearch.getAdvIncluding(), advSearch.getAttribute());
        }
        if (!advSearch.getAdvExact().equals("") && !results.isEmpty()) {
            results = advancedSearchService.findExact(results, advSearch.getAdvExact(), advSearch.getAttribute());
        }
        if (!advSearch.getAdvExcluding().equals("") && !results.isEmpty()) {
            results = advancedSearchService.findExcluding(results, advSearch.getAdvExcluding(), advSearch.getAttribute());
        }
        model.addAttribute("results", results);
        model.addAttribute("advSearch", advSearch);
        model.addAttribute("category", advSearch.getCategory());
        return "advancedSearchResults";
    }


}
