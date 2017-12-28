package test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import wumpus.DireccionJugador;
import wumpus.Jugador;
import wumpus.LingoteOro;
import wumpus.Personajes;
import wumpus.Pozo;
import wumpus.Wumpus;

/**
 * Esta clase para comrobar que todos los componentes del juego funcionan
 * correctamente
 * 
 * @author: Miguel Ángel Badi Pardo
 * @version: 27/12/2017
 */

public class JugadorTest {

	@Test
	public void avanzarDerecha() {
		System.out.println("Test avanzar derecha");
		int ancho = 3;
		int alto = 3;
		Jugador jugador = new Jugador(ancho, alto);
		DireccionJugador direccion = new DireccionJugador();
		Wumpus wumpus = new Wumpus(ancho, alto);
		wumpus.setVivo(false);

		List<Pozo> pozo = new ArrayList<Pozo>();
		Pozo p = new Pozo(ancho, alto);
		p.setPosX(-2);
		p.setPosY(-2);
		pozo.add(p);

		LingoteOro lingote = new LingoteOro(ancho, alto);
		jugador.avanzar(direccion, wumpus, pozo, lingote);
		assertTrue(jugador.getPosX() == 0 && jugador.getPosY() == 1);
	}

	@Test
	public void avanzarAbajo() {
		System.out.println("Test avanzar Abajo");
		int ancho = 3;
		int alto = 3;
		Jugador jugador = new Jugador(ancho, alto);
		DireccionJugador direccion = new DireccionJugador();
		direccion.setDireccion(1);
		Wumpus wumpus = new Wumpus(ancho, alto);
		wumpus.setVivo(false);

		List<Pozo> pozo = new ArrayList<Pozo>();
		Pozo p = new Pozo(ancho, alto);
		p.setPosX(-2);
		p.setPosY(-2);
		pozo.add(p);

		LingoteOro lingote = new LingoteOro(ancho, alto);
		jugador.avanzar(direccion, wumpus, pozo, lingote);
		assertTrue(jugador.getPosX() == 1 && jugador.getPosY() == 0);
	}

	@Test
	public void avanzarIzquierda() {
		System.out.println("Test avanzar izquierda");
		int ancho = 3;
		int alto = 3;
		Jugador jugador = new Jugador(ancho, alto);
		jugador.setPosX(1);
		jugador.setPosY(1);
		DireccionJugador direccion = new DireccionJugador();
		direccion.setDireccion(2);
		Wumpus wumpus = new Wumpus(ancho, alto);
		wumpus.setVivo(false);

		List<Pozo> pozo = new ArrayList<Pozo>();
		Pozo p = new Pozo(ancho, alto);
		p.setPosX(-2);
		p.setPosY(-2);
		pozo.add(p);

		LingoteOro lingote = new LingoteOro(ancho, alto);
		jugador.avanzar(direccion, wumpus, pozo, lingote);
		assertTrue(jugador.getPosX() == 1 && jugador.getPosY() == 0);
	}

	@Test
	public void avanzarArriba() {
		System.out.println("Test avanzar arriba");
		int ancho = 3;
		int alto = 3;
		Jugador jugador = new Jugador(ancho, alto);
		jugador.setPosX(1);
		jugador.setPosY(1);
		DireccionJugador direccion = new DireccionJugador();
		direccion.setDireccion(3);
		Wumpus wumpus = new Wumpus(ancho, alto);
		wumpus.setVivo(false);

		List<Pozo> pozo = new ArrayList<Pozo>();
		Pozo p = new Pozo(ancho, alto);
		p.setPosX(-2);
		p.setPosY(-2);
		pozo.add(p);

		LingoteOro lingote = new LingoteOro(ancho, alto);
		jugador.avanzar(direccion, wumpus, pozo, lingote);
		assertTrue(jugador.getPosX() == 0 && jugador.getPosY() == 1);
	}

	@Test
	public void percibeParedDerecha() {
		System.out.println("Test percibe pared derecha");
		int ancho = 3;
		int alto = 3;
		Jugador jugador = new Jugador(ancho, alto);
		jugador.setPosX(0);
		jugador.setPosY(2);
		DireccionJugador direccion = new DireccionJugador();
		Wumpus wumpus = new Wumpus(ancho, alto);
		wumpus.setVivo(false);

		List<Pozo> pozo = new ArrayList<Pozo>();
		Pozo p = new Pozo(ancho, alto);
		p.setPosX(-2);
		p.setPosY(-2);
		pozo.add(p);

		LingoteOro lingote = new LingoteOro(ancho, alto);
		jugador.avanzar(direccion, wumpus, pozo, lingote);
		assertTrue(jugador.getPosX() == 0 && jugador.getPosY() == 2);
	}

	@Test
	public void percibeParedAbajo() {
		System.out.println("Test percibe pared Abajo");
		int ancho = 3;
		int alto = 3;
		Jugador jugador = new Jugador(ancho, alto);
		jugador.setPosX(2);
		jugador.setPosY(0);
		DireccionJugador direccion = new DireccionJugador();
		direccion.setDireccion(1);
		Wumpus wumpus = new Wumpus(ancho, alto);
		wumpus.setVivo(false);

		List<Pozo> pozo = new ArrayList<Pozo>();
		Pozo p = new Pozo(ancho, alto);
		p.setPosX(-2);
		p.setPosY(-2);
		pozo.add(p);

		LingoteOro lingote = new LingoteOro(ancho, alto);
		jugador.avanzar(direccion, wumpus, pozo, lingote);
		assertTrue(jugador.getPosX() == 2 && jugador.getPosY() == 0);
	}

	@Test
	public void percibeParedIzquierda() {
		System.out.println("Test percibe pared izquierda");
		int ancho = 3;
		int alto = 3;
		Jugador jugador = new Jugador(ancho, alto);
		jugador.setPosX(0);
		jugador.setPosY(0);
		DireccionJugador direccion = new DireccionJugador();
		direccion.setDireccion(2);
		Wumpus wumpus = new Wumpus(ancho, alto);
		wumpus.setVivo(false);

		List<Pozo> pozo = new ArrayList<Pozo>();
		Pozo p = new Pozo(ancho, alto);
		p.setPosX(-2);
		p.setPosY(-2);
		pozo.add(p);

		LingoteOro lingote = new LingoteOro(ancho, alto);
		jugador.avanzar(direccion, wumpus, pozo, lingote);
		assertTrue(jugador.getPosX() == 0 && jugador.getPosY() == 0);
	}

	@Test
	public void percibeParedArriba() {
		System.out.println("Test percibe pared arriba");
		int ancho = 3;
		int alto = 3;
		Jugador jugador = new Jugador(ancho, alto);
		jugador.setPosX(0);
		jugador.setPosY(0);
		DireccionJugador direccion = new DireccionJugador();
		direccion.setDireccion(3);
		Wumpus wumpus = new Wumpus(ancho, alto);
		wumpus.setVivo(false);

		List<Pozo> pozo = new ArrayList<Pozo>();
		Pozo p = new Pozo(ancho, alto);
		p.setPosX(-2);
		p.setPosY(-2);
		pozo.add(p);

		LingoteOro lingote = new LingoteOro(ancho, alto);
		jugador.avanzar(direccion, wumpus, pozo, lingote);
		assertTrue(jugador.getPosX() == 0 && jugador.getPosY() == 0);
	}

	@Test
	public void percibeOroDerecha() {
		System.out.println("Test percibe oro derecha");
		int ancho = 3;
		int alto = 3;
		Jugador jugador = new Jugador(ancho, alto);
		jugador.setPosX(0);
		jugador.setPosY(0);

		LingoteOro lingote = new LingoteOro(ancho, alto);
		lingote.setPosX(0);
		lingote.setPosY(1);
		assertTrue(jugador.getPosX() == lingote.getPosX() && jugador.getPosY() == lingote.getPosY() - 1);
	}

	@Test
	public void percibeOroAbajo() {
		System.out.println("Test percibe oro abajo");
		int ancho = 3;
		int alto = 3;
		Jugador jugador = new Jugador(ancho, alto);
		jugador.setPosX(0);
		jugador.setPosY(0);

		LingoteOro lingote = new LingoteOro(ancho, alto);
		lingote.setPosX(1);
		lingote.setPosY(0);
		assertTrue(jugador.getPosX() == lingote.getPosX() - 1 && jugador.getPosY() == lingote.getPosY());
	}

	@Test
	public void percibeOroIzquierda() {
		System.out.println("Test percibe oro izquierda");
		int ancho = 3;
		int alto = 3;
		Jugador jugador = new Jugador(ancho, alto);
		jugador.setPosX(1);
		jugador.setPosY(1);

		LingoteOro lingote = new LingoteOro(ancho, alto);
		lingote.setPosX(1);
		lingote.setPosY(0);
		assertTrue(jugador.getPosX() == lingote.getPosX() && jugador.getPosY() == lingote.getPosY() + 1);
	}

	@Test
	public void percibeOroArriba() {
		System.out.println("Test percibe oro arriba");
		int ancho = 3;
		int alto = 3;
		Jugador jugador = new Jugador(ancho, alto);
		jugador.setPosX(1);
		jugador.setPosY(1);

		LingoteOro lingote = new LingoteOro(ancho, alto);
		lingote.setPosX(0);
		lingote.setPosY(1);
		assertTrue(jugador.getPosX() == lingote.getPosX() + 1 && jugador.getPosY() == lingote.getPosY());
	}

	@Test
	public void percibeWumpusDerecha() {
		System.out.println("Test percibe wumpus derecha");
		int ancho = 3;
		int alto = 3;
		Jugador jugador = new Jugador(ancho, alto);
		Wumpus wumpus = new Wumpus(ancho, alto);
		wumpus.setPosX(0);
		wumpus.setPosY(1);

		assertTrue(jugador.getPosX() == wumpus.getPosX() && jugador.getPosY() == wumpus.getPosY() - 1);
	}

	@Test
	public void percibeWumpusAbajo() {
		System.out.println("Test percibe wumpus abajo");
		int ancho = 3;
		int alto = 3;
		Jugador jugador = new Jugador(ancho, alto);
		jugador.setPosX(0);
		jugador.setPosY(0);
		Wumpus wumpus = new Wumpus(ancho, alto);
		wumpus.setPosX(1);
		wumpus.setPosY(0);

		assertTrue(jugador.getPosX() == wumpus.getPosX() - 1 && jugador.getPosY() == wumpus.getPosY());
	}

	@Test
	public void percibeWumpusIzquierda() {
		System.out.println("Test percibe wumpus izquierda");
		int ancho = 3;
		int alto = 3;
		Jugador jugador = new Jugador(ancho, alto);
		jugador.setPosX(1);
		jugador.setPosY(1);
		Wumpus wumpus = new Wumpus(ancho, alto);
		wumpus.setPosX(1);
		wumpus.setPosY(0);

		assertTrue(jugador.getPosX() == wumpus.getPosX() && jugador.getPosY() == wumpus.getPosY() + 1);
	}

	@Test
	public void percibeWumpusArriba() {
		System.out.println("Test percibe wumpus arriba");
		int ancho = 3;
		int alto = 3;
		Jugador jugador = new Jugador(ancho, alto);
		jugador.setPosX(1);
		jugador.setPosY(1);
		Wumpus wumpus = new Wumpus(ancho, alto);
		wumpus.setPosX(0);
		wumpus.setPosY(1);

		assertTrue(jugador.getPosX() == wumpus.getPosX() + 1 && jugador.getPosY() == wumpus.getPosY());
	}

	@Test
	public void percibePozoDerecha() {
		System.out.println("Test percibe pozo derecha");
		int ancho = 3;
		int alto = 3;
		int pozos = 1;
		Jugador jugador = new Jugador(ancho, alto);
		List<Pozo> pozo = new ArrayList<Pozo>();
		for (int i = 0; i < pozos; i++) {
			Pozo p = new Pozo(ancho, alto);
			p.setPosX(0);
			p.setPosY(1);
			pozo.add(p);
		} // Cierre for

		assertTrue(jugador.getPosX() == pozo.get(0).getPosX() && jugador.getPosY() == pozo.get(0).getPosY() - 1);
	}

	@Test
	public void percibePozoAbajo() {
		System.out.println("Test percibe pozo abajo");
		int ancho = 3;
		int alto = 3;
		int pozos = 1;
		Jugador jugador = new Jugador(ancho, alto);
		jugador.setPosX(0);
		jugador.setPosY(0);
		List<Pozo> pozo = new ArrayList<Pozo>();
		for (int i = 0; i < pozos; i++) {
			Pozo p = new Pozo(ancho, alto);
			p.setPosX(1);
			p.setPosY(0);
			pozo.add(p);
		} // Cierre for

		assertTrue(jugador.getPosX() == pozo.get(0).getPosX() - 1 && jugador.getPosY() == pozo.get(0).getPosY());
	}

	@Test
	public void percibePozoIzquierda() {
		System.out.println("Test percibe pozo izquierda");
		int ancho = 3;
		int alto = 3;
		int pozos = 1;
		Jugador jugador = new Jugador(ancho, alto);
		jugador.setPosX(1);
		jugador.setPosY(1);

		List<Pozo> pozo = new ArrayList<Pozo>();
		for (int i = 0; i < pozos; i++) {
			Pozo p = new Pozo(ancho, alto);
			p.setPosX(1);
			p.setPosY(0);
			pozo.add(p);
		} // Cierre for

		assertTrue(jugador.getPosX() == pozo.get(0).getPosX() && jugador.getPosY() == pozo.get(0).getPosY() + 1);
	}

	@Test
	public void percibePozoArriba() {
		System.out.println("Test percibe pozo arriba");
		int ancho = 3;
		int alto = 3;
		int pozos = 1;
		Jugador jugador = new Jugador(ancho, alto);
		jugador.setPosX(1);
		jugador.setPosY(1);

		List<Pozo> pozo = new ArrayList<Pozo>();
		for (int i = 0; i < pozos; i++) {
			Pozo p = new Pozo(ancho, alto);
			p.setPosX(0);
			p.setPosY(1);
			pozo.add(p);
		} // Cierre for

		assertTrue(jugador.getPosX() == pozo.get(0).getPosX() + 1 && jugador.getPosY() == pozo.get(0).getPosY());
	}

	@Test
	public void muerePorPozo() {
		System.out.println("Test percibe muerte por pozo");
		int ancho = 3;
		int alto = 3;
		int pozos = 1;
		Jugador jugador = new Jugador(ancho, alto);
		jugador.setPosX(1);
		jugador.setPosY(1);

		List<Pozo> pozo = new ArrayList<Pozo>();
		for (int i = 0; i < pozos; i++) {
			Pozo p = new Pozo(ancho, alto);
			p.setPosX(1);
			p.setPosY(1);
			pozo.add(p);
		} // Cierre for

		assertTrue(jugador.getPosX() == pozo.get(0).getPosX() && jugador.getPosY() == pozo.get(0).getPosY());
	}

	@Test
	public void muerePorWumpus() {
		System.out.println("Test percibe muerte wumpus");
		int ancho = 3;
		int alto = 3;
		Jugador jugador = new Jugador(ancho, alto);
		jugador.setPosX(1);
		jugador.setPosY(1);
		Wumpus wumpus = new Wumpus(ancho, alto);
		wumpus.setPosX(1);
		wumpus.setPosY(1);

		assertTrue(jugador.getPosX() == wumpus.getPosX() && jugador.getPosY() == wumpus.getPosY());
	}

	@Test
	public void jugadorGana() {
		System.out.println("Test percibe Jugador Gana");
		int ancho = 3;
		int alto = 3;
		Jugador jugador = new Jugador(ancho, alto);
		jugador.setPosX(Personajes.getPosxjugadorinicial());
		jugador.setPosY(Personajes.getPosyjugadorinicial());
		jugador.setTieneLingote(true);

		assertTrue(jugador.getPosX() == Personajes.getPosxjugadorinicial()
				&& jugador.getPosY() == Personajes.getPosyjugadorinicial() && jugador.isTieneLingote());
	}

	@Test
	public void wumpusMuere() {
		System.out.println("Test percibe wumpus muere");
		int ancho = 3;
		int alto = 3;
		int flechas = 1;
		Jugador jugador = new Jugador(ancho, alto);
		jugador.setPosX(1);
		jugador.setPosY(1);
		DireccionJugador direccion = new DireccionJugador();
		Wumpus wumpus = new Wumpus(ancho, alto);
		wumpus.setPosX(1);
		wumpus.setPosY(2);

		jugador.lanzarFlecha(direccion, wumpus, flechas);
		assertFalse(wumpus.isVivo());
	}

	@Test
	public void lanzarFlechaFallaDerecha() {
		System.out.println("Test flecha falla derecha");
		int ancho = 3;
		int alto = 3;
		Jugador jugador = new Jugador(ancho, alto);
		jugador.setPosX(1);
		jugador.setPosY(1);
		Wumpus wumpus = new Wumpus(ancho, alto);
		wumpus.setPosX(2);
		wumpus.setPosY(2);

		assertFalse(jugador.getPosX() == wumpus.getPosX() && jugador.getPosY() == wumpus.getPosY() - 1);
	}

	@Test
	public void lanzarFlechaFallaAbajo() {
		System.out.println("Test flecha falla abajo");
		int ancho = 3;
		int alto = 3;
		Jugador jugador = new Jugador(ancho, alto);
		jugador.setPosX(1);
		jugador.setPosY(1);
		Wumpus wumpus = new Wumpus(ancho, alto);
		wumpus.setPosX(2);
		wumpus.setPosY(2);

		assertFalse(jugador.getPosX() == wumpus.getPosX() - 1 && jugador.getPosY() == wumpus.getPosY());
	}

	@Test
	public void lanzarFlechaFallaIzquierda() {
		System.out.println("Test flecha falla izquierda");
		int ancho = 3;
		int alto = 3;
		Jugador jugador = new Jugador(ancho, alto);
		jugador.setPosX(1);
		jugador.setPosY(1);
		Wumpus wumpus = new Wumpus(ancho, alto);
		wumpus.setPosX(2);
		wumpus.setPosY(2);

		assertFalse(jugador.getPosX() == wumpus.getPosX() && jugador.getPosY() == wumpus.getPosY() + 1);
	}

	@Test
	public void lanzarFlechaFallaArriba() {
		System.out.println("Test flecha falla arriba");
		int ancho = 3;
		int alto = 3;
		Jugador jugador = new Jugador(ancho, alto);
		jugador.setPosX(1);
		jugador.setPosY(1);
		Wumpus wumpus = new Wumpus(ancho, alto);
		wumpus.setPosX(2);
		wumpus.setPosY(2);

		assertFalse(jugador.getPosX() == wumpus.getPosX() + 1 && jugador.getPosY() == wumpus.getPosY());
	}

	@Test
	public void girarDerechaDesdeDerecha() {
		System.out.println("Test girar derecha desde derecha");
		DireccionJugador direccion = new DireccionJugador();
		direccion.setDireccion(0);
		direccion.girarDerecha();

		assertTrue(direccion.getDireccion() == 1);
	}

	@Test
	public void girarDerechaDesdeAbajo() {
		System.out.println("Test girar derecha desde abajo");
		DireccionJugador direccion = new DireccionJugador();
		direccion.setDireccion(1);
		direccion.girarDerecha();

		assertTrue(direccion.getDireccion() == 2);
	}

	@Test
	public void girarDerechaDesdeIzquierda() {
		System.out.println("Test girar derecha desde izquierda");
		DireccionJugador direccion = new DireccionJugador();
		direccion.setDireccion(2);
		direccion.girarDerecha();

		assertTrue(direccion.getDireccion() == 3);
	}

	@Test
	public void girarDerechaDesdeArriba() {
		System.out.println("Test girar derecha desde arriba");
		DireccionJugador direccion = new DireccionJugador();
		direccion.setDireccion(3);
		direccion.girarDerecha();

		assertTrue(direccion.getDireccion() == 0);
	}

	@Test
	public void girarIzquierdaDesdeDerecha() {
		System.out.println("Test girar izquierda desde derecha");
		DireccionJugador direccion = new DireccionJugador();
		direccion.setDireccion(0);
		direccion.girarIzquierda();

		assertTrue(direccion.getDireccion() == 3);
	}

	@Test
	public void girarIzquierdaDesdeAbajo() {
		System.out.println("Test girar izquierda desde abajo");
		DireccionJugador direccion = new DireccionJugador();
		direccion.setDireccion(1);
		direccion.girarIzquierda();

		assertTrue(direccion.getDireccion() == 0);
	}

	@Test
	public void girarIzquierdaDesdeIzquierda() {
		System.out.println("Test girar izquierda desde izquierda");
		DireccionJugador direccion = new DireccionJugador();
		direccion.setDireccion(2);
		direccion.girarIzquierda();

		assertTrue(direccion.getDireccion() == 1);
	}

	@Test
	public void girarIzquierdaDesdeArriba() {
		System.out.println("Test girar izquierda desde arriba");
		DireccionJugador direccion = new DireccionJugador();
		direccion.setDireccion(3);
		direccion.girarIzquierda();

		assertTrue(direccion.getDireccion() == 2);
	}

	@Test
	public void cogerLingote() {
		System.out.println("Test coger lingote");
		int ancho = 3;
		int alto = 3;
		int pozos = 2;
		Jugador jugador = new Jugador(ancho, alto);
		jugador.setPosX(0);
		jugador.setPosY(0);
		DireccionJugador direccion = new DireccionJugador();
		Wumpus wumpus = new Wumpus(ancho, alto);
		wumpus.setVivo(false);
		
		List<Pozo> pozo = new ArrayList<Pozo>();
		for (int i = 0; i < pozos; i++) {
			Pozo p = new Pozo(ancho,alto);
			p.setPosX(-2);
			p.setPosY(-2);
			pozo.add(p);
		} // Cierre for

		LingoteOro lingote = new LingoteOro(ancho, alto);
		lingote.setPosX(0);
		lingote.setPosY(1);

		jugador.avanzar(direccion, wumpus, pozo, lingote);
		assertTrue(jugador.isTieneLingote());
	}

}
