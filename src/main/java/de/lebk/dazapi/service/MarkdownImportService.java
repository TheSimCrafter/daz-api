import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

@Service
public class MarkdownImportService {

    @Autowired
    private ArtikelRepository artikelRepository;

    @Autowired
    private ThemenbereichRepository themenbereichRepository;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @PostConstruct
    public void init() throws IOException {
        artikelRepository.deleteAll();
        themenbereichRepository.deleteAll();

        jdbcTemplate.execute("ALTER TABLE artikel AUTO_INCREMENT = 1");
        jdbcTemplate.execute("ALTER TABLE themenbereich AUTO_INCREMENT = 1");

        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();

        // Alle Themenbereiche (Ordner)
        Resource[] themenbereiche = resolver.getResources("classpath:/markdowns/*/");

        for (Resource themenbereichRes : themenbereiche) {
            String themenbereichName = themenbereichRes.getFilename();
            Themenbereich themenbereich = themenbereichRepository.save(new Themenbereich(themenbereichName));

            // Alle Artikel-Ordner pro Themenbereich
            Resource[] artikelOrdner = resolver.getResources("classpath:/markdowns/" + themenbereichName + "/*/");

            for (Resource artikelRes : artikelOrdner) {
                String titel = artikelRes.getFilename();

                String einfach = readMarkdown("classpath:/markdowns/" + themenbereichName + "/" + titel + "/einfach.md");
                String fortgeschritten = readMarkdown("classpath:/markdowns/" + themenbereichName + "/" + titel + "/fortgeschritten.md");
                String schwer = readMarkdown("classpath:/markdowns/" + themenbereichName + "/" + titel + "/schwer.md");

                Artikel artikel = new Artikel(titel, einfach, fortgeschritten, schwer, themenbereich);
                artikelRepository.save(artikel);
            }
        }
    }

    private String readMarkdown(String location) throws IOException {
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        Resource res = resolver.getResource(location);

        if (!res.exists()) return null;

        try (InputStream in = res.getInputStream();
             Scanner scanner = new Scanner(in, StandardCharsets.UTF_8)) {
            return scanner.useDelimiter("\\A").hasNext() ? scanner.next() : "";
        }
    }
}
