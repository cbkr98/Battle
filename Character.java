public class Character {
	String spell = "";
	String className = "";

	int healthCurrent = 0, healthCap = 0;
	int attackCurrent = 0, attackCap = 0;
	int armorCurrent = 0, armorCap = 0;
	int speedCurrent = 0, speedCap = 0;
	int intelligenceCurrent = 0, intelligenceCap = 0;
	int willCurrent = 0, willCap = 0;
	int mpCurrent = 0, mpCap = 0;
	int staminaCurrent = 0, staminaCap = 0;
	
	void maximizeStats(){
		healthCurrent = healthCap;
		attackCurrent = attackCap;
		armorCurrent = armorCap;
		speedCurrent = speedCap;
		intelligenceCurrent = intelligenceCap;
		willCurrent = willCap;
		mpCurrent = mpCap;
		staminaCurrent = staminaCap;
	}

	public String toString() {
		String result = "";
		result += "| STATS |\n";
		result += "---------\n";
		result += " Health: " + this.healthCurrent + "/" + this.healthCap + "\n";
		result += " Attack: " + this.attackCurrent + "\n";
		result += "  Armor: " + this.armorCurrent + "\n";
		result += "  Speed: " + this.speedCurrent + "\n";
		result += "   Luck: " + this.intelligenceCurrent + "\n";
		result += "   Will: " + this.willCurrent + "\n";
		result += "     MP: " + this.mpCurrent + "/" + this.mpCap + "\n";
		result += "Stamina: " + this.staminaCurrent + "/" + this.staminaCap + "\n";
		result += "\n";
		result += " Spell: " + spell;
		return result;
	}


	public void attack(Character that){
		// this fights  that...
		//this.healthCurrent 
	}

}