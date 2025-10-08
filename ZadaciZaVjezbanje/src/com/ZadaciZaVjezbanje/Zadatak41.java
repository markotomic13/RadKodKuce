package com.ZadaciZaVjezbanje;
/*Čarobnjak se nalazi u tački (x0,y0). Na bojnom polju se pojavljuje N neprijatelja 
na koordinatama (xi,yi). Čarobnjak baca magiju koja pogađa sve neprijatelje 
unutar kruga poluprečnika R. Potrebno je prebrojati koliko neprijatelja je 
pogođeno i naći onog najbližeg neprijatelja od čarobranja (njega magija 
automatski eleminiše). Za provjeru pripadnosti krugu koristi se uslov 
(xi−x0)2+(yi−y0)2 ≤ R2. */

import java.util.Scanner;

public class Zadatak41 {

	public static void main(String[] args) {
		
		Scanner unos = new Scanner(System.in);
		
		System.out.println("Unesite koordinate carobnjaka: ");
		System.out.print("X: "); double x0 = unos.nextDouble();
		System.out.print("Y: "); double y0 = unos.nextDouble();
		System.out.print("Unesite domet carobnjakovih magija: "); 
		double R = unos.nextDouble();
				
		System.out.print("\nUnesite broj neprijatelja N: ");
		int N = unos.nextInt();
		
		double najbliziNeprijatelj = R + 1000;
		int brojNeprijateljaUDometu = 0;
		int redniBrojNeprijatelja = 0;
		double xNajblizegNeprijatelja = 0, yNajblizegNeprijatelja = 0;
		
		for (int i = 1 ; i <= N ; i++) {
			System.out.println("Unesite koordinate neprijatelja broj " + i + ": ");
			System.out.print("X: "); double x = unos.nextDouble();
			System.out.print("Y: "); double y = unos.nextDouble();
			
			if (Math.sqrt(Math.pow(x - x0, 2) + Math.pow(y - y0, 2)) <= R)
				brojNeprijateljaUDometu += 1;
				if (Math.sqrt(Math.pow(x - x0, 2) + Math.pow(y - y0, 2)) < najbliziNeprijatelj) {
					najbliziNeprijatelj = Math.sqrt(Math.pow(x - x0, 2) + Math.pow(y - y0, 2));
					xNajblizegNeprijatelja = x;
					yNajblizegNeprijatelja = y;
					redniBrojNeprijatelja = i;
				}
			
		}
		
		System.out.printf("U dometu carobnjakovih magija se ukupno nalazi %d neprijatelja\n", brojNeprijateljaUDometu);
		System.out.printf("Dok je njemu najblizi nepijatelj pod rednim brojem %d, na kordinatama X = %.2f i Y = %.2f\nI udaljen je %.2f.", redniBrojNeprijatelja, xNajblizegNeprijatelja, yNajblizegNeprijatelja, najbliziNeprijatelj);

		unos.close();
	}

}
