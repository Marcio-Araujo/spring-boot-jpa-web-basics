package br.com.unlimited.gears.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.unlimited.gears.domain.entity.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{
		

}
