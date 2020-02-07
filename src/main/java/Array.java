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

	 public static void mediana(int[] array){
	        double mediana = 0;
	        if(array.length % 2 == 0){
	            int sumaMedios = array[array.length/2] + array[array.length/2 - 1]; 
	            mediana = (double)sumaMedios / 2; 
	        }
	        
	        System.out.println(mediana);
	        
	    }
	 
	 public static void media(int[] media) {
			int media2=0;
			for (int i=0;i<media.length;i++) {
				 media2 = media2+media[i];
			}
			media2=media2/media.length;
			System.out.println("La media es "+media2);
			
		}
	 
	public static void main(String[] args) {
		
///////////////////////////////////////  NO HACER NADA AQUI ///////////////////////////////////////////
		
		int[] maximo = {3,7,5,9,6};

		int[] minimo = {3,7,5,9,6};

		int[] mediana = {5,7,45,20,70,26};

		int[] media = {4,50,8,20};
		
		minimo(minimo);
		mediana(mediana);
		media(media);
	}

}
