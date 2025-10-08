package com.ZadaciZaVjezbanje;

/* Na terasi dužine d metara treba rasporediti n stubića širine s centimetara tako 
da rastojanje između stubića, kao i između stubića i zida bude isto. 
Ulaz: Tri reda standardnog ulaza sadrže tri broja: 
• d - realan broj koji predstavlja dužinu terase u m  
• n - broj stubića 
• s - realan broj koji predstavlja širinu stubića u cm 

Izlaz: Rastojanje između stubića u centimetrima, zaokruženo na dve 
decimale. 
Napomena:   Neka je r nepoznato rastojanje između stubića. Tada n stubića 
pokriva n · s cm. Između n stubića postoji n − 1 razmak, jedan razmak je 
između lijevog zida i prvog stubića i jedan razmak je između poslednjeg 
stubića i desnog zida. Dužina terase u centimetrima je d · 100 cm.  
Dakle, važi uslov n · s cm + (n + 1) · r cm = d · 100 cm 
Samo ostaje da r izracunamo i to je to. */

import java.util.Scanner;
public class Zadatak23 {

	public static void main(String[] args) {
		
		Scanner unos = new Scanner(System.in);
		
		System.out.print("Unesite duzinu terase u metrima: ");
		double d = unos.nextDouble();
		
		System.out.print("Unesite broj stubica: ");
		int n = unos.nextInt();
		
		System.out.print("Unesite sirinu stubica u centimetrima: ");
		double s = unos.nextDouble();
		
		d = d * 100;
		
		double rastojanje, r;
		
		rastojanje = d - ((double)n * s);
		r = rastojanje/(double)(n+1);
		
		System.out.printf("Rastojanje izmedju svakog stubica pojedinacno je %.2fcm", r);

		unos.close();
		
	}
}
