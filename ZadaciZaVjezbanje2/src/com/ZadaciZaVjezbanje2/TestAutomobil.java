package com.ZadaciZaVjezbanje2;

public class TestAutomobil {

	public static void main(String[] args) {
		
		Automobil auto1 = new Automobil("Audi", "A4", "2010", 60);
		Automobil auto2 = new Automobil("Opel", "Corsa", "1993", 40);
		Automobil auto3 = new Automobil("Toyota", "Camry", "2013", 90);
		Automobil auto4 = new Automobil("Hundai", "Tucson", "2024", 160);
		
		auto1.ispisi();
		auto2.ispisi();
		auto3.ispisi();
		auto4.ispisi();
		
		auto4.uspori(40);
		auto4.ispisi();
	}

}
