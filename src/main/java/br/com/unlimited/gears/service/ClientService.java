package br.com.unlimited.gears.service;

import java.util.List;

import br.com.unlimited.gears.domain.entity.Client;
import br.com.unlimited.gears.exception.EntityNotFoundException;

public interface ClientService {
	
	public List<Client> getAllClients();
	
	public Client getClient(Long id) throws EntityNotFoundException;

	public Client add(Client client);

	public void remove(Long client);

	public Client update(Client client);
	
}
