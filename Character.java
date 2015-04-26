public class Character {
	int health = 0;
	int attack = 0;
	
	Character() {
		this.health = (int)((Math.random()*10)+10);
		this.attack = (int)((Math.random()*5)+1);
	}	
	
	public String toString() {
		return this.health + " " + this.attack;
	}
}