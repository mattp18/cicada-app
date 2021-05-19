package com.code4joe.cicadarest.ui.controller;

import com.code4joe.cicadarest.backend.persistance.domain.Cicada;
import com.code4joe.cicadarest.backend.service.CicadaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/cicadas")
public class CicadaController {

    final CicadaService cicadaService;

    public CicadaController(CicadaService cicadaService) {
        this.cicadaService = cicadaService;
    }

    public List<Cicada> findAll() {
        return (List<Cicada>) cicadaService.getAllCicadas();
    }

    @GetMapping("/{id}")
    public Optional<Cicada> findById(@PathVariable("id") Long id) {
        return cicadaService.getCicadaById(id);
    }
}
