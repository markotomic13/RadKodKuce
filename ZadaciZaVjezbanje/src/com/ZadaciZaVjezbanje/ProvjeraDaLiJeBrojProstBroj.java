package com.ZadaciZaVjezbanje;

/*Napisati program kojim se provjerava da li je broj N prost broj.*/

import java.util.Scanner;

public class ProvjeraDaLiJeBrojProstBroj {

	public static void main(String[] args) {
		
		int djeljenik = 2, i = 2;
		
		Scanner unos = new Scanner(System.in);
		
		System.out.print("Unesite broj koji zelite da provjerite da li je prost: ");
		int broj = unos.nextInt();
		
		while(i < broj) {
			if (broj % i == 0) {
				djeljenik++;
				i++;
			}
			else {
				i++;
			}
		}
		if(djeljenik == 2) {
			System.out.printf("Uneseni broj %d je prost broj.", broj);
		}
		else {
			System.out.printf("Uneseni broj %d nije prost broj i djeljiv je sa %d broja.", broj, djeljenik);
		}
		
		unos.close();
	}

}
