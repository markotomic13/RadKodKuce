package com.ZadaciZaVjezbanje;

/* Za 𝑁 zaposlenih unosi se plata. Ako je plata ≤ 1000€, porez je 10%, inače 
20%. Program računa ukupnu sumu poreza koje firma mora da uplati. */

import java.util.Scanner;

public class Zadatak32 {

	public static void main(String[] args) {
		
		Scanner unos = new Scanner(System.in);
		
		System.out.print("Unesite N broj zaposlenih: ");
		int N = unos.nextInt();
		double sumaPoreza = 0;
		
		for(int i = 1 ; i <= N ; i++) {
			
			System.out.print("Unesite platu " + i + ". zaposlenog: ");
			double plata = unos.nextDouble();
			
			if(plata <= 1000)
				sumaPoreza += (plata * 10) / 100;
			else
				sumaPoreza += (plata * 20) / 100;
		}
		
		System.out.printf("Firma mora da plati %.2f€ poreza.", sumaPoreza);
		
		unos.close();

	}

}
