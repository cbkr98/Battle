public class Templar extends Adventurer {
	
	Templar() {
		className = "Templar";
		spell = "Defend";

		healthCap = (int)((Math.random()*4)+15);
		attackCap = (int)((Math.random()*2)+1);
		armorCap = (int)((Math.random()*3)+2);
		speedCap = (int)((Math.random()*2)+1);
		intelligenceCap = (int)((Math.random()*2)+1);
		willCap = (int)((Math.random()*3)+1);
		mpCap = (int)((Math.random()*3)+2);
		staminaCap = (int)((Math.random()*5)+10);
		
		maximizeStats();
	}	
}