package com.bdb.springboot.backend.apirest.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bdb.springboot.backend.apirest.models.dao.ILocationDao;
import com.bdb.springboot.backend.apirest.models.entity.Location;

@Service
public class LocationService implements ILocationService {

	@Autowired
	private ILocationDao locationDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Location> findAll() {
		return (List<Location>) locationDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Location findById(Long id) {
		return locationDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Location save(Location location) {
		return locationDao.save(location);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		locationDao.deleteById(id);
	}

}
