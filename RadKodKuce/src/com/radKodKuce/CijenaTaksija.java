package com.radKodKuce;

/*Ako je cijena taksija za jedan kilometar 0.5e, a početna cijena je 1e, napisati program koji 
za unijeti broj pređenih kilometara računa cijenu vožnje.*/

import java.util.Scanner;
public class CijenaTaksija {

	public static void main(String[] args) {
		
		Scanner unos = new Scanner (System.in);
		
		System.out.print("Unesite broj predjenih kilometara: ");
		
		double km = unos.nextDouble();
		
		double cijena = 1 + km*0.5;
		
		System.out.printf("Ukupna cijena koju obracunava taksi za predjenih %.2fkm iznosi %.2f€.", km, cijena);
		
		unos.close();

	}

}
