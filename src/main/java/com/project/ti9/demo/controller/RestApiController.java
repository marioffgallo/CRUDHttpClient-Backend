package com.project.ti9.demo.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.project.ti9.demo.models.Reservas;
import com.project.ti9.demo.services.ReservasServices;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/reservas")
public class RestApiController {
	
	@Autowired
	ReservasServices reservasServices;
	
	@GetMapping(value = "/findall")
	public ResponseEntity<List<Reservas>> findAll(){
		List<Reservas> list = reservasServices.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/findbyid/{id}")
	public ResponseEntity<Reservas> findById(@PathVariable Long id){
		Reservas obj = reservasServices.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
	@PostMapping(value = "/create")
	public ResponseEntity<Reservas> insert(@RequestBody Reservas obj){
		obj = reservasServices.insert(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).body(obj);
	}
	
	@DeleteMapping(value = "/delete/{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id){
		reservasServices.delete(id);
		return ResponseEntity.noContent().build();
	}
	
	@PutMapping(value = "/update/{id}")
	public ResponseEntity<Reservas> update(@PathVariable Long id, @RequestBody Reservas obj){
		obj = reservasServices.update(id, obj);
		return ResponseEntity.ok().body(obj);
	}
}