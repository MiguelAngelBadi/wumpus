package wumpus;

/**
* Esta clase define el Jugador que extiende a Personakes
* @author: Miguel �ngel Badi Pardo
* @version: 27/12/2017
*/

public class Wumpus extends Personajes{

	/**
	* Campos de la clase
	*/
	private boolean vivo;

	/* Constructor para poner al wumpus en una posici�n aleatoria dentro del tablero
	 * @param ancho El ancho del tablero de la partido en n�mero de celdas
	 * @param alto El alto del tablero de la partido en n�mero de celdas
     */
	public Wumpus(int ancho, int alto) {
		super(ancho,alto);
		this.vivo = true;
	}

	/**
     * M�todo que sirve para saber si wumpus esta vivo
     * @return vivo booleano que devuelve true o false en funci�n de si wumpus esta vivo o no
     */
	public boolean isVivo() {
		return vivo;
	}

	/**
     * M�todo para establecer wumpus a vivo(true) o a muerto(false)
     * @param vivo booleano que contiene true si wumpus esta vivo y false si esta muerto
     */
	public void setVivo(boolean vivo) {
		this.vivo = vivo;
	}

}//Cierre personajes
