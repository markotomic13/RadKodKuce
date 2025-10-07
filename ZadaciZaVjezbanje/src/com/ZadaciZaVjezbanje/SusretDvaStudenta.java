package com.ZadaciZaVjezbanje;
/* Korisnik unosi koordinate dvije tačke (x1, y1) i (x2, y2) koje predstavljaju 
početne tačke dva studenta koji su se dogovorili da se sretnu na lokaciji (x3, 
y3) koja je nalazi tačno na sredini njihovog puta. Program treba da odredi tu 
lokaciju i izračuna rastojanje od početne pozicije do tačke susreta, koristeći 
Euklidsko rastojanje. */

import java.util.Scanner;

public class SusretDvaStudenta {

	public static void main(String[] args) {
		
		Scanner unos = new Scanner(System.in);
		
		System.out.print("Unesite koordinate Studenta 1: ");
		double x1 = unos.nextDouble();
		double y1 = unos.nextDouble();
		
		System.out.print("Unesite koordinate Studenta 2: ");
		double x2 = unos.nextDouble();
		double y2 = unos.nextDouble();
		
		double ukupnoRastojanje = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		double rastojanjeDoTackeSusreta = ukupnoRastojanje / 2;
		
		double x3, y3;
		
		if (x1 == x2) {
			x3 = x1;
		}
		else {
			x3 = x1 + (x2 - x1) / 2;
		}
		if (y1 == y2) {
			y3 = y1;
		}
		else {
			y3 = y1 + (y2 - y1) / 2;
		}
		
		
		System.out.printf("Prema unijetim kordinatama Studenta 1 (%.2f, %.2f) i Studenta 2 (%.2f, %.2f),\ntacka susreta na kojoj ce se naci ova dva studenta se nalazi na koordinatama (%.2f, %.2f),\ndok je rastojanje od pocetne tacke do tacke susreta %.2f.", x1, y1, x2, y2, x3, y3, rastojanjeDoTackeSusreta);
		
		unos.close();

	}

}
