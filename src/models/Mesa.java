package models;

import java.util.ArrayList;
import java.util.List;

public class Mesa {
	
	// Propiedades
	private Baraja baraja;

	// Constructores
	public Mesa() {
		this.baraja = new Baraja(1, true);
	}

	// Getters y Setters
	public Baraja getBaraja() {
		return baraja;
	}

	// Métodos
	Carta robarCartaDeBaraja() {
		return this.baraja.robar();
	}
	
	List<Carta> robarVariasCartas(int n) {
		ArrayList<Carta> aux = new ArrayList<Carta>();
		for (int i = 0; i < n; i++) {
			aux.add(this.baraja.robar());
		}
		return aux;
	}
	
	void addCartaABaraja(Carta c) {
		this.baraja.insertaCartaFinal(c);
	}

}
