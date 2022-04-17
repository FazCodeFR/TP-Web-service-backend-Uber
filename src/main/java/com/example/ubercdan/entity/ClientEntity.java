package com.example.ubercdan.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Client")
public class ClientEntity {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "nom")
    private String Nom;

    @Column (name = "prenom")
    private String Prenom;

    @Column (name = "telephone")
    private String Telephonne;

    @OneToMany (fetch = FetchType.LAZY)
    @JoinColumn(name="id_client", referencedColumnName = "id")
    private List<TrajetEntity> trajets;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public void setPrenom(String prenom) {
        Prenom = prenom;
    }

    public void setTelephonne(String telephonne) {
        Telephonne = telephonne;
    }

    public List<TrajetEntity> getTrajets() {
        return trajets;
    }

    public void setTrajets(List<TrajetEntity> trajets) {
        this.trajets = trajets;
    }

    public Integer getId() {
        return id;
    }

    public String getNom() {
        return Nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public String getTelephonne() {
        return Telephonne;
    }
}
