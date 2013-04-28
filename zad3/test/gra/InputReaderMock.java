package gra;

import java.io.IOException;

import junit.framework.TestCase;

public class InputReaderMock  extends InputReader{

	private final String input;
	private  int i; 
	
	
	public InputReaderMock(String input) {
		this.input = input;
	}
	
	@Override
	public String readLine() throws IOException {
		String znak = input.substring(i, i+1);
		System.out.println(">> " + znak);
		i++;
		return znak;
	}
	
	
}
