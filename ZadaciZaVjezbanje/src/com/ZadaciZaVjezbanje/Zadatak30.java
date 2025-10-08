package com.ZadaciZaVjezbanje;

/*Dobili ste zadatak da provjerite da li broker koji raspolaže sa N eura može 
kupiti akcije nakon naglog skoka cijene. Poznato je da je juče cijena jedne 
akcije bila X eura, a da je jutros ta vrijednost skočila za čak 15 %. Napisati 
program koji štampa da li i koliko akcija broker može kupiti nakon promjene 
cijene. */

import java.util.Scanner;

public class Zadatak30 {

	public static void main(String[] args) {
	
		Scanner unos = new Scanner(System.in);
		
		System.out.print("Unesite iznos novca sa kojim raspolaze broker: ");
		double N = unos.nextDouble();
		
		System.out.print("Unesite cijenu jedne akcije koja je juce bila:");
		double x = unos.nextDouble();
		
		double novaCijena = x + (x*15)/100;
		
		if (N >= novaCijena) {
			double brojAkcija = N / novaCijena;
			brojAkcija = (int)brojAkcija;
			System.out.printf("S obzirom da broke raspolaze sa %.2f€, on za taj iznos moze kupiti %.0f akcija jer je njihova nova cijena %.2f.", N, brojAkcija, novaCijena);
		}
		else
			System.out.printf("Broker koji raspolaze sa %.2f€ ne moze kupiti ni jednu akciju.", N);
		
		unos.close();
	}

}
