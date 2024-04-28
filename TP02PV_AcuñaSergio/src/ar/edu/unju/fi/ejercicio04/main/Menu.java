package ar.edu.unju.fi.ejercicio04.main;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
	Scanner scanner = new Scanner(System.in);
	private ArrayList<Integer> ids = new ArrayList<>();
	
	public int MostrarMenu() {
		
		System.out.println("**MENU**");
		System.out.println("1- Añadir jugador a la lista");
		System.out.println("2- Mostrar todos los jugadores");
		System.out.println("3- Modificar posicion de un jugador");
		System.out.println("4- Eliminar un jugador de la lista");
		System.out.println("5- Salir");
	
		
		int op = 0;
		do {
			try {
				System.out.print("\nIngrese una opcion: ");
				op = scanner.nextInt();
			}
			catch (InputMismatchException e) {
				System.out.print("\nError al ingresar opcion");
			}
			scanner.nextLine();
		}while(op<1 || op >8);
		
		
		return op;
	}
	
	public int PosicionJugador() {
		
		int op = 0;
		
		do {
			System.out.println("Seleccione posicion del jugador");
			System.out.println("1-Delantero");
			System.out.println("2-Mediocampista");
			System.out.println("3-Defensor");
			System.out.println("4-Arquero");
			System.out.print("\nIngrese una opcion: ");
			op = scanner.nextInt();
			scanner.nextLine();
		}while(op<1 || op >4);
		
		return op;
		
	}
	
	public int IngresarId() {

		int id = -1;
		do {
			
			try {
				System.out.print("\nIngrese ID del jugador: ");
				id = scanner.nextInt();
			}
			catch(InputMismatchException e) {
				System.out.println("ERROR al ingresar ID");
				id = -1;
			}
			scanner.nextLine();
			
			if(ids.contains(id)) {
				System.out.println("No pueden existir dos jugadores con misma ID");
				id = -1;
			}
			
		}while(id==-1);
		
		ids.add(id);
		return id;
	}
	
	public void EliminarId(int n) {
		for(Integer i : ids) {
			if(n==i) {
				ids.remove(i);
				break;
			}
		}
	}
}
