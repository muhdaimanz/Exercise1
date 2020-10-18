//Author : Muhd Aiman Zulkarnain
public class Driver {
	public static void main(String [] org){
		//Fish actually is a data type
		//Fish nemo; == int x;
		//nemo adalah object, Fish adalah kelas
		Fish nemo = new Fish(); 
		nemo.Swim();
		nemo.color = "red"; //tukar value
		nemo.Swim();

		Fish dory = new Fish(); //another object
		dory.Swim();
		dory.color = "green";
		dory.Swim();
	}
}