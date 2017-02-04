package com.gamedrez;

import java.util.ArrayList;

public class TableroJuego {

	private CasillaTablero CasillaCentral;
	private CasillaTablero CasillaNorte;
	private CasillaTablero CasillaNoreste;
	private CasillaTablero CasillaEste;
	private CasillaTablero CasillaSureste;
	private CasillaTablero CasillaSur;
	private CasillaTablero CasillaSuroeste;
	private CasillaTablero CasillaOeste;
	private CasillaTablero CasillaNoroeste;

	public TableroJuego() {

		this.CasillaCentral = new CasillaTablero();
		this.CasillaNorte = new CasillaTablero();
		this.CasillaNoreste = new CasillaTablero();
		this.CasillaEste = new CasillaTablero();
		this.CasillaSureste = new CasillaTablero();
		this.CasillaSur = new CasillaTablero();
		this.CasillaSuroeste = new CasillaTablero();
		this.CasillaOeste = new CasillaTablero();
		this.CasillaNoroeste = new CasillaTablero();

		CasillaCentral.setNombre("CasillaCentral").setNorte(CasillaNorte).setNoreste(CasillaNoreste)
				.setEste(CasillaEste).setSureste(CasillaSureste).setSur(CasillaSur).setSuroeste(CasillaSuroeste)
				.setOeste(CasillaOeste).setNoroeste(CasillaNoroeste);

		CasillaNorte.setNombre("CasillaNorte").setEste(CasillaNoreste).setSureste(CasillaEste).setSur(CasillaCentral)
				.setSuroeste(CasillaOeste).setOeste(CasillaNoroeste);

		CasillaNoreste.setNombre("CasillaNoreste").setSur(CasillaEste).setSuroeste(CasillaCentral)
				.setOeste(CasillaNorte);

		CasillaEste.setNombre("CasillaEste").setNorte(CasillaNoroeste).setNoroeste(CasillaNorte)
				.setOeste(CasillaCentral).setSuroeste(CasillaSur).setSur(CasillaSuroeste);

		CasillaSureste.setNombre("CasillaSureste").setNorte(CasillaEste).setNoreste(CasillaCentral)
				.setOeste(CasillaSur);

		CasillaSur.setNombre("CasillaSur").setEste(CasillaSureste).setNoroeste(CasillaEste).setNorte(CasillaCentral)
				.setNoreste(CasillaOeste).setOeste(CasillaSuroeste);

		CasillaSuroeste.setNombre("CasillaSuroeste").setEste(CasillaSur).setNoreste(CasillaCentral)
				.setNorte(CasillaOeste);

		CasillaOeste.setNombre("CasillaOeste").setSur(CasillaSuroeste).setSureste(CasillaSur).setEste(CasillaCentral)
				.setNoreste(CasillaNorte).setNorte(CasillaNoroeste);

		CasillaNoroeste.setNombre("CasillaNoroeste").setEste(CasillaNorte).setSureste(CasillaCentral)
				.setSur(CasillaOeste);
	}

	public boolean insertarFichaEnCasilla(Ficha ficha, PosicionesEnum posicion) {
		CasillaTablero casilla = this.getCasillaBy(posicion);

		if (casilla.getFicha() == null) {
			casilla.setFicha(ficha);
			ficha.setPosicion(posicion);
			return true;
		} else {
			return false;
		}
	}

	// saber si hay ficha en una casilla
	public Ficha getFichaEnPosicion(PosicionesEnum posicion) {
		return this.getCasillaBy(posicion).getFicha();
	}

	public boolean casillasVacias(ArrayList<PosicionesEnum> lista) {

		for (int i = 0; i < lista.size(); i++) {
			PosicionesEnum posicion = lista.get(i);
			CasillaTablero casilla = this.getCasillaBy(posicion);
			boolean siEstaVacia = casilla.casillaVacia();
			if (siEstaVacia == true) {
			}
		}
		return false;
	}

	public CasillaTablero getCasillaBy(PosicionesEnum posicion) {
		if (posicion == PosicionesEnum.NORTE) {
			return this.getCasillaNorte();
		}
		if (posicion == PosicionesEnum.NORESTE) {
			return this.getCasillaNoreste();
		}
		if (posicion == PosicionesEnum.ESTE) {
			return this.getCasillaEste();
		}
		if (posicion == PosicionesEnum.SURESTE) {
			return this.getCasillaSureste();
		}
		if (posicion == PosicionesEnum.SUR) {
			return this.getCasillaSur();
		}
		if (posicion == PosicionesEnum.SUROESTE) {
			return this.getCasillaSuroeste();
		}
		if (posicion == PosicionesEnum.OESTE) {
			return this.getCasillaOeste();
		}
		if (posicion == PosicionesEnum.NOROESTE) {
			return this.getCasillaNoroeste();
		}

		return null;
	}

	public CasillaTablero getCasillaCentral() {
		return CasillaCentral;
	}

	public void setCasillaCentral(CasillaTablero casillaCentral) {
		CasillaCentral = casillaCentral;
	}

	public CasillaTablero getCasillaNorte() {
		return CasillaNorte;
	}

	public void setCasillaNorte(CasillaTablero casillaNorte) {
		CasillaNorte = casillaNorte;
	}

	public CasillaTablero getCasillaNoreste() {
		return CasillaNoreste;
	}

	public void setCasillaNoreste(CasillaTablero casillaNoreste) {
		CasillaNoreste = casillaNoreste;
	}

	public CasillaTablero getCasillaEste() {
		return CasillaEste;
	}

	public void setCasillaEste(CasillaTablero casillaEste) {
		CasillaEste = casillaEste;
	}

	public CasillaTablero getCasillaSureste() {
		return CasillaSureste;
	}

	public void setCasillaSureste(CasillaTablero casillaSureste) {
		CasillaSureste = casillaSureste;
	}

	public CasillaTablero getCasillaSur() {
		return CasillaSur;
	}

	public void setCasillaSur(CasillaTablero casillaSur) {
		CasillaSur = casillaSur;
	}

	public CasillaTablero getCasillaSuroeste() {
		return CasillaSuroeste;
	}

	public void setCasillaSuroeste(CasillaTablero casillaSuroeste) {
		CasillaSuroeste = casillaSuroeste;
	}

	public CasillaTablero getCasillaOeste() {
		return CasillaOeste;
	}

	public void setCasillaOeste(CasillaTablero casillaOeste) {
		CasillaOeste = casillaOeste;
	}

	public CasillaTablero getCasillaNoroeste() {
		return CasillaNoroeste;
	}

	public void setCasillaNoroeste(CasillaTablero casillaNoroeste) {
		CasillaNoroeste = casillaNoroeste;
	}

}
