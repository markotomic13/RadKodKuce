package com.ZadaciZaVjezbanje;

/*Napisati program kojim se provjerava da li se tačka nalazi unutar 
pravouganika. Za pravougaonik su date koordinate gornjeg lijevog i donjeg 
desnog tjemena.*/

import java.util.Scanner;

public class TackaUnutarPravougaonika {

	public static void main(String[] args) {
		
		Scanner unos = new Scanner(System.in);
		
		System.out.print("Unesite koordinate gornje lijeve tacke: ");
		double x1 = unos.nextDouble();
		double y1 = unos.nextDouble();
		
		System.out.print("Unesite koordinate donje desne tacke: ");
		double x2 = unos.nextDouble();
		double y2 = unos.nextDouble();
		
		System.out.print("Sada kada ste unijeli koordinate u kojima je opisan pravougaonik, unesite tacku koju treba da provjerimo: ");
		double x3 = unos.nextDouble();
		double y3 = unos.nextDouble();
		
		if(x3 > x1 & x3 < x2) {
			if (y3 < y1 & y3 > y2) {
				System.out.printf("Tacka sa koordinatama %.1f i %.1f se nalazi u opisanom pravougaoniku.", x3, y3);
			}
			else {
				System.out.printf("Tacka sa koordinatama %.1f i %.1f se ne nalazi u opisanom pravougaoniku.", x3, y3);
			}
		}
		else {
			System.out.printf("Tacka sa koordinatama %.1f i %.1f se ne nalazi u opisanom pravougaoniku.", x3, y3);
		}
		
		unos.close();
		
	}

}
