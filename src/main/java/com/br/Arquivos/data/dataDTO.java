package com.br.Arquivos.data;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class dataDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	LocalDate data1;
	LocalDate data2;
	
	public dataDTO(LocalDate data1, LocalDate data2) {
		super();
		this.data1 = data1;
		this.data2 = data2;
	}

	public dataDTO() {
		super();
	}

	@Override
	public int hashCode() {
		return Objects.hash(data1, data2);
	}
	
	
	public LocalDate getData1() {
		return data1;
	}

	public void setData1(LocalDate data1) {
		this.data1 = data1;
	}

	public LocalDate getData2() {
		return data2;
	}

	public void setData2(LocalDate data2) {
		this.data2 = data2;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		dataDTO other = (dataDTO) obj;
		return Objects.equals(data1, other.data1) && Objects.equals(data2, other.data2);
	}
	
	
	
	
	
}
