package com.radKodKuce;
/* Date su koordinate donje desne i gornje lijeve ivice zida (pravougaonik). Napisati 
program koji računa povrsinu i obim zida.*/

import java.util.Scanner;
public class PovrsinaZidaPoKoordinatama {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		
		System.out.print("Unesite koordinate tacke koja se nalazi u donjem desnom uglu: ");
		
		double x1 = unos.nextDouble();
		double y1 = unos.nextDouble();
		
		System.out.print("Unesite koordinate tacke koja se nalazi u gornjem lijevom uglu: ");
		
		double x2 = unos.nextDouble();
		double y2 = unos.nextDouble();
		
		double a = Math.abs(x1) - Math.abs(x2);
		double b = Math.abs(y2) - Math.abs(y1);
		
		double P = a * b;
		double O = 2*a + 2*b;
		
		System.out.printf("Po unesenim koordinatama za tacku koja se nalazi u donjem desnom uglu (%.0f,%.0f), i u gornjem lijevom uglu (%.0f,%.0f),\nPovrsina tog zida iznosi %.2f dok je obim %.2f", x1, y1, x2, y2, P, O);
		
		unos.close();
		
		

	}

}
