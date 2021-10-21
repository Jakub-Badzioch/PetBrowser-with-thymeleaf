package com.PetBrowser.petBrowser.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@ToString
@Getter
@Setter
@Entity
@Table(name = "animal")
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "species")
    private String species;

    @Column(name = "race")
    private String race;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private double age;

    @Column(name = "sex")
    private String sex;

    @OneToOne
    @JoinColumn(name = "adress_id")
    private Adress adress;

    @OneToOne
    @JoinColumn(name = "description_id")
    private Description description;
}
