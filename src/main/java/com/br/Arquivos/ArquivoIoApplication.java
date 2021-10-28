package com.br.Arquivos;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.br.Arquivos.IO.IOService;
import com.br.Arquivos.data.dataDTO;
import com.br.Arquivos.data.dataService;

@SpringBootApplication
public class ArquivoIoApplication implements CommandLineRunner  {

	@Autowired
	dataService obj;
	
	@Autowired
	IOService ioservice;
	
	public static void main(String[] args) {
		SpringApplication.run(ArquivoIoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Willyan");
		dataDTO dto2 = new dataDTO(LocalDate.parse("2020-11-24"),LocalDate.parse("2021-11-24"));
		obj.VerificarDefault(dto2.getData1(), dto2.getData2());
		obj.VerificarMeses(dto2.getData1(), dto2.getData2());
		obj.VerificaMeses2(dto2.getData1(), dto2.getData2());
		System.out.println("Fim");
		//obj.TesteValores();
		//System.out.println("--------------------");
		obj.VerificaDias(dto2.getData1(), dto2.getData2());
		//System.out.println("--------------------");
		
		//---------------------------------------------------------------------------------------------------------
		//c://temp//person.csv
		String path = "c://temp//person.csv";
		String path2 = "c://temp//buscaCadastro.csv";
		String path1 = "c://temp//cad1.csv";
		String path3 = "c://temp//cad4.csv";
		
		System.out.println("caminho do arquivo: -> c://temp//person.csv");
		ioservice.LerArquivos("c://temp//person.csv");
		ioservice.LerArquivosList(path);
		
		System.out.println(" -> Ler e escrever  arquivo");
		ioservice.WriteFileCadastro(path1, path2);
		
		ioservice.WriteFileCadastroCreate(path3, path2);
	}
}
