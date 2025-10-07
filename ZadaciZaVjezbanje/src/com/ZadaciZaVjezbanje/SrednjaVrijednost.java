package com.ZadaciZaVjezbanje;

/*Napisati program koji za unijete parametre a i b vraća srednju vrijednost.  
Npr. ako je a = 2, b = 3, rezultat funkcije treba da bude 2.5. Ako je a = -2, b = 
4, rezultat treba da bude 1. Ako je a = -4, b = 2, rezultat treba da bude - 1. */

import java.util.Scanner;
public class SrednjaVrijednost {

	public static void main(String[] args) {
		
		Scanner unos = new Scanner(System.in);
		
		double a, b;
		
		System.out.print("Unesite parametar a: ");
		a = unos.nextDouble();
		
		System.out.print("Unesite parametar b: ");
		b = unos.nextDouble();
		
		
		System.out.printf("Za unijete paramete %.2f i %.2f iznosi %.2f.", a, b, (a+b)/2);
		
		unos.close();
		
	}

}
