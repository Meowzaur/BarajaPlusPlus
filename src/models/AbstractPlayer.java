package models;

public abstract class AbstractPlayer {
	
	// Propiedades
	private Mano mano;
	private Mesa mesa;
	private String nombre;
	private int puntos;

	// Constructores
	public AbstractPlayer(Mesa mesa, String nombre) {
		super();
		this.mano = new Mano();
		this.mesa = mesa;
		this.nombre = nombre;
		this.puntos = 0;
	}

	// Getters y Setters

	// Métodos
	abstract void jugarTurno();

}
