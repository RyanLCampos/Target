package atividade.fibonacci;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe um numero: ");
		int num = entrada.nextInt();
		
		Fibonnaci(num);
		
		entrada.close();
	}
	
	public static void Fibonnaci(int numero) {
		int aux = 1;
		int aux_2 = 0;
		boolean resposta = false;
		System.out.println("");
		while(aux <= numero) {
			System.out.print(aux_2 + ", " + aux + ", ");
			aux_2 += aux;
			aux += aux_2;
			
			if(numero == aux || numero == aux_2) {
				resposta = true;
			}
		}
		
		System.out.println("\n\n===== ===== Resposta ===== =====");
		if(resposta == true) {
			System.out.println("\nNúmero pertence a sequencia de Fibonacci!");
		}else {
			System.out.println("\nNúmero não pertence a sequencia de Fibonacci!");
		}
		
	}

}
