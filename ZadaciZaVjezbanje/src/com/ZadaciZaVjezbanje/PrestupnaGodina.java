package com.ZadaciZaVjezbanje;

/* Napisati program koji za datu godinu određuje da li je prestupna i štampa 
odgovarajuću poruku. */

import java.util.Scanner;

public class PrestupnaGodina {

	public static void main(String[] args) {
		
		Scanner unos = new Scanner(System.in);
		
		System.out.print("Unesite godinu koju zelite da provjerite da li je prestupna: ");
		int godina = unos.nextInt();
		
		if (godina % 4 == 0 ) {
			if (godina % 100 == 0) {
				if (godina % 400 == 0) {
					System.out.printf("Godina %d je prestupna.", godina);
				}
				else {
					System.out.printf("Godina %d je nije prestupna.", godina);
				}
			}
			else if(godina % 4 == 0) {
				System.out.printf("Godina %d je prestupna.", godina);
			}
		}
		else {
			System.out.printf("Godina %d je nije prestupna.", godina);
		}
		
		unos.close();
		
	}

}
