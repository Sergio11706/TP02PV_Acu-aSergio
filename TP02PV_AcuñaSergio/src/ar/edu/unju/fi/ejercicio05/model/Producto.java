package ar.edu.unju.fi.ejercicio05.model;

public class Producto {
	
	private String id;
	private String nombre;
	private double precio;
	private boolean estado;
	private int unidades;
	
	
	public Producto(String id, String nombre, double precio, boolean estado, int unidades) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
		this.estado = estado;
		this.unidades = unidades;
	}
	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public boolean getEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}


	public int getUnidades() {
		return unidades;
	}

	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}


	public void MostrarDatos() {
		System.out.println("\nID: "+id);
		System.out.println("Nombre del producto "+nombre);
		if(estado) {
			System.out.println("Estado: Disponible");
			System.out.println("Precio: "+precio);
			System.out.println("Unidades disponible: "+unidades);
		}
		else System.out.println("Estado: NO Disponible");
	}
}
