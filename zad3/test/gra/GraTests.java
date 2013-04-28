package gra;

import org.junit.Test;

import junit.framework.Assert;
import junit.framework.TestCase;

public class GraTests extends TestCase {

	@Test
	public void testShouldThrowNbrExectonWhenUserInvalidData() {
		// GIVEN Gra i zły input dostarczony przez mocka
		GameLoop game = new GameLoop();
		InputReader ir = new InputReaderMock("fshufdshufids");
		// WHEN ustawiamy Input mocka i uruchamiamy gre
		game.setInputReader(ir);
		game.setLosowacz(new Losowacz());
		Exception ex = null;
		try {
			game.start();
		} catch (GameException e) {
			ex = e;
		}
		// THEN powinniśmy dostać GameException
		Assert.assertNotNull("Poniewaz podalismy bledny input musimy dostac exception ", ex);
	}
	
	@Test
	public void testShouldGenerateRandomNumber() {
		// GIVEN Gra 
		GameLoop game;
		// WHEN losujemy	
		game = new GameLoop();
		// THEN powinnismy dostac liczbe z zakrasu 1 -100;
		if (game==null){
			Assert.fail("Gra nie została utworzona");
		}
		boolean result = (game.getLiczba()<100) && (game.getLiczba()>=0);
		Assert.assertTrue(result);
		
	}
	
	@Test
	public void testShouldDisplayWinDialogWhenWin() throws GameException {
		// GIVEN Gra i zły input dostarczony przez mocka
		boolean expected = true;
		GameLoop game = new GameLoop();
		InputReader ir = new InputReaderMock("3");
		Losowacz losowacz = new MockLosowacz();
		// WHEN ustawiamy Input mocka i uruchamiamy gre
		game.setInputReader(ir);
		game.setLosowacz(losowacz);
		boolean result = game.start();
		// THEN powinniśmy wygrac
		Assert.assertEquals(expected, result);
		Assert.assertEquals(1, game.getIleRazy());
	}
	
	@Test
	public void testShoudAskForNextNumber() throws GameException {
		// GIVEN Gra i zły input dostarczony przez mocka
		boolean expected = true;
		GameLoop game = new GameLoop();
		InputReader ir = new InputReaderMock("43");
		Losowacz losowacz = new MockLosowacz();
		// WHEN ustawiamy Input mocka i uruchamiamy gre
		game.setInputReader(ir);
		game.setLosowacz(losowacz);
		boolean result = game.start();
		// THEN powinniśmy wygrac
		Assert.assertEquals(expected, result);
		Assert.assertEquals(2, game.getIleRazy());
	}
	

}
