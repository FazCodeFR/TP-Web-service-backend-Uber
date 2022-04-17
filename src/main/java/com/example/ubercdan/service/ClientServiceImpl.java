package com.example.ubercdan.service;

import com.example.ubercdan.dto.ClientDto;
import com.example.ubercdan.dto.ClientTrajetDto;
import com.example.ubercdan.dto.TrajetDto;
import com.example.ubercdan.entity.ClientEntity;
import com.example.ubercdan.entity.TrajetEntity;
import com.example.ubercdan.repository.ClientRepostory;
import com.example.ubercdan.repository.TrajetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientRepostory clientRepostory;



    @Autowired
    private TrajetService trajetService;

    @Autowired
    private TrajetRepository trajetRepository;

    @Override
    public List<ClientDto> getAll() {

        List<ClientEntity> list = clientRepostory.findAll();
        List<ClientDto> result = new ArrayList<ClientDto>();

        for (int i = 0; i < list.size(); i++) {

            ClientDto dto = toDto(list.get(i));
            result.add(dto);
        }
        return result;
    }

    @Override
    public ClientDto toDto(ClientEntity entity) {
        ClientDto dto = new ClientDto();
        dto.setDiplayName(entity.getPrenom() + " " + entity.getNom());
        dto.setTelephonne(entity.getTelephonne());
        return dto;
    }

    @Override
    public ClientTrajetDto toClientTrajetDto(ClientEntity entity) {
        ClientTrajetDto dto = new ClientTrajetDto();

        dto.setDisplayName(entity.getNom() + " " + entity.getPrenom());
        dto.setNbTrajet(entity.getTrajets().size());

        List<TrajetDto> list = new ArrayList<TrajetDto>();

        for (int i = 0; i<entity.getTrajets().size(); i++)
        {
            TrajetDto trajetDto = trajetService.toDto(entity.getTrajets().get(i));
            list.add(trajetDto);
        }
        dto.setListTrajet(list);
        return dto;
    }

    @Override
    public ClientTrajetDto getClient(Integer id) {

       ClientEntity client = clientRepostory.findById(id).get();
        return toClientTrajetDto(client);
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
