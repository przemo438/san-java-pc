package gra;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Gra {

	public static void main(String[] args) throws NumberFormatException, IOException {

				BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
				boolean wynik = false;
				int ktory_raz=1;
		        Random rand = new Random();
		        int liczba = rand.nextInt(100);
		        while (wynik==false)
				{
		        	System.out.print("Wpisz liczbê z zakresu 0-100: ");
		        	int zgadnij = Integer.parseInt(reader.readLine());
		        	if(zgadnij==liczba)
					{
		        		System.out.println("");
		        		System.out.println("Sukces!!!");
		        		System.out.println("Znalaz³eœ szukan¹ liczbê!");
		        		wynik=true;
		        	}
		        	else if (zgadnij>liczba)
					{
		        		System.out.println("Poda³eœ za du¿¹ liczbê.");
		        		wynik=false;
		        		ktory_raz++;
		        	}
		        	else if (zgadnij<liczba)
					{
		        		System.out.println("Poda³eœ za ma³¹ liczbê.");
		        		wynik=false;
		        		ktory_raz++;
		        	}
		        }
		        System.out.println("Uda³o siê za "+ktory_raz+" razem.");
	}	
		

}
