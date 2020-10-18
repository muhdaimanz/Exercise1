//Author : Muhd Aiman Zulkarnain
public class Driver {
	public static void main(String [] org){
		//Fish actually is a data type
		//Fish nemo; == int x;
		//nemo adalah object, Fish adalah kelas
		Fish nemo = new Fish(); 
		nemo.Swim();
		//nemo.color = "red"; //tukar value
		nemo.SetColor("red"); //change here
		nemo.Swim();
		
		//nemo.Eat(); //superclass call subclass method

		Shark fiery = new Shark();
		fiery.Eat();
		fiery.Swim();
		fiery.SetSharpTeeth(130);
		fiery.Eat();


		//Fish dory = new Fish(); //another object
		//dory.Swim();
		//dory.color = "green";
		//dory.SetColor("yellow"); //change here
		//dory.Swim();

		//Aquirium fancyAquirium = new Aquirium();
		//fancyAquirium.fillFish();
	}
}