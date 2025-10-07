package com.ZadaciZaVjezbanje;

/* Napisati program koji provjerava da li se od pravouganika poznatih 
dimenzija stranica mogu napraviti bar dva kvadrata čija je dužina ista kao i 
dužina pravouganika. */

import java.util.Scanner;

public class DvaKvadrataOdPravougaonika {

	public static void main(String[] args) {
		
		Scanner unos = new Scanner(System.in);
		
		System.out.print("Unesite duzinu pravougaonika: ");
		double duzina = unos.nextDouble();
		
		System.out.print("Unesite sirinu pravougaonika: ");
		double sirina = unos.nextDouble();
		
		if(sirina < duzina) {
			int brojKvadrata = (int)(duzina / sirina);
					if (brojKvadrata >= 2) {
						System.out.printf("U pravougaonik stranice duzine %.2f i stranice sirine %.2f mogu se napraviti dva ili vise kvadrata", duzina, sirina);
					}
					else {
						System.out.printf("U pravougaonik stranice duzine %.2f i stranice sirine %.2f ne mogu se napraviti dva ili vise kvadrata", duzina, sirina);
					}
		}
		else {
			System.out.printf("U pravougaonik stranice duzine %.2f i stranice sirine %.2f ne mogu se napraviti dva ili vise kvadrata", duzina, sirina);
		}
		
		unos.close();
		
	}

}
