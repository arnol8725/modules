package com.escom.quartz.dao.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.escom.quartz.dao.entity.Agenda;
import com.escom.quartz.dao.repository.AgendaRepository;
import com.escom.quartz.dao.service.AgendaService;

public class AgendaServiceImpl implements AgendaService {
	
	@Autowired
	@Qualifier("agendaRepository")
	public AgendaRepository agendaRepository;

	@Override
	public List<Agenda> det() {
		// TODO Auto-generated method stub
		return (List<Agenda>) agendaRepository.findAll();
	}

}
