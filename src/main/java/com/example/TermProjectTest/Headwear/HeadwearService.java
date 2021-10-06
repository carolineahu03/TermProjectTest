package com.example.TermProjectTest.Headwear;

import com.example.TermProjectTest.Fossils.Fossils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class HeadwearService {

    @Autowired
    private HeadwearRepository headwearRepository;

    public List<Headwear> getAll() {
        return headwearRepository.findAll(Sort.by("name"));
    }

    public Headwear getID(String id) {
        return (Headwear) headwearRepository.findById(id).get();
    }
}
