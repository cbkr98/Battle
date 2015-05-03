public class Warrior extends Adventurer{
	
	Warrior() {
		className = "Warrior";
		spell = "Slam";
	
		healthCap = (int)((Math.random()*3)+12);
		attackCap = (int)((Math.random()*3)+2);
		armorCap = (int)((Math.random()*2)+1);
		speedCap = (int)((Math.random()*2)+1);
		intelligenceCap = (int)((Math.random()*2)+1);
		willCap = (int)((Math.random()*2)+0);
		mpCap = (int)((Math.random()*3)+2);
		staminaCap = (int)((Math.random()*3)+8);
		
		maximizeStats();
	}
}