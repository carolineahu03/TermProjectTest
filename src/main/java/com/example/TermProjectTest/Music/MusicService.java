package com.example.TermProjectTest.Music;

import com.example.TermProjectTest.Headwear.Headwear;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MusicService {

    @Autowired
    private MusicRepository musicRepository;

    public List<Music> getAll() {return musicRepository.findAll(Sort.by("name")); }

    public Music getID(String id) {
        return (Music) musicRepository.findById(id).get();
    }
}
