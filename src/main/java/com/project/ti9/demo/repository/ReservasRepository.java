package com.project.ti9.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.ti9.demo.models.Reservas;

@Repository
public interface ReservasRepository extends JpaRepository<Reservas, Long>{

}
