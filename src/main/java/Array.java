package main.java;

public class Array {
	public static void minimo(int []minimo) {
		int numeroMinimo=999;
		for(int i=0; i<minimo.length; i++) {
			if(minimo[i]<numeroMinimo) {
				numeroMinimo=minimo[i];
			}
		}
		System.out.println("El numero minimo es "+numeroMinimo);
	}

	public static void main(String[] args) {
		
///////////////////////////////////////  NO HACER NADA AQUI ///////////////////////////////////////////
		

		int[] minimo = {3,7,5,9,6};
		minimo(minimo);
	}

}
