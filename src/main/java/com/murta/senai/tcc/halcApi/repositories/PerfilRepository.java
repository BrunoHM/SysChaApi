package com.murta.senai.tcc.halcApi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.murta.senai.tcc.halcApi.entities.Perfil;

@Repository
public interface PerfilRepository extends JpaRepository<Perfil, Long>{

}
