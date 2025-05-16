package de.lebk.dazapi.controller;

import de.lebk.dazapi.data.entities.Artikel;
import de.lebk.dazapi.responses.AkkordeonArtikelResponse;
import de.lebk.dazapi.responses.AkkordeonResponse;
import de.lebk.dazapi.responses.ArtikelResponse;
import de.lebk.dazapi.service.ArtikelService;
import de.lebk.dazapi.service.ThemenbereichService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/akkordeon")
public class AkkordeonController {

    @Autowired
    private ThemenbereichService service;

    @Autowired
    private ArtikelService artikelService;

    @GetMapping
    public ResponseEntity<AkkordeonResponse> getAkkordeon() {
        AkkordeonArtikelResponse[] artikelResponses =
                new AkkordeonArtikelResponse[(int) artikelService.getArtikelCount()];
        List<Artikel> artikelList = artikelService.getAllArtikel();
        for (int i = 0; i < artikelList.size(); i++) {
            Artikel artikel = artikelList.get(i);
            AkkordeonArtikelResponse artikelResponse =
                    new AkkordeonArtikelResponse(artikel.getId(), artikel.getTitel());
            artikelResponses[i] = artikelResponse;
        }
        //TODO fertig machen
        return ResponseEntity.ok(new AkkordeonResponse(null));
    }
}
