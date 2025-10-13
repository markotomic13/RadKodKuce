package com.ZadaciZaVjezbanje2;

/*Napisati klasu BankovniRacun sa atributima: imeVlasnika, stanje (double).  

a. Kreirati konstruktor, getere i setere.  

b. Dodati metod uplati(double iznos) koji povećava stanje.  

c. Dodati metod isplati(double iznos) koji smanjuje stanje samo ako ima 
dovoljno sredstava.  

d. Dodati metod ispisi() koji prikazuje trenutno stanje računa. */

public class BankovniRacun {
	
	private String imeVlasnika;
	private double stanje;
	
	public BankovniRacun(String ImeVlasnika, double stanje) {
		this.imeVlasnika = ImeVlasnika;
		this.stanje = stanje;
	}

	public String getImeVlasnika() {return imeVlasnika;}
	public void setImeVlasnika(String imeValsnika) {this.imeVlasnika = imeValsnika;}

	public double getStanje() {return stanje;}
	public void setStanje(double stanje) {this.stanje = stanje;}
	
	public void uplati(double iznos) {
		stanje = stanje + iznos;
	}
	
	public void isplati(double iznos) {
		if(stanje - iznos < 0)
			System.out.print("Nemate dovoljno sredstava na racunu.\n");
		else
			stanje = stanje - iznos;
	}
	
	public void ispisi() {
		System.out.printf(imeVlasnika + ", Stanje na racunu: %.2f€.\n", stanje);
	}

}
