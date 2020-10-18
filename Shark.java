//Author : Muhd Aiman Zulkarnain
public class Shark extends Fish {
	private int sharpTeeth = 50;

	public void Eat(){
		System.out.println("Eat wiht " + sharpTeeth + " number of teeth");

	}
	public void SetSharpTeeth(int teeth){
		sharpTeeth = teeth;
	}
}
