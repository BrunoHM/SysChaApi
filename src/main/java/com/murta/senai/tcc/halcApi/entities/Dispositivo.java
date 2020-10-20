package com.murta.senai.tcc.halcApi.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Builder @Getter @Setter @ToString @NoArgsConstructor @AllArgsConstructor
public class Dispositivo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idDispositivo;
	
	private String descricao;
	private String local;
	private String codigoDispositivo;
	private boolean ativo;
}
