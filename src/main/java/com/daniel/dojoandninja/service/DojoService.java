package com.daniel.dojoandninja.service;

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
}
