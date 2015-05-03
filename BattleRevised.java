import java.util.Scanner;

public class BattleRevised
{
	public static void main( String[] args ) {

		Scanner keyboard = new Scanner(System.in);
		Player p = new Player();
		
		
		int k = 20;
		int w = 0;
		
		// creating you
			// System.out.println();
	// 		System.out.println( "*What spell would you like to learn for your travels?* :" );
	// 		System.out.println( "1) Heal\n2) Fireball\n3) Ice" );
	// 		p.spell.number = keyboard.nextInt();
		
		System.out.println();
		System.out.println( "<---- You ---->" );
		System.out.println();
		System.out.println( p );
		System.out.println();
		
		// asking for amount of adventurers you request
		System.out.println( "We have 19 willing adventurers to take your side." );
		System.out.print( "How many adventurers whould you like to take with?: " );
		while ( k > 19 ) {
			k = keyboard.nextInt();
			if ( k > 19 ) {
				System.out.println( "Sorry, but we just don't have that many willing adventurers." );
				System.out.print( "How many would you like to take with?: " );
			}
		}
		System.out.println( "We will tell our adventurers to make haste." );
		delay(5000);
		System.out.println( "Here they are." );
		delay(2000);
		
		// creating the requested adventurers
		Adventurer adventurers[] = new Adventurer[k];
		for ( int i = 0; i < k; i++ ) {
			int j = i + 1;
			int l = (int)((Math.random()*8)+1);
			
			System.out.println();
			System.out.println( "<---- Adventurer " + j + " ---->" );
			if ( l == 1 ) {
				adventurers[i] = new Warrior();
			} else if ( l == 2 ) {
				adventurers[i] = new Mage();
			} else if ( l == 3 ) {
				adventurers[i] = new Rogue();
			} else if ( l == 4 ) {
				adventurers[i] = new Templar();
			} else if ( l == 5 ) {
				adventurers[i] = new Healer();
			} else if ( l == 6 ) {
				adventurers[i] = new Trickster();
			} else if ( l == 7 ) {
				adventurers[i] = new Druid();
			} else if ( l == 8 ) {
				adventurers[i] = new Monk();
			}
			System.out.println( adventurers[i] );
			System.out.println();
			System.out.println( "+-=-=-=-=-=-=-=-=-=-=-=-+" );
			delay(1500);
		}
		System.out.println();
		System.out.println( "You and your adventurers leave to explore the forest." );
		delay(3000);
		System.out.print( "As your and your adventurers enter the forest, you run " );
		System.out.println( "into a group of monsters!" );
		delay(3000);
		System.out.println( "You are now in battle!" );
		delay(3000);
		
		w = (int)((Math.random()*8)+4);
		Monster monsters[] = new Monster[w];
		for ( int i = 0; i < w; i ++ ) {
			int j = i + 1;
			
			System.out.println();
			System.out.println( "!---- Monster " + j + " ----!" );
			monsters[i] = new Monster();
			System.out.println( monsters[i] );
			System.out.println( "\\-:-:-:-:-:-:-:-:-:-:-:-/" );
			delay(1000);
		}
	}
	
	public static void delay( int a ) {
		try {
			Thread.sleep(a);                 
		} catch(InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
	}
	public static void fight() {
		
	}
}	       