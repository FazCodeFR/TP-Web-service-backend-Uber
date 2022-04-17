package com.example.ubercdan.dto;

public class TrajetDto {

    private String chaffeur;
    private String distance;
    private Integer prix;
    private String date;

    public String getChaffeur() {
        return chaffeur;
    }

    public void setChaffeur(String chaffeur) {
        this.chaffeur = chaffeur;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public Integer getPrix() {
        return prix;
    }

    public void setPrix(Integer prix) {
        this.prix = prix;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
