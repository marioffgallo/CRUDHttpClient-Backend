package com.project.ti9.demo.services;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.project.ti9.demo.models.Reservas;
import com.project.ti9.demo.repository.ReservasRepository;
import com.project.ti9.demo.services.exceptions.DatabaseException;
import com.project.ti9.demo.services.exceptions.ResourceNotFoundException;

@Service
public class ReservasServices {
	
	@Autowired
	ReservasRepository repository;
	
	public List<Reservas> findAll(){
		return repository.findAll();
	}
	
	public Reservas findById(Long id) {
		Optional<Reservas> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
	}
	
	public Reservas insert(Reservas reserva) {
		return repository.save(reserva);
	}
	
	public void delete(Long id) {
		try{
			repository.deleteById(id);
		}
		catch(EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException(id);
		}
		catch(DataIntegrityViolationException e) {
			throw new DatabaseException(e.getMessage());
		}
	}
	
	public Reservas update(Long id, Reservas obj) {
		try {
			Reservas entity = repository.getOne(id);
			updateData(entity, obj);
			return repository.save(entity);	
		}
		catch(EntityNotFoundException e) {
			throw new ResourceNotFoundException(id);
		}
		
	}

	private void updateData(Reservas reserva, Reservas _reserva) {
		reserva.setPrimeiroNome(_reserva.getPrimeiroNome());
		reserva.setSegundoNome(_reserva.getSegundoNome());
		reserva.setEmail(_reserva.getEmail());
		reserva.setQtdePessoas(_reserva.getQtdePessoas());
		reserva.setTimeChegada(_reserva.getTimeChegada());
		reserva.setDtChegada(_reserva.getDtChegada());
		reserva.setDtSaida(_reserva.getDtSaida());
		reserva.setTimeSaida(_reserva.getTimeSaida());
		reserva.setTranspGratis(_reserva.getTranspGratis());
		reserva.setCodigoVoo(_reserva.getCodigoVoo());
		reserva.setReqEspeciais(_reserva.getReqEspeciais());
		reserva.setStatus(_reserva.getStatus());
	}
	
//	public List<Reservas> getReservasInfos(){
//		return repository.findAll();
//	}
//	
//	public Optional<Reservas> getReservaById(Long id){
//		return repository.findById(id);
//	}
//	
//	public boolean checkExistReserva(Long id) {
//		if(repository.existsById(id)) {
//			return true;
//		}
//		return false;
//	}
//	
//	public Reservas updateReserva(Reservas reserva) {
//		return repository.save(reserva);
//	}
//	
//	public void deleteReservaById(long id) {
//		repository.deleteById(id);
//	}
}
