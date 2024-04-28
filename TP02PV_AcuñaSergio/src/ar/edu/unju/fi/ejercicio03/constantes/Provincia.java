package ar.edu.unju.fi.ejercicio03.constantes;

public enum Provincia {
	JUJUY(673307,53244.2),
	SALTA(1214441,155340.5),
	TUCUMAN(1448188,22592.1),
	CATAMARCA(367828,101486.1),
	LA_RIOJA(333642,91493.7),
	SANTIAGO_DEL_ESTERO(874006,136934.3); 
	
	private int cantPoblacion;
	private double superficie;
	
	
	private Provincia(int cantPoblacion, double superficie) {
		this.cantPoblacion = cantPoblacion;
		this.superficie = superficie;
	}


	public int getCantPoblacion() {
		return cantPoblacion;
	}

	public void setCantPoblacion(int cantPoblacion) {
		this.cantPoblacion = cantPoblacion;
	}


	public double getSuperficie() {
		return superficie;
	}

	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}
	
	
	public double DensidadPoblacion() {
		return cantPoblacion/superficie;
	}
	
}
