from animal import Animal


# # Farm
#
# - Reuse your `Animal` class
# - Create a `Farm` class
class Farm:
    #   - it has a list of Animals
    #   - it has a limit that defines how many animals can be kept in the Farm
    def __init__(self, animal_limit, animals=None):
        self.animal_limit = animal_limit
        if animals is None:
            self.animals = []
        else:
            self.animals = animals

    #   - it has two methods:
    #     - `breed()` -> creates a new animal if there's place for it
    #     - `sell()` -> removes the least hungry animal
    def breed(self):
        if len(self.animals) < self.animal_limit:
            self.animals.append(Animal())
        else:
            print("cattle is full")

    def sell(self):
        least_hungry_index = 0
        least_hunger = 100
        for i in range(len(self.animals)):
            if least_hunger > self.animals[i].hunger:
                least_hunger = self.animals[i].hunger
                least_hungry_index = i
        self.animals.pop(least_hungry_index)
