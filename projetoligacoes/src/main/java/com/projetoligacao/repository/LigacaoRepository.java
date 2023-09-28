package com.projetoligacao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoligacao.entities.Ligacao;

public interface LigacaoRepository extends JpaRepository<Ligacao, Long> {

}
