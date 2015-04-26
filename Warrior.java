public class Warrior {
	int health = 0;
	int attack = 0;
	int speed = 0;
	int armor = 0;
	int mp = 0;
	
	Warrior() {
		this.health = (int)((Math.random()*7)+13);
		this.attack = (int)((Math.random()*6)+4);
		this.speed = (int)((Math.random()*2)+1);
		this.armor = (int)((Math.random()*2)+1);
		this.mp = (int)((Math.random()*3)+2);
	}	
	public String toString() {
		String result = "";
		result += "------Warrior------\n";
		result += "\n";
		result += "| STATS |\n";
		result += "---------\n";
		result += "Health: " + this.health + "\n";
		result += "Attack: " + this.attack + "\n";
		result += " Speed: " + this.speed + "\n";
		result += " Armor: " + this.armor + "\n";
		result += "    MP: " + this.mp + "\n";
		result += "\n";
		result += " Spell: Slam";
		return result;
	}
}