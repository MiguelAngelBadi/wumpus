package wumpus;

/**
* Esta clase define la direcci�n del jugador
* @author: Miguel �ngel Badi Pardo
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
	
	 /* Constructor para la direcci�n del jugador
     */
	public DireccionJugador() {
		this.direccion = 0;
	}

	/**
     * M�todo que obtiene la direcci�n del jugador
     * @return direccion La direccion del jugador
     */
	public int getDireccion() {
		return direccion;
	}

	/**
     * M�todo para ponerle la direcci�n que queramos al jugador
     * @param direccion El par�metro direcci�n establece la direccion del jugador
     */
	public void setDireccion(int direccion) {
		this.direccion = direccion;
	}
	
	/**
     * M�todo para girar a la derecha la direcci�n del jugador
     */
	public void girarDerecha() {
		direccion++;
		if (direccion == 4) {
			direccion = 0;
		}
	}
	
	/**
     * M�todo para girar a la izquierda la direcci�n del jugador
     */
	public void girarIzquierda() {
		direccion--;
		if (direccion == -1) {
			direccion = 3;
		}
	}

}
