package ar.edu.unju.fi.ejercicio01.model;

public class Producto {
	private String codigo;
	private String descr;
	private float precioU;
	private OrigenFabricacion or_fab;
	private Categoria cat;
	
	
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescr() {
		return descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}

	public float getPrecioU() {
		return precioU;
	}

	public void setPrecioU(float precioU) {
		this.precioU = precioU;
	}

	public OrigenFabricacion getOr_fab() {
		return or_fab;
	}

	public void setOr_fab(OrigenFabricacion or_fab) {
		this.or_fab = or_fab;
	}

	public Categoria getCat() {
		return cat;
	}

	public void setCat(Categoria cat) {
		this.cat = cat;
	}


	public enum OrigenFabricacion{
		ARGENTINA,
		CHINA,
		BRASIL,
		URUGUAY,
	}
	
	public enum Categoria{
		TELEFONIA, 
		INFORMATICA,
		ELECTROHOGAR, 
		HERRAMIENTAS, 
	}
	
	
	public void MostrarDatos() {
		System.out.println("\nCodigo: "+codigo);
		System.out.println("Descripcion: "+descr);
		System.out.println("Precio: "+precioU);
		System.out.println("Origen de fabricacion: "+or_fab);
		System.out.println("Categoria: "+cat+"\n");
	}
	
}
