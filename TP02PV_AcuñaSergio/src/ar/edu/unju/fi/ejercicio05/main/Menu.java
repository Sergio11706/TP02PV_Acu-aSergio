package ar.edu.unju.fi.ejercicio05.main;

public class Menu {
	
	public void MostrarMenu() {
		System.out.println("\n***MENU***");
		System.out.println("1.Mostrar lista de productos");
		System.out.println("2.Realizar compra");
		System.out.println("3.Salir");
		System.out.print("Ingrese una opcion: ");
	}
	
	public void MenuCompra(double monto) {
		System.out.println("\n***Realizar Compra***");
		System.out.println("Monto total: "+monto);
		System.out.println("1.Agregar producto");
		System.out.println("2.Pagar con tarjeta");
		System.out.println("3.Pagar con efectivo");
		System.out.println("4.Volver");
		System.out.print("Ingrese una opcion: ");
	}
}