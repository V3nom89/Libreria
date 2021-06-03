package com.example.dto;

import java.util.ArrayList;
import java.util.List;

import com.example.model.Libro;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ScaffaleDTO {

	private Long id;
	private String stanza;
	private String nomeResponsabile;
	private int capienza;
	private List<Libro> listLibro= new ArrayList<>();
}
