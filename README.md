# Ejercicios_java
public class EjerciciosBasicos {
	

	public static void imprimir(){

		for (int i =1; i < 256; i++){
	        System.out.println(i);
		}
	}
	
	public static void imprimirImpares(){

		for (int i =1; i < 256; i++){
			if (i%2==1) {
				System.out.println(i);
			}
		}
	}
	
	public static void imprimirSuma(){
		int suma=0;

		for (int i =0; i < 256; i++){
			suma += i;
	        System.out.println("Nuevo numero:"+ i +" Suma: "+suma);
		}
	}
	
	public static void imprimirArreglo(int[] myArray1){		
		
		for( int i = 0; i <myArray1.length; i++) {
			System.out.println(myArray1[i]);
		}
	}
	
	public static void imprimirMaximo(int [] miArr) {
			
			int maximo=miArr[0];
			
			for (int i = 0; i < miArr.length; i++){				
				if (miArr[i] > maximo) {					
					maximo =  miArr[i];										
				}				
			}
			System.out.println(maximo);	
	}
	
	public void imprimirPromedio(int [] miArr) {
		
		int suma = 0;
		
		for (int i =0; i <miArr.length; i++){
			suma += i;	
			
			}
		System.out.println(suma/miArr.length);		
		}
	
