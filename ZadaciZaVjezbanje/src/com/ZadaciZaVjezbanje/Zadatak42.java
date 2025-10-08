package com.ZadaciZaVjezbanje;
/*  Dvorac se nalazi u centru na koordinatama (0, 0). Na polju je N neprijateljskih 
katapulta. Katapult može da pogodi dvorac ako mu je Manhattan rastojanje do 
centra manje ili jednako određenoj vrijednosti D. Potrebno je odrediti koliko 
katapulta predstavlja prijetnju. Osim toga, provjeriti da li će katapulti koji 
predstavljaju prijednju srušiti dvorac ispaljivanjem po jednog hica, ako je 
poznato za dvorac da ima health HD, a da je za svaki katapult ima istu 
vrijednost napada KA (zbir svih KA iz dometa >= HD).*/

import java.util.Scanner;

public class Zadatak42 {

	public static void main(String[] args) {
		
		Scanner unos = new Scanner(System.in);
		
		double x0 = 0;
		double y0 = 0;
		int brojPrijetnji = 0;
		
		System.out.print("Koliko dvorac ima HD health?: ");
		double HD = unos.nextInt();
		
		System.out.print("Unesite N broj neprijateljskih katapulta: ");
		int N = unos.nextInt();
		
		System.out.print("Unesite D domet katapulta: ");
		int D = unos.nextInt();
		
		System.out.print("Unesite KA jacinu napada katapulta: ");
		int KA = unos.nextInt();
		
		for (int i = 1 ; i <= N ; i++) {
			System.out.print("Unesite koordinate katapulta broj " + i + ": \n");
			int xK = unos.nextInt();
			int yK = unos.nextInt();
			
			if (Math.sqrt(Math.pow(xK - x0, 2) + Math.pow(yK - y0, 2)) <= D) 
				brojPrijetnji += 1;
			
		}
		System.out.printf ("\n%d katapulta predstavlja opasnost po nas dvorac.\n\n", brojPrijetnji);
		
		HD = HD - KA * brojPrijetnji;
		
		if (HD <= 0)
			System.out.print("Nas dvorac je srusen.");
		else
			System.out.printf("Nas dvorac je prezivio i ostalo mu je %.2f health-i.", HD);
		
		unos.close();
	}

}
