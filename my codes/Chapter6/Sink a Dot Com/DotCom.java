import java.util.ArrayList;


public class DotCom{

	private String name;
	private ArrayList <String> locationCells;

	public class DotCom(String dotName){
		name = dotName;
	}

	public void setLocationCells(ArrayList<String> locs){
		locationCells = locs;
	}

	public void getName(){
		return name;
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