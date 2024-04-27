package ar.edu.unju.fi.ejercicio01.main;

import java.util.ArrayList;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio01.model.Producto;
import ar.edu.unju.fi.ejercicio01.model.Producto.Categoria;
import ar.edu.unju.fi.ejercicio01.model.Producto.OrigenFabricacion;

public class Main {

	private static Menu menu = new Menu();
	private static ArrayList<String> codigos = new ArrayList<>();
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Producto> productos = new ArrayList<>();
		
		boolean band=true;
		String op="";
		
		while(band) {
			menu.MostrarMenu();
			op = scanner.nextLine();
			
			switch (op) {
			case "1": {
				Producto prod = new Producto();
				prod = CargarProducto(scanner,true);
				productos.add(prod);
				System.out.println("\nSe agrego un nuevo producto a la lista");
			}
			break;
			
			case "2": {
				for(Producto i : productos) {
					i.MostrarDatos();
				}
			}
			break;
			
			case "3": {
				System.out.print("\nIngrese codigo del producto para modificar: ");
				String cod = scanner.nextLine();
				
				for(Producto i : productos) {
					
					if(cod.equals(i.getCodigo())) {
						Producto prod = new Producto();
						prod = CargarProducto(scanner,false);
						
						i.setDescr(prod.getDescr());
						i.setPrecioU(prod.getPrecioU());
						i.setCat(prod.getCat());
						i.setOr_fab(prod.getOr_fab());
						
						System.out.println("\nSe modifico el producto de codigo "+cod);
						break;
						
					}
					
				}
			}
			break;
			
			case "4": {
				System.out.println("\n***FIN DEL PROGRAMA***\n");
				band=false;
			}
			break;
			
			default: System.out.println("\n Opcion no disponible");
			break;
			}
		}
		
		scanner.close();
	}

	
	private static Producto CargarProducto(Scanner scanner ,boolean mod) {
		Producto producto = new Producto();
		
		if(mod) {
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
		}
		
		System.out.print("Ingrese una descripcion para el producto: ");
		String descr = scanner.nextLine();
		producto.setDescr(descr);
		
		System.out.print("Ingrese el precio del producto: ");
		float precioU = scanner.nextFloat();
		scanner.nextLine();
		producto.setPrecioU(precioU);
		
		boolean band = true;
		
		while(band) {
			band = false;
			
			menu.ElegirOrigenFabricacion();
			String op = scanner.nextLine();
			
			switch(op) {
			case "1": {
				producto.setOr_fab(OrigenFabricacion.ARGENTINA);
			}
			break;
			
			case "2": {
				producto.setOr_fab(OrigenFabricacion.CHINA);
			}
			break;
			
			case "3": {
				producto.setOr_fab(OrigenFabricacion.BRASIL);
			}
			break;
			
			case "4": {
				producto.setOr_fab(OrigenFabricacion.URUGUAY);
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
				producto.setCat(Categoria.TELEFONIA);
			}
			break;
			
			case "2": {
				producto.setCat(Categoria.INFORMATICA);
			}
			break;
			
			case "3": {
				producto.setCat(Categoria.ELECTROHOGAR);
			}
			break;
			
			case "4": {
				producto.setCat(Categoria.HERRAMIENTAS);
			}
			break;
			
			default: {
				System.out.println("\nOpcion no disponible");
				band = true;
			}
			break;
			
			}
		}
		
		return producto;
	}
	
}
