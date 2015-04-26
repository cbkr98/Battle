import java.util.Scanner;

public class BattleRevised
{
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		Spell s = new Spell();
		Player p = new Player();
		int k = 20;
		int spellNumber = 0;
		String spellName = "";
		
		// creating you
		System.out.println( "*What is your gender?* : " );
		System.out.println( "1) female\n2) male" );
		p.gender = keyboard.nextInt();
			
		System.out.println( "*What spell would you like to take on your travels?* :" );
		System.out.println( "1) Heal\n2) Fireball\n3) Ice" );
		spellNumber = keyboard.nextInt();
		if ( spellNumber == 1 ) {
			spellName = "Heal";
		} else if ( spellNumber == 2 ) {
			spellName = "Fireball";
		} else if ( spellNumber == 3 ) {
			spellName = "Ice";
		}
		
		System.out.println();
		System.out.println( "<---- You ---->" );
		System.out.println();
		System.out.println( p );
		System.out.println();
		System.out.println( "Spell: " + spellName );
		System.out.println();
		
		// asking for amount of adventurers you request
		System.out.println( "We have 19 willing adventurers to take your side, " + p.genderStr() + "." );
		System.out.print( "How many adventurers whould you like to take with?: " );
		while ( k > 19 ) {
			k = keyboard.nextInt();
			if ( k > 19 ) {
				System.out.println( "I'm sorry, " +  p.genderStr() + ", but we just don't have that many willing adventurers." );
				System.out.print( "How many would you like to take with?: " );
			}
		}
		System.out.println( "We will tell our adventurers to make haste." );
		delay(5000);
		System.out.println( "Here they are." );
		delay(2000);
		
		// creating the requested adventurers
		for ( int i = 1; i <= k; i++ ) {
			Spell s2 = new Spell();
			Warrior w = new Warrior();
			Mage m = new Mage();
			Rogue r = new Rogue();
			Templar te = new Templar();
			Healer h = new Healer();
			Druid d = new Druid();
			Trickster tr = new Trickster();
			int l = (int)((Math.random()*7)+1);
			
			System.out.println();
			System.out.println( "<---- Adventurer " + i + " ---->" );
			
			if ( l == 1 ) {
				System.out.println( w );
			} else if ( l == 2 ) {
				System.out.println( m );
			} else if ( l == 3 ) {
				System.out.println( r );
			} else if ( l == 4 ) {
				System.out.println( te );
			} else if ( l == 5 ) {
				System.out.println( h );
			} else if ( l == 6 ) {
				System.out.println( d );
			} else if ( l == 7 ) {
				System.out.println( tr );
			}
			System.out.println();
			System.out.println( "+-=-=-=-=-=-=-=-=-=-=-=-+" );
			System.out.println();
			delay(1500);
		}
	}
	
	public static void delay( int a ) {
		try {
			Thread.sleep(a);                 
		} catch(InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
	}
}	       