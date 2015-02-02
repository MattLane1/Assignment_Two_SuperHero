/*Assignment Two, Matthew Lane (200214586), The Super Hero */

/**
 * @author Matthew Lane (200214586)
 * @date 02/2/2015
 * @description Assignment 2, The Super Hero
 * 
 * --History--
 * @version 1.0 - Began this assignment. I used the Hero class from my previous assignment as the super class.
 * @version 2.0 - Added necessary arrays, and generate abilities function.
 * @version 3.0 - Fixed errors, learned a lesson about the different between java arrays, and c++ arrays.
 * @version 4.0 - Added more comments, added version history, added if else to catch the same power being applied more than once Finished Assignment Two!
 */

//This class is the SuperHero sub class. Its parent, is the Hero class. It allows further skills and abilities for specialized Heros.
public class SuperHero extends Hero {

	//Forward Declarations
	//The string array to hold the three random powers each super hero has. 
	private String[] superPowers = new String[3];
	
	//Constructor --------------------
	public SuperHero(String name) {
		super(name);
		
		//Randomly select and apply abilities from the superPowers array.
		generateRandomPowers();
		
		//Display the Heros Powers
		showPowers();
	}//End of Constructor -----------
	
	//Function Generate Random Powers (Selects powers randomly from a string array and assigns them to the current Super Hero.
	private void generateRandomPowers(){
		
		//Array of possible powers to choose from
		String[] possiblePowers = {"Super Speed", "Super Strength", "Body Armour", "Flight", "Fire Generation", "Weather Control"};
		
		//Loop to assign random powers from the possiblePowers array to the superPowers array.
		for (int powerGenerator = 0; powerGenerator < 3; powerGenerator ++)
		{//Select a random number, to be used to select a random location in the superPowers array.
			int powerSelected = (int)(Math.random() * 5);
			
			//If / Else to stop the same power being applied more than once. If it has been used, roll back the loop by one so we try again.
			if (superPowers[0] == possiblePowers[powerSelected] || superPowers[1] == possiblePowers[powerSelected] || superPowers[2] == possiblePowers[powerSelected])
			powerGenerator --;
				
			else
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
