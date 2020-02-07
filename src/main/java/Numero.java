package main.java;

import java.util.Scanner;

public class Numero {
	public static void primos(int desde, int hasta) {
		boolean esPrimo;
		for(int i =desde; i<=hasta; i++ ) {
			esPrimo=true;
			for(int j=2; j<=Math.sqrt(i)&& esPrimo; j++) {
				if(i% j==0) {
					
				}
			}
			if(esPrimo) {
				System.out.print(i+"-");
			}
		}
	}
	 public static void main(String[] args) {
		 
///////////////////////////////////////  NO HACER NADA AQUI ///////////////////////////////////////////
	 
		Scanner scanner= new Scanner (System.in);
		
///////////////////////////////////////  PARA CALCULAR LOS NUMEROS PRIMOS /////////////////////////////
		
	    int desde = 4;
	    int hasta = 100;
	    
///////////////////////////////////////  PARA CALCULAR EL FACTORIAL ///////////////////////////////////
	    
	    int numero;
	    int i=1;
		int factorial = 1;
		primos(desde, hasta);
		System.out.println("");
		System.out.println("Introduce un numero: ");
		numero = scanner.nextInt();

	 }
}
