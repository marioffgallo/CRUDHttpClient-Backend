package com.project.ti9.demo.models;

import java.util.ArrayList;
import java.util.List;

public class Message {

	private String message = "";
	private List<Reservas> reservas = new ArrayList<Reservas>();
	private String error = "";
	
	public Message(String message, List<Reservas> reservas, String error) {
		this.message = message;
		this.reservas = reservas;
		this.error = error;
	}
	
	public String getMessage() {
		return this.message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public List<Reservas> getReservas(){
		return this.reservas;
	}
	
	public void setReservas(ArrayList<Reservas> reservas) {
		this.reservas = reservas;
	}
	
	public void setError(String error) {
		this.error = error;
	}
	
	public String getError() {
		return this.error;
	}	
}
