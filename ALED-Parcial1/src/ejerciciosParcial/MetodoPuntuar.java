package ejerciciosParcial;

public class MetodoPuntuar {
	/*public list<String> getWellRated(float minAverage) {
		 *     list<String> titulosWellRated = new ArrayList<String>();
		 *     float average = 0;                  // la flecha indicaba que iba antes del for
		 *     for (Book b : books) {
		 *         for (int j = 0; j < ratings.length; j++) {
		 *             int numValoraciones = b.getRating(j).length;
		 *             average = ratings / numValoraciones;
		 *             if (average >= minAverage) {
		 *                 titulosWellRated.add(b.getTitle);
		 *             }
		 *             b++;
		 *         }
		 *     }
		 *     return titulosWellRated;
		 * }
		 *
		 * ===== QUÉ SE CAMBIA =====
		 * 1. average se reinicia dentro del for de cada libro.
		 * 2. Las valoraciones se obtienen con b.getRatings() (int[]), y su tamaño con .length.
		 * 3. Se comprueba numValoraciones > 0 para no dividir entre 0 (libros sin valoraciones).
		 * 4. El bucle interior solo suma: suma = suma + b.getRatings()[j];
		 * 5. La media y el add se hacen fuera del bucle interior (una vez por libro).
		 * 6. (float) suma / numValoraciones para no perder decimales.
		 * 7. getTitle() lleva paréntesis y List va con mayúscula.
		 * 8. Se quita b++ (el for-each avanza solo).
		 */

	
	 // ===== CÓDIGO CORREGIDO (con tu planteamiento) =====
    public List<String> getWellRated(float minAverage) {
        List<String> titulosWellRated = new ArrayList<String>();

        for (Book b : books) {
            float average = 0;
            int suma = 0;
            int numValoraciones = b.getRatings().length;

            if (numValoraciones > 0) {
                for (int j = 0; j < numValoraciones; j++) {
                    suma = suma + b.getRatings()[j];
                }
                average = (float) suma / numValoraciones;

                if (average >= minAverage) {
                    titulosWellRated.add(b.getTitle());
                }
            }
        }

        return titulosWellRated;
    }

    // Prueba rápida con el ejemplo del enunciado (resultado esperado: [El Quijote, Dune]) NO compila por clase BOOK
    public static void main(String[] args) {
        List<Book> libros = new ArrayList<Book>();
        libros.add(new Book("El Quijote", new int[]{5, 4, 5}));
        libros.add(new Book("Manual de Java", new int[]{2, 3}));
        libros.add(new Book("Rayuela", new int[]{}));
        libros.add(new Book("Dune", new int[]{4, 3, 5, 4}));

        Ejercicio2_getWellRated biblioteca = new Ejercicio2_getWellRated(libros);
        System.out.println(biblioteca.getWellRated(4.0f));
    }
    
    /*Solución oficial
     * public List<String> getWellRated(float minAverage) { 
     * 	List<String> titulos = new ArrayList<String>(); 
     * 		for (Book book: books) { 
     * 			int[] ratings= book.getRatings(); 
     * // Los libros sin valoraciones sedescartan (y evitamos dividir por 0) 
     * 			if (ratings.length == 0) 
     * 				continue; 
     * 			int suma =0; 
     * 			for (int i= 0;i < ratings.length; i++) { 
     * 				suma += ratings[i]; 
     * 			} 
     * 			// El castevita división de enteros 
     * 			float media= (float) suma / ratings.length; 
     * 			if (media >= minAverage) titulos.add(book.getTitle()); 
     * 		} 
     * 		return titulos; 
     *	}
     */
    
    
}



