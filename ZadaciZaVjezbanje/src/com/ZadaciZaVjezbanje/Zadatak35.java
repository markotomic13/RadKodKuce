package com.ZadaciZaVjezbanje;
/*Marko se zabavlja kartama. Sve karte koje je imao u ruci je složio tako da 
prvo idu sve karte sa parnim brojevima, a zatim one sa neparnim brojevima 
(moguće je i da je Marko imao samo parne ili samo neparne karte). Napiši 
program koji proverava da li je Marko ispravno složio karte. */

import java.util.Scanner;

public class Zadatak35 {

	public static void main(String[] args) {
		
		Scanner unos = new Scanner(System.in);
		
		System.out.print("Unesite broj karata koje je Marko imao u ruci: ");
		int brojKarata = unos.nextInt();
		int indikator = 0;
		int i = 1;
		
		System.out.print("Unesite njihov redoslijed: ");
		
		while (i <= brojKarata & indikator == 0) {
			
			int vrijednostKarte = unos.nextInt();
			if(vrijednostKarte == 2 | vrijednostKarte == 4 | vrijednostKarte == 6 | vrijednostKarte == 8 | vrijednostKarte == 10)
				i++;
			else
				indikator = 1;
		}
		
		while (i < brojKarata & indikator == 1) {
			
				int vrijednostKarte = unos.nextInt();
				if(vrijednostKarte == 1 | vrijednostKarte == 3 | vrijednostKarte == 5 | vrijednostKarte == 7 | vrijednostKarte == 9)
					i++;
				else
					indikator = 2;
		}
		
		unos.close();
		
		if (indikator == 1 | indikator == 0)
			System.out.print("Marko je pravilno naslozio spil.");
		else
			System.out.print("Marko nije ispravno naslozio spil.");

	}

}
