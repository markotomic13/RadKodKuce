package com.ZadaciZaVjezbanje;

/*Za dva stola kružnog oblika poznat je njihov poluprečnik. Napisati program 
kojim se štampa obim stola sa većom površinom. */

import java.util.Scanner;

public class PoredjeneStolova {

	public static void main(String[] args) {
		
		Scanner unos = new Scanner(System.in);
		
		System.out.print("Unesite poluprecnik Stola 1: ");
		double r1 = unos.nextDouble();
		
		System.out.print("Unesite poluprecnik Stola 2: ");
		double r2 = unos.nextDouble();
		
		double P1 = Math.pow(r1, 2) * Math.PI;
		double P2 = Math.pow(r2, 2) * Math.PI;
		
		if(P1 > P2) {
			double O1 = 2 * r1 * Math.PI;
			System.out.printf("Obim kruga sa vecom povrsinom je %.2f", O1);
			
		}
		else if(P1 < P2){
			double O2 = 2 * r2 * Math.PI;
			System.out.printf("Obim kruga sa vecom povrsinom je %.2f", O2);
		}
		else {
			double O = 2 * r1 * Math.PI;
			System.out.printf("Povrsine oba kruga su jednake, tako da imaju isti obim koji iznosi %.2f", O);
		}
		
		unos.close();
	}

}
