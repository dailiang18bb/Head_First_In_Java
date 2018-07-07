import java.util.ArrayList;


public class DotCom{

	private ArrayList <String> locationCells;
	public void setLocationCells(ArrayList<String> locs){
		locationCells = locs;
	}

	public String checkYourself(String stringGuess){
		int index = locationCells.indexOf(stringGuess);
		String result = "miss";

		if(index >= 0){
			locationCells.remove(index);


			if (locationCells.isEmpty()){
				result = "kill";
			}else{
				result = "hit";
			}
		} 
		System.out.println(result);
		return result;
	}
}