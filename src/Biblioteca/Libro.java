package Biblioteca;

public  class Libro{
	
	protected String nombre;
	protected Double precio;
	protected String autor;
	protected int num;
	
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public void calcularPrecio() {
		
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
		this.calcularPrecio();
	}
	
	@Override
	public String toString() {
		return "Libro [nombre=" + nombre + ", autor=" + autor + ", precio=" + precio + "]";
	
	}
	
}
	
