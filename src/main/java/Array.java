package main.java;

public class Array {
	
	 public static void mediana(int[] array){
	        double mediana = 0;
	        if(array.length % 2 == 0){
	            int sumaMedios = array[array.length/2] + array[array.length/2 - 1]; 
	            mediana = (double)sumaMedios / 2; 
	        }
	        
	        System.out.println(mediana);
	        
	    }

	public static void main(String[] args) {
		
///////////////////////////////////////  NO HACER NADA AQUI ///////////////////////////////////////////
		
		int[] maximo = {3,7,5,9,6};

		int[] minimo = {3,7,5,9,6};

		int[] mediana = {5,7,45,20,70,26};
		mediana(mediana);

		int[] media = {4,50,8,20};
	}

}
