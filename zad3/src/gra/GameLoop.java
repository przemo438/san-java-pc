package gra;

import java.io.IOException;
import java.util.Random;

public class GameLoop {


	int ktoryRaz = 1;
	private int liczba;
	private InputReader inputReader;
	private Losowacz losowacz; 
	
	public GameLoop() {
		losowacz = new Losowacz();
		liczba = losowacz.getLiczba();
	}
	
	
	public void setLosowacz(Losowacz losowacz) {
		this.losowacz = losowacz;
		liczba =losowacz.getLiczba();
	}
	
	public boolean start() throws GameException {
		boolean wygrana = false;
		do {
			System.out.print("Wpisz liczbę z zakresu 0-" + losowacz.getMax()+ ":");
			try {
				int zgadnij = Integer.parseInt(inputReader.readLine());
				wygrana = gameLoop(zgadnij);
			} catch (NumberFormatException e) {
				throw new GameException("Podano bledna liczne", e);
			} catch (IOException e) {
				throw new GameException("Problem z odczytem liczby", e);
			}
		} while (!wygrana);
		return wygrana;
	}

	private boolean gameLoop(int zgadnij) {
		boolean wygrana = false;
		if (czyZgadnol(zgadnij)) {
			wygrana  = wygral();
		} else if (czyPodalZaDuzo(zgadnij)) {
			wygrana = przegrał(czyPodalZaDuzo(zgadnij));
			ktoryRaz++;
		} else if (czyPodalZaMalo(zgadnij)) {
			wygrana = przegrał(czyPodalZaDuzo(zgadnij));
			ktoryRaz++;
		}
		return wygrana;
	}

	private boolean przegrał(boolean czyPodalZaDuzo) {
		if (czyPodalZaDuzo) {
			System.out.println("Podał za duża liczbe");
		} else {
			System.out.println("Podał za duża liczbe");
		}
		return false;
	}

	private boolean wygral() {
		System.out.println("");
		System.out.println("Sukces!!!");
		System.out.println("Znalazłeś szukaną liczbę!");
		return true;
	}

	private boolean czyPodalZaMalo(int zgadnij) {
		return zgadnij < liczba;
	}

	private boolean czyPodalZaDuzo(int zgadnij) {
		return zgadnij > liczba;
	}

	private boolean czyZgadnol(int zgadnij) {
		return zgadnij == liczba;
	}

	public void setInputReader(InputReader ir) {
		this.inputReader = ir;

	}

	public int getLiczba() {
		return liczba;
	}
	public int getIleRazy() {
		return ktoryRaz;
	}

}
