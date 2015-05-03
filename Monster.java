public class Monster extends Character {
	int health = 0;
	int attack = 0;
	int speed = 0;
	int armor = 0;
	
	Monster() {
		this.health = (int)((Math.random()*6)+5);
		this.attack = (int)((Math.random()*3)+1);
		this.speed = (int)((Math.random()*2)+1);
		this.armor = (int)((Math.random()*2)+0);
	}
	public String toString() {
		String result = "";
		result += "<<<<< Monster >>>>>\n";
		result += "\n";
		result += "| STATS |\n";
		result += "---------\n";
		result += "Health: " + this.health + "\n";
		result += "Attack: " + this.attack + "\n";
		result += " Speed: " + this.speed + "\n";
		result += " Armor: " + this.armor + "\n";
		return result;
	}
}