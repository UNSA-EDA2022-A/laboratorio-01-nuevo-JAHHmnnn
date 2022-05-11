package com.example.project;

import java.util.Scanner;

public class Exercise1 {

	public static void main(final String[] args) {

		Exercise1 obj = new Exercise1();
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			System.out.println(obj.convertirBaseGabriel(n));			
		}
	}

	public String convertirBaseGabriel(int a) {

		int number = 0;
		int cont1 = 0;
		int cont2 = 0;
		boolean val = false;
		int decimal = 0;
		int exp = 1;
		
		while (a!=0) {
			number = a - (a/10)*10;
			
				if (number==0) {
					decimal += number*(Math.pow(2, exp)-1);
				}
				else if (number==1) {
					decimal += number*(Math.pow(2, exp)-1);
					cont1++;
				}
				else if (number==2 && cont1==0 && cont2==0) {
					decimal += number*(Math.pow(2, exp)-1);
					cont1 = 0;
					cont2++;
				}
				else {
					cont1++;
					val = true;
					break;
				}
			
			a/=10;
			exp++;
		}
		
		if (cont2<=1 && val==false) {
			return decimal+"";
		}
		else {
			return "El numero proporcionado no esta en base Gabriel";
		}
		
	}
}
