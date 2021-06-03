package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.ScaffaleDTO;

@RestController
@RequestMapping("/libreria/scaffale")
public class ScaffaleController extends AbstractController<ScaffaleDTO>{

}
