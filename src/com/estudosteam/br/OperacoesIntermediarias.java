package com.estudosteam.br;

import java.util.Arrays;
import java.util.List;

public class OperacoesIntermediarias {
	
	public static void main(String[] args) {
		
		
		List<Integer> lista = Arrays.asList(1,2,3,4,5,6,6);
		
		lista.stream()
			//Operações intermediárias
		
			//Ignora uma quantidade x de elementos dentro do fluxo.
			//Saida esperada = 3,4,5,6,6
			//.skip(2)
			
			//Limita a processar x elementos.
			//Saida esperada = 1,2
			//.limit(2)
			
			//Não permite elementos repetidos.
			//Saida esperada: 1,2,3,4,5,6
			//.distinct()	//Usa equals e hashcode
		
			//Saida esperada: 3,4,5,6
			//.skip(2)
			//.limit(4)
			//.distinct()
			
			//Permite filtrar pelo oque desejamos. 
			//Caso o e ( elemento ) for par ele vai para o forEach
			//Saida esperada 2,4,6,6
			//.filter(e -> e%2 == 0)
			
		
			//Realiza transformações no elemento que está passando no stream.
			//Saida esperada: 2,4,6,8,10,12,12
			//.map(e -> e * 2)	A lista original não é modificada.
			
		
			//Filtros - antes do map
			.limit(4)	
			.map(e -> e * 5)
			//Saida esperada: 5,10,15,20
			.forEach(e -> System.out.println(e));
		
		}
}
