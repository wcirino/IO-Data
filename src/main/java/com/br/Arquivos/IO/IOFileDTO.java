package com.br.Arquivos.IO;

import java.io.Serializable;
import java.util.Objects;

public class IOFileDTO implements Serializable{


	private static final long serialVersionUID = 1L;
	private String name;
	private String phone;
	private String email;
	private String idade;
	
	public IOFileDTO(String name, String phone, String email, String idade) {
		super();
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.idade = idade;
	}

	public IOFileDTO() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(email, idade, name, phone);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		IOFileDTO other = (IOFileDTO) obj;
		return Objects.equals(email, other.email) && Objects.equals(idade, other.idade)
				&& Objects.equals(name, other.name) && Objects.equals(phone, other.phone);
	}
	
	
	
}
