//Author : Muhd Aiman Zulkarnain
public class Fish {

	//Attribute or data member or fields
	private String color = "blue"; //defautl value

	//Method
	public void Swim () {
		System.out.println(color + "fish swim");
	}

	//Setter / Mutator method
	public void SetColor(String warna) {
		color = warna;

	}
	//Getter / Accessor method
	public String GetColor(){
		return color;
	}
}
