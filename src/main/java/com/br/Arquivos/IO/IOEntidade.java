package com.br.Arquivos.IO;

import java.io.Serializable;
import java.util.Objects;

public class IOEntidade implements Serializable {

	private static final long serialVersionUID = 1L;
	private String name;
	private String email;
	private String date;
	private String Pais;
	private String cartaoCredito;
	private String cvv;
	
	public IOEntidade(String name, String email, String date, String pais, String cartaoCredito, String cvv) {
		super();
		this.name = name;
		this.email = email;
		this.date = date;
		Pais = pais;
		this.cartaoCredito = cartaoCredito;
		this.cvv = cvv;
	}

	public IOEntidade() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getPais() {
		return Pais;
	}

	public void setPais(String pais) {
		Pais = pais;
	}

	public String getCartaoCredito() {
		return cartaoCredito;
	}

	public void setCartaoCredito(String cartaoCredito) {
		this.cartaoCredito = cartaoCredito;
	}

	public String getCvv() {
		return cvv;
	}

	public void setCvv(String cvv) {
		this.cvv = cvv;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Pais, cartaoCredito, cvv, date, email, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		IOEntidade other = (IOEntidade) obj;
		return Objects.equals(Pais, other.Pais) && Objects.equals(cartaoCredito, other.cartaoCredito)
				&& Objects.equals(cvv, other.cvv) && Objects.equals(date, other.date)
				&& Objects.equals(email, other.email) && Objects.equals(name, other.name);
	}
	
	
	
}
