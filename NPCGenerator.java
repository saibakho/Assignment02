//package lab02.character;
//import lab02.PokemonData;

import java.util.ArrayList;

/**
 * Created by jerry on 2017/3/7.
 * In this practice you will see the power of polymorphism
 * practice to inherit and
 */
public class NPCGenerator {
    //no modifier is private
    private ArrayList<NPC> npcTemplates;
    public NPCGenerator()
    {
        npcTemplates = new ArrayList<NPC>();
        //TODO create some NPC and put into the template list. At least one for each type of character
        NPC npc_1 = new NPC("Roodney", "Villager", "Hi! How's your Day?");
        NPC npc_2 = new NPC("Joy", "Nurse", "Welcome to our Pokemon Center! ]\n    [ We heal your Pokemon back to perfect health!");
        PokemonTrainer trainer_1 = new PokemonTrainer("Satoshi", "PokemonTrainer", "I challenge you! Let's battle!!",
                                   new PokemonData(82, "Magneton", "Electric", "Zap Cannon", 500, 60, 70));
        npcTemplates.add(npc_1);
        npcTemplates.add(npc_2);
        npcTemplates.add(trainer_1);
    }

    //Try ctrl-N or command-N, click on Getter, you will see something useful
    //TODO write a public method to return npcTemplates
    public ArrayList<NPC> getList()
    {
    	return npcTemplates;
    }

}
