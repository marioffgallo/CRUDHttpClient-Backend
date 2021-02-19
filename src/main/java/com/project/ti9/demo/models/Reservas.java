package com.project.ti9.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="reservas")
public class Reservas {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column
	private String primeiroNome;
	
	@Column
	private String segundoNome;
	
	@Column
	private String email;
	
	@Column
	private Integer qtdePessoas;
	
	@Column
	private String dtChegada;
	
	@Column
	private String timeChegada;
	
	@Column 
	private String dtSaida;
	
	@Column
	private String timeSaida;
	
	@Column
	private String transpGratis;
	
	@Column
	private String codigoVoo;
	
	@Column
	private String reqEspeciais;
	
	@Column
	private String status;
	
	public Reservas() {
	}

	public Reservas(String primeiroNome, String segundoNome, String email, Integer qtdePessoas, String dtChegada, String timeChegada,
			String dtSaida, String timeSaida, String transpGratis, String codigoVoo, String reqEspeciais, String status) {
		super();
		this.primeiroNome = primeiroNome;
		this.segundoNome = segundoNome;
		this.email = email;
		this.qtdePessoas = qtdePessoas;
		this.dtChegada = dtChegada;
		this.timeChegada = timeChegada;
		this.dtSaida = dtSaida;
		this.timeSaida = timeSaida;
		this.transpGratis = transpGratis;
		this.codigoVoo = codigoVoo;
		this.reqEspeciais = reqEspeciais;
		this.status = status;
	}
	
	public Long getId() {
		return id;
	}

	public String getPrimeiroNome() {
		return primeiroNome;
	}

	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}

	public String getSegundoNome() {
		return segundoNome;
	}

	public void setSegundoNome(String segundoNome) {
		this.segundoNome = segundoNome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getQtdePessoas() {
		return qtdePessoas;
	}

	public void setQtdePessoas(Integer qtdePessoas) {
		this.qtdePessoas = qtdePessoas;
	}

	public String getDtChegada() {
		return dtChegada;
	}

	public void setDtChegada(String dtChegada) {
		this.dtChegada = dtChegada;
	}
	
	public String getTimeChegada() {
		return timeChegada;
	}

	public void setTimeChegada(String timeChegada) {
		this.timeChegada = timeChegada;
	}

	public String getDtSaida() {
		return dtSaida;
	}

	public void setDtSaida(String dtSaida) {
		this.dtSaida = dtSaida;
	}
	
	public String getTimeSaida() {
		return timeSaida;
	}

	public void setTimeSaida(String timeSaida) {
		this.timeSaida = timeSaida;
	}

	public String getTranspGratis() {
		return transpGratis;
	}

	public void setTranspGratis(String transpGratis) {
		this.transpGratis = transpGratis;
	}

	public String getCodigoVoo() {
		return codigoVoo;
	}

	public void setCodigoVoo(String codigoVoo) {
		this.codigoVoo = codigoVoo;
	}

	public String getReqEspeciais() {
		return reqEspeciais;
	}

	public void setReqEspeciais(String reqEspeciais) {
		this.reqEspeciais = reqEspeciais;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Reservas [id=" + id + ", primeiroNome=" + primeiroNome + ", segundoNome=" + segundoNome + ", email="
				+ email + ", qtdePessoas=" + qtdePessoas + ", dtChegada=" + dtChegada + ", dtSaida=" + dtSaida + "]";
	}
	
}
