package com.example.ubercdan.dto;

import java.util.List;

public class ClientTrajetDto {

    private String displayName;
    private Integer nbTrajet;
    private List<TrajetDto> listTrajet;

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public Integer getNbTrajet() {
        return nbTrajet;
    }

    public void setNbTrajet(Integer nbTrajet) {
        this.nbTrajet = nbTrajet;
    }

    public List<TrajetDto> getListTrajet() {
        return listTrajet;
    }

    public void setListTrajet(List<TrajetDto> listTrajet) {
        this.listTrajet = listTrajet;
    }
}
