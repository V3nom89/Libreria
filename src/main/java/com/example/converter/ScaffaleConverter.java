package com.example.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.dto.ScaffaleDTO;
import com.example.model.Scaffale;

@Component
public class ScaffaleConverter extends AbstractConverter<Scaffale, ScaffaleDTO>{

	@Autowired
	LibroConverter libroConverter;
	
	@Override
	public Scaffale toEntity(ScaffaleDTO dto) {
		
		Scaffale scaffale= null;
		
		if(dto!=null) {
			
			scaffale = new Scaffale(dto.getId(), dto.getStanza(), dto.getNomeResponsabile(), dto.getCapienza(), dto.getListLibro());
		}
		
		return scaffale;
	}

	@Override
	public ScaffaleDTO toDTO(Scaffale entity) {
		
		ScaffaleDTO scaffaleDto = null ;
		
		if(entity!=null) {
			
			scaffaleDto = new ScaffaleDTO(entity.getId(), entity.getStanza(), entity.getNomeResponsabile(), entity.getCapienza(), entity.getListLibro());
			
		}
		
		return scaffaleDto;
	}

	

}
