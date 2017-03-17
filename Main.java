//package lab02;
//import lab02.character.NPC;
//import lab02.character.NPCGenerator;
//import lab02.character.AbstractCharacter;
//import lab02.character.PokemonTrainer;
import java.util.Random;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
	    NPCGenerator generator = new NPCGenerator();
        ArrayList<NPC> npcList = generator.getList();
        Random random = new Random();
        
        Player morris = new Player("Morris", "PokemonTrainer", "Magikarp! Use splash attack!!!",
                        new PokemonData(129, "Magikarp", "Water", "splash", 200, 10, 80), 0);
    //========================================================
        int isQuit = 0;
        while (isQuit == 0) {
            NPC curNpc = npcList.get(random.nextInt(npcList.size()));
            System.out.println("\n====================");
            System.out.println("{ Meet " + curNpc.getName() + " }\n");
            curNpc.showInformation();
            System.out.println("{ Talk, ignore, or quit ? }");
            System.out.print(">>> ");
            while ( ( isQuit = morris.react(curNpc) ) == 2);
        }
        System.out.println("Game over ...");
        System.out.println("You have $" + morris.getMoney() + " money.");
    }
}
