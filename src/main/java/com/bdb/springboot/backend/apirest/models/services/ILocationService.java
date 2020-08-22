package com.bdb.springboot.backend.apirest.models.services;

import java.util.List;

import com.bdb.springboot.backend.apirest.models.entity.Location;

public interface ILocationService {

	public List<Location> findAll();
	
	public Location findById(Long id);
	
	public Location save(Location location);
	
	public void delete(Long id);
	
}
