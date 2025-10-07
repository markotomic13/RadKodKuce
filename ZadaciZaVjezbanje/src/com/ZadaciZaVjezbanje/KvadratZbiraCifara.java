package com.ZadaciZaVjezbanje;

/* Dat je četvorocifreni prirodan broj. Napisati program koji prikazuje kvadrat 
zbira cifara tog broja. */

import java.util.Scanner;

public class KvadratZbiraCifara {

	public static void main(String[] args) {
		
		Scanner unos = new Scanner(System.in);
		
		System.out.print("Unesite cetvorocifren broj: ");
		int broj = unos.nextInt();
		
		if (broj>=1000 & broj<=9999) {
			double kvadratZbira = Math.pow(broj%10 + broj/10%10 + broj/10/10%10 + broj/1000, 2);
			System.out.printf("Kvadrat zbira cifara unesenog broja je %.0f.", kvadratZbira);
		}
		else {
			System.out.print("Niste unijeli cetvorocifren broj.");
		}
		unos.close();
		
	}

}
