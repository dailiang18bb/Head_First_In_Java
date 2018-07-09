import java.util.*;



public class DotComBust{

	ArrayList<DotCom> dotList = new ArrayList<DotCom>();
	GameHelper helper = new GameHelper();
	int numOfGuesses = 0;

	public static void main(String[] args) {
		DotComBust game = new DotComBust();
		game.setUpGame();
		game.startPlaying();
	}

	private void setUpGame(){
		DotCom dotLdai = new DotCom();
		dotLdai.setName("Ldai.com");
		DotCom dotCharles = new DotCom();
		dotCharles.setName("Charles.com");
		DotCom dotVictor = new DotCom();
		dotVictor.setName("Victor.com");
		dotList.add(dotLdai);
		dotList.add(dotCharles);
		dotList.add(dotVictor);

		System.out.println("Your goal is to sink three dot coms.");
		System.out.println("Ldai.com, Charles.com, Victor.com");
		System.out.println("Try to sink them all in the fewest number of guesses");

		// Setting up locations for each
		for(DotCom dotComToSet : dotList){
			ArrayList<String> newLocation = helper.placeDotCom(3);
			dotComToSet.setLocationCells(newLocation);
		}

	}

	private void startPlaying(){
		while(!dotList.isEmpty()){
			String userGuess = helper.getUserInput("Enter a guess");
			checkUserGuess(userGuess);
		}
		finishGame();
	}

	private void checkUserGuess(String userGuess){
		numOfGuesses++;
		String result = "miss";
		for(DotCom dotComToTest : dotList){
			result = dotComToTest.checkYourself(userGuess);
			if(result.equals("hit")){
				break;
			}
			if(result.equals("kill")){
				dotList.remove(dotComToTest);
				break;
			}
		}
		System.out.println(result);

	}

	private void finishGame(){
		System.out.println("All Dot Coms are dead! Your stock is now worthless.");
		if (numOfGuesses <= 18) {
			System.out.println("It only took you " + numOfGuesses + " guesses.");
			System.out.println(" You got out before your options sank.");
		} else {
			System.out.println("Took you long enough. "+ numOfGuesses + " guesses.");
			System.out.println("Fish are dancing with your options.");
		}
	}
}



