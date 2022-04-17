package com.example.ubercdan.controller;

import com.example.ubercdan.dto.ClientDto;
import com.example.ubercdan.dto.ClientTrajetDto;
import com.example.ubercdan.dto.TrajetDto;
import com.example.ubercdan.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("Client")
public class ClientController {

    @Autowired
    private ClientService service;

    @GetMapping("All")
    public List<ClientDto> getAll(){

        return service.getAll();
    }

    @GetMapping("by ")
    public ClientTrajetDto get (@PathVariable String id){

        Integer ID = Integer.valueOf(id);
        return service.getClient(ID);

    }

    @GetMapping("trajetMax/{id}")
    public TrajetDto maxTrajet(@PathVariable String id) {

        Integer ID = Integer.valueOf(id);

        return service.getMaxTrajet(ID);
    }

    @GetMapping("coutMoyen/{id}")
    public Float coutMoyen(@PathVariable String id) {

        Integer ID = Integer.valueOf(id);

        return service.getCoutMoyen(ID);
    }



}
