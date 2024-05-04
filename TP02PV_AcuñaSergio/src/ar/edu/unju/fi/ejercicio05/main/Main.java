package ar.edu.unju.fi.ejercicio05.main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio05.model.PagoEfectivo;
import ar.edu.unju.fi.ejercicio05.model.PagoTarjeta;
import ar.edu.unju.fi.ejercicio05.model.Producto;

public class Main {
	
	private static ArrayList<Producto> productos = new ArrayList<>();
	private static Menu menu = new Menu();
	private static Scanner scanner = new Scanner(System.in);
	private static double monto=0.0;
	
	public static void main(String[] args) {
		CargarProductos();
		boolean band = true;
		while(band) {
			menu.MostrarMenu();
			String op = scanner.nextLine();
			switch(op) {
			case "1": {
				for(Producto i : productos) {
					i.MostrarDatos();
				}
			}
			break;
			
			case "2": {
				Comprar();
			}
			break;
			
			case "3": {
				System.out.println("***FIN DEL PROGRAMA***");
				band = false;
			}
			}
		}
	}
	
	
	private static void Comprar() {
		boolean band=true;
		while(band) {
			menu.MenuCompra(monto);
			String op = scanner.nextLine();
			switch(op) {
			case "1": {
				System.out.print("Ingrese ID del producto para agregar al monto: ");
				String id = scanner.nextLine();
				for(Producto i : productos) {
					if(i.getId().equals(id)) {
						if(!i.getEstado()) {
							System.out.println("\nEl producto se encuentra sin stock");
							break;
						}
						monto += i.getPrecio();
						i.setUnidades(i.getUnidades()-1);
						if(i.getUnidades() == 0) i.setEstado(false);
						break;
					}
				}
			}
			break;
			
			case "2": {
				PagoTarjeta pagoTarjeta = new PagoTarjeta("4539123456789090", LocalDate.now(), 0.0);
				pagoTarjeta.realizarPago(monto);
				monto = 0.0;
				pagoTarjeta.imprimirRecibo();
			}
			break;
			
			case "3": {
				PagoEfectivo pagoEfectivo = new PagoEfectivo(0.0, LocalDate.now());
				pagoEfectivo.realizarPago(monto);
				monto = 0.0;
				pagoEfectivo.imprimirRecibo();
			}
			break;
			
			case "4": {
				band = false;
			}
			break;
			
			default : System.out.println("\nError al ingresar opcion");
			}
		}
	}
	
	
	private static void CargarProductos() {
		productos.add(new Producto("1", "Galletas Oreo", 2000.0, true, 3));
		productos.add(new Producto("2", "Galletas Pepito", 1800.0, true, 5));
		productos.add(new Producto("3", "Chocolate Milka", 2500.0, true, 2));
		productos.add(new Producto("4", "Paleta de Caramelo", 1000.0, true, 8));
		productos.add(new Producto("5", "Paquete de chicles", 1500.0, true, 6));
		productos.add(new Producto("6", "Gomitas de Ositos", 1200.0, true, 4));
		productos.add(new Producto("7", "Barra de cereal", 1800.0, true, 5));
		productos.add(new Producto("8", "Paquete de mentas", 900.0, true, 7));
		productos.add(new Producto("9", "Turrón de mani", 2200.0, true, 3));
		productos.add(new Producto("10", "Bolsa de caramelos", 3000.0, true, 4));
		productos.add(new Producto("11", "Pochoclos", 1500.0, true, 3));
		productos.add(new Producto("12", "Coca Cola 2L", 2200.0, true, 3));
		productos.add(new Producto("13", "Malvaviscos", 1400.0, true, 6));
		productos.add(new Producto("14", "Jugo Baggio 1,5L", 1400.0, true, 2));
		productos.add(new Producto("15", "Caja de Bombones", 3700.0, true, 1));
	}
}