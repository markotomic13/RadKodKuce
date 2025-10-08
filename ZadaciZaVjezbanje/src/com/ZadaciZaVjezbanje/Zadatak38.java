package com.ZadaciZaVjezbanje;

/*Napisati program koji za N unijetih realnih parova brojeva x i y provjerava 
koliko tačka sa koordinatama (x,y) pripada osjenčenom dijelu ravni. Centar 
oba kruga je u tački (0,0), poluprečnici su im redom r1 i r2 (unosi korisnik), 
dok je prava data jednačinom x-y-4=0. Podsjetite se da je krug skup tačaka u 
ravni koje su na rastojanju r od date tačke tj. centra kruga. Štampati, osim 
broja tačaka koje pripadaju jednom od djelova, koliko tačaka pripada 
pojedinačno svakom od djelova. */

//U zadatku sam primjenio pravilo i da se tacke presjeka nalaze u osjencenom dijelu
import java.util.Scanner;

public class Zadatak38 {

	public static void main(String[] args) {
		
		Scanner unos = new Scanner(System.in);
		
		System.out.print("Unesite broj N kojim deklarisete koliko parova brojeva cete unijeti: ");
		int N = unos.nextInt();
		
		System.out.print("Unesite poluprecnik manje kruznice: ");
		double r1 = unos.nextDouble();
		
		System.out.print("Unesite poluprecnik vece kruznice: ");
		double r2 = unos.nextDouble();
		
		int brojac = 0, prviDio = 0, drugiDio = 0, treciDio = 0, cetvrtiDio = 0;
		
		for (int i = 1 ; i <= N ; i++) {
			System.out.println("Unesite " + i + ". par brojeva: ");
			double x = unos.nextDouble();
			double y = unos.nextDouble();
			
			if (x >= 0 & y >= 0) {
				if (Math.sqrt(x*x + y*y) <= r1) {
					prviDio += 1;
					brojac += 1;
					if(Math.sqrt(x*x + y*y) <= r2 & Math.sqrt(x*x + y*y) >= r1 & y <= x - 4) {
						drugiDio += 1;
						if (Math.sqrt(x*x + y*y) <= r1 & y <= x - 4) {
							cetvrtiDio += 1;
						}
					}
					if(Math.sqrt(x*x + y*y) <= r2 & Math.sqrt(x*x + y*y) >= r1) {
						treciDio += 1;
						}
				}
						
				else if(Math.sqrt(x*x + y*y) <= r2 & Math.sqrt(x*x + y*y) >= r1 & y <= x - 4) {
					drugiDio += 1;
					brojac += 1;
					}
				}
			
			else if (x <= 0 & y >= 0) {
				if(Math.sqrt(x*x + y*y) <= r2 & Math.sqrt(x*x + y*y) >= r1) {
					treciDio += 1;
					brojac += 1;
					
					}
				}
			
			else if (x >= 0 & y <= 0) {
				if (Math.sqrt(x*x + y*y) <= r1 & y <= x - 4) {
					cetvrtiDio += 1;
					brojac += 1;
				}
			}
		}
			
		System.out.printf("Prema koordinatama unijetih tacaka,\n%d se nalazi u prvom dijelu,\n%d se nalazi u drugom dijelu,\n%d se nalazi u trecem dijelu,\n%d se nalazi u cetvrtom dijelu,\ndok se ukupno nalazi %d tacaka u svim osjencenim djelovima", prviDio, drugiDio, treciDio, cetvrtiDio, brojac);
	
		unos.close();
		}
	}

/*Razlog zbog kojeg sam ovoliko prosirio linije koda jer sam uvidio prilikom testirana da se odredjene
tacke preklapaju u odredjenim osjencenim djelovima kada se za vrijednosti uzimaju tacke koje pripadaju osama, jer ose ujedno 
pripadaju i pojedinacnim kvadrantima*/



