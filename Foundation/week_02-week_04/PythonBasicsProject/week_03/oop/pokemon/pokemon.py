class Pokemon(object):
    def __init__(self, name, type, effective_against):
        self.name = name
        self.type = type
        self.effectiveAgainst = effective_against

    def is_effective_against(self, another_pokemon):
        return self.effectiveAgainst == another_pokemon.type


def initialize_pokemons():
    pokemon = []

    pokemon.append(Pokemon("Bulbasaur", "grass", "water"))
    pokemon.append(Pokemon("Pikachu", "electric", "water"))
    pokemon.append(Pokemon("Charizard", "fire", "grass"))
    pokemon.append(Pokemon("Pidgeot", "flying", "fighting"))
    pokemon.append(Pokemon("Kingler", "water", "fire"))

    return pokemon


pokemons = initialize_pokemons()


# Every pokemon has a name and a type.
# Certain types are effective against others, e.g. water is effective against fire.

def choose(pokemon_list, opponent):
    for pokemon in pokemon_list:
        if pokemon.is_effective_against(opponent):
            return pokemon.name


# Ash has a few pokemon.
# A wild pokemon appeared!

wild_pokemon = Pokemon("Oddish", "grass", "water")

# Which pokemon should Ash use?

print("I choose you, " + choose(pokemons, wild_pokemon))
