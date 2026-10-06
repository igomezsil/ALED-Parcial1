package ejerciciosParcial;

public class MetodoPalindromo {
	 /*public static boolean isPalindrome(String sentence) {
		 *     String stringMinusculas = sentence.toLowerCase();
		 *     boolean cumple = false;
		 *     String[] array1 = new String[stringMinusculas.length()];
		 *     String[] array2 = new String[stringMinusculas.length()];
		 *     for (int i = 0; i <= (stringMinusculas.length() - 1); i++) {
		 *         array1.charAt(i);
		 *     }
		 *     for (int i = stringMinusculas.length() - 1; i >= 0; i--) {
		 *         array2.charAt(i);
		 *     }
		 *     if (cumple) {
		 *         array1 == array2;
		 *         boolean cumple = true;
		 *     }
		 *     if (sentence.length() <= 1) {   // la flecha indicaba que iba en la 1ª línea
		 *         boolean cumple = false;
		 *         System.out.println("La cadena de caracteres recibida tiene una longitud menor o igual a 1");
		 *     }
		 * }
		 *
		 * ===== QUÉ SE CAMBIA =====
		 * 1. La comprobación de longitud va primero y hace return false.
		 * 2. cumple empieza en true y solo pasa a false si hay una diferencia.
		 * 3. Se asigna con "=": array1[i] = "" + stringMinusculas.charAt(i);
		 *    (charAt va sobre el String, no sobre el array).
		 * 4. array2 necesita un segundo índice (j) para rellenarse al revés.
		 * 5. Tercer bucle para comparar posición a posición, con equals (no == ni !=).
		 * 6. return cumple; al final.
		 */
	
	// ===== CÓDIGO CORREGIDO (con tu planteamiento) =====
	public static boolean isPalindrome(String sentence) {
		if (sentence.length() <= 1) {
			System.out.println("La cadena de caracteres recibida tiene una longitud menor o igual a 1");
		    return false;
		    }
		
		String stringMinusculas = sentence.toLowerCase();
		boolean cumple = true;
		String[] array1 = new String[stringMinusculas.length()];
		String[] array2 = new String[stringMinusculas.length()];

		// array1: al derecho
		for (int i = 0; i <= stringMinusculas.length() - 1; i++) {
			array1[i] = "" + stringMinusculas.charAt(i);
		    }

		// array2: al revés (i baja por el String, j sube por el array)
		int j = 0;
		for (int i = stringMinusculas.length() - 1; i >= 0; i--) {
			array2[j] = "" + stringMinusculas.charAt(i);
		    j++;
		    }

		// comparar posición a posición
		for (int i = 0; i < array1.length; i++) {
			if (!array1[i].equals(array2[i])) {
				cumple = false;
				}
			}
		
		return cumple;
		
		    }

	// Prueba rápida
	public static void main(String[] args) {
		System.out.println(isPalindrome("Ana"));   // true
		System.out.println(isPalindrome("Hola"));  // false
		System.out.println(isPalindrome("a"));     // mensaje de error y false
		}
	}

	/*Solución oficial
	 * public staticboolean isPalindrome(String sentence) { 
	 * 	if (sentence.length() <= 1) { 
	 * 		System.out.println("Sentence too short"); 
	 * 		return false; 
	 *	 } 
	 * 
	 * 	String text =sentence.toLowerCase(); 
	 *	 int i = 0; 
	 * 
	 * // Avanza desdeel principio 
	 * 	int j = text.length()-1; 
	 * 
	 * //Retrocede desde el final 
	 * 	while (i <j) { 
	 * 		if (text.charAt(i) == ' ') { 
	 * 			i++; 
	 * 		} else if(text.charAt(j) == ' '){ 
	 * 			j--; 
	 * 		} else { 
	 * 			if (text.charAt(i) != text.charAt(j)) 
	 * 				return false; 
	 * 			i++; 
	 * 			j--; 
	 * 		} 
	 * 	} 
	 * 	return true; 
	 *	}
	 */


