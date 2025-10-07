package com.ZadaciZaVjezbanje;

/*  Korisnik unosi tri broja. Naći minimum i maksimum među unijetim brojevima i 
rezultat prikazati korisniku. */

import java.util.Scanner;

public class MinimumMaksimum {

	public static void main(String[] args) {
		
		Scanner unos = new Scanner(System.in);
		double min, max;
		
		System.out.print("Unesite prvi broj: ");
		double x1 = unos.nextDouble();
		
		System.out.print("Unesite drugi broj: ");
		double x2 = unos.nextDouble();
		
		System.out.print("Unesite treci broj: ");
		double x3 = unos.nextDouble();
		
		min = Math.min(x1, x2);
		
		if (min < x3) {
			System.out.printf("Od unesenih brojeva %.2f, %.2f i %.2f, najmanji broj je %.2f.\n", x1, x2, x3, min);
		}
		else {
			System.out.printf("Od unesenih brojeva %.2f, %.2f i %.2f, najmanji broj je %.2f.\n", x1, x2, x3, x3);
		}
		
		max = Math.max(x1, x2);
		
		if (max > x3) {
			System.out.printf("Od unesenih brojeva %.2f, %.2f i %.2f, najveci broj je %.2f.", x1, x2, x3, max);
		}
		else {
			System.out.printf("Od unesenih brojeva %.2f, %.2f i %.2f, najveci broj je %.2f.", x1, x2, x3, x3);
		}
		
		unos.close();
	}

}
