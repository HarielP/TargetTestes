package Questões;

import java.util.Scanner;

public class Questão5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		
		String entrada = "";
		String saida = "";
		
		System.out.println("Digite uma palavra para inverter : ");
		entrada = teclado.next();
		
		
		for(int i = entrada.length() - 1 ; i>=0 ; i-- ) {
			
			entrada.charAt(i);
			saida = saida + entrada.charAt(i);
			}
		
		System.out.println("O resultado é : " + saida);
		
		
		
		
		
	}

}
