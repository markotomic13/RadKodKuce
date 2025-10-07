package com.ZadaciZaVjezbanje;

/* Date su cijene tri proizvoda. Napisati program koji treba da nađe par 
proizvoda čija cijena u zbiru daje najmanju vrijednost.  */

import java.util.Scanner;

public class NajmanjiZbirParaProizvoda {

	public static void main(String[] args) {
		
		Scanner unos = new Scanner(System.in);
		
		System.out.print("Unesite cijenu prvog proizvoda: ");
		double x1 = unos.nextDouble();
		
		System.out.print("Unesite cijenu drugog proizvoda: ");
		double x2 = unos.nextDouble();
		
		System.out.print("Unesite cijenu treceg proizvoda: ");
		double x3 = unos.nextDouble();
		
		if (x1 < x2) {
			if (x1 < x3) {
				if(x2 < x3) {
					double zbir = x1 +x2;
					System.out.printf("Zbir najmanjih cijena je %.2f", zbir);
				}
				else {
					double zbir = x1 +x3;
					System.out.printf("Zbir najmanjih cijena je %.2f", zbir);
				}

			}
			else {
				double zbir = x1 +x3;
				System.out.printf("Zbir najmanjih cijena je %.2f", zbir);
			}
		}
		else if (x1 < x3){
			double zbir = x1 +x2;
			System.out.printf("Zbir najmanjih cijena je %.2f", zbir);
		}
		else {
			double zbir = x2 +x3;
			System.out.printf("Zbir najmanjih cijena je %.2f", zbir);
		}
		unos.close();
	}

}
