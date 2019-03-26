package Biblioteca;

import java.util.Collection;
import java.util.List;
//import java.util.Scanner


public class Carrito {	
	
	public static void calcular(Collection<Libro> libros) {
		double total =0;
		
		for(Libro libro : libros) {
			total += libro.precio;
			System.out.println(libro.num + " " +libro.nombre+" "+ libro.precio + " ");
		}
		System.out.println("Su total es:" +total);	
		
}
	
	
	
	
	
}
