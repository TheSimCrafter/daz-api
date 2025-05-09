package de.lebk.dazapi.data.repositories;

import de.lebk.dazapi.data.entities.Artikel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtikelRepository extends JpaRepository<Artikel, Integer> {
}
