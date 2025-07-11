package de.lebk.dazapi.service;

import de.lebk.dazapi.data.entities.Artikel;
import de.lebk.dazapi.data.entities.Themenbereich;
import de.lebk.dazapi.data.repositories.ArtikelRepository;
import de.lebk.dazapi.data.repositories.ThemenbereichRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Objects;

@Service
public class MarkdownImportService {
    @Autowired
    private ArtikelRepository artikelRepository;

    @Autowired
    private ThemenbereichRepository themenbereichRepository;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Value("classpath:markdowns")
    private Resource markdownsRoot;

    @PostConstruct
    public void init() throws IOException {
        artikelRepository.deleteAll();
        themenbereichRepository.deleteAll();

        jdbcTemplate.execute("ALTER TABLE artikel AUTO_INCREMENT = 1");
        jdbcTemplate.execute("ALTER TABLE themenbereich AUTO_INCREMENT = 1");

        File rootDir = markdownsRoot.getFile();
        for (File themenbereichDir : Objects.requireNonNull(rootDir.listFiles(File::isDirectory))) {
            String themenbereichName = themenbereichDir.getName();
            Themenbereich themenbereich = new Themenbereich(themenbereichName);
            themenbereich = themenbereichRepository.save(themenbereich);

            for (File artikelDir : Objects.requireNonNull(themenbereichDir.listFiles(File::isDirectory))) {
                String titel = artikelDir.getName();
                String einfach = readMarkdownFile(artikelDir, "einfach.md");
                String fortgeschritten = readMarkdownFile(artikelDir, "fortgeschritten.md");
                String schwer = readMarkdownFile(artikelDir, "schwer.md");

                Artikel artikel = new Artikel(titel, "einfach.md", "fortgeschritten.md", "schwer.md", themenbereich);
                artikelRepository.save(artikel);
            }
        }
    }

    private String readMarkdownFile(File dir, String filename) throws IOException {
        File file = new File(dir, filename);
        return file.exists() ? Files.readString(file.toPath()) : null;
    }
}