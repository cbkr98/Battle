import java.util.Scanner;

public class BattleRevised
{
	public static void main( String[] args ) {
		for ( int i = 0; i < 3; i++ ) {
			Spell s = new Spell();
			Character c = new Character();
			System.out.println( s );
			System.out.println( c );
			System.out.println();
		}
		System.out.println();
		System.out.println();
		Monster m = new Monster();
		System.out.println( m );
	}
}	       