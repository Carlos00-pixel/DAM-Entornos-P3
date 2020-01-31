package main.java;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Decimales {
	
	public static void redondeoSinDecimales(double numero) {
		
		DecimalFormat df = new DecimalFormat("#");
		System.out.println(df.format(numero));
		
	}

	public static void main(String[] args) {
		
///////////////////////////////////////  NO HACER NADA AQUI ///////////////////////////////////////////
		
		Scanner scanner = new Scanner (System.in);
		
		double numero=0;
		
		for(int i=1; i<=5; i++) {
			System.out.println("Introduce el numero "+i+" en decimales:");
			numero = scanner.nextDouble();
			redondeoSinDecimales(numero);
		}
	}

}
