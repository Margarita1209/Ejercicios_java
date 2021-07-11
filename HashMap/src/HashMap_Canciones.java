import java.util.HashMap;
import java.util.Set;

public class HashMap_Canciones {

	public static void main(String[] args) {
		
		HashMap<String, String> trackList = new HashMap<String, String>();
		trackList.put("1.-Track","Esta es la letra del track1 del album");
		trackList.put("2.-Con@calma","Esta es la letra de la cancion con calma" );
		trackList.put("3.-Tema: Bailando","Esta es la letra del tema 3 Bailando" );
		trackList.put("4.-Dama Blanca","esta es la letra de la cancion Dama Blanca" );
		trackList.put("Soy igual que tu","Letra de Soy igual que tu Alex y Fiddo " );
		trackList.put("Pobre Diabla","Letra cancion Pobre diabla , don Omar" );
		
		String letra = trackList.get("Pobre Diabla");
		System.out.println("letra de la cancion seleccionada " + letra);
		
		Set<String> keys = trackList.keySet();
        for(String key : keys) {
            System.out.println(key);
            System.out.println(trackList.get(key));    
        }
		// TODO Auto-generated method stub

	}

}
