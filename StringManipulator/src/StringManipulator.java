
public class StringManipulator {
	
	
	public String trimAndConcat(String cadena1, String cadena2) { 
		String nuevaCadena1 = cadena1.trim();
		String nuevaCadena2 = cadena2.trim();
		
		return nuevaCadena1 + nuevaCadena2;		
	}

	public int getIndexOrNull(String texto, char buscar) {
		// TODO Auto-generated method stub
		int a = texto.indexOf(buscar);
		
		return a;
	}
	
	public int getIndexOrNull(String texto, String algo) {
		// TODO Auto-generated method stub
		int z = texto.indexOf(algo);
		
		return z;
	}
	// de una cadena extraer dos valores en distintas posiciones mas una cadena y concatenarlas
	public String concatSubstring(String cadena, int inicio, int fin, String concateCadena) { 
		String frase ="";
		
		frase = cadena.substring(inicio-1,fin);//se estrae valor de la cadena. primer parametros de inicio -1 porque en string las posiciones se empieza a contabilizar desde el 0
		frase= frase.concat(concateCadena);//se concatena frase mas concatena cadena y luego se sobreescribe frase con su nuevo valor
				
		return frase;
		
	}
	
	

	
	
}