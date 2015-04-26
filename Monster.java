public class Monster extends Character {
	int fury = 0;
	
	Monster() {
		this.fury = (int)((Math.random()*7)*100);
	}	
	
	public String toString() {
		return super.toString() + " " + this.fury + "";
	}
}