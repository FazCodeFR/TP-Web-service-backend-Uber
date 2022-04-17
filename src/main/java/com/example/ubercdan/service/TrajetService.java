package com.example.ubercdan.service;

import com.example.ubercdan.dto.TrajetDto;
import com.example.ubercdan.entity.TrajetEntity;

public interface TrajetService {

    public TrajetDto toDto (TrajetEntity entity);
}
