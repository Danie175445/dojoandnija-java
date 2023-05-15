package com.daniel.dojoandninja.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.daniel.dojoandninja.model.Dojo;

@Repository
public interface DojoRepository extends CrudRepository<Dojo,Long> {
	List<Dojo>findAll();
}
