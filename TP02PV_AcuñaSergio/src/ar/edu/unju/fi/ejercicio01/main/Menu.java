package ar.edu.unju.fi.ejercicio01.main;

public class Menu {
	
	public void MostrarMenu() {
		System.out.println("***MENU***");
		System.out.println("1-Crear producto");
		System.out.println("2-Mostrar productos");
		System.out.println("3-Modificar producto");
		System.out.println("4-Salir");
		System.out.print("Ingrese una opcion: ");
	}
	
	public void ElegirOrigenFabricacion() {
		System.out.println("\n***ORIGEN DE FABRICACION***");
		System.out.println("1-Argentina \n2-China \n3-Brasil \n4-Uruguay");
		System.out.print("Elija una opcion: ");
	}
	
	public void ElegirCategoria() {
		System.out.println("\n***ORIGEN DE FABRICACION***");
		System.out.println("1-Telefonia \n2-Informatica \n3-Electrohogar \n4-Herramienta");
		System.out.print("Elija una opcion: ");
	}
}
