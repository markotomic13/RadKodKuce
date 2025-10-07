package com.ZadaciZaVjezbanje;

/* U jednoj privatnoj školi uvedeno je pravilo kojim se određuje iznos popusta 
koji ostvaruju učenici prilikom upisa u narednu školsku godinu. Učenici sa 
odličnim uspehom ostvaruju popust od 40% ukupnog iznosa školarine, sa 
vrlodobrim 20% a sa dobrim 10%. Takođe, učenici koji su osvojili nagradu na 
nekom od državnih takmičenja ostvaruju popust od 30% ukupnog iznosa 
školarine. Ukoliko neki učenik ispunjava dva kriterijuma za popust primenjuje 
se kriterijum po kome je popust veći. Na osnovu punog iznosa školarine, 
prosječne ocjene učenika i informacije o nagradama sa takmičenja odrediti 
iznos koji učenik treba da plati pri upisu u narednu školsku godinu. 
Ulaz: U prvoj varijabli nalazi se pun iznos školarine (realan broj), u drugoj 
prosječna ocjena učenika (realan broj od 2.0 do 5.0) a u trećoj 0 ukoliko 
učenik nema nagradu ili 1 ukoliko je ima. 
Izlaz: Iznos školarine koju učenik treba da plati (zaokružen na najbliži cio broj) 
navodi se u jednoj linije standardnog izlaza. */

import java.util.Scanner;

public class Zadatak24 {

	public static void main(String[] args) {
		
		Scanner unos = new Scanner(System.in);
		
		System.out.print("Unesite iznos pune skolarine: ");
		double skolarina = unos.nextDouble();
		
		System.out.print("Unesite prosjecnu ocjenu ucenika: ");
		double uspjeh = unos.nextDouble();
		
		System.out.print("Unesite 1 ako je ucenik osvojio nagradu na drzavnom takmicenju, 0 ukoliko nije: ");
		int takmicenje = unos.nextInt();
		
		double iznosSkolarine;
		
		if (takmicenje == 1) {
			if (uspjeh >= 4.50) 
				iznosSkolarine = skolarina - (skolarina * 40)/100;
			else
				iznosSkolarine = skolarina - (skolarina * 30)/100;
			}
		else {
			if (uspjeh >= 4.50) 
				iznosSkolarine = skolarina - (skolarina * 40)/100;
			else if (uspjeh >= 3.50)
				iznosSkolarine = skolarina - (skolarina * 20)/100;
			else
				iznosSkolarine = skolarina - (skolarina * 10)/100;
		}

		iznosSkolarine = (int)iznosSkolarine;
		
		System.out.printf("Po unesenim parametrima, ucenik treba da plati skolarinu u iznosu od %.0f.", iznosSkolarine);
		
		unos.close();
	}

}


