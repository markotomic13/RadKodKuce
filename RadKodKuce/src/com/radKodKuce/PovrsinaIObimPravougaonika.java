package com.radKodKuce;

/* Napisati program koji računa površinu i obim pravougaonika na osnovu zadatih dimenzija 
a i b.*/

import java.util.Scanner;
public class PovrsinaIObimPravougaonika {

	public static void main(String[] args) {
		
		Scanner unos = new Scanner(System.in);
		double a, b, P, O;
		
		System.out.print("Unesite duzinu stranice a: ");
		a = unos.nextDouble();
		
		System.out.print("Unesite duzinu stranice b: ");
		b = unos.nextDouble();
		
		P = a*b;
		O = 2*a + 2*b;
		
		System.out.printf("Po unesenim stranicama a = %.2f i b = %.2f,\nPovrisina ovog pravougaonika je %.2f \nDok obim ovog pravougaonika iznosi %.2f", a, b, P, O);
		
		unos.close();
		
	}

}
