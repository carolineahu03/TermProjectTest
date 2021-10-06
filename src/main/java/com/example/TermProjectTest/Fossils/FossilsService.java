package com.example.TermProjectTest.Fossils;

import com.example.TermProjectTest.Floors.Floors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class FossilsService {

    @Autowired
    private FossilsRepository fossilsRepository;

    public List<Fossils> getAll() {
        return fossilsRepository.findAll(Sort.by("salePrice"));
    }

    public Fossils getID(String id) {
        return fossilsRepository.findById(id).get();
    }
}

