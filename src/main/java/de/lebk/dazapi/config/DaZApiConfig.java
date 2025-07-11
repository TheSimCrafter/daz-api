package de.lebk.dazapi.config;

import de.lebk.dazapi.service.ArtikelService;
import de.lebk.dazapi.service.MarkdownImportService;
import de.lebk.dazapi.service.ThemenbereichService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DaZApiConfig {

    @Bean
    public ArtikelService artikelService() {
        return new ArtikelService();
    }

    @Bean
    public ThemenbereichService themenbereichService() {
        return new ThemenbereichService();
    }

    @Bean
    public MarkdownImportService markdownImportService() {
        return new MarkdownImportService();
    }

}
