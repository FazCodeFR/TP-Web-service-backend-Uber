package com.example.ubercdan.service;

import com.example.ubercdan.dto.TrajetDto;
import com.example.ubercdan.entity.TrajetEntity;
import org.springframework.stereotype.Service;

@Service
public class TrajetServiceImpl  implements TrajetService{
    @Override
    public TrajetDto toDto(TrajetEntity entity) {
        TrajetDto dto = new TrajetDto();
        dto.setChaffeur(entity.getChauffeur().getPrenom() + " " + entity.getChauffeur().getNom());

        dto.setDistance(entity.getDistance() + " " + "metres");
        dto.setPrix(entity.getPrix());
        dto.setDate(entity.getDate().toString());
        return dto;
    }
}
