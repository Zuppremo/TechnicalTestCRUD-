package com.technical.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="paises")
public class Country 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "id_pais")
	private Integer id;
	@Column(name = "nombre_pais")
	private String name;
	
	public Country() {
		
	}

	public Country(String name) {
		super();
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
