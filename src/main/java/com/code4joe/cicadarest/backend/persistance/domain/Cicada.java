package com.code4joe.cicadarest.backend.persistance.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class Cicada {

    @Id
    @GeneratedValue
    @NonNull
    private Long id;

    @NonNull
    private String name;

    @NonNull
    private String image;
}
