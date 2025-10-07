package com.ZadaciZaVjezbanje;

/*Dimenzije pravougaonika su 543 i 130. Napisati program koji računa koliko 
kvadrata stranice 65 je moguće izrezati iz tog pravougaonika. */

public class BrojKvadrataUPravougaoniku {

	public static void main(String[] args) {
		
		int a = 543, b = 130, sadrzalacUa = 0, sadrzalacUb = 0;
		
		sadrzalacUa = a / 65;
		sadrzalacUb = b / 65;
		
		int brojKvadrata = sadrzalacUa * sadrzalacUb;
		
		System.out.printf("Iz pravougaonika stranica a = 543 i b = 130 moze se izrezati %d kvadrata stranice 65.", brojKvadrata);
		

	}

}
