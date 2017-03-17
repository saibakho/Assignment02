
import java.util.Random;
import java.util.Scanner;

public class Player extends PokemonTrainer
{
    private int money;
	public Player(String name, String job, String quote, PokemonData data, int money)
    {
        //TODO call super constructor
        super(name, job, quote, data);
        this.money = money;
    }
    public int getMoney()
    {
        return money;
    }
    // villager
    private void receiveMoney(String npcName)
    {
    	Random random = new Random();
        int temp = random.nextInt(30);
    	money += temp;
        System.out.println();
        System.out.println(npcName + " : ");
        System.out.println("    [You had better take this ...]");
        System.out.println("    [Have a nice day !]");
        System.out.println();
        System.out.println("<<< { [$" + temp + "] get! }");
    }
    // nurse
 	// call pokemonData.heal();
    // Trainer
    private void battle(String eName, PokemonData ePokemon)
    {
        Scanner stdin = new Scanner(System.in);
        Random random = new Random();
        String op = "";
        System.out.println("===================");
        System.out.println("BATTLE START!!!\n");

        PokemonData firstATK  = ePokemon.getSPD() >= pokemonData.getSPD() ? ePokemon : pokemonData ;
        PokemonData secondATK = ePokemon.getSPD() <  pokemonData.getSPD() ? ePokemon : pokemonData ;
        while (!firstATK.isFainted() && !secondATK.isFainted() && !op.toLowerCase().equals("quit"))
        {
            int choice = 1;
            if (firstATK == pokemonData) {
                choice = 0;
                System.out.println("{ Attack, check your bag, or run away ? }");
                System.out.print(">>> ");
                op = stdin.next();
                switch(op.toLowerCase()) {
                    case "check" :
                        System.out.println("{ You have [$" + money + "] in your bag }");
                        break;
                    case "attack" :
                        choice = 1;
                        break;
                    case "run" :
                        if (random.nextInt(30)%3 == 1) {
                            System.out.println("{ Run away successfully!! }");
                            ePokemon.healHP();
                            return;
                        } else {
                            System.out.println("{ You can't run away in the battle with a Trainer. }");
                            break;
                        }
                    default :
                        System.out.println("# unrecognized command.");
                        break;
                }
                System.out.println();
            }
            if (choice == 1) {
                System.out.println(">>> " + firstATK.getName() + " used " + firstATK.getMove() + " !!");
                secondATK.getHurt(firstATK.getATK());
                System.out.println("{ " + secondATK.getName() + " receives " + (int)firstATK.getATK() + " damage. }");
                System.out.println("{ " + secondATK.getName() + " has " + secondATK.getCurHP() + " left. }\n");

                PokemonData temp = firstATK;
                firstATK = secondATK;
                secondATK = temp;
            }
        }
        if (pokemonData.isFainted())    money = 0;
        System.out.println(">>> " + (ePokemon.isFainted() ? ePokemon.getName() : pokemonData.getName() ) + " fainted.");
        System.out.println("{ " + (ePokemon.isFainted() ? eName : "You") + " lost the battle and lost all the money. }");
        ePokemon.healHP();
    }
    public int react(NPC npc)
    {
    	Scanner stdin = new Scanner(System.in);
    	String op = stdin.next();
    	switch( op.toLowerCase() ) {
    		case "talk" :
    			//
    			switch (npc.getJob()) {
    				case "Villager" :
    					receiveMoney(npc.getName());
    					break;
    				case "Nurse" :
    					pokemonData.healHP();
                        System.out.println("{ Your " + pokemonData.getName() + "(" + pokemonData.getCurHP() + ") just recovered! }");
    					break;
    				case "PokemonTrainer" :
                        if (!pokemonData.isFainted()) {
                            battle(npc.name, ((PokemonTrainer)npc).pokemonData);
                        } else {
                            System.out.println("{ Your Pokemon just fainted. }");
                            System.out.println("{ Better get healed for the battle }");
                        }
    					break;
    			}
    			//
    			return 0;
    		case "ignore" :
    			return 0;
    		case "quit" :
    			return 1;
    		default :
    			System.out.println("unrecognized command.");
    			return 2;
    	}
    }
}