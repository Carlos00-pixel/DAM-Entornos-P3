package main.java;


import java.util.Scanner;

public class Decimales {
	
	public static void redondeoAlAlza(double numero) {
		
		
		System.out.println(Math.round(numero));
		
	}


	public static void main(String[] args) {
		

		
		Scanner scanner = new Scanner (System.in);
		
		double numero=0;
		
		for(int i=1; i<=5; i++) {
			System.out.println("Introduce el numero "+i+" en decimales:");
			numero = scanner.nextDouble();
			redondeoAlAlza(numero);

		}
	}

}
