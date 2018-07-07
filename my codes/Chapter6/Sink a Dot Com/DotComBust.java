import java.util.*;



public class DotComBust{

	ArrayList<DotCom> dotList = new ArrayList<DotCom>();
	GameHelper helper = new GameHelper();
	int numOfGuesses = 0;

	public static void main(String[] args) {

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

	private void setUpGame(){
		DotCom dotLdai = new DotCom("Ldai.com");
		DotCom dotCharles = new DotCom("Charles.com");
		DotCom dotVictor = new DotCom("Victor.com");
		dotList.add(dotLdai);
		dotList.add(dotCharles);
		dotList.add(dotVictor);

		System.out.println("Your goal is to sink three dot coms.");
		System.out.println("Ldai.com, Charles.com, Victor.com");
		System.out.println("Try to sink them all in the fewest number of guesses");

		// Setting up locations for each

	}

	private void startPlaying(){
		while(!dotList.isEmpty()){
			String userGuess = helper.getUserInput("Enter a guess");
			checkUserGuess(userGuess);
		}
		finishGame();

	}

	private void checkUserGuess(){

	}

	private void finishGame(){

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


