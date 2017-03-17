//package lab02.character;
//import lab02.PokemonData;

import javax.lang.model.type.PrimitiveType;

/**
 * Created by jerry on 2017/3/7.
 */
public class PokemonTrainer extends NPC
{
    protected PokemonData pokemonData;

    //TODO solve the error
    public PokemonTrainer(String name, String job, String quote, PokemonData data)
    {
        //TODO call super constructor
        super(name, job, quote);
        //TODO assign attributes
        this.pokemonData = data;
    }
    public String getName()
    {
        return name;
    }
    public PokemonData getPokemon()
    {
        return pokemonData;
    }
    //TODO override toString()
    @Override
    public void showInformation()
    {
        super.showInformation();
        System.out.println("Pokemon :");
        pokemonData.showData();
        System.out.println();
    }
}
