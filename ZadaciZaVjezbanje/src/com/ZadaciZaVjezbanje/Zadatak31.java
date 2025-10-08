package com.ZadaciZaVjezbanje;

/*Za 𝑁 vozača unosi se brzina. Dozvoljena brzina je 50 km/h. Ako vozač pređe 
brzinu, kazna je 10€ za svaki km/h preko limita. Program računa ukupnu 
sumu kazni. */

import java.util.Scanner;

public class Zadatak31 {

	public static void main(String[] args) {
		
		Scanner unos = new Scanner (System.in);
		
		System.out.print("Unesite broj N vozaca: ");
		int N = unos.nextInt();
		double sumaKazni = 0;
		for (int i = 1 ; i <= N ; i++) {
			
			System.out.print("Unesite brzinu po kojoj je isao " + i + ". vozac: ");
			double brzina = unos.nextDouble();
			
			if (brzina > 50) {
				sumaKazni += (brzina - 50) * 10;
			}	
			
		}
		
		System.out.printf("Ukupna suma kazni je %.2f€.", sumaKazni);
		
		unos.close();

	}

}
