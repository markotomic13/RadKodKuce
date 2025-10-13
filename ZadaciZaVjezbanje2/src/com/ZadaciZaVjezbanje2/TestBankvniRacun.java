package com.ZadaciZaVjezbanje2;

public class TestBankvniRacun {

	public static void main(String[] args) {
		
		BankovniRacun a1 = new BankovniRacun("Marko Tomic", 500);
		
		a1.ispisi();
		a1.uplati(200);
		a1.ispisi();
		a1.isplati(400);
		a1.ispisi();
		a1.isplati(1000);
		a1.ispisi();
	}

}
