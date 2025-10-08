package com.ZadaciZaVjezbanje;

/* Poznate su temperature za svaki dan nekog perioda. Napisati program kojim 
se određuje redni broj dana u tom periodu kada je temperatura poslednji put 
bila negativna (dani se broje od 1 do n). */

import java.util.Scanner;

public class Zadatak34 {

	public static void main(String[] args) {
		
		Scanner unos = new Scanner(System.in);
		
		System.out.print("Unesite period od koliko dana se mjerila temperatura: ");
		int period = unos.nextInt();
		int redniBrojDana = 0;
		
		for (int i = 1 ; i <= period ; i++) {
			System.out.print("Unesite temperaturu za " + i +". dan: ");
			double temperatura = unos.nextDouble();
			
			if (temperatura < 0)
				redniBrojDana = i;
		}
		
		if (redniBrojDana > 0)
			System.out.printf("Poslednji put je temperatura bila ispod nule %d. dana u periodu od %d dana koji je zadat.", redniBrojDana, period);
		else
			System.out.print("Temperatura nije bila ispod nule za zadati period.");
		unos.close();

	}

}
