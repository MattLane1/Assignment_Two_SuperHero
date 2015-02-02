/*Assignment Two, Matthew Lane (200214586), The Super Hero */

/**
 * @author Matthew Lane (200214586)
 * @date 02/2/2015
 * @description Assignment 2, The Super Hero
 * @version 3.0
 */

//This class is the SuperHero sub class. Its parent, is the Hero class. It allows further skills and abilities for specialized Heros.
public class SuperHero extends Hero {

	//Forward Declarations
	
	//The string array to hold the three random powers each super hero has. 
	private String[] superPowers = new String[3];
	
	//Constructor ---------------
	public SuperHero(String name) {
		super(name);
		
		//Randomly select and apply abilities from the superPowers array.
		generateRandomPowers();
		
		//Display the Heros Powers
		showPowers();
	}
	
	//Function Generate Random Powers (Selects powers randomly from a string array and assigns them to the current Super Hero.
	private void generateRandomPowers(){
		
		//Array of possible powers to choose from
		String[] possiblePowers = {"Super Speed", "Super Strength", "Body Armour", "Flight", "Fire Generation", "Weather Control"};
		
		
		//Loop to assign random powers from the possiblePowers array to the superPowers array.
		for (int powerGenerator = 0; powerGenerator < 3; powerGenerator ++)
		{
			int powerSelected = (int)(Math.random() * 5);
			superPowers[powerGenerator] = possiblePowers[powerSelected];
		}
		
	}
	
	//Function to display the heros super powers to the console. 
	public void showPowers(){
		System.out.println("---------------------------------");
		System.out.println("Name: " + this.name);
		System.out.println("Powers: " + this.superPowers[0] + ", " + this.superPowers[1] + ", " + this.superPowers[2]);
		System.out.println("---------------------------------");
	}

}
