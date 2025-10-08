package com.ZadaciZaVjezbanje;

/*Napisati program koji sabira sve cifre unijetog broja i računa aritmetičku 
sredinu cifara tog broja. */

import java.util.Scanner;

public class Zadatak33 {
	
	public static void main(String[] args) {
		
		Scanner unos = new Scanner(System.in);
		
		System.out.print("Unesite prirodan broj N: ");
		int N = unos.nextInt();
		int i = 0;
		double aritmetickaSredina = 0, sumaCifara = 0;
		
		while (N != 0) {
			int cifra = N % 10;
			sumaCifara += (double)cifra;
			N /= 10;
			i++;
		}
		
		aritmetickaSredina = sumaCifara / i;
		
		System.out.printf("Suma cifara unesenog broja je %.2f dok je aritmeticka sredina %.2f.", sumaCifara, aritmetickaSredina);
	
		unos.close();
	}

}
