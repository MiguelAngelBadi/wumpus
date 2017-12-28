package wumpus;

import java.util.List;

/**
* Esta clase define el Jugador que extiende a Personakes
* @author: Miguel Ángel Badi Pardo
* @version: 27/12/2017
*/

public class Jugador extends Personajes {

	/**
	* Campos de la clase
	*/
	private int ancho;
	private int alto;
	private boolean tieneLingote;

	/* Constructor para poner al jugador en la posicion inicial que hayamos definido en Personajes 
	 * @param ancho El ancho del tablero de la partido en número de celdas
	 * @param alto El alto del tablero de la partido en número de celdas
     */
	public Jugador(int ancho, int alto) {
		super();
		this.ancho = ancho;
		this.alto = alto;
		this.setPosX(getPosxjugadorinicial());
		this.setPosY(getPosyjugadorinicial());
		this.setTieneLingote(false);
	}

	/**
     * Método que avanza la posición del jugador en función de la dirección del jugador
     * @param direccion La dirección del jugador
	 * @param wumpus Instancia de la clase wumpus
	 * @param pozo Lista con instancias de pozos(n instancias dependiendo de los pozos elegidos por el usuario)
	 * @param lingote Instancia de la clase LingoteOro
     */
	public void avanzar(DireccionJugador direccion, Wumpus wumpus, List<Pozo> pozo, LingoteOro lingote) {

		switch (direccion.getDireccion()) {
		case 0:// avanzar derecha
			this.posY++;
			if (this.posY == ancho) {
				this.posY--;
				System.out.println("Percibe choque \n");
			}
			break;
		case 1:// avanzar abajo
			this.posX++;
			if (this.posX == alto) {
				this.posX--;
				System.out.println("Percibe choque \n");
			}
			break;
		case 2:// avanzar izquierda
			this.posY--;
			if (this.posY == -1) {
				this.posY++;
				System.out.println("Percibe choque \n");
			}
			break;
		case 3:// avanzar arriba
			this.posX--;
			if (this.posX == -1) {
				this.posX++;
				System.out.println("Percibe choque \n");
			}
			break;
		default:
			System.out.println("Dirección erronea \n");
		}//Cierre switch

		System.out.println("estas en " + this.posX + " " + this.posY + "\n");

		validacionNuevaCelda(wumpus,lingote,pozo);
	}//Cierrre avanzar

	/**
     * Método que valida la posición a la que avanza el jugador para ver si coincide con wumpus, con el pozo, con el lingote, si cae en posiciones adyacente a wumpus, pozo y lingote y si gana la partida 
	 * @param wumpus Instancia de la clase wumpus
	  * @param lingote Instancia de la clase LingoteOro
	 * @param pozo Lista con instancias de pozos(n instancias dependiendo de los pozos elegidos por el usuario)
     */
	protected void validacionNuevaCelda(Wumpus wumpus, LingoteOro lingote, List<Pozo> pozo) {
		
		//Misma posicion wumpus
		if (this.posX == wumpus.getPosX() && this.posY == wumpus.getPosY() && wumpus.isVivo()) {
			System.out.println("WUMPUS TE HA MATADO \n");
			System.exit(1);
		}
		
		//Misma posición pozo
		for (Pozo p : pozo) {
			if (this.posX == p.getPosX() && this.posY == p.getPosY()) {
				System.out.println("TE HAS CAIDO AL POZO Y HAS MUERTO \n");
				System.exit(1);
			}
		}

		//Posición adyacente wumpus
		if (this.posX == wumpus.getPosX() && this.posY == wumpus.getPosY() - 1 && wumpus.isVivo()
				|| this.posX == wumpus.getPosX() - 1 && this.posY == wumpus.getPosY() && wumpus.isVivo()
				|| this.posX == wumpus.getPosX() && this.posY == wumpus.getPosY() + 1 && wumpus.isVivo()
				|| this.posX == wumpus.getPosX() + 1 && this.posY == wumpus.getPosY() && wumpus.isVivo()) {
			System.out.println("HUELE a WUMPUS \n");
		}

		//Posición adyacente pozo
		for (Pozo p : pozo) {
			if (this.posX == p.getPosX() && this.posY == p.getPosY() - 1
					|| this.posX == p.getPosX() - 1 && this.posY == p.getPosY()
					|| this.posX == p.getPosX() && this.posY == p.getPosY() + 1
					|| this.posX == p.getPosX() + 1 && this.posY == p.getPosY()) {
				System.out.println("HUELE a brisa de POZO \n");
			}
		}

		//Posición adyacente oro
		if (this.posX == lingote.getPosX() && this.posY == lingote.getPosY() - 1 && !this.isTieneLingote()
				|| this.posX == lingote.getPosX() - 1 && this.posY == lingote.getPosY() && !this.isTieneLingote()
				|| this.posX == lingote.getPosX() && this.posY == lingote.getPosY() + 1 && !this.isTieneLingote()
				|| this.posX == lingote.getPosX() + 1 && this.posY == lingote.getPosY() && !this.isTieneLingote()) {
			System.out.println("El ORO esta CERCA \n");
		}

		//Misma posición lingote
		if (this.posX == lingote.getPosX() && this.posY == lingote.getPosY()) {
			System.out.println("Has COGIDO el lingote de ORO \n");
			setTieneLingote(true);
		}
		
		//Misma posicion inicial con lingote
		if (this.posX == getPosxjugadorinicial() && this.posY == getPosyjugadorinicial() && isTieneLingote()) {
			System.out.println("HAS GANADO \n");
			System.exit(1);
		}
		
	}//Cierre validacion nueva celda

	/**
     * Método que sirve para lanzar la flecha en la dirección del jugador 
     * @param direccion La dirección del jugador
	 * @param wumpus Instancia de la clase wumpus
	  * @param flechas El número de flechas que le queda al jugador
     */
	public void lanzarFlecha(DireccionJugador direccion, Wumpus wumpus, int flechas) {

		switch (direccion.getDireccion()) {
		case 0:// lanzar flecha derecha
			this.posY++;
			if (this.posY == ancho) {
				this.posY--;
				System.out.println("La flecha se ha chocado con la pared \n");
			} else {
				flecha(wumpus);
			}
			this.posY--;
			break;
		case 1:// lanzar flecha abajo
			this.posX++;
			if (this.posX == alto) {
				this.posX--;
				System.out.println("La flecha se ha chocado con la pared \n");
			} else {
				flecha(wumpus);
			}
			this.posX--;
			break;
		case 2:// lanzar flecha izquierda
			this.posY--;
			if (this.posY == -1) {
				this.posY++;
				System.out.println("La flecha se ha chocado con la pared \n");
			} else {
				flecha(wumpus);
			}
			this.posY++;
			break;
		case 3:// lanzar flecha arriba
			this.posX--;
			if (this.posX == -1) {
				this.posX++;
				System.out.println("La flecha se ha chocado con la pared \n");
			} else {
				flecha(wumpus);
			}
			this.posX++;
			break;
		default:
			System.out.println("Dirección erronea \n");
		}//Cierre switch
		flechas--;
	}//Cierre lanzar flecha

	/**
     * Método que sirve para comprobar si la flecha cae en la celda del jugador o no
	 * @param wumpus Instancia de la clase wumpus
     */
	private void flecha(Wumpus wumpus) {
		if (this.posX == wumpus.getPosX() && this.posY == wumpus.getPosY()) {
			System.out.println("Has MATADO a wumpus \n");
			wumpus.setVivo(false);
		} else {
			System.out.println("Has fallado \n");
		}
	}

	public boolean isTieneLingote() {
		return tieneLingote;
	}

	public void setTieneLingote(boolean tieneLingote) {
		this.tieneLingote = tieneLingote;
	}
	
}
