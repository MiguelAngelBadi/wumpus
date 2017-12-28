package wumpus;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 * Esta clase es la clase principal del juego wumpus
 * 
 * @author: Miguel Ángel Badi Pardo
 * @version: 27/12/2017
 */

public class Principal {

	/**
	 * Campos de la clase
	 */
	private static int ancho;
	private static int alto;
	private static int pozos;
	private static int flechas;

	/**
	 * Clase principal del juego wumpus
	 */
	public static void main(String[] args) {

		instrucciones();
		Scanner sn = new Scanner(System.in);// Creación de un objeto Scanner
		configurarPartida(sn);

		Jugador jugador = new Jugador(ancho, alto);
		DireccionJugador direccion = new DireccionJugador();
		Wumpus wumpus = new Wumpus(ancho, alto);
//		System.out.println("El Wumpus esta en " + wumpus.getPosX() + " " + wumpus.getPosY() + "\n");

		List<Pozo> pozo = new ArrayList<Pozo>();
		List<Pozo> pozoConfirmados = new ArrayList<Pozo>();
		boolean nuevoPozo = false;
		for (int i = 0; i < pozos; i++) {
			Pozo p;
			do {
				p = new Pozo(ancho, alto);
				nuevoPozo = false;
				if (p.getPosX() == wumpus.getPosX() && p.getPosY() == wumpus.getPosY()) {//Si el pozo coincide con la posicion de wumpus volvemos a calcularla
					nuevoPozo = true;
				} else {
					for (Pozo pc : pozoConfirmados) {// Si hay algun pozo repetido volvemos a calcular la posicion
						if (p.posX == pc.getPosX() && p.getPosY() == pc.getPosY()) {
							nuevoPozo = true;
							// pozoConfirmados.remove(p);
						}
					}
				}
			} while (nuevoPozo);
			pozo.add(p);
			pozoConfirmados.add(p);
			nuevoPozo = false;
//			System.out.println("El Pozo esta en " + p.getPosX() + " " + p.getPosY() + "\n");
		} // Cierre for

		LingoteOro lingote;
		boolean nuevoLingote = false;
		do {
			lingote = new LingoteOro(ancho, alto);
			nuevoLingote = false;
			if (lingote.getPosX() == wumpus.getPosX() && lingote.getPosY() == wumpus.getPosY()) {//Si el lingote coincide con la posicion de wumpus volvemos a calcularla
				nuevoLingote = true;
			} else {
				for (Pozo p : pozo) {// Si el lingote coincide con algun pozo volvemos a calcular la posicion
					if (p.getPosX() == lingote.getPosX() && p.getPosY() == lingote.getPosY()) {
						nuevoLingote = true;
					}
				}
			}
		} while (nuevoLingote);
		nuevoLingote = false;
//		System.out.println("El Lingote esta en " + lingote.getPosX() + " " + lingote.getPosY() + "\n");

		jugador.validacionNuevaCelda(wumpus, lingote, pozo);

		menu(jugador, direccion, wumpus, pozo, sn, lingote);
		sn.close();
	}// Cierre main

	private static void instrucciones() {
		System.out.println("Intruciones HUNT THE WUMPUS \n");
		System.out.println(
				"El pesonaje principal es un cazador que busca un lingote de oro en un tablero de n x n celdas. \n"
						+ "El cazador puede encontrar peligros en su camino: pozos sin fondo donde si cae muere y el Wumpus,\n"
						+ "un monstruo que mata al cazado cuando coinciden en la misma celda del tablero. \n");
		System.out.println("El cazador dispone de las siguientes habilidades:");
		System.out.println("Girar 90° Izquierda ");
		System.out.println("Girar 90° Derecha ");
		System.out.println("Avanzar ");
		System.out.println("Lanzar flecha ");
		System.out.println("Salir \n");
	}

	/**
	 * Método que configura la partida por los datos introducidos del usuario
	 * * @param sn El parámetro sn es una instancia del objeto Scanner
	 */
	private static void configurarPartida(Scanner sn) {

		System.out.println("EMPEZAMOS LA PARTIDA");
		System.out.println("Por favor introduzca el ancho del tablero");
		ancho = sn.nextInt(); // Invocamos un método sobre un objeto Scanner
		System.out.println("El ancho el tablero es: " + ancho + "\n");

		System.out.println("Por favor introduzca el alto del tablero");
		alto = sn.nextInt(); // Invocamos un método sobre un objeto Scanner
		System.out.println("El alto del tablero es: " + alto + "\n");

		 do {
		System.out.println("Por favor introduzca el número de pozos: (El maximo de pozos es < Celdas/2)");
		pozos = sn.nextInt(); // Invocamos un método sobre un objeto Scanner
		 } while (pozos > (ancho * alto / 2));
		System.out.println("El número de pozos es: " + pozos + "\n");

		System.out.println("Por favor introduzca el número de flechas:");
		flechas = sn.nextInt(); // Invocamos un método sobre un objeto Scanner
		System.out.println("El número de flechas es: " + flechas + "\n");

//		System.out.println("El numero de celdas es: " + ancho * alto + "\n");
	}// Cierre configurar partida

	/**
	 * Método que crea el menu para que el jugador pueda Girar 90° Izquierda(1),
	 * Girar 90° Derecha(2), Avanzar(3), Lanzar flecha(4) y Salir de la partida(5)
	 * * @param sn El parámetro sn es una instancia del objeto Scanner
	 */

	private static void menu(Jugador jugador, DireccionJugador direccion, Wumpus wumpus, List<Pozo> pozo, Scanner sn,
			LingoteOro lingote) {
		boolean salir = false;
		int opcion; // Guardaremos la opcion del usuario

		while (!salir) {

			System.out.println("1. Girar 90° Izquierda");
			System.out.println("2. Girar 90° Derecha");
			System.out.println("3. Avanzar");
			System.out.println("4. Lanzar flecha");
			System.out.println("5. Salir");

			try {

				System.out.println("Escribe una de las opciones");
				opcion = sn.nextInt();

				switch (opcion) {
				case 1:
					System.out.println("Has girado 90° a la Izquierda \n");
					direccion.girarIzquierda();
					break;
				case 2:
					System.out.println("Has girado 90° a la Derecha \n");
					direccion.girarDerecha();
					break;
				case 3:
					System.out.println("Has avanzado \n");
					jugador.avanzar(direccion, wumpus, pozo, lingote);
					break;
				case 4:
					System.out.println("Has LANZADO flecha \n");
					if (flechas > 0) {
						jugador.lanzarFlecha(direccion, wumpus, flechas);
					} else {
						System.out.println("No te quedan flechas \n");
					}
					break;
				case 5:
					salir = true;
					break;
				default:
					System.out.println("Solo números entre 1 y 5 \n");
				}// Cierre switch
			} catch (InputMismatchException e) {
				System.out.println("Debes insertar un número");
				sn.next();
			}
		} // Cierre while
	}// Cierre menu
}
