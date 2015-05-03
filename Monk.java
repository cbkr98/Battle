public class Monk extends Adventurer {
	
	Monk() {
		className = "Monk";
		spell = "Stun";

		healthCap = (int)((Math.random()*3)+9);
		attackCap = (int)((Math.random()*2)+2);
		armorCap = (int)((Math.random()*1)+0);
		speedCap = (int)((Math.random()*2)+2);
		intelligenceCap = (int)((Math.random()*2)+0);
		willCap = (int)((Math.random()*3)+3);
		mpCap = (int)((Math.random()*4)+2);
		staminaCap = (int)((Math.random()*4)+12);
		
		maximizeStats();
	}
}