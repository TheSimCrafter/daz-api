package de.lebk.dazapi.service;

import de.lebk.dazapi.data.entities.Themenbereich;
import de.lebk.dazapi.data.repositories.ThemenbereichRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ThemenbereichService {

    @Autowired
    private ThemenbereichRepository themenbereichRepository;

    public List<Themenbereich> getAllThemenbereich() {
        return themenbereichRepository.findAll();
    }

    public long getAllThemenbereichCount() {
        return themenbereichRepository.count();
    }
}
