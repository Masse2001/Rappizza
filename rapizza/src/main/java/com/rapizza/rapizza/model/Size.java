package com.rapizza.rapizza.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name ="SIZES")
public class Size {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private String id;

    @Column(name = "name")
    private String name;

    @Column(name = "reduceRate")
    private float reduceRate;


}

