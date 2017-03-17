Software Studio 2017 Spring Assignment02

1. Program Running Method : makefile (with Path of "java" and "javac" in Environment Variables)

2. Program Structure :
	
	"Player" extends "PokemonTrainer" extends "NPC" extends "AbstractCharacter(actually an abstract class)"
	Villager and Nurse are "NPC"s, but not a PokemonTrainer.

	I make the Player meet and random NPCs int the Main class, but react with the "react()" function in the Player class. As well, I have a "battle()" in it to enter a battle as one of the reaction of Player.

	In battle, Player can choose three options when in his/her turn :
		attack : attack challenger's pokmon with move of own pokemon
		check  : check the bag pack (only money availble)
		run    : run away from battle. But, there's only 1/3 possibility to succed.
				 In gerenal, players cannot run away from the battle with PokemonTrainers.

	NPCs :
	1. Roodney
		job    : Villager
		quote  : 
			"Hi! How's your Day?"
		action : give money to morris (at most $30)
	2. Billy Nare
		job    : Billonare
		quote  :
			"Hey, poor guy!"
			"I have lots of money but you don't. Hahaha."
		action : give money to morris (at most $500000)
	3. Joy
		job    : Nurse
		quote  :
			"Welcome to our Pokemon Center!"
			"We heal your Pokemon back to perfect health!" 
		action : heal your pokemon
	4. Satoshi
		job    : PokemonTrainer
		quote  :
			"I challenge you! Let's battle!!"
		action : battle
	5. RED
		job    : PokemonTrainer
		quote  :
			" ... ... "
		action : battle

3. Problems Encountered

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

	P.S.
	Exams from other subjects are coming, so I have little time to do with these assignments, cry cry QQ.