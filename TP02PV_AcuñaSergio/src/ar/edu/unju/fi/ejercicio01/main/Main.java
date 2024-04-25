package ar.edu.unju.fi.ejercicio01.main;

import java.util.ArrayList;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio01.model.Producto;
import ar.edu.unju.fi.ejercicio01.model.Producto.Categoria;
import ar.edu.unju.fi.ejercicio01.model.Producto.OrigenFabricacion;

public class Main {

	private static Menu menu = new Menu();
	private static ArrayList<String> codigos = new ArrayList<>();
	private static OrigenFabricacion or_fab;
	private static Categoria cat;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Producto> productos = new ArrayList<>();
		
		boolean band=true;
		
		while(band) {
			menu.MostrarMenu();
			String op = scanner.nextLine();
			
			switch (op) {
			case "1": {
				productos.add(CargarProducto());
			}
			break;
			
			case "2": {
				for(Producto i : productos) {
					i.MostrarDatos();
				}
			}
			break;
			
			case "3": {
				
			}
			case "4": {
				System.out.println("\n***FIN DEL PROGRAMA***\n");
				band=false;
			}
			break;
			
			default: System.out.println("\n Opcion no disponible");
			break;
			}
		}
		
		
	}

	
	private static Producto CargarProducto() {
		Scanner scanner = new Scanner(System.in);
		Producto producto = new Producto();
		
		String cod=null;
		while(cod==null) {
			System.out.print("\nIngrese codigo del producto: ");
			cod = scanner.nextLine();
			
			if(codigos.contains(cod)) {
				System.out.println("No pueden existir dos codigos iguales");
				cod = null;
			}
		}
		codigos.add(cod);
		producto.setCodigo(cod);
		
		System.out.print("Ingrese una descripcion para el producto: ");
		String descr = scanner.nextLine();
		producto.setDescr(descr);
		
		System.out.print("Ingrese el precio del producto:");
		float precioU = scanner.nextInt();
		producto.setPrecioU(precioU);
		
		boolean band = true;
		
		while(band) {
			band = false;
			
			menu.ElegirOrigenFabricacion();
			String op = scanner.nextLine();
			
			switch(op) {
			case "1": {
				producto.setOr_fab(or_fab.ARGENTINA);
			}
			break;
			
			case "2": {
				producto.setOr_fab(or_fab.CHINA);
			}
			break;
			
			case "3": {
				producto.setOr_fab(or_fab.BRASIL);
			}
			break;
			
			case "4": {
				producto.setOr_fab(or_fab.URUGUAY);
			}
			break;
			
			default: {
				System.out.println("\nOpcion no disponible");
				band = true;
			}
			break;
			
			}
		}
		
		
		band = true;
		while(band) {
			band = false;
			
			menu.ElegirCategoria();
			String op = scanner.nextLine();
			
			switch(op) {
			case "1": {
				producto.setCat(cat.TELEFONIA);
			}
			break;
			
			case "2": {
				producto.setCat(cat.INFORMATICA);
			}
			break;
			
			case "3": {
				producto.setCat(cat.ELECTROHOGAR);
			}
			break;
			
			case "4": {
				producto.setCat(cat.HERRAMIENTAS);
			}
			break;
			
			default: {
				System.out.println("\nOpcion no disponible");
				band = true;
			}
			break;
			
			}
		}
		
		scanner.close();
		return producto;
	}
	
	private static Producto ModificarProducto() {
		Producto producto = new Producto();
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Ingrese una descripcion para el producto: ");
		String descr = scanner.nextLine();
		producto.setDescr(descr);
		
		System.out.print("Ingrese el precio del producto:");
		float precioU = scanner.nextInt();
		producto.setPrecioU(precioU);
		
		boolean band = true;
		
		while(band) {
			band = false;
			
			menu.ElegirOrigenFabricacion();
			String op = scanner.nextLine();
			
			switch(op) {
			case "1": {
				producto.setOr_fab(or_fab.ARGENTINA);
			}
			break;
			
			case "2": {
				producto.setOr_fab(or_fab.CHINA);
			}
			break;
			
			case "3": {
				producto.setOr_fab(or_fab.BRASIL);
			}
			break;
			
			case "4": {
				producto.setOr_fab(or_fab.URUGUAY);
			}
			break;
			
			default: {
				System.out.println("\nOpcion no disponible");
				band = true;
			}
			break;
			
			}
		}
		
		
		band = true;
		while(band) {
			band = false;
			
			menu.ElegirCategoria();
			String op = scanner.nextLine();
			
			switch(op) {
			case "1": {
				producto.setCat(cat.TELEFONIA);
			}
			break;
			
			case "2": {
				producto.setCat(cat.INFORMATICA);
			}
			break;
			
			case "3": {
				producto.setCat(cat.ELECTROHOGAR);
			}
			break;
			
			case "4": {
				producto.setCat(cat.HERRAMIENTAS);
			}
			break;
			
			default: {
				System.out.println("\nOpcion no disponible");
				band = true;
			}
			break;
			
			}
		}
		
		scanner.close();
		return producto;
	}
}
