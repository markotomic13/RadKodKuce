package com.ZadaciZaVjezbanje;

/* Napisati program koji račun X**n koristeći petlju.*/

import java.util.Scanner;

public class BrojNaNekiEksponent {

	public static void main(String[] args) {
		
		Scanner unos = new Scanner (System.in);
		int i = 0;
		double eksponent = 1;
		
		System.out.print("Unesite neki broj: ");
		double x = unos.nextDouble();
		
		System.out.print("Unesite njegov eksponent: ");
		double n = unos.nextDouble();
		
		if(i == n) {
			System.out.printf("Broj %.2f na 0 je 1.", x);
		}
		else {
			if (n > 0) {
				i = 1;
				while(i <= n) {
					eksponent = eksponent * x;
					i++;
				}
				System.out.printf("Broj %.2f na %.0f je %.2f.", x, n, eksponent);
			}
			else {
				n = Math.abs(n);
				i = 1;
				while(i <= n) {
					eksponent = eksponent * x;
					i++;
				}
				System.out.printf("Broj %.2f na %.0f je %f.", x, n, 1 /eksponent);
			}
		}
		unos.close();
	}

}
