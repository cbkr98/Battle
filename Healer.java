public class Healer extends Adventurer{
	
	Healer() {
		className = "Healer";
		spell = "Heal";

		healthCap = (int)((Math.random()*3)+5);
		attackCap = (int)((Math.random()*2)+0);
		armorCap = (int)((Math.random()*2)+0);
		speedCap = (int)((Math.random()*1)+1);
		intelligenceCap = (int)((Math.random()*3)+2);
		willCap = (int)((Math.random()*3)+2);
		mpCap = (int)((Math.random()*4)+3);
		staminaCap = (int)((Math.random()*5)+3);
		
		maximizeStats();
	}	
}