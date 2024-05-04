package ar.edu.unju.fi.ejercicio05.model;

import java.time.LocalDate;

import ar.edu.unju.fi.ejercicio05.interfaces.Pago;

public class PagoTarjeta implements Pago {
	private String numTarjeta;
	private LocalDate fechaPago;
	private double montoPagado;
	
	public PagoTarjeta(String numTarjeta, LocalDate fechaPago, double montoPagado) {
		super();
		this.numTarjeta = numTarjeta;
		this.fechaPago = fechaPago;
		this.montoPagado = montoPagado;
	}

	
	public String getNumTarjeta() {
		return numTarjeta;
	}

	public void setNumTarjeta(String numTarjeta) {
		this.numTarjeta = numTarjeta;
	}

	public LocalDate getFechaPago() {
		return fechaPago;
	}

	public void setFechaPago(LocalDate fechaPago) {
		this.fechaPago = fechaPago;
	}

	public double getMontoPagado() {
		return montoPagado;
	}

	public void setMontoPagado(double montoPagado) {
		this.montoPagado = montoPagado;
	}
	
	
	@Override
	public void realizarPago(double monto) {
		montoPagado += monto;
		montoPagado -= 0.15 * montoPagado;
	}
	
	@Override
	public void imprimirRecibo() {
		System.out.println("\nRecibo de Compra");
		System.out.println("Numero de Tarjeta: "+numTarjeta);
		System.out.println("Fecha del pago: "+fechaPago.getDayOfMonth()+"/"+fechaPago.getMonthValue()+"/"+fechaPago.getYear());
		System.out.println("Monto pagado: "+montoPagado);
	}
}