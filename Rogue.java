public class Rogue extends Adventurer {
	
	Rogue() {
		className = "Rouge";
		spell = "Poison";

		healthCap = (int)((Math.random()*4)+10);
		attackCap = (int)((Math.random()*3)+1);
		armorCap = (int)((Math.random()*2)+0);
		speedCap = (int)((Math.random()*4)+2);
		intelligenceCap = (int)((Math.random()*2)+1);
		willCap = (int)((Math.random()*2)+1);
		mpCap = (int)((Math.random()*3)+2);
		staminaCap = (int)((Math.random()*4)+6);
		
		maximizeStats();
	}	
}