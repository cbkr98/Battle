public class Rogue {
	int health = 0;
	int attack = 0;
	int speed = 0;
	int armor = 0;
	int mp = 0;
	
	Rogue() {
		this.health = (int)((Math.random()*6)+10);
		this.attack = (int)((Math.random()*4)+2);
		this.speed = (int)((Math.random()*3)+3);
		this.armor = (int)((Math.random()*1)+0);
		this.mp = (int)((Math.random()*3)+1);
	}	
	public String toString() {
		String result = "";
		result += "------Rogue------\n";
		result += "\n";
		result += "| STATS |\n";
		result += "---------\n";
		result += "Health: " + this.health + "\n";
		result += "Attack: " + this.attack + "\n";
		result += " Speed: " + this.speed + "\n";
		result += " Armor: " + this.armor + "\n";
		result += "    MP: " + this.mp + "\n";
		result += "\n";
		result += " Spell: Poison";
		return result;
	}
}