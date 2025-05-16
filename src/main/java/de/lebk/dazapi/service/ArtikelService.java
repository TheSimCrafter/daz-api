package de.lebk.dazapi.service;

import de.lebk.dazapi.data.entities.Artikel;
import de.lebk.dazapi.data.repositories.ArtikelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArtikelService {

    @Autowired
    private ArtikelRepository artikelRepository;

    public Artikel getArtikelById(int id) {
        return artikelRepository.findById(id).orElse(null);
    }

}
