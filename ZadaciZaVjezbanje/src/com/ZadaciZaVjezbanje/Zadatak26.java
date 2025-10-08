package com.ZadaciZaVjezbanje;

/* Vaš zadatak je da napišete program kojim ćete provjeriti da li se mrav kreće 
po ivici stola. Geometrijski, mrav se predstavlja kao tačka, a za sto su poznate 
tjemena desne gornje i lijeve donje ivice stola. Radi jednostavnosti smatrati da 
je sto pravouganik, ne kvadar. */

import java.util.Scanner;

public class Zadatak26 {

	public static void main(String[] args) {
		
		Scanner unos = new Scanner(System.in);
		
		System.out.print("Unesite koordinate  tjemena gornje desne ivice stola: ");
		double x1 = unos.nextDouble();
		double y1 = unos.nextDouble();
		
		
		System.out.print("Unesite koordinate tjemena donje lijeve ivice stola: ");
		double x2 = unos.nextDouble();
		double y2 = unos.nextDouble();
		
		
		System.out.print("Unesite koordinate na kojima se nalazi mrav: ");
		double x3 = unos.nextDouble();
		double y3 = unos.nextDouble();
		
		if (x3 >= x2 & x3<= x1) {
			if ( y3 == y2 | y3 == y1 ) 
				System.out.print("Mrav se krece po ivici stola.");
			else if (y3 > y2 & y3< y1) {
				if ( x3 == x2 | x3 == x1 ) 
					System.out.print("Mrav se krece po ivici stola.");
				else
					System.out.print("Mrav se ne krece po ivici stola.");
			}
			else
				System.out.print("Mrav se ne krece po ivici stola.");
		}
		else
			System.out.print("Mrav se ne krece po ivici stola.");
		
		unos.close();
	}

}
