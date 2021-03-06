package com.example.repository;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Scaffale;

@Repository
@Transactional
public interface ScaffaleRepository extends CrudRepository<Scaffale, Long> {

	Scaffale findScaffaleById(Long id);
}
