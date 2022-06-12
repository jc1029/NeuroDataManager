package com.base01.proyecto1.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="games")

public class Game implements Serializable{

	private static final long serialVersionUID = 1901719839544302922L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long llave;
	@Column(length = 20 )	
	
	private String name;
	public Long getLlave() {
		return llave;
	}
	public void setLlave(Long llave) {
		this.llave = llave;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


}
