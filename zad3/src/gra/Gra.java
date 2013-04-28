package gra;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Gra {

	public static void main(String[] args) throws NumberFormatException,
			IOException, GameException {

		GameLoop game = new GameLoop();
		InputReader ir = new InputReader();
		game.setInputReader(ir);
		game.start();		
		System.out.println("Udało się za " + game.getIleRazy() + " razem.");
	}

}
