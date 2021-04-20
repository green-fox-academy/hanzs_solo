package Basics.OO.Pokemon;

import java.util.ArrayList;
import java.util.List;

public class Pokemon2 {
  String name;
  String type;
  String effectiveAgainst;
  int successRate;


  public Pokemon2(String name, String type, String effectiveAgainst) {
    this.name = name;
    this.type = type;
    this.effectiveAgainst = effectiveAgainst;
  }

  boolean isEffectiveAgainst(Pokemon2 anotherPokemon) {
    return this.effectiveAgainst.equals(anotherPokemon.type);
  }

  public List getBestPokemonAgainstOpponent(List<Pokemon2> pokemonList,
                                            Pokemon2 opponent, boolean defensive) {

    Pokemon2 currentPokemon;
    boolean opponentCounters;
    boolean weCounter;

    List<Pokemon2> bestPokemons = new ArrayList<>();

    for (int i = 0; i < pokemonList.size(); i++) {
      currentPokemon = pokemonList.get(i);
      opponentCounters = opponent.isEffectiveAgainst(currentPokemon);
      weCounter = currentPokemon.isEffectiveAgainst(opponent);

      //calling method
      ratingLogic(weCounter, opponentCounters, defensive);
    }

    return bestPokemons;
  }


  public void ratingLogic(boolean currentIsEffective, boolean opponentIsEffective,
                          boolean defensive) {

    if (defensive) {
      if (!opponentIsEffective && !currentIsEffective) {
        this.successRate = 2; //switched
      } else if (opponentIsEffective && currentIsEffective) {
        this.successRate = 1; //switched
      } else if (currentIsEffective) {
        this.successRate = 3;
      } else {
        this.successRate = 0;
      }
    } else {
      if (!opponentIsEffective && !currentIsEffective) {
        this.successRate = 1; //switched
      } else if (opponentIsEffective && currentIsEffective) {
        this.successRate = 2; //switched
      } else if (currentIsEffective) {
        this.successRate = 3;
      } else {
        this.successRate = 0;
      }
    }
  }
}