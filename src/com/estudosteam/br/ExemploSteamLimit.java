package com.estudosteam.br;

import java.util.Arrays;
import java.util.List;

public class ExemploSteamLimit {
	
	
	//Limita o processamento dos dados a 4 elementos.
	public static void main(String[] args) {
		List<Integer> lista = Arrays.asList(1,2,3,4,5,6,6,8,10);
		lista.stream()
		.limit(4)
		.forEach(e -> System.out.println(e));
		
	}

}
