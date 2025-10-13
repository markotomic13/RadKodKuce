package com.ZadaciZaVjezbanje2;

/*Napisati klasu Automobil sa atributima: marka, model, godiste i brzina (int). 
 
a. Kreirati konstruktor, getere i setere.  

b. Dodati metod ubrzaj(int vrijednost) koji povećava brzinu, ali ne smije preći 
200.  

c. Dodati metod uspori(int vrijednost) koji smanjuje brzinu, ali ne smije pasti 
ispod 0. 
 
d. Dodati metod ispisi() koji prikazuje podatke o automobilu.*/

public class Automobil {
	
	private String marka;
	private String model;
	private String godiste;
	private int brzina;
	
	public Automobil(String marka, String model, String godiste, int brzina) {
		this.marka = marka;
		this.model = model;
		this.godiste = godiste;
		
		if(brzina > 200)
			this.brzina = 200;
		else if(brzina < 0)
			this.brzina = 0;
		else
			this.brzina = brzina;
	}

	public String getMarka() {return marka;}
	public void setMarka(String marka) {this.marka = marka;}

	public String getModel() {return model;}
	public void setModel(String model) {this.model = model;}

	public String getGodiste() {return godiste;}
	public void setGodiste(String godiste) {this.godiste = godiste;}

	public int getBrzina() {return brzina;}
	public void setBrzina(int brzina) {this.brzina = brzina;}
	
	public void ubrzaj(int ubrzanje) {
		brzina = brzina + ubrzanje;
		if (brzina > 200)
			brzina = 200;
	}
	public void uspori(int usporavanje) {
		brzina = brzina - usporavanje;
		if (brzina < 0)
			brzina = 0;
	}
	
	public void ispisi() {
		System.out.println(marka + ", " + model + ", " + godiste + ", " + brzina + "km/h");
	}
	
	

}
