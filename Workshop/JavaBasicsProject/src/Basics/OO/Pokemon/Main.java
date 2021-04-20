/*
package Basics.OO.Pokemon;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
  public static void main(String[] args) {
    List<Pokemon2> pokemonListOfAsh = initializePokemons();

    // Every pokemon has a name and a type.
    // Certain types are effective against others, e.g. water is effective against fire.

    // Ash has a few pokemon.
    // A wild pokemon appeared!
    Pokemon2 wildPokemon = new Pokemon2("Oddish", "leaf", "water");

    // Which pokemon should Ash use?
    // Write the necessary code to get the name of the right pokemon and print it:
    Random random = new Random();
    //List<Pokemon> bestPokemonsAgaintOpponent = new ArrayList<>(Pokemon.getBestPokemonAgainstOpponent(pokemonListOfAsh,wildPokemon,true));

    //getBestPokemonAgainstOpponent(pokemonListOfAsh, wildPokemon);
    System.out
        .print(
            "I choose you, " +bestPokemonsAgaintOpponent.get(random.nextInt(bestPokemonsAgaintOpponent.size()-1)));
  }
//  public static Pokemon getBestPokemonAgainstOpponent(List<Pokemon> pokemonList,
//                                                      Pokemon opponent) {
//    Pokemon bestPokemonAgainstOpponent;
//    for (Pokemon currentPokemon : pokemonList) {
//      if (currentPokemon.effectiveAgainst.equals(opponent.type)) {
//        bestPokemonAgainstOpponent = currentPokemon;
//        return bestPokemonAgainstOpponent;
//      }
//    }
//    return null;
//  }



//  public static Pokemon iChooseYou(ArrayList pokemonList,Pokemon opponent){
//
//
//
//    return bestPokemonForThisTask;
//  }


  private static List<Pokemon2> initializePokemons() {
    List<Pokemon2> pokemon = new ArrayList<>();

    pokemon.add(new Pokemon2("Balbasaur", "leaf", "water"));
    pokemon.add(new Pokemon2("Pikatchu", "electric", "water"));
    pokemon.add(new Pokemon2("Charizard", "fire", "leaf"));
    pokemon.add(new Pokemon2("Balbasaur", "water", "fire"));
    pokemon.add(new Pokemon2("Kingler", "water", "fire"));

    return pokemon;
  }
}
*/
