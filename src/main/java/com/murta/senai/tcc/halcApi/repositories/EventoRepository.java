package com.murta.senai.tcc.halcApi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.murta.senai.tcc.halcApi.entities.Evento;

@Repository
public interface EventoRepository extends JpaRepository<Evento, Long>{

}
