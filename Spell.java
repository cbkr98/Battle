public class Spell {
	int number = 0;
	String name = "";
	
	Spell() {
		int x = (int)((Math.random()*3)+1);
		if ( x == 1 ) {
			this.number = 1;
			this.name = "Heal";
		} else if ( x == 2 ) {
			this.number = 2;
			this.name = "Fireball";
		} else if ( x == 3 ) {
			this.number = 3;
			this.name = "Ice";
		}	
	}
	public String toString() {
		String result = "";
		result += " Spell: " + this.name;
		return result;
	}
}