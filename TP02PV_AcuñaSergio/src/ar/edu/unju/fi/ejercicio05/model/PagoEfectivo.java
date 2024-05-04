package ar.edu.unju.fi.ejercicio05.model;

import java.time.LocalDate;

import ar.edu.unju.fi.ejercicio05.interfaces.Pago;

public class PagoEfectivo implements Pago {
	
	private double montoPagado;
	private LocalDate fechaPago;
	
	public PagoEfectivo(double montoPagado, LocalDate fechaPago) {
		super();
		this.montoPagado = montoPagado;
		this.fechaPago = fechaPago;
	}

	
	public double getMontoPagado() {
		return montoPagado;
	}

	public void setMontoPagado(double montoPagado) {
		this.montoPagado = montoPagado;
	}

	public LocalDate getFechaPago() {
		return fechaPago;
	}

	public void setFechaPago(LocalDate fechaPago) {
		this.fechaPago = fechaPago;
	}
	
	
	@Override
	public void realizarPago(double monto) {
		montoPagado += monto;
		montoPagado -= 0.10 * montoPagado;
	}
	
	@Override
	public void imprimirRecibo() {
		System.out.println("\nRecibo de Compra");
		System.out.println("Fecha del pago: "+fechaPago.getDayOfMonth()+"/"+fechaPago.getMonthValue()+"/"+fechaPago.getYear());
		System.out.println("Monto pagado: "+montoPagado);
	}
}