package gra;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputReader {

	BufferedReader reader;

	public InputReader() {
		reader = new BufferedReader(new InputStreamReader(System.in));
	}

	public String readLine() throws IOException {
		return reader.readLine();
	}

}
