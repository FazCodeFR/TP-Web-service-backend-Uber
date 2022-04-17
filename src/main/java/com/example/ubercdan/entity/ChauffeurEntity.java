package com.example.ubercdan.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Chauffeur")
public class ChauffeurEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "nom")
    private String Nom;

    @Column (name = "prenom")
    private String Prenom;

    @Column (name = "voiture")
    private String Voiture;

    public List<TrajetEntity> getTrajets() {
        return trajets;
    }

    public void setTrajets(List<TrajetEntity> trajets) {
        this.trajets = trajets;
    }

    @OneToMany (fetch = FetchType.LAZY)
    @JoinColumn(name="id_chauffeur", referencedColumnName = "id")
    private List<TrajetEntity> trajets;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public void setPrenom(String prenom) {
        Prenom = prenom;
    }

    public String getVoiture() {
        return Voiture;
    }

    public void setVoiture(String voiture) {
        Voiture = voiture;
    }
}
