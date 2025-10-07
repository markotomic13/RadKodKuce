package com.ZadaciZaVjezbanje;

/*Napisati program koji računa površinu ekrana monitora pravougaonog oblika, 
ukoliko je poznata dužina njegove dijagonale (d = 50) i odnos stranica (aspect 
ratio = 16:9). */

public class PovrsinaMonitoraEkrana {
	
	public static void main(String[] args) {
		
		double dijagonala = 50, aspectX = 16, aspectY = 9;
		
		double hipotenuza = Math.sqrt(Math.pow(aspectX, 2) + Math.pow(aspectY, 2));
		double a = (aspectX / hipotenuza) * dijagonala;
		double b = (aspectY / hipotenuza) * dijagonala;
		
		double Povrsina = a * b;
		
		System.out.printf("Povrsina ekrana cija je dijagonala 50 je %.2f.", Povrsina);
	}
}

