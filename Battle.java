import java.util.Scanner;

public class Battle
{
	public static void main( String[] args ) {		
	
	//////////////////////////////////////////////////////////////////////////////////
	//																				//
	// Just start over. This whole thing is a mess and you have done a great job.	//
	//																				//
	//////////////////////////////////////////////////////////////////////////////////
	
	
	
	
		Scanner keyboard = new Scanner(System.in);
		
		int charHealth, monHealth, charAttack, monAttack, charSpeed, monSpeed, charMP, monMP;
		int charHealthCurrent, charAttackCurrent, charSpeedCurrent, charArmorCurrent, charMPCurrent;
		int monHealthCurrent, monAttackCurrent, monArmorCurrent, monSpeedCurrent, monMPCurrent;
		int charArmor, monArmor, charSpellCooldown, monSpellCooldown;
		int rollBattle, rollCritical, rollTurn, charTurnNumber;
		int chanceRun, chanceSpell, monChanceSpell, choiceSpell, monChoiceSpell, monChoiceBattle, monChoiceAction;
		String choiceBattle, charSpell, monSpell;
		charSpell = "";
		monSpell = "";
		
	// set stats of player and monster
		charHealth = random(20) + 20;
		charAttack = random(5) + 3;
		charSpeed = random(4);
		charArmor = random(7) - 1;
		charMP = random(3) + 1;
		
		monHealth = random(20) + 20;
		monAttack = random(5) + 3;
		monSpeed = random(4);
		monArmor = random(7) - 1;
		monMP = random(3) + 1;
		
		charHealthCurrent = charHealth;
		charAttackCurrent = charAttack;
		charSpeedCurrent = charSpeed;
		charArmorCurrent = charArmor;
		charMPCurrent = charMP;
		
		monHealthCurrent = monHealth;
		monAttackCurrent = monAttack;
		monSpeedCurrent = monSpeed;
		monArmorCurrent = monArmor;
		monMPCurrent = monMP;
		
		charSpellCooldown = 0;
		monSpellCooldown = 0;
		charTurnNumber = 0;
	// all stats have been set
		
		stats( 	charHealthCurrent, 	charAttackCurrent, 
				charSpeedCurrent, 	charMPCurrent, 
				charSpellCooldown,	charArmorCurrent,
				monAttackCurrent,	monSpeedCurrent,
				monArmorCurrent,	monHealthCurrent,
				monSpellCooldown,	monMPCurrent,
				charSpell,			monSpell 	);
		
	// asking for a spell
		while (true){
			System.out.println( "Choose your spell:\n1) Heal\n2) Fireball\n3) Ice" );
			try{
				choiceSpell = keyboard.nextInt();
			} catch (Exception e){
				choiceSpell = 0;
				keyboard = new Scanner(System.in);
			}
			if ( choiceSpell == 1 ) {
				charSpell = "Heal";
			} else if ( choiceSpell == 2 ) {
				charSpell = "Fireball";
			} else if ( choiceSpell == 3 ) {
				charSpell = "Ice";
			} else {
				System.out.println("Invalid choice");
				continue;
			}
			break;
		}
	// spell set
		
	// monster spell being set
		if ( monHealth <= charHealth - 9 || monAttack <= 4 ) {
			monChoiceSpell = 1;
			monSpell = "Heal";
		}
		if ( monAttack < charArmor ) {
			monChoiceSpell = 2;
			monSpell = "Fireball";
		}
		if ( charSpeed == 4 ) {
			monChoiceSpell = 3;
			monSpell = "Ice";
		}
		else {
			monChoiceSpell = random(3);
			if (monChoiceSpell == 1 ) {
				monSpell = "Heal"; 
			} else if ( monChoiceSpell == 2 ) {
				monSpell = "Fireball";
			} else if ( monChoiceSpell == 3 ) {
				monSpell = "Ice";
			}
		}
	// monster spell set
		
		while ( charHealthCurrent > 0 && monHealthCurrent > 0 )  {
			
			stats( 	charHealthCurrent, 	charAttackCurrent, 
					charSpeedCurrent, 	charMPCurrent, 
					charSpellCooldown,	charArmorCurrent,
					monAttackCurrent,	monSpeedCurrent,
					monArmorCurrent,	monHealthCurrent,
					monSpellCooldown,	monMPCurrent,
					charSpell,			monSpell 	);
					
					
	// your turn starts
			while(charTurnNumber == 0) {
			System.out.println( "Your turn!" );
				while (true) {
					if ( monChoiceSpell == 3 && monSpellCooldown > 1 ) {
						System.out.println( "You are frozen." );
						break;
					}
					if ( monSpellCooldown == 0 ) {
						charArmorCurrent = charArmor;
						charSpeedCurrent = charSpeed;
					}
		// choose action
					System.out.println( "Do you choose to \"attack\", \"spell\", or  " );
					System.out.println( "\"run\"?" );
					choiceBattle = keyboard.next();
		// spell choice
					if ( choiceBattle.equals( "spell" ) ) {
						if ( charSpellCooldown == 0 ) {
							chanceSpell = random(3);
							if ( chanceSpell != 3 && charMP != 0 ) {
								System.out.println( "You use " + charSpell + "!" );
								delay();
								if ( choiceSpell == 1 ) {
									charHealthCurrent += 10;
									charMPCurrent -= 1;
								} else if ( choiceSpell == 2 ) {
									if ( charSpellCooldown == 0 ) {
										monHealthCurrent -= 6;
										monArmorCurrent = 0;
										charSpellCooldown = 3;
										charMPCurrent -= 1;
									}	
								} else if ( choiceSpell == 3 ) {
									if ( charSpellCooldown == 0 ) {
										monSpeedCurrent -= 1;
										charSpellCooldown = 3;
										charMPCurrent -= 1;	
									}	
								}
							}
							else {
								System.out.println( "Your spell fizzles." );
								charMPCurrent -= 1;
								if ( charMP < 0 ){
									charMPCurrent = 0;
								}
							} 							
						} 
						else {
							System.out.println( "You can't. Spell on cooldown." );
							continue;
						}	
		// attack choice
					} else if ( choiceBattle.equals( "attack" )) {
						System.out.println( "You attack!" );
						rollBattle = random(4);
						if ( rollBattle >= monSpeed ) {
							System.out.println( "You hit!" );
							rollCritical = random(4);
							if ( rollCritical == 1 ) {
								System.out.println( "Critical!" );
								monHealthCurrent -= charAttackCurrent * 2;
								delay();
							} 
							else {
								monHealthCurrent -= charAttackCurrent - monArmorCurrent;
								delay();
							}		
						}
						else {
							System.out.println( "You miss!" );
							delay();
						}
		// run choice	
					} else if ( choiceBattle.equals( "run" )) {
						chanceRun = random(3);
						if ( chanceRun == 1 ) {
							System.out.println( "You live to see another day!" );
							break;
						}
						else {
							System.out.println( "Your attempt fails." );
						}
						// other choice
					} else {
						System.out.println( "That is not an option." );
						continue;
					} 
					// spell cooldown timer
					if ( charSpellCooldown != 0 ) {
						charSpellCooldown -= 1;
					} else if ( charSpellCooldown == 0 ) {
						monSpeedCurrent = monSpeed;
						monArmorCurrent = monArmor;
						monAttackCurrent = monAttack;
					}
					charTurnNumber = 1;
					break;
				}
				charTurnNumber = 1;
				if ( monHealthCurrent <=0 ) {
						break;
				}
			}	
	// monster's turn
		// determines if frozen
			if ( monHealthCurrent <=0 ) {
				break;
			}
			if ( choiceSpell == 3 && charSpellCooldown > 1 ) {
				System.out.println( "Monster is frozen." );
				charTurnNumber = 0;
				delay();
				continue;
			}	
			int a = 1;
			stats( 	charHealthCurrent, 	charAttackCurrent, 
					charSpeedCurrent, 	charMPCurrent, 
					charSpellCooldown,	charArmorCurrent,
					monAttackCurrent,	monSpeedCurrent,
					monArmorCurrent,	monHealthCurrent,
					monSpellCooldown,	monMPCurrent,
					charSpell,			monSpell 	);
			
	// monster action
			while ( charTurnNumber == 1 ) {
				monChoiceAction = random(2);
				if ( monChoiceAction == 1 ) {
			
					// monster attacks
					System.out.println( "Monster attacks!" );
					rollBattle = random(4);
					if ( rollBattle >= charSpeed ) {
						System.out.println( "Monster hits!" );
						rollCritical = random(4);
						if ( rollCritical == 1 ) {
							System.out.println( "Critical!" );
							charHealthCurrent -= monAttackCurrent * 2;
							delay();
						}
						else {
							charHealthCurrent -= monAttackCurrent - charArmorCurrent;
							delay();
						}
					}	
					else {
					System.out.println( "Monster misses!" );
					delay();
					}
				
					// monster uses a spell
				} else if ( monChoiceAction == 2 ) {
					monChanceSpell = random(3);
					if ( monChanceSpell != 3 ) {
						if ( monMPCurrent == 0 ) {
							continue;
						}
						if ( monSpellCooldown > 0 ) {
							continue;
						} else if ( monChoiceSpell == 1 ) {
							System.out.println( "Monster uses " + monSpell );
							monHealthCurrent += 10;
							monMPCurrent -= 1;
							delay();
						} else if ( monChoiceSpell == 2 ) {
							System.out.println( "Monster uses " + monSpell );
							charHealthCurrent -= 6;
							charArmorCurrent = 0;
							monMPCurrent -= 1;
							monSpellCooldown = 3;
							delay();
						} else if ( monChoiceSpell == 3 ) {
							System.out.println( "Monster uses " + monSpell );
							charSpeed -= 1;
							monMPCurrent -= 1;
							monSpellCooldown = 3;
							delay();
						}
					} else {
						System.out.println( "Monster's spell fizzles" );
						monMPCurrent -= 1;
					}
				}
			if ( monSpellCooldown > 0 ) {	
			monSpellCooldown -= 1;	
			}
			charTurnNumber = 0;			
			}
		}
	// end of battle
		while ( charHealthCurrent <= 0 || monHealthCurrent <= 0 ) {
			if ( charHealthCurrent > monHealthCurrent ) {
				System.out.println( "You live to see another day!" );
			}
			else {
				System.out.println( "You're dead." );
			}
			break;
		}	
	}
	
	public static void delay() {
		try {
			Thread.sleep(1000);                 
		} catch(InterruptedException ex) {
   			Thread.currentThread().interrupt();
		}
	}
	
	public static int random( int a ) {
		return (int)((Math.random()*a)+1);
	}
	
	public static void stats( 	int charHealthCurrent, 	int charAttackCurrent, 
								int charSpeedCurrent, 	int charMPCurrent, 
								int charSpellCooldown,	int charArmorCurrent,
								int monAttackCurrent,	int monSpeedCurrent,
								int monArmorCurrent,	int monHealthCurrent,
								int monSpellCooldown,	int monMPCurrent,
								String charSpell,		String monSpell 	) {
	System.out.println();
	System.out.println( "Your stats:" );
	System.out.println( "\tHealth: " + charHealthCurrent );
	System.out.println( "\tAttack: " + charAttackCurrent );
	System.out.println( "\t Speed: " + charSpeedCurrent );
	System.out.println( "\t Armor: " + charArmorCurrent );
	System.out.println( "\t    MP: " + charMPCurrent );
	System.out.println();
	System.out.println( "\t Spell: " + charSpell );
	System.out.println( "\t Spell Cooldown: " + charSpellCooldown );
	System.out.println();
	System.out.println();
	System.out.println( "Monster stats:" );
	System.out.println( "\tHealth: " + monHealthCurrent );
	System.out.println( "\tAttack: " + monAttackCurrent );
	System.out.println( "\t Speed: " + monSpeedCurrent );
	System.out.println( "\t Armor: " + monArmorCurrent );
	System.out.println( "\t    MP: " + monMPCurrent );
	System.out.println();
	System.out.println( "\t Spell: " + monSpell );
	System.out.println( "\t Spell Cooldown: " + monSpellCooldown );
	System.out.println();
	
	delay();
	}		
}	