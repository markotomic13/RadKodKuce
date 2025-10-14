package com.ZadaciZaVjezbanje2;

public class App {

	public static void main(String[] args) {
		
		BankovniRacun marko = new BankovniRacun("Marko", 500);
		
		Transakcija uplata = new Transakcija();
		
		Transakcija isplata = new Transakcija();
		
		marko.ispisi();
		
		uplata.setIznos(300);
		
		if(uplata.jeUplata() == true)
			marko.uplati(uplata.getIznos());
		else
			marko.isplati(uplata.getIznos());
		
		marko.ispisi();
		
		isplata.setTip("isplata");
		
		isplata.setIznos(400);
		
		marko.isplati(isplata.getIznos());
		
		marko.ispisi();

	}

}
