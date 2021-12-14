package models;

import java.util.Scanner;

public class Mano extends Baraja {
	
	// Propiedades
	public Mano() {
		super();
	}

	// Constructores

	// Getters y Setters

	// Métodos
	void listarCartas() {
		for (Carta c : this.listaCartas) {
			System.out.println(c);
		}
	}
	
	Carta elegirCarta() {
		Scanner sc = new Scanner(System.in);
		
		return null;
	}
}
