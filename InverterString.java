package atividade.string;

import java.util.Scanner;

public class InverterString {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe um texto: ");
		String texto = entrada.nextLine();
		inverterString(texto);
		
		entrada.close();

	}
	
	public static void inverterString(String texto) {
		String textoInvertido = "";
		
		for(int i = texto.length() - 1; i >=0; i--) {
			textoInvertido = textoInvertido + texto.charAt(i);
		}
		
		System.out.println("Texto invertido é: " + textoInvertido);
	}

}
