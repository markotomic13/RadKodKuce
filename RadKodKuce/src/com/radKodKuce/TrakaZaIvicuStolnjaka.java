package com.radKodKuce;

/* Napisati program kojim se izračunava potrebna dužina trake za ivicu stoljnjaka kružnog 
oblika čija je površina P*/

import java.util.Scanner;
public class TrakaZaIvicuStolnjaka {

	public static void main(String[] args) {
		
		Scanner unos = new Scanner(System.in);
		
		System.out.print("Unesite povrsinu stolnjaka: ");
		
		double P = unos.nextDouble();
		
		double r = Math.sqrt(P / Math.PI);
		
		double O = 2 * r * Math.PI;
		
		System.out.printf("Duzina trake koja je potrebna za ivicu stolnjaka povrsine %.2f izosi %.2f", P, O);
		
		unos.close();

	}

}
