package com.bdb.springboot.backend.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.bdb.springboot.backend.apirest.models.entity.Location;

public interface ILocationDao extends CrudRepository <Location, Long>{

}
