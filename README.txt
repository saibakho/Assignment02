Software Studio 2017 Spring Assignment02

1. Program Running Method : makefile (with Path of "java" and "javac" in Environment Variables)

2. Program Structure :
	
	"Player" extends "PokemonTrainer" extends "NPC" extends "AbstractCharacter(actually an abstract class)"
	Villager and Nurse are "NPC"s, but not a PokemonTrainer.

	I make the Player meet and random NPCs int the Main class, but react with the "react()" function in the Player class. As well, I have a "battle()" in it to enter a battle as one of the reaction of Player.

	Because somehow the PokemonData class is packed too big if we writes too many functions in it (I'm not sure how Java stores and calls the objects. Probably that makes it execute slowerer(?) ), I'm wondering if there's a way to modified the private variables from other classes.
	But it literally constradicts the concept of object oriented programming ...
	(Or by using the "protected" type ?)
	
	Like
		Nurse.healPokemon() {
			...
		}
		
		Or
		
		Villager.GiveMoney() {
			...
		}

	Not like
		PokemonData.getHealed() {
			currentHP = maxHP;
		}
		
		Or
		
		Player.getMony() {
			money = random.nextInt(30);
		}


3. Problems Encountered
	Exams from other subjects are coming, so I have little time to do with these assignments, cry cry QQ.