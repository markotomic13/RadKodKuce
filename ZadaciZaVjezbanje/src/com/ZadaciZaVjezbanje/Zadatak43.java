package com.ZadaciZaVjezbanje;

/* Napisati program kojim se ispituje da li su sve cifre u dekadnom zapisu datog 
prirodnog broja različite? */

import java.util.Scanner;

public class Zadatak43 {

	public static void main(String[] args) {
		
		Scanner unos = new Scanner(System.in);
		
		System.out.print("Unesite prirodan broj N: ");
		int N = unos.nextInt();
		int M = N;
		int indikator = 0;
		int brojCifara = 0;
		int cifra;
		int cifra2;
		
		if (N > 0) {
			
			while (M!=0) {
				brojCifara += 1;
				M /= 10;
			}
			
			for (int i = 0 ; i < brojCifara; i++) {
				cifra = N % 10;
					for (int p = 1 ; p < brojCifara; p++) {
						cifra2 = N / (int)Math.pow(10, p);
						cifra2 = cifra2 % 10;
						if (cifra == cifra2)
							indikator +=1;
					}
				N /= 10;
			}
			
			if(indikator == 0)
				System.out.print("Sve cifre u unijetom broju su razlicite.");
			else
				System.out.printf("Neke cifre se ponavljaju.");
		
		}
		else
			System.out.print("Nijeste unijeli prirodan broj.");
		
		unos.close();
		
	}

}
