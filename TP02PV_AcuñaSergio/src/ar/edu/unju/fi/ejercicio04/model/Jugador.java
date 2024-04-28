package ar.edu.unju.fi.ejercicio04.model;

import java.time.LocalDate;
import java.time.Period;
import ar.edu.unju.fi.ejercicio04.constantes.Posicion;

public class Jugador {
	private int id;
	private String nombre;
	private String apellido;
	private LocalDate fec_nac;
	private String nacionalidad;
	private float estatura;
	private byte peso;
	private Posicion posicion;
	
	
	public Jugador(int id,String nombre, String apellido, LocalDate fec_nac, String nacionalidad, float estatura, byte peso, Posicion posicion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fec_nac = fec_nac;
		this.nacionalidad = nacionalidad;
		this.estatura = estatura;
		this.peso = peso;
		this.posicion = posicion;
	}
	
	
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getApellido() {
		return apellido;
	}



	public void setApellido(String apellido) {
		this.apellido = apellido;
	}



	public LocalDate getFec_nac() {
		return fec_nac;
	}



	public void setFec_nac(LocalDate fec_nac) {
		this.fec_nac = fec_nac;
	}



	public String getNacionalidad() {
		return nacionalidad;
	}



	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}



	public float getEstatura() {
		return estatura;
	}



	public void setEstatura(float estatura) {
		this.estatura = estatura;
	}



	public byte getPeso() {
		return peso;
	}



	public void setPeso(byte peso) {
		this.peso = peso;
	}



	public Posicion getPosicion() {
		return posicion;
	}



	public void setPosicion(Posicion posicion) {
		this.posicion = posicion;
	}



	public int CalcularEdad() {
		LocalDate hoy = LocalDate.now();
		Period period = Period.between(fec_nac, hoy);
		int edad = period.getYears();
		return edad;
	}
	
	public void MostrarDatos() {
		System.out.println("\nID: "+id);
		System.out.println("Nombre: "+nombre);
		System.out.println("Apellido: "+apellido);
		System.out.println("Edad: "+CalcularEdad());
		System.out.println("Nacionalidad: "+nacionalidad);
		System.out.println("Posicion: "+posicion);
	}
}
