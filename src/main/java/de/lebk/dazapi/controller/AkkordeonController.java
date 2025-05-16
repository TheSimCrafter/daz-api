package de.lebk.dazapi.controller;

import de.lebk.dazapi.data.entities.Artikel;
import de.lebk.dazapi.data.entities.Themenbereich;
import de.lebk.dazapi.responses.AkkordeonArtikelResponse;
import de.lebk.dazapi.responses.AkkordeonResponse;
import de.lebk.dazapi.responses.AkkordeonThemenbereichResponse;
import de.lebk.dazapi.responses.ArtikelResponse;
import de.lebk.dazapi.service.ArtikelService;
import de.lebk.dazapi.service.ThemenbereichService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/akkordeon")
public class AkkordeonController {

    @Autowired
    private ArtikelService artikelService;

    @Autowired
    private ThemenbereichService themenbereichService;

    @GetMapping
    public ResponseEntity<AkkordeonResponse> getAkkordeon() {
        List<Themenbereich> themenbereiche = themenbereichService.getAllThemenbereich();

        if (themenbereiche == null || themenbereiche.isEmpty()) {
            return ResponseEntity.noContent().build();
        }

        List<AkkordeonThemenbereichResponse> akkordeonThemenbereichResponses = themenbereiche.stream()
                .map(this::mapToAkkordeonThemenbereichResponse)
                .toList();

        return ResponseEntity.ok(new AkkordeonResponse(akkordeonThemenbereichResponses));
    }

    private AkkordeonThemenbereichResponse mapToAkkordeonThemenbereichResponse(Themenbereich themenbereich) {
        List<Artikel> artikelList = artikelService.getArtikelByThemenbereichSchl(themenbereich);

        AkkordeonArtikelResponse[] artikelResponses = artikelList.stream()
                .map(artikel -> new AkkordeonArtikelResponse(artikel.getId(), artikel.getTitel()))
                .toArray(AkkordeonArtikelResponse[]::new);

        return new AkkordeonThemenbereichResponse(
                themenbereich.getId(),
                themenbereich.getTitel(),
                artikelResponses
        );
    }

}
