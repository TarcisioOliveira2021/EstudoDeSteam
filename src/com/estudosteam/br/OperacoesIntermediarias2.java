package com.estudosteam.br;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class OperacoesIntermediarias2 {

	public static void main(String[] args) {

		List<Integer> lista = Arrays.asList(1,2,3,4,5,6,6);
		
		//Imprimi os menores valores pares
		Optional<Integer> min = lista.stream()
			.filter(e -> e % 2 ==0)
			.min(Comparator.naturalOrder());	
		System.out.println(min.get());
	}

}
