package Basics.OO.Pokemon;


import java.util.List;
import java.util.Random;

public class Pokemon {
  String name;
  String type;
  String effectiveAgainst;


  Pokemon(String name, String type, String effectiveAgainst) {
    this.name = name;
    this.type = type;
    this.effectiveAgainst = effectiveAgainst;
  }

  public static Pokemon choosePokemonAgainstOpponent(List<Pokemon> pokemonList, Pokemon opponent) {

    int bestSuccessRate = 0;
    Pokemon bestPokemonForTask;
    for (Pokemon myPokemon : pokemonList) {
      boolean opponentCounters = false;
      boolean mineCounters = false;
      int successRate = 0;
      opponentCounters = opponent.isEffectiveAgainst(myPokemon);
      mineCounters = myPokemon.isEffectiveAgainst(opponent);

      if (!opponentCounters && !mineCounters) {
        successRate = 1;
      }else if (opponentCounters && mineCounters) {
        successRate = 2;
      }else if (opponentCounters) {
        successRate = 0;
      }else {
        successRate = 3;
      } 

      if (successRate > bestSuccessRate){
        bestSuccessRate = successRate;
        bestPokemonForTask = myPokemon;
      }
    }
    //in case we are fucked
    Random random = new Random();
    bestPokemonForTask = pokemonList.get(random.nextInt(pokemonList.size()-1));

    return bestPokemonForTask;
  }


  boolean isEffectiveAgainst(Pokemon anotherPokemon) {
    return this.effectiveAgainst.equals(anotherPokemon.type);
  }
}