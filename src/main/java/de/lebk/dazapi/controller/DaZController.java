package de.lebk.dazapi.controller;

import de.lebk.dazapi.data.entities.Artikel;
import de.lebk.dazapi.responses.ArtikelResponse;
import de.lebk.dazapi.service.ArtikelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.io.FileNotFoundException;

@RestController
@RequestMapping("/api")
public class DaZController {

    @Autowired
    private ArtikelService artikelService;

    @GetMapping("/artikel/{id}")
    public ResponseEntity<ArtikelResponse> getArtikel(@PathVariable("id") Integer id) {
        Artikel artikel = artikelService.getArtikelById(id);
        if(artikel == null) {
            return ResponseEntity.notFound().build();
        }
        ArtikelResponse response;
        try {
            response = new ArtikelResponse(artikel.getId(), artikel.getThemenbereichSchl().getTitel(),
                    artikelService.getArtikelTextByName(artikel.getEinfach(), artikel.getThemenbereichSchl()),
                artikelService.getArtikelTextByName(artikel.getFortgeschritten(), artikel.getThemenbereichSchl()),
                artikelService.getArtikelTextByName(artikel.getExperte(), artikel.getThemenbereichSchl()));
        } catch (FileNotFoundException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
        }
        return ResponseEntity.ok(response);
    }

    @GetMapping("/artikel/startseite")
    public ResponseEntity<ArtikelResponse> getArtikelStartseite() {
        return getArtikel(0);
    }

}
