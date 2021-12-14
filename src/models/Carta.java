package models;

public class Carta {

	// Propiedades
	private int numero;
	private int palo;

	// Constructores
	public Carta(int numero, int palo) {
		super();
		this.numero = numero;
		this.palo = palo;
	}

	public Carta(int id) {
		super();
		numero = (id - 1) % 10 + 1;
		palo = (id - 1) / 10;
	}

	// Getters y Setters
	public int getNumero() {
		return numero;
	}

	public int getPalo() {
		return palo;
	}

	// Métodos
	/**
	 * Devuelve el numero de identidad respecto a la posición ordenada de la baraja.
	 * @return
	 */
	public int getId() {
		return (numero + palo * 10);
	}

	/**
	 * Devuelve el nombre del número elegido.
	 * @param numero Número a obtener nombre.
	 */
	public void getNombreNumero(int numero) {
		switch (numero) {
		case 1:
			System.out.print("As");
			break;
		case 2:
			System.out.print("Dos");
			break;
		case 3:
			System.out.print("Tres");
			break;
		case 4:
			System.out.print("Cuatro");
			break;
		case 5:
			System.out.print("Cinco");
			break;
		case 6:
			System.out.print("Seis");
			break;
		case 7:
			System.out.print("Siete");
			break;
		case 8:
			System.out.print("Sota");
			break;
		case 9:
			System.out.print("Caballo");
			break;
		case 10:
			System.out.print("Rey");
			break;
		}
	}

	/**
	 * Devuelve el nombre del palo elegido.
	 * @param palo Palo a obtener nombre.
	 */
	public void getNombrePalo(int palo) {
		switch (palo) {
		case 0:
			System.out.print("Oros");
			break;
		case 1:
			System.out.print("Copas");
			break;
		case 2:
			System.out.print("Espadas");
			break;
		case 3:
			System.out.print("Bastos");
			break;
		}
	}

	/**
	 * Obtiene el nombre completo de la carta (ej: as de oros).
	 * @param numero Número de la carta.
	 * @param palo Palo de la carta.
	 */
	public void getNombreCarta(int numero, int palo) {
		getNombreNumero(numero);
		System.out.print(" de ");
		getNombrePalo(palo);
	}

	/**
	 * Obtiene los valores de la carta en el juego del Tute.
	 * @param numero Carta del valor a obtener.
	 * @return
	 */
	public int getValorTute(int numero) {
		int valor;
		switch (numero) {
		case 1:
			valor = 11;
			break;
		case 3:
			valor = 10;
			break;
		case 8:
			valor = 2;
			break;
		case 9:
			valor = 3;
			break;
		case 10:
			valor = 4;
			break;
		default:
			valor = 0;
		}
		return valor;
	}

	/**
	 * Obtiene los valores de la carta en el juego del Mus.
	 * @param numero Carta del valor a obtener.
	 * @return
	 */
	public int getValorMus(int numero) {
		int valor;
		switch (numero) {
		case 1:
			valor = 1;
			break;
		case 2:
			valor = 1;
			break;
		case 4:
			valor = 4;
			break;
		case 5:
			valor = 5;
			break;
		case 6:
			valor = 6;
			break;
		case 7:
			valor = 7;
			break;
		default:
			valor = 10;
		}
		return valor;
	}

	/**
	 * Obtiene los valores de la carta en el juego del 7 y Medio.
	 * @param numero Carta del valor a obtener.
	 * @return
	 */
	public double getValor7ymedio(int numero) {
		double valor;
		switch (numero) {
		case 1:
			valor = 1;
			break;
		case 2:
			valor = 2;
			break;
		case 3:
			valor = 3;
			break;
		case 4:
			valor = 4;
			break;
		case 5:
			valor = 5;
			break;
		case 6:
			valor = 6;
			break;
		case 7:
			valor = 7;
			break;
		default:
			valor = 0.5;
		}
		return valor;
	}

}
