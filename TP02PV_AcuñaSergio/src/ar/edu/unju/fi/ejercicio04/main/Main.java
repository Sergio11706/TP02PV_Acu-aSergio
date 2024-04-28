package ar.edu.unju.fi.ejercicio04.main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio04.constantes.Posicion;
import ar.edu.unju.fi.ejercicio04.model.*;

public class Main {

	public static void main(String[] args) {
		ArrayList<Jugador> jugadores =new ArrayList<>();
		Menu menu = new Menu();
		Scanner scanner = new Scanner(System.in);
		int op = -1;
		
		do {
			op = menu.MostrarMenu();
			switch(op){
			
			case 1: {
								
				int id = menu.IngresarId();
				
				System.out.print("Ingrese nombre del jugador: ");
				String nombre = scanner.nextLine();
				
				System.out.print("Ingrese apelldio del jugador: ");
				String apellido = scanner.nextLine();
				
				System.out.print("Ingrese nacionalidad del jugador: ");
				String nacionalidad = scanner.nextLine();
				
				System.out.print("Ingrese estatura del jugador: ");
				float estatura = scanner.nextFloat();
				scanner.nextLine();
				
				System.out.print("Ingrese peso del jugador: ");
				byte peso = scanner.nextByte();
				scanner.nextLine();
				
				System.out.println("Ingrese fecha de nacimiento del jugador");
				System.out.print("Dia: ");
				int dia = scanner.nextInt();
				System.out.print("Mes: ");
				int mes = scanner.nextInt();
				System.out.print("Año: ");
				int anio = scanner.nextInt();
				scanner.nextLine();
				LocalDate fec_nac = LocalDate.of(anio, mes, dia);
				
				int posicion = menu.PosicionJugador();
				
				switch(posicion) {
				case 1: jugadores.add(new Jugador(id, nombre, apellido, fec_nac, nacionalidad, estatura, peso, Posicion.DELANTERO));
				break;
				
				case 2: jugadores.add(new Jugador(id, nombre, apellido, fec_nac, nacionalidad, estatura, peso, Posicion.MEDIO));			
				break;
				
				case 3: jugadores.add(new Jugador(id, nombre, apellido, fec_nac, nacionalidad, estatura, peso, Posicion.DEFENSA));
				break;
				
				case 4: jugadores.add(new Jugador(id, nombre, apellido, fec_nac, nacionalidad, estatura, peso, Posicion.ARQUERO));
				break;
				}
				
				System.out.println("\nSe añadio un jugador correctamente\n");
			}
			break;
			
			case 2: {
				for(Jugador i : jugadores) {
					i.MostrarDatos();
				}
			}
			break;
			
			case 3: {
				
				System.out.print("\nIngresar ID del jugador para modificar la posicion: ");
				int id = scanner.nextInt();
				scanner.nextLine();
				
				for(Jugador i : jugadores) {
					if(i.getId() == id) {
						
						int posicion = menu.PosicionJugador();

						switch(posicion) {
						case 1: i.setPosicion(Posicion.DELANTERO);
						break;
						
						case 2: i.setPosicion(Posicion.MEDIO);
						break;
						
						case 3: i.setPosicion(Posicion.DEFENSA);
						break;
						
						case 4: i.setPosicion(Posicion.ARQUERO);
						break;
						}
						
						System.out.println("\nSe modifico la posicion del jugador con ID "+id);
						break;
					}
				}
				
			}
			break;
			
			case 4: {
				
				System.out.print("\nIngresar ID para eliminar jugador: ");
				int id = scanner.nextInt();
				scanner.nextLine();
				
				for(Jugador i : jugadores) {
					if(i.getId() == id) {
						menu.EliminarId(id);
						jugadores.remove(i);
						System.out.println("\nSe elimino el jugador de ID "+id);
						break;
					}
				}
				
			}
			break;
			
			case 5: {
				System.out.println("\n**FIN DEL PROGRAMA**\n");
			}
			break;
			
			default: System.out.println("OPCION NO DISPONIBLE");
			}
			
		}while(op!=8);
		
		scanner.close();
	}

}
