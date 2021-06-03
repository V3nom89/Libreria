package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.converter.ScaffaleConverter;
import com.example.dto.ScaffaleDTO;
import com.example.model.Scaffale;
import com.example.repository.ScaffaleRepository;

@Service
public class ScaffaleService extends AbstractService<Scaffale, ScaffaleDTO>{

	@Autowired
	private ScaffaleConverter scaffaleConverter;
	@Autowired
	private ScaffaleRepository scaffaleRepository;
	
	
	public ScaffaleDTO findScaffaleById(Long id) {
		return scaffaleConverter.toDTO(scaffaleRepository.findScaffaleById(id));
		
		
	}
}
