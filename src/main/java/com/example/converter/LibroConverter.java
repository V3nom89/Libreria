package com.example.converter;


import org.springframework.stereotype.Component;

import com.example.dto.LibroDTO;
import com.example.model.Libro;

@Component
public class LibroConverter extends AbstractConverter<Libro,LibroDTO>{

	@Override
	public Libro toEntity(LibroDTO dto) {
		
		Libro libro=null;
		
		if(dto!=null) {
			
			libro = new Libro(dto.getId(),  dto.getTitolo(), dto.getAnnoPubblicazione(), dto.getAutore(), dto.getNumeroPagine(), dto.getScaffale()  );
		}
		
		return libro;
	}

	@Override
	public LibroDTO toDTO(Libro entity) {
		
		LibroDTO dto= null;
		
		if(entity!=null) {
			
			dto = new LibroDTO(entity.getId(), entity.getTitolo(),entity.getAnnoPubblicazione(), entity.getAutore(), entity.getNumeroPagine(), entity.getScaffale());
		}
		
		return dto;
	}

}
