package com.example.TermProjectTest.Floors;

import com.example.TermProjectTest.Construction.Construction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class FloorsController {
    @Autowired
    private FloorsService floorsService;

    @RequestMapping(value="/allFloors")
    public String floors(Model model) {
        List<Floors> floors = floorsService.getAll();
        model.addAttribute("floors", floors);
        return "allFloors";
    }

    @GetMapping(value="/findFloors")
    public @ResponseBody Floors table2(@RequestParam(value = "id") String floorsID) {
        Floors floors = floorsService.getID(floorsID);
        return floors;
    }
}