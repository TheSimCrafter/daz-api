package de.lebk.dazapi.config;

import de.lebk.dazapi.service.ArtikelService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DaZApiConfig {

    @Bean
    public ArtikelService artikelService() {
        return new ArtikelService();
    }

}
