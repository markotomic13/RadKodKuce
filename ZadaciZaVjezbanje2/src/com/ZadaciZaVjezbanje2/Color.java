package com.ZadaciZaVjezbanje2;

/* Kreirati klasu Color koja ima tri privatna atributa: red, green i blue (vrijednosti 
0–255). Napraviti konstruktor koji postavlja početne vrijednosti svih atributa.
 
a. Napraviti getere i setere za sve atribute. U seterima treba provjeriti da li je 
vrijednost između 0 i 255. Ako nije, ispisati poruku i ne mijenjati vrijednost.  

b. Napraviti metode addRed(int change), addGreen(int change) i addBlue(int 
change) koje mijenjaju vrijednost odgovarajuće boje za zadatu količinu 
(pozitivnu ili negativnu). Ako promjena izađe van [0,255], ispisati poruku i 
postaviti vrijednost na granicu (0 ili 255).  

c. Napraviti metodu printColor() koja ispisuje vrijednosti svih boja u obliku: "red: 
X, green: Y, blue: Z". */

public class Color {
	
	private int red;
	private int blue;
	private int green;

	public void color(int r, int g, int b) {
		if (r >= 0 & r <= 255)
			this.red = r;
		else
			System.out.print("Vrijednost red boje nije u dozvoljenom opsegu od 0 do 255\n");
		
		if (b >= 0 & b <= 255)
			this.blue = b;
		else
			System.out.print("Vrijednost blue nije u dozvoljenom opsegu od 0 do 255\n");
		
		if (g >= 0 & g <= 255)
			this.green = g;
		else
			System.out.print("Vrijednost green nije u dozvoljenom opsegu od 0 do 255\n");
	}
	
	//pod a.	
	public int getRed() {return red;}
	public void setRed(int red) {
		if (red >= 0 & red <= 255)
			this.red = red;
		else
			System.out.print("Vrijednost nije u dozvoljenom opsegu od 0 do 255");
	}

	public int getBlue() {return blue;}
	public void setBlue(int blue) {
		if (blue >= 0 & blue <= 255)
			this.blue = blue;
		else
			System.out.print("Vrijednost nije u dozvoljenom opsegu od 0 do 255");
	}

	public int getGreen() {return green;}
	public void setGreen(int green) {
		if (green >= 0 & green <= 255)
			this.green = green;
		else
			System.out.print("Vrijednost nije u dozvoljenom opsegu od 0 do 255");
	}
	
	// Pod b.
	
	public void addRed(int change) {
		red = red + change;
		if (red > 255) {
			red = 255;
			System.out.printf("Vrijednost je premasila dozvoljenu vrijednost, tako da je red %d.", red);
		}
		else if (red < 0) {
			red = 0;
			System.out.printf("Vrijednost boje je ispod dozvoljene vrijednosti, tako da je red %d.", red);
		}
		
	}
	
	public void addBlue(int change) {
		blue = blue + change;
		if (blue > 255) {
			blue = 255;
			System.out.printf("Vrijednost je premasila dozvoljenu vrijednost, tako da je blue %d.", blue);
		}
		else if (blue < 0) {
			blue = 0;
			System.out.printf("Vrijednost boje je ispod dozvoljene vrijednosti, tako da je blue %d.", blue);
		}
		
	}
	
	public void addGreen(int change) {
		green = green + change;
		if (green > 255) {
			green = 255;
			System.out.printf("Vrijednost je premasila dozvoljenu vrijednost, tako da je green %d.", green);
		}
		else if (green < 0) {
			green = 0;
			System.out.printf("Vrijednost boje je ispod dozvoljene vrijednosti, tako da je green %d.", green);
		}
	
	}
	
	//Pod c.
	public void printColor() {
		System.out.println("red: " + red);
		System.out.println("green: " + green);
		System.out.println("blue: " + blue);
	}

}
