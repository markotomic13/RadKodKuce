package com.ZadaciZaVjezbanje;

/*Za četiri grada poznat je ukupan broj stanovnika (po gradu). Naći prosjek 
broja stanovnika za te gradove. */

import java.util.Scanner;

public class ProsjekBrojaStanovnika {

	public static void main(String[] args) {
		
		Scanner unos = new Scanner (System.in);
		
		System.out.print("Unesite broj stanovnika u Bijelom Polju: ");
		int BijeloPolje = unos.nextInt();
		
		System.out.print("Unesite broj stanovnika u Rozaje: ");
		int Rozaje = unos.nextInt();
		
		System.out.print("Unesite broj stanovnika u Podgorica: ");
		int Podgorica = unos.nextInt();
		
		System.out.print("Unesite broj stanovnika u Niksic: ");
		int Niksic = unos.nextInt();
		
		float prosjek = (float)(BijeloPolje + Rozaje + Podgorica + Niksic)/4;
		
		System.out.printf("Prosjecan broj stanovnika u ova cetiri grada iznosi %.2f.", prosjek);
		
		unos.close();

	}

}
