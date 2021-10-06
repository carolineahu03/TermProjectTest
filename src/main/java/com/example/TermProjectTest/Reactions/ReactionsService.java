package com.example.TermProjectTest.Reactions;

import com.example.TermProjectTest.Headwear.Headwear;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ReactionsService {

    @Autowired
    private ReactionsRepository reactionsRepository;

    public List<Reactions> getAll() { return reactionsRepository.findAll(Sort.by("version")); }

    public Reactions getID(String id) {
        return (Reactions) reactionsRepository.findById(id).get();
    }
}
