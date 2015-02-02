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

public class CreateAndUseHeros {

	//The main method for the assignment
	public static void main(String[] args) {
		
		//Create the SuperHero
		SuperHero hero = new SuperHero("Smokey");
		
		//Make the hero fight for our amusement.
		hero.fight();
	}
}
