public class Player extends Adventurer {

	Player() {
		className = "Player";
		spell = "Mend";
	
		healthCap = 20;
		attackCap = 5;
		armorCap = 3;
		speedCap = 5;
		intelligenceCap = 7;
		willCap = 6;
		mpCap = 8;
		staminaCap = 12;
		
		maximizeStats();
	}
}	