package gra;

import java.util.Random;

public class Losowacz {
	private static final int MAX_GAME_NUMBER = 100;
	private int liczba;
	
	public Losowacz() {
		Random rand = new Random();
		liczba = rand.nextInt(MAX_GAME_NUMBER);
	}
	public int getLiczba() {
		return liczba;
	}
	public int getMax() {
		return MAX_GAME_NUMBER;
	}
}	
