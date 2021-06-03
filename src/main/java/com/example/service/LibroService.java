package com.example.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.converter.LibroConverter;
import com.example.dto.LibroDTO;
import com.example.model.Libro;
import com.example.model.Scaffale;
import com.example.repository.LibroRepository;

@Service
public class LibroService extends AbstractService<Libro, LibroDTO> {

	@Autowired
	private LibroConverter libroConverter;
	@Autowired
	private LibroRepository libroRepository;
	
	
	public LibroDTO findLibroById(Long id) {
		
		return libroConverter.toDTO(libroRepository.findLibroById(id));
	}
	
	
}
