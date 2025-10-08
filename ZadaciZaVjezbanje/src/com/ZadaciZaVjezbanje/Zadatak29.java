package com.ZadaciZaVjezbanje;

/*Za unijetu tačku sa koordinata (x,y) napisati program koji provjerava kom 
kvadratnu pripada u koordinatnom sistemu. */

import java.util.Scanner;

public class Zadatak29 {

	public static void main(String[] args) {
		
		Scanner unos = new Scanner(System.in);
		
		System.out.print("Unesite koordinate X i Y: ");
		double x = unos.nextDouble();
		double y = unos.nextDouble();
		
		if(x > 0 & y > 0)
			System.out.print("Ova tacka pripada I kvadrantu. ");
		
		else if(x < 0 & y > 0)
			System.out.print("Ova tacka pripada II kvadrantu. ");
		
		else if(x < 0 & y < 0)
			System.out.print("Ova tacka pripada III kvadrantu. ");
		
		else if(x > 0 & y < 0)
			System.out.print("Ova tacka pripada IV kvadrantu. ");
		
		else
			System.out.print("Unijeli ste centar koordinatnog sistema.");
		
		unos.close();
	}

}
