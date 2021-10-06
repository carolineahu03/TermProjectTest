package com.example.TermProjectTest.Construction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ConstructionService {

    @Autowired
    private ConstructionRepository constructionRepository;

    public List<Construction> getAll() {
        return constructionRepository.findAll(Sort.by("name"));
    }

    public Construction getID(String id) {
        return (Construction) constructionRepository.findById(id).get();
    }

}

