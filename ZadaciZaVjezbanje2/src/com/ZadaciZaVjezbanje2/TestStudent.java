package com.ZadaciZaVjezbanje2;

public class TestStudent {

	public static void main(String[] args) {
		
		Student s1 = new Student("Marko", "Tomic", "19/011", 10, 9, 9);
		Student s2 = new Student("Peta", "Petrovic", "19/045", 7, 8, 6);
		Student s3 = new Student("Nikola", "Nikolic", "19/077", 8, 8, 7);
		
		s1.ispisiPodatke();
		s2.ispisiPodatke();
		s3.ispisiPodatke();
		
		System.out.println("\nUkupan broj studenata: " + Student.ukupanBrojStudenata);
		
	}

}
