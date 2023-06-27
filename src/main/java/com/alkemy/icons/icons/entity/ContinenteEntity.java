package com.alkemy.icons.icons.entity;

import lombok.Data;

import javax.persistence.*;
@Entity
@Table(name = "continente")
@Data
public class ContinenteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String imagen;

    private String denominacion;
}
