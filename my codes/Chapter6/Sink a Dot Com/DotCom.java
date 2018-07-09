import java.util.ArrayList;


public class DotCom{

	private String name;
	private ArrayList <String> locationCells;

	public void setName(String n){
		name = n;
	}

	public void setLocationCells(ArrayList<String> locs){
		locationCells = locs;
	}

	public String getName(){
		return name;
	}


	public String checkYourself(String stringGuess){
		int index = locationCells.indexOf(stringGuess);
		String result = "miss";

		if(index >= 0){
			locationCells.remove(index);


			if (locationCells.isEmpty()){
				result = "kill";
				System.out.println("Ouch! You sunk " + name + " : ( ");
			}else{
				result = "hit";
			}
		} 
		// System.out.println(result);
		return result;
	}
}