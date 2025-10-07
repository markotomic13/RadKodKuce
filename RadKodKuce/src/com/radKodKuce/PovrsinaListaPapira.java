package com.radKodKuce;

/* Napisati program koji na osnovu zadate širine i visine lista papira (pravougaonog oblika) u 
milimetrima određuje njegovu površinu u kvadratnim centimetrima.*/

import java.util.Scanner;
public class PovrsinaListaPapira {

	public static void main(String[] args) {
		
		Scanner unos = new Scanner(System.in);
		
		System.out.print("Unesite visinu lista papira u milimetrima: ");
		
		double a = unos.nextDouble();
		
		System.out.print("Unesite sirinu lista papira u milimetrima: ");
		
		double b = unos.nextDouble();
		
		System.out.printf("Povrsina lista po unesenim paramtrima iznosi %.2fcm2", a*b/100);
		
		unos.close();
		
	}

}
