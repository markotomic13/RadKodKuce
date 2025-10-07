package com.ZadaciZaVjezbanje;

/*Napisati program kojim se na osnovu temperature vode određuje njeno 
agregatno stanje. Ako je temperatura: 
• viša od 0 C i niža od 100C - agregatno stanje je tečno; ne viša od 0 C - 
agregatno stanje je čvrsto; ne niža od 100 C - agregatno stanje je gasovito. 
Za temperaturu od tačno 0 smatra se da je agregatno stanje čvrsto, a za 
tačno 100 da je gasovito. 
Ulaz: Temperatura - cio broj  
Izlaz: Na standardni izlaz ispisati jednu od sledećih riječi: cvrsto, tecno, 
gasovito.*/

import java.util.Scanner;

public class AgregatnoStanjeVode {

	public static void main(String[] args) {
		
		Scanner unos = new Scanner(System.in);
		
		System.out.print("Unesite temperaturu vode: ");
		int temperaturaVode = unos.nextInt();
		
		if(temperaturaVode > 0) {
			if (temperaturaVode < 100) {
				System.out.print("Voda je u tecnom stanju.");
			}
			else {
				System.out.print("Voda je u gasovitom stanju.");
			}
		}
		else {
			System.out.print("Voda je u cvrstom stanju.");
		}
		
		unos.close();

	}

}
