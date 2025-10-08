package com.ZadaciZaVjezbanje;

/*Napisati program koji proverava da li su brojevi koji se unose uređeni tako da 
prvo idu negativni, zatim nule i na kraju pozitivni brojevi (moguće je i da bilo 
kojih od navedenih brojeva nema). */

import java.util.Scanner;

public class Zadatak36 {

	public static void main(String[] args) {
		
		Scanner unos = new Scanner(System.in);
		
		System.out.print("Koliko cete brojeva da unesete u program?: ");
		int N = unos.nextInt();
		int i = 1;
		int indikator =  0;
		
		System.out.println("Unesite brojeve: ");
		
		while (i <= N & indikator == 0) {
			
			double broj = unos.nextDouble();
			if(broj < 0)
				i++;
			else
				indikator = 1;
		}
		
		while (i < N & indikator == 1) {
			
			double broj = unos.nextDouble();
			if(broj == 0)
				i++;
			else
				indikator = 2;
		}
		
		while (i < N - 1 & indikator == 2) {
			
			double broj = unos.nextDouble();
			if(broj > 0)
				i++;
			else
				indikator = 3;
		}
		
		if (indikator == 0 | indikator == 1 | indikator == 2)
			System.out.print("Brojevi su uredjeni kako je zadato u postavci zadatka");
		else
			System.out.print("Brojevi nisu uredjeni kako je zadato u postavci zadatka");
		
		unos.close();
	}

}
