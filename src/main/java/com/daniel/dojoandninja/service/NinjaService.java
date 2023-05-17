package com.daniel.dojoandninja.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daniel.dojoandninja.model.Ninja;
import com.daniel.dojoandninja.repository.NinjaRepository;

@Service
public class NinjaService {
	@Autowired
	NinjaRepository ninjaRepository;
	
	public Ninja create(Ninja ninja) {
		return ninjaRepository.save(ninja);
	}
}
