package com.estudosteam.br;

import java.util.Arrays;
import java.util.List;

public class EstudoDeSteamJava8 {
	//Steams so usam lambda
	public static void main(String[] args) {
		List<Integer> lista = Arrays.asList(1,2,3,4,5,6,6);
	
		//Forma intera��o java 4
//		for (Iterator<Integer> iterator = lista.iterator(); iterator.hasNext();) {
//			Integer integer = (Integer) iterator.next();
//			System.out.println(integer);
//		}
		
		//Forma de intera��o java 5
		// -> N�o mechemos na lista enquanto interamos.
//		for (Integer integer : lista) {
//			System.out.println(integer);
//		}
		
		//Forma de intera��o usando o java 8
		//Stream = fluxo de dados.
		lista.stream().forEach(e -> System.out.println(e));
	}
}
