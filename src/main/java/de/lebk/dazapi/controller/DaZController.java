package de.lebk.dazapi.controller;

import de.lebk.dazapi.data.entities.Artikel;
import de.lebk.dazapi.responses.ArtikelResponse;
import de.lebk.dazapi.service.ArtikelService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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
        ArtikelResponse response = new ArtikelResponse(artikel.getId(), artikel.getThemenbereichSchl().getTitel(),
                artikel.getEinfach(), artikel.getFortgeschritten(), artikel.getExperte());
        return ResponseEntity.ok(response);
    }

    @GetMapping("/artikel/startseite")
    public ResponseEntity<ArtikelResponse> getArtikelStartseite() {
        return getArtikel(0);
    }

}
