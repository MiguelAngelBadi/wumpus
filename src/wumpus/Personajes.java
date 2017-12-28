package wumpus;

/**
* Esta clase define el Jugador que extiende a Personakes
* @author: Miguel �ngel Badi Pardo
* @version: 27/12/2017
*/

public class Personajes {
	protected  int posX;
	protected  int posY;
	private static final int posXJugadorInicial = 0;
	private static final int posYJugadorInicial = 0;

	/* Constructor vacio para no asignar posicion al personaje
     */
	public Personajes() {

	}
	
	/* Constructor para poner al personaje en una posici�n aleatoria dentro del tablero
	 * @param ancho El ancho del tablero de la partido en n�mero de celdas
	 * @param alto El alto del tablero de la partido en n�mero de celdas
     */
	public Personajes(int ancho, int alto) {
		do {
			posX = (int) (Math.random() * ancho);
			posY = (int) (Math.random() * alto);
		} while (posX == posXJugadorInicial && posY == posYJugadorInicial);//Comprobamos que los personajes no caigan en la celda inicial del jugador
		setPosX(posX);
		setPosY(posY);
	}

	/**
     * M�todo que devuelve la posici�nX del Personaje
     * @return posX La direccion del Personaje
     */
	public int getPosX() {
		return posX;
	}

	/**
     * M�todo que establece la posici�nX del Personaje
     * @param posX La direccion del Personaje
     */
	public void setPosX(int posX) {
		this.posX = posX;
	}

	/**
     * M�todo que devuelve la posici�nY del Personaje
     * @return posY La direccion del Personaje
     */
	public int getPosY() {
		return posY;
	}

	/**
     * M�todo que establece la posici�nY del Personaje
     * @param posY La direccion del Personaje
     */
	public void setPosY(int posY) {
		this.posY = posY;
	}

	/**
     * M�todo que devuelve la posici�nX del jugador Inicial
     * @return posXJugadorInicial La posici�nX del jugador Inicial
     */
	public static int getPosxjugadorinicial() {
		return posXJugadorInicial;
	}

	/**
     * M�todo que devuelve la posici�nY del jugador Inicial
     * @return posYJugadorInicial La posici�nY del jugador Inicial
     */
	public static int getPosyjugadorinicial() {
		return posYJugadorInicial;
	}

}