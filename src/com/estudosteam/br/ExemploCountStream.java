package com.estudosteam.br;

import java.util.Arrays;
import java.util.List;

public class ExemploCountStream {
	
	
	//Dada uma lista quantos números são pás ?
	public static void main(String[] args) {
		List<Integer> lista = Arrays.asList(1,2,3,4,5,6,7,9,10);
		long count = lista.stream()
		.filter(e -> e % 2 == 0)
		.count();
		System.out.println(count);
	}

}
