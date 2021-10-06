package com.example.TermProjectTest.simpleSearch;

import com.example.TermProjectTest.Floors.FloorsRepository;
import com.example.TermProjectTest.Fossils.FossilsRepository;
import com.example.TermProjectTest.GenericRepository;
import com.example.TermProjectTest.GenericTable;
import com.example.TermProjectTest.Headwear.HeadwearRepository;
import com.example.TermProjectTest.Music.MusicRepository;
import com.example.TermProjectTest.Reactions.ReactionsRepository;
import com.example.TermProjectTest.Villagers.VillagersRepository;
import com.example.TermProjectTest.Construction.ConstructionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SimpleSearchService {

    @Autowired
    public ConstructionRepository constructionRepository;
    @Autowired
    public FloorsRepository floorsRepository;
    @Autowired
    public FossilsRepository fossilsRepository;
    @Autowired
    public MusicRepository musicRepository;
    @Autowired
    public HeadwearRepository headwearRepository;
    @Autowired
    public ReactionsRepository reactionsRepository;
    @Autowired
    public VillagersRepository villagersRepository;

    public <T extends GenericTable> List<T> containsName(GenericRepository<T> repository, String search) {
        List<T> results = repository.findAll(Sort.by("name"));
        results = results.stream().filter(t -> t.getName().contains(search)).collect(Collectors.toList());
        return results;
    }

}
