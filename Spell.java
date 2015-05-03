public class Spell {
	int number = 0;
	
	public String name() {
		if ( number == 1 ) {
			return "Heal";
		} else if ( number == 2 ) {
			return "Fireball";
		} else if ( number == 3 ) {
			return "Ice";
		} else {
			return "Unknown";
		}
	}

	public String toString() {
		return this.name();
	}
}