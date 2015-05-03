public class Mage extends Adventurer{
	
	Mage() {
		className = "Mage";
		spell = "Fireball";

		healthCap = (int)((Math.random()*4)+6);
		attackCap = (int)((Math.random()*2)+0);
		armorCap = (int)((Math.random()*2)+0);
		speedCap = (int)((Math.random()*2)+1);
		intelligenceCap = (int)((Math.random()*3)+2);
		willCap = (int)((Math.random()*3)+3);
		mpCap = (int)((Math.random()*4)+4);
		staminaCap = (int)((Math.random()*4)+5);
		
		maximizeStats();
	}	
}