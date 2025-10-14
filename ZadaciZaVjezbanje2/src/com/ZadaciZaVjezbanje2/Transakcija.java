package com.ZadaciZaVjezbanje2;

/*(Zavisnost od prethodnog zadatka) Napisati klasu Transakcija sa atributima: iznos 
(double), tip (String: "uplata" ili "isplata"), opis (String). 

Potrebno je odraditi: 
a. Konstruktor; getere/setere (iznos ≥ 0).  
b. Metod jeUplata() koji vraća true ako je tip "uplata". 
 
Napisati glavnu klasu App (naziv fajla) koja kreira jedan BankovniRacun i dvije 
Transakcija (uplata i isplata). Na osnovu jeUplata() poziva uplati ili isplati sa iznosom 
transakcije. */

public class Transakcija {
	
	private double iznos;
	private String tip;
	
	public Transakcija() {}

	public double getIznos() {return iznos;}
	public void setIznos(double iznos) {
		this.iznos = iznos;
		if (iznos >= 0)
			tip = "uplata";
		else
			tip = "isplata";
	}

	public String getTip() {return tip;}
	public void setTip(String tip) { this.tip = tip;}
	
	public boolean jeUplata() {
		if(tip == "uplata")
			return true;
		return false;
	}
	
	
	

}
