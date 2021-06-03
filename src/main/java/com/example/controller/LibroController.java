package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.dto.LibroDTO;
import com.example.service.LibroService;


@RestController
@RequestMapping("/libreria/libro")
public class LibroController extends AbstractController<LibroDTO>{
	


}
