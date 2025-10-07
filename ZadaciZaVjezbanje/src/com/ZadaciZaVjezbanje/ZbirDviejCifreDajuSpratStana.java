package com.ZadaciZaVjezbanje;

/* Dat je petocifreni prirodan broj koji predstavlja broj stambene jedinice u 
zgradi. Na osnovu zadatog broja potrebno je odrediti sprat na kome se nalazi 
stambena jedinica. Poznato je da se to može otkriti kada se na vrijednost 
pretposlednje cifre zadatog broja doda vrijednost poslednje cifre. Štampati taj 
zbir. */

import java.util.Scanner;

public class ZbirDviejCifreDajuSpratStana {

	public static void main(String[] args) {
		
		Scanner unos = new Scanner(System.in);
		
		System.out.print("Unesite broj stana ciji je broj petocifren: ");
		int brojStana = unos.nextInt();
		
		if(brojStana>=10000 & brojStana <= 99999) {
			int petaCifra = brojStana % 10;
			brojStana = brojStana / 10;
			int cetvrtaCifra = brojStana % 10;
			int sprat = cetvrtaCifra + petaCifra;
			
			System.out.printf("Stan se nalazi na %d. spratu.", sprat);
		}
		else {
			System.out.print("Niste unijeli petocifren broj.");
		}
		unos.close();
	}

}
