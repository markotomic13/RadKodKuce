package com.ZadaciZaVjezbanje;

/*Dato je rastojanje u centimetrima između ulaza u dvije različite kancelarije. 
Napisati program koji određuje koliko cijelih metara ima u tom rastojanju. Npr. 
324cm imaju 3 metra. */

import java.util.Scanner;

public class RastojanjeUlazaDvijeRazliciteKancelarije {

	public static void main(String[] args) {
		
		Scanner unos = new Scanner(System.in);
		
		System.out.print("Unesite rastojanje izmedju ulaza dvije kancelarije u centimetrima: ");
		float rastojanje = unos.nextFloat();
		
		int cijeloRastojanje = (int)(rastojanje);
		
		System.out.printf("Rastojanje izmedju ulaza dvije kancelarije je %d cijela metra.", cijeloRastojanje/100);
		
		unos.close();
		

	}

}
