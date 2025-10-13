package com.ZadaciZaVjezbanje2;

//Testna klasa za Zadatak 1.

public class TestColor {
	
	public static void main(String[]args) {
		
		Color boje = new Color();
		
		boje.color(-8, 18, 270);
		
		boje.printColor();
		
		boje.addBlue(15);
		
		boje.printColor();
		
	}
}
