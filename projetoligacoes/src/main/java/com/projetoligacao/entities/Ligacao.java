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
@Table(name = "ligacoes")
public class Ligacao {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	@NotBlank
	@Column (name = "data")
	private String data;

	@NotNull
	@NotBlank
	@Column (name = "horarioinicio")
	private String horarioinicio;

	@NotNull
	@NotBlank
	@Column (name = "horariotermino")
	private String horariotermino;
	
	@NotNull
	@NotBlank
	@Column (name = "telefoneDiscado")
	private String telefoneDiscado;
	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getdata() {
		return data;
	}
	public void setdata(String data) {
		this.data = data;
	}
	public String gethorarioinicio() {
		return horarioinicio;
	}
	public void sethorarioinicio(String horarioinicio) {
		this.horarioinicio = horarioinicio;
	}

	public String gethorariotermino() {
		return horariotermino;
	}

	public void sethorariotermino(String horariotermino) {
		this.horariotermino = horariotermino;
	}
	public String gettelefoneDiscado() {
		return telefoneDiscado;
	}

	public void settelefoneDiscado(String telefoneDiscado) {
		this.telefoneDiscado = telefoneDiscado;
	}



	
	

}
