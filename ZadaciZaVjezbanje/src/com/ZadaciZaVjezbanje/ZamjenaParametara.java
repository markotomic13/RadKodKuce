package com.ZadaciZaVjezbanje;

/*Za Milicu i Anu se čuva koliko puta su obišle teren u 40 minuta. Međutim, 
prilikom unosa podataka desila se zabuna, pa je u varijabli x sačuvana 
vrijednost koja je trebala biti sačuvana u varijabli y i obrnuto. Skicirati 
algoritam (napisati program) koji mijenja mjesta vrijednostima u promjenljivim 
x i y. Npr. ako je x = 7 i y = 10, poslije izvršavanja koda treba da bude x=10 i 
y=7. */

import java.util.Scanner;
public class ZamjenaParametara {

	public static void main(String[] args) {
		
		Scanner unos = new Scanner(System.in);
		
		System.out.print("Unesite koliko puta je Milica obisla teren za 40min: ");
		float milica = unos.nextFloat();
		
		System.out.print("Unesite koliko puta je Ana obisla teren za 40min: ");
		float ana = unos.nextFloat();
		
		float x = milica;
		float y = ana;
		
		milica = y;
		ana = x;
		
		System.out.printf("Zbog greske koja je nastala prilikom unosa parametara, Milica je zapravo presla %.1f puta\nDok je Ana zapravo presla %.1f puta", milica, ana);;
		
		
		unos.close();

	}

}
