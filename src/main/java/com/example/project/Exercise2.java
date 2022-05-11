package com.example.project;

import java.util.Scanner;

public class Exercise2 {

	public static void main(final String[] args) {

		Exercise2 obj = new Exercise2();
		Scanner sc = new Scanner(System.in);
		while (true) {

            int a [] = new int [7];
            for(int i = 0; i < 7; i++){
                int n = sc.nextInt();
                a[i] = n;
            }
			
			System.out.println(obj.getMenorNumeroSaltos(a));			
		}
	}

	public Integer getMenorNumeroSaltos(int a []) {

		int avanceConejo = 0;
		int numeroActual = a[0];
		int contSaltos = 1;
		
		for (int i=0; i<7; i++) {
			
			if (numeroActual>50) { 
				contSaltos = -1;
				break;
			}
			else if (numeroActual<=50 && (avanceConejo+numeroActual)<50) { 
				avanceConejo += numeroActual;				
			}
			else {
				contSaltos++;
					avanceConejo = numeroActual; 
				
			}
			if (i<6) {
				numeroActual = a[i+1]-a[i];
			}
			
		}
		
		return contSaltos;
	}
}
