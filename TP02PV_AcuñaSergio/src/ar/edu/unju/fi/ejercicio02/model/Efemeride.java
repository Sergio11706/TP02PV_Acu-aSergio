package ar.edu.unju.fi.ejercicio02.model;

import ar.edu.unju.fi.ejercicio02.constantes.Mes;

public class Efemeride {
	
	private String codigo;
	private byte dia;
	private Mes mes;
	private String detalle;
	
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public byte getDia() {
		return dia;
	}
	public void setDia(byte dia) {
		this.dia = dia;
	}
	public Mes getMes() {
		return mes;
	}
	public void setMes(Mes mes) {
		this.mes = mes;
	}
	public String getDetalle() {
		return detalle;
	}
	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}
	
	public void MostrarDatos() {
		System.out.println("\nCodigo: "+codigo);
		System.out.println("Detalles: "+detalle);
		System.out.println("Fecha: "+dia+" de "+mes);
	}
}
