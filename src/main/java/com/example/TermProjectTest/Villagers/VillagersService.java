package com.example.TermProjectTest.Villagers;

import com.example.TermProjectTest.Reactions.Reactions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VillagersService {
    @Autowired
    private VillagersRepository villagersRepository;

    public List<Villagers> getAll() { return villagersRepository.findAll(Sort.by("name"));}

    public Villagers getID(String id) {
        return (Villagers) villagersRepository.findById(id).get();
    }
}
