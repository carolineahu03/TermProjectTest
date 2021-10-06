package com.example.TermProjectTest.Floors;

import com.example.TermProjectTest.Construction.Construction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class FloorsService {
    @Autowired
    private FloorsRepository floorsRepository;

    public List<Floors> getAll() {
        return floorsRepository.findAll(Sort.by("purchasePrice"));
    }

    public Floors getID(String id) {
        return floorsRepository.findById(id).get();
    }
}
