package com.example.ubercdan.service;

import com.example.ubercdan.dto.ChauffeurDto;
import com.example.ubercdan.dto.ClientDto;
import com.example.ubercdan.dto.ClientTrajetDto;
import com.example.ubercdan.dto.TrajetDto;
import com.example.ubercdan.entity.ClientEntity;
import java.util.List;

public interface ChauffeurService {

    List<ChauffeurDto> getAll();
    ChauffeurDto toDto(ClientEntity entity);
    ClientTrajetDto toClientTrajetDto (ClientEntity entity);
    ClientTrajetDto getClient(Integer id);

    TrajetDto getMaxTrajet(Integer id);

    Float getCoutMoyen(Integer id);
}
