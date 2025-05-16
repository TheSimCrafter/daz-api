package de.lebk.dazapi.data.repositories;

import de.lebk.dazapi.data.entities.Artikel;
import de.lebk.dazapi.data.entities.Themenbereich;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ArtikelRepository extends JpaRepository<Artikel, Integer> {
    List<Artikel> findAllByThemenbereichSchl(Themenbereich themenbereichSchl);
}
