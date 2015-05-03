public class Adventurer extends Character {

	public String toString() {
		String result = "";
		result += "------" + className + "------\n";
		result += "\n";
		result += super.toString();
 		return result;
	}
}