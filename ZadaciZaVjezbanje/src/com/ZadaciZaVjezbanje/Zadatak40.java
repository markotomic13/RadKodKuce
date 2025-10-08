package com.ZadaciZaVjezbanje;

/*U četvrtom zadatku staza je prsten između krugova sa centrom (cx, cy) i 
poluprečnicima R1<R2 . Unosi se N tačaka (xi,yi). Potrebno je prebrojati trkače 
koji su u prstenu uključujući granice i u gornjoj poluravni yi≥cy . Takođe je 
potrebno izračunati najudaljenijeg trkačima od centra, po eukladskom 
rastojanju. */

import java.util.Scanner;

public class Zadatak40 {

	public static void main(String[] args) {
		
		Scanner unos = new Scanner(System.in);
		
		System.out.println("Unesite koodinate kruga cX i cY: ");
		double cX = unos.nextDouble();
		double cY = unos.nextDouble();
		
		System.out.print("Unesite broj trkaca: ");
		int N = unos.nextInt();
		
		System.out.print("Unesite manji poluprecnik: ");
		double r1 = unos.nextDouble();
	
		System.out.print("Unesite veci poluprecnik: ");
		double r2 = unos.nextDouble();
		
		double najudaljenijaTacka = 0;
		int brojTrkacaUGornjojPoluravni = 0;
		double xNajudaljenijiTrkac = 0;
		double yNajudaljenijiTrkac = 0;
		
		if(r2 < r1)
			System.out.print("Pogresno ste unijeli duzinu poluprecnika");
		else {
			for(int i = 1 ; i<= N ; i ++) {
				System.out.println("Unesite koodinate trkaca broj " + i +": ");
				double x = unos.nextDouble();
				double y = unos.nextDouble();
				
				if(y >= cY) {
					if(Math.sqrt(Math.pow(Math.abs(x)- Math.abs(cX), 2) + Math.pow(Math.abs(y) - Math.abs(cY), 2)) >= r1 &  Math.sqrt(Math.pow(Math.abs(x)- Math.abs(cX), 2) + Math.pow(Math.abs(y) - Math.abs(cY), 2)) <= r2) {
						brojTrkacaUGornjojPoluravni += 1;
						if(Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)) > najudaljenijaTacka) {
							najudaljenijaTacka = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
							xNajudaljenijiTrkac = x;
							yNajudaljenijiTrkac = y;
						}
					}
				}
				else {
					if(Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)) > najudaljenijaTacka) {
						najudaljenijaTacka = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
						xNajudaljenijiTrkac = x;
						yNajudaljenijiTrkac = y;
					}
				}
			}
			
			System.out.printf("Ukupno se nalazi %d trkaca u gornjoj poluravni staze.\nNajudaljeniji igrac od centra igrac sa koordinatama X= %.2f i Y= %.2f i udaljen je za rastojanje u iznosu od %.2f.", brojTrkacaUGornjojPoluravni, xNajudaljenijiTrkac, yNajudaljenijiTrkac, najudaljenijaTacka);
			
			unos.close();
		}
		

	}

}
