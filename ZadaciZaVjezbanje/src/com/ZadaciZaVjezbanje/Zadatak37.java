package com.ZadaciZaVjezbanje;

/*U gradu su ulice raspoređene kao kvadratna mreža (grid). Policijska stanica 
nalazi se na koordinatama (x0, y0). U gradu se desilo N incidenata na 
lokacijama (xi,yi). Manhattan rastojanje između dvije tačke definiše se kao: 
d = ∣xi −x0 ∣ + ∣yi −y0 ∣. Potrebno je izračunati za svaki incident Manhattan 
rastojanje do stanice i ispisati ga, a zatim na kraju odrediti i koji incident je bio 
najbliži, a koji najdalji stanici. */

import java.util.Scanner;

public class Zadatak37 {

	public static void main(String[] args) {
		
		Scanner unos = new Scanner(System.in);
		
		System.out.println("Unesite koordinate policijske stanice: ");
		double x0 = unos.nextDouble();
		double y0 = unos.nextDouble();
		
		double xi, yi, d, najbliziIncident = 0, najdaljiIncident = 0;
		int redniBrojIncidenta = 0, redniBrojIncidenta1 = 0;
		
		System.out.println("Unesite koliko se incidenata desilo u gradu: ");
		int brojIncidenta = unos.nextInt();
		
		for(int i = 1 ; i <= brojIncidenta ; i++) {
			System.out.println("Unesite koordinate "+ i + ". incidenta:");
			xi = unos.nextDouble();
			yi = unos.nextDouble();
			
			d = Math.abs(x0 - xi) + Math.abs(y0 - yi);
						
			System.out.printf("Menhetn rastojanje incidenta broja " + i + " iznosi %.2f.\n\n", d);
			
			if (d > najdaljiIncident) {
				najdaljiIncident = d;
				redniBrojIncidenta = i;
				if (najbliziIncident == 0) {
					najbliziIncident = d;
					redniBrojIncidenta1 = i;
				}
			}
			else if (d < najbliziIncident) {
				najbliziIncident = d;
				redniBrojIncidenta1 = i;
			}
			
		}
		System.out.printf("Najblizi incident se nalazio na Menhetn razdaljini od %.2f i u pitanju je %d. incident.\n\n", najbliziIncident, redniBrojIncidenta1);
		System.out.printf("Najudaljeniji incident se nalazio na Menhetn razdaljini od %.2f i u pitanju je %d. incident.", najdaljiIncident, redniBrojIncidenta);
		
		
		unos.close();
	}

}
