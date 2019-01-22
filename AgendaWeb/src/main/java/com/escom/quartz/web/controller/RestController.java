package com.escom.quartz.web.controller;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
/*
import com.escom.quartz.dao.entity.Agenda;
import com.escom.quartz.dao.serviceImpl.AgendaServiceImpl;
*/
@CrossOrigin()
@EntityScan(basePackages = {"com.escom.quartz.dao.entity"})
@org.springframework.web.bind.annotation.RestController
@RequestMapping(value="/rest",method={RequestMethod.OPTIONS,RequestMethod.GET,RequestMethod.POST} )
public class RestController {
	private static final Log LOG = LogFactory.getLog(RestController.class);
	
/*	private AgendaServiceImpl agendaServiceImpl;
	
	
	
	public RestController(AgendaServiceImpl agendaServiceImpl) {
		super();
		// TODO Auto-generated constructor stub
		this.agendaServiceImpl =  agendaServiceImpl;
	}



	@CrossOrigin
	@GetMapping("/contactosAgenda")	
	public ResponseEntity<List<Agenda>> checkRest(){
		//agendaServiceImpl.listTodosContacts();
		//List<Agenda> lista = agendaServiceImpl.listAllContacts();
		List<Agenda> lista = this.agendaServiceImpl.det();
		return new ResponseEntity<List<Agenda>>(lista,HttpStatus.OK);
	}  */
}
