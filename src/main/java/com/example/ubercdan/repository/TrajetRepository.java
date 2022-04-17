package com.example.ubercdan.repository;

import com.example.ubercdan.entity.ClientEntity;
import com.example.ubercdan.entity.TrajetEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrajetRepository extends JpaRepository <TrajetEntity, Integer> {

    TrajetEntity findFirstByClient_IdOrderByPrixDesc(Integer client_id);

}
