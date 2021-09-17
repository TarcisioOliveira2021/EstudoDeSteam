package com.estudosteam.br;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class ExemploSteamMax {
	
	
	//Imprimi o maior valor encontrado na lista ( usa o comparator da classe Integer ).
	public static void main(String[] args) {
		List<Integer> lista = Arrays.asList(1,2,3,4,5,6,7,8,9,11,11);
		Optional<Integer> max = lista.stream()
				.max(Comparator.naturalOrder());
		//Caso não tenha o max ele escreve OPCIONAL + o que foi guardado ).
		System.out.println(max.get());	//Mostra apenas o número armazenado no stream. 
		
	}

}
