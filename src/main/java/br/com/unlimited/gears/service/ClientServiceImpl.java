package br.com.unlimited.gears.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.assertj.core.util.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.unlimited.gears.domain.entity.Client;
import br.com.unlimited.gears.domain.repository.ClientRepository;
import br.com.unlimited.gears.exception.EntityNotFoundException;

@Service("clientService")
public class ClientServiceImpl implements ClientService {
	
	@Autowired
	private ClientRepository repository;
	
	private List<Client> clients = new ArrayList<>(Arrays.asList(
			new Client(1l, "Tecnomin", "Tecnomin sociedade anonima"),
			new Client(2l, "EPC", "EPC socidade limitada")
		)); 

	@Override
	public List<Client> getAllClients() {
		return repository.findAll(); 				
	}
	
	@Override
	public Client getClient(Long id) throws EntityNotFoundException{
		
		try {
			return repository.findOne(id);
						
		} catch(IllegalArgumentException e) {
			throw new EntityNotFoundException();
		}
	}
	
	@Override
	public Client add(Client client) {
		return repository.save(client);
	}
	
	@Override
	public void remove(Long id) {
		repository.delete(id);	
	}

	@Override
	public Client update(Client client) {
		return repository.save(client);
	}
}
