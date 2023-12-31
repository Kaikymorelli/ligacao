package com.projetoligacao.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "agenda")
public class Agenda {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	@NotBlank
	@Column (name = "nome")
	private String nome;

	@NotNull
	@NotBlank
	@Column (name = "ddd")
	private String ddd;

	@NotNull
	@NotBlank
	@Column (name = "telefone")
	private String telefone;
	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getddd() {
		return ddd;
	}
	public void setddd(String ddd) {
		this.ddd = ddd;
	}

	public String gettelefone() {
		return telefone;
	}

	public void settelefone(String telefone) {
		this.telefone = telefone;
	}


	
}
