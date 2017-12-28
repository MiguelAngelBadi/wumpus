package wumpus;

/**
* Esta clase define la dirección del jugador
* @author: Miguel Ángel Badi Pardo
* @version: 27/12/2017
*/

public class DireccionJugador {

	/**
	* Campos de la clase
	*/
	private int direccion;
	//direccion 0  derecha
	//direccion 1  abajo
	//direccion 2  izquierda
	//direccion 3  arriba
	
	 /* Constructor para la dirección del jugador
     */
	public DireccionJugador() {
		this.direccion = 0;
	}

	/**
     * Método que obtiene la dirección del jugador
     * @return direccion La direccion del jugador
     */
	public int getDireccion() {
		return direccion;
	}

	/**
     * Método para ponerle la dirección que queramos al jugador
     * @param direccion El parámetro dirección establece la direccion del jugador
     */
	public void setDireccion(int direccion) {
		this.direccion = direccion;
	}
	
	/**
     * Método para girar a la derecha la dirección del jugador
     */
	public void girarDerecha() {
		direccion++;
		if (direccion == 4) {
			direccion = 0;
		}
	}
	
	/**
     * Método para girar a la izquierda la dirección del jugador
     */
	public void girarIzquierda() {
		direccion--;
		if (direccion == -1) {
			direccion = 3;
		}
	}

}
