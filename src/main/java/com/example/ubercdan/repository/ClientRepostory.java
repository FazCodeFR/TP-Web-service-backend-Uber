package com.example.ubercdan.repository;

import com.example.ubercdan.entity.ClientEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepostory extends JpaRepository<ClientEntity, Integer> {

}
