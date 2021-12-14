package models;

import java.util.ArrayList;

public class Baraja {

	// Propiedades
	protected ArrayList<Carta> listaCartas = new ArrayList<Carta>();

	// Constructores
	public Baraja() {
		super();
		this.listaCartas = new ArrayList<Carta>();
	}
	
	public Baraja(int tipoBaraja) {
		super();
		for (int i = 1; i <= 40; i++) {
			for (int j = 0; j < tipoBaraja; j++) {
				listaCartas.add(new Carta(i));
			}
		}
	}
	
	public Baraja(int tipoBaraja, boolean barajar) {
		super();
		for (int i = 1; i <= 40; i++) {
			for (int j = 0; j < tipoBaraja; j++) {
				listaCartas.add(new Carta(i));
			}
		}
		if (barajar) {
			barajar();
		}
	}

	// Getters y Setters

	// Métodos
	/**
	 * Aleatoriza las cartas de la baraja. Crea una nueva lista donde añade las cartas
	 * en un orden aleatorio, y luego las devuelve a esa baraja en ese orden.
	 */
	public void barajar() {
		ArrayList<Carta> listaCartasBarajar = new ArrayList<Carta>();
		do {
			int selector = (int) (Math.random() * listaCartas.size());
			listaCartasBarajar.add(listaCartas.get(selector));
			listaCartas.remove(selector);
		} while (listaCartas.size() != 0);
		for (int i = 0; i < listaCartasBarajar.size(); i++) {
			listaCartas.add(listaCartasBarajar.get(i));
		}
		listaCartasBarajar.clear();
	}
	
	/**
	 * Coloca una cantidad de cartas al final de la baraja. Copia la primera carta
	 *  y la coloca al final, en un bucle para determinar la cantidad.
	 * @param posicion Cantidad de cartas que se van a mover.
	 */
	public void cortar(int posicion) {
		for (int i = 0; i < posicion; i++) {
			listaCartas.add(listaCartas.get(0));
			listaCartas.remove(0);
		}
	}

	/**
	 * Devuelve una carta para luego borrarla. Asigna esa carta a un valor, borra la primera carta de la baraja y devuelve la carta.
	 * @return
	 */
	public Carta robar() {
		Carta robada = listaCartas.get(0);
		listaCartas.remove(0);
		return robada;
	}

	/**
	 * Añade una carta al final de la lista, la carta es respecto a su id.
	 * @param idCarta Número de identificación de la carta.
	 */
	public void insertaCartaFinal(int idCarta) {
		listaCartas.add(new Carta (idCarta));
	}

	/**
	 * Añade una carta al principio de la lista, la carta es respecto a su id.
	 * @param idCarta Número de identificación de la carta.
	 */
	public void insertaCartaPrincipio(int idCarta) {
		listaCartas.add(0, new Carta (idCarta));
	}

	/**
	 * Añade una carta al final de la lista.
	 * @param c Carta elegida a añadir.
	 */
	public void insertaCartaFinal(Carta c) {
		listaCartas.add(c);
	}

	/**
	 * Añade una carta al principio de la lista.
	 * @param c Carta elegida a añadir.
	 */
	public void insertaCartaPrincipio(Carta c) {
		listaCartas.add(0, c);
	}

	/**
	 * Dice cuantas cartas hay en la baraja.
	 */
	public void getNumeroCartas() {
		System.out.println("La baraja contiene " + listaCartas.size() + " cartas.");
	}

	/**
	 * Devuelve true si la baraja está vacía. Devuelve false si la baraja contiene cartas.
	 * @return
	 */
	public boolean isVacia() {
		if (listaCartas.size() == 0) {
			return true;
		} else {
			return false;
		}
		
	}

}
