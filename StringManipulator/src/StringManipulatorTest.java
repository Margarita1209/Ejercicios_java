
public class StringManipulatorTest {

	public static void main(String[] args) {
		StringManipulator manipulator = new StringManipulator();
	 
		String str = manipulator.trimAndConcat("hola   ","sonsa   ");
		System.out.println(str); 
		
		
		char letter = 'n';
		
		int a = manipulator.getIndexOrNull("Coding", letter);
		int b = manipulator.getIndexOrNull("Hola Mundo", letter);
		int c = manipulator.getIndexOrNull("Saludar", letter);
		System.out.println(a); // 4
		System.out.println(b); // 7
		System.out.println(c); // -1
		
		
		String word= "Hola";
		String subString = "la";
		String notSubString = "mundo";
		int aa = manipulator.getIndexOrNull(word, subString);
		int bb = manipulator.getIndexOrNull(word, notSubString);
		System.out.println(aa); // 2
		System.out.println(bb); // -1
		
		
		String word1 = manipulator.concatSubstring("sintaxis", 1, 4, "mundo");
		System.out.println(word1); // 


	}
}

		
		
		
	
	

