public class Druid extends Adventurer {
	
	Druid() {
		className = "Druid";
		spell = "Call Wolf";

		healthCap = (int)((Math.random()*3)+7);
		attackCap = (int)((Math.random()*2)+1);
		armorCap = (int)((Math.random()*2)+0);
		speedCap = (int)((Math.random()*2)+1);
		intelligenceCap = (int)((Math.random()*3)+2);
		willCap = (int)((Math.random()*3)+1);
		mpCap = (int)((Math.random()*4)+3);
		staminaCap = (int)((Math.random()*4)+3);
		
		maximizeStats();
	}	
}