package wumpus;

/**
* Esta clase define el Jugador que extiende a Personakes
* @author: Miguel Ángel Badi Pardo
* @version: 27/12/2017
*/

public class Pozo extends Personajes{

	/* Constructor para poner el pozo en una posición aleatoria dentro del tablero
	 * @param ancho El ancho del tablero de la partido en número de celdas
	 * @param alto El alto del tablero de la partido en número de celdas
     */
	
	public Pozo(int ancho, int alto) {
		super(ancho,alto);
	}

}
