package com.ZadaciZaVjezbanje;

/*Dat je trocifren broj. Odrediti broj koji se dobija zamjenom prve i posljednje 
cifre.*/

import java.util.Scanner;

public class ZamjenaPrveIPoslednjeCifre {

	public static void main(String[] args) {
		
		Scanner unos = new Scanner(System.in);
		
		System.out.print("Unesite trocifren broj: ");
		int broj = unos.nextInt();
		
		if(broj <= 999 & broj >= 100) {
			int prvaCifra = broj / 100;
			int drugaCifra = broj / 10 % 10;
			int trecaCifra = broj % 10;
			
			int noviBroj = trecaCifra*100 + drugaCifra*10 + prvaCifra;
			
			System.out.printf("Cifra koju cemo dobiti kada se zamijene mjesta je %d.", noviBroj);
		}
		else{
			System.out.print("Niste unijeli trocifren broj.");
		}
		unos.close();
	}

}
