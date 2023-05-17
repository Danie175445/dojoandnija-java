package com.daniel.dojoandninja.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daniel.dojoandninja.model.Dojo;
import com.daniel.dojoandninja.repository.DojoRepository;

@Service
public class DojoService {
	@Autowired
	DojoRepository dojoRepository;
	
	public Dojo create(Dojo dojo) {
		return dojoRepository.save(dojo);
	}
	
	public List<Dojo> findall(){
		return dojoRepository.findAll();
	}
	
	public Dojo getOne(Long id) {
		Optional<Dojo> optionalDojo = dojoRepository.findById(id);
		if(optionalDojo.isPresent()) {
			return optionalDojo.get();
		}
		else {
			return null;
		}
	}
}
