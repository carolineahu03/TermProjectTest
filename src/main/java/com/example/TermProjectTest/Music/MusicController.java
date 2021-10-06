package com.example.TermProjectTest.Music;

import com.example.TermProjectTest.Headwear.Headwear;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class MusicController {
    @Autowired
    private MusicService musicService;

    @RequestMapping(value="/allMusic")
    public String music(Model model) {
        List<Music> musics = musicService.getAll();
        model.addAttribute("musics", musics);
        return "allMusic";
    }

    @GetMapping(value="/findMusic")
    public @ResponseBody
    Music table2(@RequestParam(value = "id") String musicID) {
        Music music = musicService.getID(musicID);
        return music;
    }
}
