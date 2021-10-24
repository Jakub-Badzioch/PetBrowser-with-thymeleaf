package com.PetBrowser.petBrowser.entities;

import lombok.*;

import javax.persistence.*;

@NoArgsConstructor
@ToString
@Getter
@Setter
@Entity
@Table(name = "animal")
public class Animal {

    public Animal(String species, String race, String name, double age, String sex, Adress adress, Description description) {
        this.species = species;
        this.race = race;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.adress = adress;
        this.description = description;
    }

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
