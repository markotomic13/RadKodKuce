package com.ZadaciZaVjezbanje;

/*Dat je četvorocifreni prirodan broj koji predstavlja broj stambene jedinice u 
zgradi. Na osnovu zadatog broja potrebno je odrediti sprat na kome se nalazi 
stambena jedinica. Poznato je da se to može otkriti iz pretposlednje cifre 
zadatog broja.*/

import java.util.Scanner;

public class BrojStanaDajeSprat {

	public static void main(String[] args) {
		
		Scanner unos = new Scanner(System.in);
		
		System.out.print("Unesite broj stana, i neka to budu cetiri cifre: ");
		int brojStana = unos.nextInt();
		
		if(brojStana <= 9999 & brojStana >= 1000) {
			int trocifrenBroj = brojStana/10;
			int sprat = trocifrenBroj % 10;
			System.out.printf("Stan se nalazi na %d spratu.", sprat);
		}
		else {
			System.out.print("Niste unijeli cetvorocifren broj. Pokusajte opet: ");
			brojStana = unos.nextInt();
			unos.close();
			return;
		}
		
		unos.close();
		
	}

}
