package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Libro {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Long id;
	@Column
	private String titolo;
	private String annoPubblicazione;
	private String autore;
	private int numeroPagine;


	@ManyToOne(targetEntity = Scaffale.class)
	@JoinColumn(name="IdScaffale", referencedColumnName = "id")
	private Scaffale scaffale;
}
