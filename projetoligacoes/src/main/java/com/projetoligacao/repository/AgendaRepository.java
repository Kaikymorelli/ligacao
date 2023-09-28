package com.projetoligacao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoligacao.entities.Agenda;

public interface AgendaRepository extends JpaRepository<Agenda, Long> {

}
