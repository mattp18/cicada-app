package com.code4joe.cicadarest.util;

import com.code4joe.cicadarest.backend.persistance.domain.Cicada;
import com.code4joe.cicadarest.backend.service.CicadaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {
    Logger log = LoggerFactory.getLogger(DatabaseLoader.class);

    private final CicadaService cicadaService;

    @Autowired
    public DatabaseLoader(CicadaService cicadaService) {
        this.cicadaService = cicadaService;
    }

    @Override
    public void run(String... args) throws Exception {
        log.info("Before saving cicada");
        this.cicadaService.saveCicada(new Cicada(1L, "name1", "test.jpg"));
        log.info("saved new cicada");
    }
}
