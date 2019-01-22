package com.escom.quartz.dao.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.escom.quartz.dao.entity.Agenda;

@Repository("agendaRepository")
public interface AgendaRepository extends CrudRepository<Agenda, Long> {

}
