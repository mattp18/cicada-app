package com.code4joe.cicadarest.backend.persistance.repositories;

import com.code4joe.cicadarest.backend.persistance.domain.Cicada;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CicadaRepository extends CrudRepository<Cicada, Long> {
}
