public class Trickster extends Adventurer {
	
	Trickster() {
		className = "Trickter";
		spell = "Fear";

		healthCap = (int)((Math.random()*3)+4);
		attackCap = (int)((Math.random()*2)+0);
		armorCap = (int)((Math.random()*2)+0);
		speedCap = (int)((Math.random()*2)+1);
		intelligenceCap = (int)((Math.random()*3)+2);
		willCap = (int)((Math.random()*3)+1);
		mpCap = (int)((Math.random()*3)+3);
		staminaCap = (int)((Math.random()*4)+4);
		
		maximizeStats();
	}	
}