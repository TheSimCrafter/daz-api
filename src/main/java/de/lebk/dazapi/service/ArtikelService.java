package de.lebk.dazapi.service;

import de.lebk.dazapi.data.entities.Artikel;
import de.lebk.dazapi.data.entities.Themenbereich;
import de.lebk.dazapi.data.repositories.ArtikelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ArtikelService {

    @Autowired
    private ArtikelRepository artikelRepository;

    public Artikel getArtikelById(int id) {
        return artikelRepository.findById(id).orElse(null);
    }

    public List<Artikel> getArtikelByThemenbereichSchl(Themenbereich themenbereich) {
        return artikelRepository.findAllByThemenbereichSchl(themenbereich);
    }

    public String getArtikelTextByName(String name, Themenbereich themenbereichSchl) throws FileNotFoundException {
        System.out.println("../../../resources/" + name);

        String path = System.getProperty("user.dir");

        BufferedReader reader = new BufferedReader(new FileReader(path + "/src/main/resources/markdowns/" + themenbereichSchl.getTitel().toLowerCase() + "/" +name));
        return reader.lines().collect(Collectors.joining("\n"));
    }

}
