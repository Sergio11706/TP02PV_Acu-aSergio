package ar.edu.unju.fi.ejercicio03.main;

import java.util.ArrayList;
import java.util.Arrays;

import ar.edu.unju.fi.ejercicio03.constantes.Provincia;

public class Main {

	public static void main(String[] args) {
		ArrayList<Provincia> provincias = new ArrayList<>(Arrays.asList(Provincia.values()));
		
		for(Provincia i : provincias) {
			System.out.println("\nProvincia: "+i);
			System.out.println("Cantidad de Poblacion: "+i.getCantPoblacion());
			System.out.println("Superficie: "+i.getSuperficie());
			System.out.println("Densidad de Poblacion: "+i.DensidadPoblacion());
		}
	}

}
