package com.br.Arquivos.IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.stereotype.Service;

@Service
public class IOService {

	String path = "c://temp//person.csv";
	File file = new File(path);
	Scanner scan = null;
	
	public void LerArquivos(String path) {
		try {
			File file = new File(path);
			Scanner sc = null;
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());

			}
		} catch (Exception e) {
			e.getMessage();
		}
	}
	
	public void LerArquivosList(String path) {
		try {
			String linha;
			String row[];
			File file = new File(path);
			Scanner sc = null;
			List<IOEntidade> lista = new ArrayList<>();
			
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
				row = sc.nextLine().split(";");
				lista.add(new IOEntidade(row[0],row[1],row[2],row[3],row[4],row[5]));
			}
			sc.close();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	
	public void LerArquivoBuffer(String path) {
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
	
	public void WriteFile() {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
			String[] lines = new String[] { "Oi tudo bem", "sim !", "ok" };
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void WriteFileCadastro(String path1,String path2) {
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path1))) {

				BufferedReader br = new BufferedReader(new FileReader(path2));
				String row = br.readLine();
				String arrayRow[];
				List<IOFileDTO> lista = new ArrayList<>();

			while (row != null) {
				row = br.readLine();
				if(row != null) {
					arrayRow = br.readLine().split(",");
					lista.add(new IOFileDTO(arrayRow[0], arrayRow[1], arrayRow[2], arrayRow[3]));
				}
			}
						
			bw.write("Name"+";"+"Idade"+";"+"Email"+";"+"Phone"+"/n");
			for (IOFileDTO dto : lista) {
				bw.write(" -> : "+dto.getName()+";"+dto.getIdade()+";"+dto.getEmail()+";"+dto.getPhone()+"/n");
				bw.newLine();
			}
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void WriteFileCadastroCreate(String path1,String path2) {
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path1))) {

				BufferedReader br = new BufferedReader(new FileReader(path2));
				String row = br.readLine();
				String arrayRow[];
				List<IOFileDTO> lista = new ArrayList<>();

			while (row != null) {
				row = br.readLine();
				if(row != null) {
					arrayRow = br.readLine().split(",");
					lista.add(new IOFileDTO(arrayRow[0], arrayRow[1], arrayRow[2], arrayRow[3]));
				}
			}
						
			bw.write("Name"+";"+"Idade"+";"+"Email"+";"+"Phone"+"/n");
			for (IOFileDTO dto : lista) {
				bw.write(" -> : "+dto.getName()+";"+dto.getIdade()+";"+dto.getEmail()+";"+dto.getPhone()+"/n");
				bw.newLine();
			}
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
