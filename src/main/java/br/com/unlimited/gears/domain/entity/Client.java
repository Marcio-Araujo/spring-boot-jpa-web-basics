package br.com.unlimited.gears.domain.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Client {
	
	@Id
	private Long id;
	
	private String name;
	
	private String description;
	
	public Client() {
	}
	
	public Client(Long id, String name, String description) {
		this.id = id;
		this.name = name;
		this.description = description;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
