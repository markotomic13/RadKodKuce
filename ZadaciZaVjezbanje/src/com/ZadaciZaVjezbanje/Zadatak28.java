package com.ZadaciZaVjezbanje;

/*Napisati program koji za zadato x računa y i to na sledeći način: 
 y = -2x + 7/2, x <= -7
 y = (x² - 3x + 5) / (x² + 2), -7 < x < 1
 y = (x² + 2x + 2)½ + (|3/2x - 4/7|)½, 1<= x <= 8
 y = |3/x² - 11x|, x > 8
*/

import java.util.Scanner;

public class Zadatak28 {

	public static void main(String[] args) {
		
		Scanner unos = new Scanner(System.in);
		
		System.out.print("Unesite broj X: ");
		double x = unos.nextDouble();
		double y = 0;
		
		if (x <= -7)
			y = (-2 * x) + (double)7/2;
		
		else if (x > -7 & x < 1)
			y = (Math.pow(x, 2) + 3 * x + 5) / (Math.pow(x, 2) + 2);
		
		else if (x >= 1 & x <= 8)
			y = Math.sqrt(Math.pow(x, 2) + 2 * x + 2) + Math.sqrt(Math.abs((3 / 2) * x - (4 / 7)));
		
		else
			y = Math.abs(3 / Math.pow(x, 2) - 11 * x);
		
		System.out.printf("S obzirom da je unesena cifra %.2f, prema uslovu zadatka y = %.2f.", x, y);
		
		unos.close();

	}

}
