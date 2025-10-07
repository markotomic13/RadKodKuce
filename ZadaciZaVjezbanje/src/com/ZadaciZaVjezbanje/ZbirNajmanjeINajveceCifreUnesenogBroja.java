package com.ZadaciZaVjezbanje;

/*Napisati program koji računa zbir najmanje i najveće cifre unesenog broja. */

import java.util.Scanner;

public class ZbirNajmanjeINajveceCifreUnesenogBroja {

	public static void main(String[] args) {
		
		Scanner unos = new Scanner(System.in);
		
		System.out.print("Unesite broj: ");
		int broj = unos.nextInt();
		broj = Math.abs(broj);
		int cifra;
		
		int najmanja = 9;
		int najveca = 0;
		
		if(broj > 9) {
			while(broj != 0) {
				cifra = broj % 10;
				if (cifra > najveca) {
					najveca = cifra;
					broj /= 10;
				}
				else if (cifra < najmanja) {
					najmanja = cifra;
					broj /= 10;
				}
				else {
					broj /= 10;
				}
			}
			int zbir = najmanja + najveca;		
			System.out.print("Zbir najmanje unesene i najvece unesene cifre je "+ zbir+".");
		}
		else if (broj == 0){
			System.out.print("Unijeli ste broj 0, tako da nije moguce izracunati.");
		}
		else {
			System.out.print("Unijeli ste jednocifren broj, tako da je rjesenje broj "+ broj + ".");
		}
		
		unos.close();
	}

}

