public class Player {
	int health = 35;
	int attack = 6;
	int speed = 4;
	int armor = 3;
	int mp = 5;
	int gender = 2;
	
	public String genderStr() {
		if (this.gender == 1){
			return "sir";
		} else {
			return "madam";
		}
	}
	
	
	public String toString() {
		String result = "";
		result += "| STATS |\n";
		result += "---------\n";
		result += "Health: " + this.health + "\n";
		result += "Attack: " + this.attack + "\n";
		result += " Speed: " + this.speed + "\n";
		result += " Armor: " + this.armor + "\n";
		result += "    MP: " + this.mp;
		return result;
	}
}	