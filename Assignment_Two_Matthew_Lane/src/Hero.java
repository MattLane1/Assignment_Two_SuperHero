/* Assignment One, Matthew Lane (200214586)*/

//This class generates the hero and it's abilities.
public class Hero {
	
	//PRIVATE PROPERTIES 
	private int strength;
	private int speed;
	private int health;
	
	//PUBLIC PROPERTIES 
	public String name;
	
	//CONSTRUCTOR OF HERO CLASS
	public Hero(String name){
		this.name = name;
		generateAbilities();
	}
	
	//PRIVATE METHODS 
	
	//This method generates the unique abilities for the hero. The hero has 3 properties, strength, speed and health.
	private void generateAbilities(){
		this.strength = (int)(Math.random() * 100 + 1);
		this.speed = (int)(Math.random() * 100 + 1);
		this.health = (int)(Math.random() * 100 + 1);
	}
	
	//PUBLIC METHODS 
	
	//This method displays the name and stats of the hero.
	public void show()
	{
		System.out.println("---------------------------------");
		System.out.println("Name: " + this.name);
		System.out.println("Strength: " + this.strength);
		System.out.println("Speed: " + this.speed);
		System.out.println("Health: " + this.health);
		System.out.println("---------------------------------");
	}
	
	//This method is called when a hero is fighting.
	public void fight(){
		System.out.println(this.name + " Is attempting to hit!");
		Boolean hitSuccess = hitAttempt();
		
		//The hero landed a blow! Calculate the damage and print it to the console. 
		if (hitSuccess == true)
			System.out.println(hitDamage() + " Damage was done!");
		
		else//*The price is right failure music here*
			System.out.println("The hit was unsuccessfull!");
	}
	
	//The hero has attempted a hit. Decide if it has succeeded.
	public Boolean hitAttempt(){
		int didHit = (int)(Math.random() * 100 + 1);
		Boolean hit = false;
		
		//20% chance of hitting.
		if (didHit <= 20)
			hit = true;
		
		//80% chance of failing to hit.
		else 
			hit = false;
		
		return hit;
	}
	
	//A hit was successful, how much damage was done?
	public int hitDamage(){
		//Damage = Hero's Strength multiplied by a random number between 1 and 6.
		int damage = (this.strength * (int)(Math.random() * 6 + 1));
		
		return damage;
	}


	
}
