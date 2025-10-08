package com.ZadaciZaVjezbanje;

/* Napisati program  koji računa zbir parnih cifara ukoliko je broj paran, a ukoliko 
je neparan proizvod neparnih cifara četvorocifrenog broja. Broj n unosi 
korisnik. */

import java.util.Scanner;

public class Zadatak25 {

	public static void main(String[] args) {
		
		Scanner unos = new Scanner(System.in);
		
		System.out.print("Unesite broj n: ");
		int n = unos.nextInt();
		
		int indetifikator = n%10;
		
		if (indetifikator == 0 | indetifikator == 2 |indetifikator == 4 |indetifikator == 6 |indetifikator == 8) {
			
			int zbir = 0;
			int cifra;
			while (n != 0) {
				cifra = n % 10;
				if (cifra == 2 | cifra == 4 | cifra == 6 | cifra == 8) {
					zbir += cifra;
					n = n / 10;
				}
				else
					n = n / 10;
			}
			
			System.out.printf("Za unijeti broj (s obzirom da je u pitanju paran broj), zbir njegovih parnih cifara je %d.", zbir);
		}
		else {
			int proizvod = 1;
			int cifra;
			while (n != 0) {
				cifra = n % 10;
				if (cifra == 1 | cifra == 3 | cifra == 5 | cifra == 7 | cifra == 9) {
					proizvod *= cifra;
					n = n / 10;
				}
				else
					n = n / 10;
			}
			System.out.printf("Za unijeti broj (s obzirom da je u pitanju neparan broj), proizvod njegovih neparnih cifara je %d.", proizvod);

		}
		
		unos.close();

	}

}
