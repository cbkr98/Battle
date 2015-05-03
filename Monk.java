public class Monk extends Character{
	int healthCurrent = 0, healthCap = 0;
	int attackCurrent = 0, attackCap = 0;
	int armorCurrent = 0, armorCap = 0;
	int speedCurrent = 0, speedCap = 0;
	int intelligenceCurrent = 0, intelligenceCap = 0;
	int willCurrent = 0, willCap = 0;
	int mpCurrent = 0, mpCap = 0;
	int staminaCurrent = 0, staminaCap = 0;
	
	Monk() {
		this.healthCap = (int)((Math.random()*3)+9);
		this.attackCap = (int)((Math.random()*2)+2);
		this.armorCap = (int)((Math.random()*1)+0);
		this.speedCap = (int)((Math.random()*2)+2);
		this.intelligenceCap = (int)((Math.random()*2)+0);
		this.willCap = (int)((Math.random()*3)+3);
		this.mpCap = (int)((Math.random()*4)+2);
		this.staminaCap = (int)((Math.random()*4)+12);
		
		this.healthCurrent = healthCap;
		this.attackCurrent = attackCap;
		this.armorCurrent = armorCap;
		this.speedCurrent = speedCap;
		this.intelligenceCurrent = intelligenceCap;
		this.willCurrent = willCap;
		this.mpCurrent = mpCap;
		this.staminaCurrent = staminaCap;
	}	
	public String toString() {
		String result = "";
		result += "------Monk------\n";
		result += "\n";
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
		result += " Spell: Haste";
		return result;
	}
}