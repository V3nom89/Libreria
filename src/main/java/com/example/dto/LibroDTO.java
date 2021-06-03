package com.example.dto;




import com.example.model.Scaffale;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class LibroDTO {

	private Long id;
	private String titolo;
	private String annoPubblicazione;
	private String autore;
	private int numeroPagine;
	private Scaffale scaffale;
	
}
