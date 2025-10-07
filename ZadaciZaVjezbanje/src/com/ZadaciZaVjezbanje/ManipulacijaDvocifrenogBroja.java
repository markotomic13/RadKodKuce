package com.ZadaciZaVjezbanje;

/*Napisati program koji obrađuje dvocifreni broj na sledeći način: 
a. Ako je prva cifra veća od druge štampati razliku prve i druge cifre 
b. Ako je prva cifra manja od druge štampati zbir te dvije cifre 
c. Ako su cifre iste štampati njihov proizvod */

import java.util.Scanner;

public class ManipulacijaDvocifrenogBroja {

	public static void main(String[] args) {
		
		Scanner unos = new Scanner(System.in);
		
		System.out.print("Unesite dvocifren broj: ");
		int uneseniBroj = unos.nextInt();
		
		if(uneseniBroj >= 10 & uneseniBroj <= 99) {
			int drugaCifra = uneseniBroj % 10;
			int prvaCifra = uneseniBroj / 10;
			
			if(prvaCifra > drugaCifra) {
				int razlika = prvaCifra - drugaCifra;
				System.out.printf("S obzirom da je prva cifra veca od druge, njihova razlika je %d.", razlika);
			}
			else if (prvaCifra < drugaCifra) {
				int zbir = prvaCifra + drugaCifra;
				System.out.printf("S obzirom da je prva cifra manja od druge, njihov zbir je %d.", zbir);
			}
			else {
				int proizvod = prvaCifra * drugaCifra;
				System.out.printf("S obzirom da su prva i druga cifra jednake, njihov proizvod je %d.", proizvod);
			}
		}
		else {
			System.out.print("Niste unijeli dvocifren broj.");
		}
		
		unos.close();

	}

}
