package com.example.TermProjectTest.Fossils;

import com.example.TermProjectTest.Floors.Floors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class FossilsController {
    @Autowired
    private FossilsService fossilsService;

    @RequestMapping(value="/allFossils")
    public String home(Model model) {
        List<Fossils> fossils = fossilsService.getAll();
        model.addAttribute("fossils", fossils);
        return "allFossils";
    }

    @GetMapping(value="/findFossils")
    public @ResponseBody
    Fossils table2(@RequestParam(value = "id") String fossilsID) {
        Fossils fossils = fossilsService.getID(fossilsID);
        return fossils;
    }

}
