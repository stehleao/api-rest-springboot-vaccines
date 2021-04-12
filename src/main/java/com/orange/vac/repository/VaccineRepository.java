package com.orange.vac.repository;

import com.orange.vac.model.Vaccine;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VaccineRepository  extends JpaRepository<Vaccine, Long> {
  
}
