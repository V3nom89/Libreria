package com.example.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Libro;
import com.example.model.Scaffale;


@Repository
@Transactional
public interface LibroRepository extends CrudRepository<Libro, Long>{
	
	Libro findLibroById(Long id);
	List<Libro> findByScaffale(Scaffale scaffale);
}
