import java.util.*;
import java.io.*;



public class DotComTestDrive{
	public static void main(String[] args) {
		DotCom dot = new DotCom();
		GameHelper helper = new GameHelper();
		int numOfGuesses = 0;
		int startingLocation = (int)(Math.random() * 4);
		int[] locations = {startingLocation,startingLocation + 1, startingLocation + 2};
		dot.setLocationCells(locations);

		// Scanner sc = new Scanner(System.in);

		while(true){
			//System.out.print("enter a number  ");
			//String userGuess = sc.nextLine();
			String userGuess = helper.getUserInput("enter a number between 0-7");
			String result = dot.checkYourself(userGuess);
			numOfGuesses++;
			if (result.equals("kill")){
				System.out.println("You took "+ numOfGuesses +" guesses");
				break;
			}
		}

		//sc.close();
	}
}


class GameHelper {
	public String getUserInput(String prompt) {
		String inputLine = null;
		System.out.print(prompt + " ");
		try {
			BufferedReader is = new BufferedReader(
				new InputStreamReader(System.in));
			inputLine = is.readLine();
			if (inputLine.length() == 0 ) return null;
		} catch (IOException e) {
			System.out.println("IOException: " + e);
		}
		return inputLine;
	}
}


