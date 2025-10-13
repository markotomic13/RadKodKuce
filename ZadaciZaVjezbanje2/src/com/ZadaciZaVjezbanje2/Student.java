package com.ZadaciZaVjezbanje2;

/*Kreirati jednostavan program za potrebe studentske službe. U sistemu je potrebno 
omogućiti upravljanje podacima o studentima (ime, prezime, broj indeksa i dodati tri 
ocjene).  

a. U testnoj klasi potrebno je dodati nove studente i informacije o njima.
  
b. Na osnovu unešenih ocjena potrebno je izračunati prosječnu ocjenu i na 
osnovu prosjeka odrediti da li student može ostvariti pravo na studentski 
kredit (prosjek veći od 9).  

c.  Na kraju programa, koristeći statičku promjenljivu, potrebno je odštampati 
spisak studenata u formatu: (Ime , Prezime, Stipendija (Da/Ne)).  

Napomena: Ne koristiti nizove, pa se možete ograničiti na 3-4 studenta za koje 
unosite podatke.*/

public class Student {
	
	private String ime;
	private String prezime;
	private String brojIndeksa;
	private int ocjena1;
	private int ocjena2;
	private int ocjena3;
	static int ukupanBrojStudenata = 0;
	
	public Student(String ime, String prezime, String brojIndeksa, int ocjena1, int ocjena2, int ocjena3) {
		this.ime = ime;
		this.prezime = prezime;
		this.brojIndeksa = brojIndeksa;
		this.ocjena1 = ocjena1;
		this.ocjena2 = ocjena2;
		this.ocjena3 = ocjena3;
		
		ukupanBrojStudenata++;
		
	}
	
	public double getProsjek() {
		return ((double)ocjena1 + ocjena2 + ocjena3) / 3;
	}
	
	public boolean imaStipendiju() {
		return getProsjek()>=9;
	}
	
	public void ispisiPodatke() {
		System.out.println(ime + " " + prezime + " - Stipendija: " + (imaStipendiju() ? "Da" : "Ne"));
	}
}
