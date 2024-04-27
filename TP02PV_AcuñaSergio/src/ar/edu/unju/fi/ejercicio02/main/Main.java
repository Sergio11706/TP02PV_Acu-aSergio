package ar.edu.unju.fi.ejercicio02.main;

import java.util.ArrayList;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio02.constantes.*;
import ar.edu.unju.fi.ejercicio02.model.*;

public class Main {

	private static Menu menu = new Menu();
	private static ArrayList<String> codigos = new ArrayList<>();
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Efemeride> efemerides = new ArrayList<>();
		
		boolean band=true;
		String op="";
		
		while(band) {
			menu.MostrarMenu();
			op = scanner.nextLine();
			
			switch (op) {
			case "1": {
				Efemeride efem = new Efemeride();
				efem = CargarEfemeride(scanner,true);
				efemerides.add(efem);
				System.out.println("\nSe añadio una nueva efemeride");
			}
			break;
			
			case "2": {
				for(Efemeride i : efemerides) {
					i.MostrarDatos();
				}
			}
			break;
			
			case "3": {
				System.out.print("\nIngrese codigo de la efemeride para eliminar: ");
				String cod = scanner.nextLine();
				
				for(Efemeride i : efemerides) {
					
					if(cod.equals(i.getCodigo())) {
						efemerides.remove(i);
						System.out.println("\nSe elimino la efemeride de codigo "+cod);
						break;
					}
					
				}
			}
			break;
			
			case "4": {
				System.out.print("\nIngrese codigo de la efemeride para modificar: ");
				String cod = scanner.nextLine();
				
				for(Efemeride i : efemerides) {
					
					if(cod.equals(i.getCodigo())) {
						Efemeride efem = new Efemeride();
						efem = CargarEfemeride(scanner,false);
						
						i.setDetalle(efem.getDetalle());
						i.setDia(efem.getDia());
						i.setMes(efem.getMes());
						
						System.out.println("\nSe modifico la efemeride de codigo "+cod);
						break;
						
					}
					
				}
			}
			break;
			
			case "5": {
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
	
	
	private static Efemeride CargarEfemeride(Scanner scanner ,boolean mod) {
		Efemeride efem = new Efemeride();
		
		if(mod) {
			String cod=null;
			while(cod==null) {
				System.out.print("\nIngrese codigo de la efemeride: ");
				cod = scanner.nextLine();
				
				if(codigos.contains(cod)) {
					System.out.println("No pueden existir dos codigos iguales");
					cod = null;
				}
			}
			codigos.add(cod);
			efem.setCodigo(cod);
		}
		
		System.out.print("Ingrese los detalles de la efemeride: ");
		String detalle = scanner.nextLine();
		efem.setDetalle(detalle);
		
		System.out.print("Ingrese el dia: ");
		byte dia = scanner.nextByte();
		scanner.nextLine();
		efem.setDia(dia);
		
		boolean band = true;
		
		while(band) {
			band = false;
			
			System.out.print("Ingrese el mes: ");
			String mes = scanner.nextLine();
			
			switch(mes) {
			case "1": {
				efem.setMes(Mes.ENERO);
			}
			break;
			
			case "2": {
				efem.setMes(Mes.FEBRERO);
			}
			break;
			
			case "3": {
				efem.setMes(Mes.MARZO);
			}
			break;
			
			case "4": {
				efem.setMes(Mes.ABRIL);
			}
			break;
			
			case "5": {
				efem.setMes(Mes.MAYO);
			}
			break;
			
			case "6": {
				efem.setMes(Mes.JUNIO);
			}
			break;
			
			case "7": {
				efem.setMes(Mes.JULIO);
			}
			break;
			
			case "8": {
				efem.setMes(Mes.AGOSTO);
			}
			break;
			
			case "9": {
				efem.setMes(Mes.SEPTIEMBRE);
			}
			break;
			
			case "10": {
				efem.setMes(Mes.OCTUBRE);
			}
			break;
			
			case "11": {
				efem.setMes(Mes.NOVIEMBRE);
			}
			break;
			
			case "12": {
				efem.setMes(Mes.DICIEMBRE);
			}
			break;
			
			default: {
				System.out.println("\nOpcion no disponible");
				band = true;
			}
			break;
			
			}
		}
		
		
		return efem;
	}

}
