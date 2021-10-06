package com.example.TermProjectTest.Headwear;

import com.example.TermProjectTest.Fossils.Fossils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class HeadwearController {
    @Autowired
    private HeadwearService headwearService;

    @RequestMapping(value="/allHeadwear")
    public String headwear(Model model) {
        List<Headwear> headwears = headwearService.getAll();
        model.addAttribute("headwears", headwears);
        return "allHeadwear";
    }

    @GetMapping(value="/findHeadwear")
    public @ResponseBody
    Headwear table2(@RequestParam(value = "id") String headwearID) {
        Headwear headwear = headwearService.getID(headwearID);
        return headwear;
    }
}
