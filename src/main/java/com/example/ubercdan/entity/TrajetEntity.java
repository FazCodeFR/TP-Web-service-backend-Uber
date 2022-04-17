package com.example.ubercdan.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "Trajet")
public class TrajetEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "prix")
    private Integer prix;

    @Column(name = "distance")
    private Integer distance;


    @Column(name = "date")
    private LocalDateTime date;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_client")
    private ClientEntity client;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_chauffeur")
    private ChauffeurEntity chauffeur;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPrix() {
        return prix;
    }

    public void setPrix(Integer prix) {
        this.prix = prix;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public ClientEntity getClient() {
        return client;
    }

    public void setClient(ClientEntity client) {
        this.client = client;
    }

    public ChauffeurEntity getChauffeur() {
        return chauffeur;
    }

    public void setChauffeur(ChauffeurEntity chauffeur) {
        this.chauffeur = chauffeur;
    }
}
