package Biblioteca;

//import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	// private Boolean agregarLibro=true;
	private static Scanner sc;
	private Map<Integer, Libro> listaLibros = new HashMap<>();
	private Collection<Libro> libros;

	Carrito car = new Carrito();

	public static void main(String[] args) {
		Main miMain = new Main();
		miMain.cargarDato();
		miMain.ejecutarPrograma();

	}

	public void ejecutarPrograma() {
		sc = new Scanner(System.in);
		this.libros = new ArrayList<>();
		System.out.println("**Libros Disponibles:**");
		this.mostrarLibros();
		System.out.println("Cuantos libros desea?");
		int cantidad = sc.nextInt();
		for (int i = 0; i < cantidad; i++) {
			System.out.println("Elija su libro: ");		
			if (sc.hasNextInt()) {
				// pedir este numero al usuario
				Integer numeroElejido = sc.nextInt();
				// meter este libro seleccionado al carrito
				Libro libroElejido = listaLibros.get(numeroElejido);
				//agregando libto elegido a array de libros del carrito
				this.libros.add(libroElejido);
			}else {
				System.out.println("por favor escoja un numero de libro");
			}
		}
		Carrito.calcular(libros);

	}
	

	public void mostrarLibros() {
		Collection<Libro> libros = listaLibros.values();
		for (Libro libro : libros) {
			System.out.println(libro.getNum() + ") " + " Nombre: " + libro.nombre + " Autor: " + libro.autor
					+ " Precio: " + libro.precio);
		}
	}

	
	
	
	public void cargarDato() {

		Libro instanciadelibro1 = new Libro();
		instanciadelibro1.setNombre("Microservicios");
		instanciadelibro1.setAutor("Christian Posta");
		instanciadelibro1.setPrecio(45.98);
		instanciadelibro1.setNum(1);
		listaLibros.put(1, instanciadelibro1);

		Libro instanciadelibro2 = new Libro();
		instanciadelibro2.setNombre("Patrones de diseno");
		instanciadelibro2.setAutor("Markus Eisele");
		instanciadelibro2.setPrecio(72.807);
		instanciadelibro2.setNum(2);
		listaLibros.put(2, instanciadelibro2);

		Libro instanciadelibro3 = new Libro();
		instanciadelibro3.setNombre("Programación Orientada a Objetos");
		instanciadelibro3.setAutor("Richard Warbuton:");
		instanciadelibro3.setPrecio(45.98);
		instanciadelibro3.setNum(3);
		listaLibros.put(3, instanciadelibro3);

		Libro instanciadelibro4 = new Libro();
		instanciadelibro4.setNombre("Aprendiendo Java:");
		instanciadelibro4.setAutor("Ben Evans");
		instanciadelibro4.setPrecio(66.81);
		instanciadelibro4.setNum(4);
		listaLibros.put(4, instanciadelibro4);

		Libro instanciadelibro5 = new Libro();
		instanciadelibro5.setNombre("Aprendiendo Python:");
		instanciadelibro5.setAutor("David Mertz:");
		instanciadelibro5.setPrecio(43.27);
		instanciadelibro5.setNum(5);
		listaLibros.put(5, instanciadelibro5);

		Libro instanciadelibro6 = new Libro();
		instanciadelibro6.setNombre("Big Data con Hadoop");
		instanciadelibro6.setAutor("Donald Miner");
		instanciadelibro6.setPrecio(39.60);
		instanciadelibro6.setNum(6);
		listaLibros.put(6, instanciadelibro6);

		Libro instanciadelibro7 = new Libro();
		instanciadelibro7.setNombre("IOS con Swift:");
		instanciadelibro7.setAutor("Tim Nugent:");
		instanciadelibro7.setPrecio(24.18);
		instanciadelibro7.setNum(7);
		listaLibros.put(7, instanciadelibro7);

		Libro instanciadelibro8 = new Libro();
		instanciadelibro8.setNombre("IOS con Swift:");
		instanciadelibro8.setAutor("Tim Nugent:");
		instanciadelibro8.setPrecio(24.18);
		instanciadelibro8.setNum(8);
		listaLibros.put(8, instanciadelibro8);

		Libro instanciadelibro9 = new Libro();
		instanciadelibro9.setNombre("Programación con C");
		instanciadelibro9.setAutor("Joel Falcou:");
		instanciadelibro9.setPrecio(58.70);
		instanciadelibro9.setNum(9);
		listaLibros.put(9, instanciadelibro9);

		Libro instanciadelibro10 = new Libro();
		instanciadelibro10.setNombre("Diseño de Sistemas:");
		instanciadelibro10.setAutor(" Joel Falcou:");
		instanciadelibro10.setPrecio(55.67);
		instanciadelibro10.setNum(10);
		listaLibros.put(10, instanciadelibro10);

	}

}
