import java.util.*;
import java.util.ArrayList;

import java.io.*;
import java.lang.*;



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

		
	
	public int[] crearArregloNumerosImpares(int inicio, int fin){
			
		int[] miarray = null;
		int dimension = 0;
		int posicion = 0;
		
		if (inicio < fin) {
			
			// calculo dimension
			for (int i = inicio ; i <= fin; i++){
				if (i%2==1) {
					dimension++;
				} 
			}
			
			miarray = new int[dimension];
			
			// agrego valor a cada posicion
			for (int i = inicio ; i <= fin; i++){
				if (i%2==1) {
					miarray[posicion] = i;
					posicion++;
				} 
			}
						
			return miarray;
		}else {
			return miarray;
		}
			
	} 
	
	public void arregloAlCuadrado() {
		
		 int [] arreglo = {1,5,10,-2};
		 ArrayList<Integer> nuevo = new ArrayList<Integer>();
		 
		   for (int i=0; i<arreglo.length; i++){
			    
				   nuevo.add(arreglo[i]*arreglo[i]);
			   }
						    		
			   System.out.println(nuevo);
			 
	}

	
		
}
