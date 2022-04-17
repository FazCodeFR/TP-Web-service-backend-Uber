package com.example.ubercdan.repository;

import com.example.ubercdan.entity.ChauffeurEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChauffeurRepository extends JpaRepository<ChauffeurEntity, Integer> {
}
