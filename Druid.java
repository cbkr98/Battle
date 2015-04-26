public class Druid {
	int health = 0;
	int attack = 0;
	int speed = 0;
	int armor = 0;
	int mp = 0;
	
	Druid() {
		this.health = (int)((Math.random()*5)+6);
		this.attack = (int)((Math.random()*3)+1);
		this.speed = (int)((Math.random()*2)+2);
		this.armor = (int)((Math.random()*1)+0);
		this.mp = (int)((Math.random()*3)+3);
	}	
	public String toString() {
		String result = "";
		result += "------Druid------\n";
		result += "\n";
		result += "| STATS |\n";
		result += "---------\n";
		result += "Health: " + this.health + "\n";
		result += "Attack: " + this.attack + "\n";
		result += " Speed: " + this.speed + "\n";
		result += " Armor: " + this.armor + "\n";
		result += "    MP: " + this.mp + "\n";
		result += "\n";
		result += " Spell: Rejuvinate";
		return result;
	}
}