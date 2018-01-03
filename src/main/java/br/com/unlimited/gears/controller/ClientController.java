package br.com.unlimited.gears.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.unlimited.gears.domain.entity.Client;
import br.com.unlimited.gears.exception.EntityNotFoundException;
import br.com.unlimited.gears.service.ClientService;

@RestController
public class ClientController {

	@Autowired
	private ClientService service;
	
	@RequestMapping("/clients")
	private List<Client> getAllCLientes(){
		return service.getAllClients();
	}
	
	@RequestMapping("/client/{id}")
	private Client getClient(@PathVariable("id") Long id) {
		Client client = null;
		try {
			client = service.getClient(id);
		} catch (EntityNotFoundException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		return client;
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/clients")
	private void addClient(@RequestBody Client client) {
		service.add(client);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/clients/{id}")
	private void deleteClient(@PathVariable("id") Long id) {
		service.remove(id);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/clients")
	private void updateClient(@RequestBody Client client) {
		service.update(client);
	}
}
