package com.ZadaciZaVjezbanje;

/* Napisati program koji za broj N računa aritmetičku sredinu cifara tog broja. */

import java.util.Scanner;

public class Zadatak27 {

	public static void main(String[] args) {
		
		Scanner unos = new Scanner(System.in);
		
		System.out.print("Unesite prirodan broj N: ");
		int N = unos.nextInt();
		int M = N;
		int zbirCifara = 0;
		int i = 0;
		
		
		while(M != 0) {
			i++;
			M /= 10;
		}
		
		while (N!=0) {
			int cifra = N % 10;
			zbirCifara +=cifra;
			N /=10;
		}
		
		double aritmetickaSredina = (double)zbirCifara / i;
		
		System.out.printf("Aritmeticka sredina unesenog broja N je %.2f.", aritmetickaSredina);
		
		unos.close();
	}

}
