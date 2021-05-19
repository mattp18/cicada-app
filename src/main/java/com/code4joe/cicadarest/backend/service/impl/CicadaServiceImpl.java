package com.code4joe.cicadarest.backend.service.impl;

import com.code4joe.cicadarest.backend.persistance.domain.Cicada;
import com.code4joe.cicadarest.backend.persistance.repositories.CicadaRepository;
import com.code4joe.cicadarest.backend.service.CicadaService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CicadaServiceImpl implements CicadaService {

    final CicadaRepository cicadaRepository;

    public CicadaServiceImpl(CicadaRepository cicadaRepository) {
        this.cicadaRepository = cicadaRepository;
    }

    /**
     * Create cicada with given cicada instance.
     *
     * @param cicada
     * @return created cicada
     */
    @Override
    public Cicada saveCicada(Cicada cicada) {
        return cicadaRepository.save(cicada);
    }

    /**
     * Delete given cicada.
     *
     * @param cicada to be deleted
     */
    @Override
    public void deleteCicada(Cicada cicada) {
        cicadaRepository.delete(cicada);
    }

    /**
     * Retrieve list of all cicadas.
     *
     * @return List of cicadas
     */
    @Override
    public List<Cicada> getAllCicadas() {
        return (List<Cicada>) cicadaRepository.findAll();
    }

    /**
     * Retrieve cicada by given id.
     *
     * @param id cicada to be retrieved
     * @return retrieved cicada
     */
    @Override
    public Optional<Cicada> getCicadaById(Long id) {
        return cicadaRepository.findById(id);
    }
}
