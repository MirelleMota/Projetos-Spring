package com.lojagame.LojaGame.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lojagame.LojaGame.model.CategoriaModel;
import com.lojagame.LojaGame.repository.CategoriaRepository;

@RestController
@RequestMapping("/categoria")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class CategoriaController {

	@Autowired
	private CategoriaRepository repository;
	
	@GetMapping
	public ResponseEntity<List<CategoriaModel>> getAll() {
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<CategoriaModel> GetById(@PathVariable Long id) {
		return repository.findById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/genero/{genero}")
	public ResponseEntity<List<CategoriaModel>> GetByGenero(@PathVariable String genero) {
		return ResponseEntity.ok(repository.findAllByGeneroContainingIgnoreCase(genero));
	
	}
	
	@PostMapping
	public ResponseEntity<CategoriaModel> post (@RequestBody CategoriaModel Categoria) {
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(Categoria));
	}
	
	@PutMapping
	public ResponseEntity<CategoriaModel> put (@RequestBody CategoriaModel Categoria) {
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(Categoria));
	}
	
	@DeleteMapping("/{id}")
	public void delete (@PathVariable Long id) {
		repository.deleteById(id);
	}
}
