package models;

import java.util.ArrayList;
import enums.ModoJuego;

public abstract class AbstractGame {
	
	// Propiedades
	private boolean finalizado;
	private ModoJuego modo;
	private Mesa mesa;
	private ArrayList<AbstractPlayer> jugadores;
	private int ronda;

	// Constructores
	public AbstractGame() {
		
	}

	// Getters y Setters

	// Métodos

}
