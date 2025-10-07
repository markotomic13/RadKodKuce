package com.radKodKuce;
/* Zamislite da ste dobili tajanstveno pismo sa mapom i uputstvima za pronalaženje 
skrivenog blaga. Uputstva su sljedeća: "Trebate da krenete od starog hrasta koji ima 
sledeću poziciju G (x1,y1). Onda trebate ići pravo do stare kuće koja se nalazi na poziciji 
K(x2,y2). Blago je zakopano u susjedstvu, gdje se nalazi kuća, i to desno od pozicije kuće za 
dvije pozicije, i ispod za tri pozicije. Izračunajte koordinate blaga. Izračunajte (vazdušno) 
rastojanje od hrasta do blaga. Izračunajte rastojanje od hrasta do blaga tako da morate 
obići i kuću.*/

import java.util.Scanner;

public class SkrivenoBlago {

	public static void main(String[] args) {
		
		Scanner unos = new Scanner(System.in);
		
		System.out.print("Unesite koordinate starog hrasta: ");
		
		double x1 = unos.nextDouble();
		double y1 = unos.nextDouble();
		
		System.out.print("Unesite koordinate stare kuce: ");
		
		double x2 = unos.nextDouble();
		double y2 = unos.nextDouble();
		
		double x3 = x2 + 2;
		double y3 = y2 - 3;
		
		double razdaljinaHrastBlago = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y1 - y3, 2));
		double razdaljinaBlagoKucaHrast = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)) + Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y2 - y3, 2));;
		
		System.out.printf("Koordinate blaga su %.0f i %.0f\n", x3, y3);
		System.out.printf("Vazdusna razdaljina izmedju starog hrasta i blaga je %.2f\n", razdaljinaHrastBlago);
		System.out.printf("Razdaljina koju moramo preci od blaga do stare kuce i od stare kuce do hrasta iznosi %.2f", razdaljinaBlagoKucaHrast);
		
		unos.close();

	}

}
