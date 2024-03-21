package Questões;

import java.util.Scanner;

public class Questão2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		int a = 0;
		int b = 1;
		int c = 0;
		int v;
		
		
		System.out.println("Digite um número : ");
		v = teclado.nextInt();
		
		while (v > c) {
			c = a + b;
			a = b ;
			b = c;}
		
		if (v == 0 || v ==1) {
		System.out.println("O número pertence a sequência de Fibonacci.");
	} else if (v == c) {
		System.out.println("O número pertence a sequência de Fibonacci.");}
	else {
	System.out.println("O número não pertence a sequência de Fibonnacci.");}

}}
