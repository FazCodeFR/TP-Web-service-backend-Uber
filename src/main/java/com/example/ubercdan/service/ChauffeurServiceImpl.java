package com.example.ubercdan.service;

import com.example.ubercdan.dto.ChauffeurDto;
import com.example.ubercdan.dto.ClientDto;
import com.example.ubercdan.dto.ClientTrajetDto;
import com.example.ubercdan.dto.TrajetDto;
import com.example.ubercdan.entity.ChauffeurEntity;
import com.example.ubercdan.entity.ClientEntity;
import com.example.ubercdan.entity.TrajetEntity;
import com.example.ubercdan.repository.ChauffeurRepository;
import com.example.ubercdan.repository.ClientRepostory;
import com.example.ubercdan.repository.TrajetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ChauffeurServiceImpl implements ClientService {

    @Autowired
    private ClientRepostory clientRepostory;

    @Autowired
    private ChauffeurRepository chauffeurRepository;

    @Autowired
    private TrajetService trajetService;

    @Autowired
    private TrajetRepository trajetRepository;

    @Override
    public List<ChauffeurDto> getAll() {

        List<ChauffeurEntity> list = chauffeurRepository.findAll();
        List<ChauffeurDto> result = new ArrayList<ChauffeurDto>();

        for (int i = 0; i < list.size(); i++) {

            ChauffeurDto dto = toDto(list.get(i));
            result.add(dto);
        }
        return result;
    }

//    @Override
    public ChauffeurDto toDto(ChauffeurEntity entity) {
        ChauffeurDto dto = new ChauffeurDto();
        dto.setDiplayName(entity.getPrenom() + " " + entity.getNom());
        dto.setVoiture(entity.getVoiture());
        return dto;
    }


    @Override
    public TrajetDto getMaxTrajet(Integer id) {

        return trajetService.toDto(trajetRepository.findFirstByClient_IdOrderByPrixDesc(id));

    }

    @Override
    public Float getCoutMoyen(Integer id) {
        //ClientTrajetDto monclient = getClient(id);
        List<TrajetEntity> maListe = clientRepostory.getById(id).getTrajets();

        Float total = 0F;
        for(int i = 0; i<maListe.size(); i++) {
            total += maListe.get(i).getPrix();
        }
        return total/maListe.size();
    }
}
