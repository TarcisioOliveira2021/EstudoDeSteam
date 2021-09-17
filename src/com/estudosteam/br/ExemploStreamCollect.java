package com.estudosteam.br;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ExemploStreamCollect {

static final List<Integer> lista = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,12);
		
	public static void main(String[] args) {
		
		//Armazena todo o dado do stream em uma nova lista.
		List<Integer> novaLista = lista.stream()
			.collect(Collectors.toList());
		System.out.println(novaLista);
		exemploStreamCollectors();
		groupByCollector();
		groupByCollector2();
		joiningCollector();
		joiningCollector2();
	}
	
	public static void exemploStreamCollectors () {		
		//Armaze 4 numeros pares e depois some + 1
		List<Integer> novaLista = lista.stream()
				.filter(e -> e % 2 == 0)
				.limit(4)
				.map(e -> e + 1)
				.collect(Collectors.toList());
			//Saida esperada : 3,5,7,9
			System.out.println(novaLista);
	}
	
	//Multiplica cada número do stream por 3.
	//Agrupa em um mapa onde true = pares | false = impares.
	//O mapa boleano tem a ver com a comparação ==
	public static void groupByCollector() {
		Map<Boolean, List<Integer>> mapa = lista.stream()
			.map(e -> e * 3)
			.collect(Collectors.groupingBy(e -> e % 2 == 0 ));
		System.out.println(mapa);
	}
	
	//Observamos que agora temos um mapa integer
	//pois o agrupamento está sendo pelo resto da divisão por 3.
	//Divide todos os elementos da lista por 3 armazena o resto dessa divisão.
	//e agrupa em um mapa de inteiros.
	public static void groupByCollector2() {
			Map<Integer, List<Integer>> mapa = lista.stream()
				.collect(Collectors.groupingBy(e -> e % 3));
			System.out.println(mapa);	
	}
	
	//joinig agrupa strings
	public static void joiningCollector() {
		String collect = lista.stream()	//Junta toda a lista em uma string.
			.map(e -> String.valueOf(e)) //converte a lista em string.
			.collect(Collectors.joining());
		System.out.println(collect);
	}
	
	//Joining concatecando a string
	public static void joiningCollector2() {
		String collect = lista.stream() 
				.map(e -> String.valueOf(e)) 
				.collect(Collectors.joining("-"));	//ajuda para gerar csv.
		System.out.println(collect);
	}
	
}
