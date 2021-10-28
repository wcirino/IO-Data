package com.br.Arquivos.data;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

import org.springframework.stereotype.Service;

@Service
public class dataService {

	LocalDate dtNow = LocalDate.now();
	LocalDate dt2 = LocalDate.parse("2020-10-24");
	
	dataDTO dto = new dataDTO(dt2,dtNow);	
	dataDTO dto2 = new dataDTO(LocalDate.parse("2020-11-24"),LocalDate.parse("2021-10-24"));
	
	
	public Period VerificarDefault(LocalDate d1, LocalDate d2) {
		Period periodo = Period.between(d1,d2);
		System.out.println(periodo);
		return periodo;
	}
	
	public Period VerificarMeses(LocalDate d1, LocalDate d2) {
		Period periodo = Period.between(d1.withDayOfMonth(1),d2.withDayOfMonth(1));
		System.out.println("Por meses apenas: "+periodo);
		return periodo;
	}
	
	public long VerificaMeses2(LocalDate d1, LocalDate d2){
		long monthsBetween = ChronoUnit.MONTHS.between(d1.withDayOfMonth(1),d2.withDayOfMonth(1));
		System.out.println("Por meses só numero : "+monthsBetween);
		return monthsBetween;//3
	}
	
	public long VerificaDias(LocalDate d1, LocalDate d2){
		long monthsBetween = ChronoUnit.DAYS.between(d1.withDayOfMonth(1),d2.withDayOfMonth(1));
		System.out.println("Por dias   só numero : "+monthsBetween);
		return monthsBetween;//3
	}
	
	public void TesteValores() {
		dataDTO dto = new dataDTO(LocalDate.parse("2020-11-24"),LocalDate.parse("2021-10-24"));
		System.out.println("---- Inicio dos teste ----");
		System.out.println(dto.getData1().withDayOfMonth(1));
		System.out.println(dto.getData2().withDayOfMonth(1));
		System.out.println(dto.getData1().withMonth(1));
		System.out.println(dto.getData1().withYear(0));
		System.out.println(dto.getData1().withYear(1));
		System.out.println(dto.getData1().withMonth(1));
		System.out.println("----- Fim dos teste --------");
		
	}
}
