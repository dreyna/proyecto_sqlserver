package com.example.proyectosqlserver.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.proyectosqlserver.entity.Pliego;
import com.example.proyectosqlserver.service.PliegoService;

@RestController
public class HomeController {
	@Autowired
	private PliegoService pliegoService;
@GetMapping("/")
public List<Pliego> mensaje() {
	return pliegoService.readAll();
}
}
