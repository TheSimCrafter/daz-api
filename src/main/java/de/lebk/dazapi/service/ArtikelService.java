package de.lebk.dazapi.service;

import de.lebk.dazapi.data.entities.Artikel;
import de.lebk.dazapi.data.entities.Themenbereich;
import de.lebk.dazapi.data.repositories.ArtikelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArtikelService {

    @Autowired
    private ArtikelRepository artikelRepository;

    public Artikel getArtikelById(int id) {
        return artikelRepository.findById(id).orElse(null);
    }

    public List<Artikel> getAllArtikel() {
        return artikelRepository.findAll();
    }

    public List<Artikel> getArtikelByThemenbereichSchl(Themenbereich themenbereich) {
        return artikelRepository.findAllByThemenbereichSchl(themenbereich);
    }

    public long getArtikelCountByThemenbereich(Themenbereich themenbereich) {
        return artikelRepository.findAllByThemenbereichSchl(themenbereich).size();
    }
}
