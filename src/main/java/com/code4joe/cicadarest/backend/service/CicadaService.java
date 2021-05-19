package com.code4joe.cicadarest.backend.service;

import com.code4joe.cicadarest.backend.persistance.domain.Cicada;

import java.util.Optional;

public interface CicadaService {

    /**
     * Create cicada with given cicada instance.
     *
     * @param cicada
     * @return created cicada
     */
    Cicada saveCicada(Cicada cicada);

    /**
     * Delete given cicada.
     *
     * @param cicada to be deleted
     */
    void deleteCicada(Cicada cicada);

    /**
     * Retrieve list of all cicadas.
     * @return List of cicadas
     */
    Iterable<Cicada> getAllCicadas();

    /**
     * Retrieve cicada by given id.
     *
     * @param id cicada to be retrieved
     * @return retrieved cicada
     */
    Optional<Cicada> getCicadaById(Long id);

    
}
