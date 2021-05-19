package com.code4joe.cicadarest.backend.persistance.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class Cicada {

    @Id
    @GeneratedValue
    private Long id;
}
