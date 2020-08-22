package com.bdb.springboot.backend.apirest.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="locations")
public class Location implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(length = 256, nullable = false)
	public String name;
	
	@Column(nullable = false)
	public float area_m2; 
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setArea_m2(float area_m2) {
		this.area_m2 = area_m2;
	}
	
	public float getArea_m2() {
		return area_m2;
	}
	
	private static final long serialVersionUID = 1L;
	
}
