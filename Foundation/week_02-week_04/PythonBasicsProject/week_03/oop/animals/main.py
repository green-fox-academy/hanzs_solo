from animals import Farm
from animals import Animal

# an_list = [Animal,Animal,Animal()]

farm_1 = Farm(8)
farm_1.animals = []
for i in range(11):
    farm_1.breed()

print(len(farm_1.animals))
farm_1.animals[4].play()
print(farm_1.animals[4].hunger)
farm_1.animals[1].eat()
print(farm_1.animals[1].hunger)
farm_1.sell()
print(len(farm_1.animals))
for animal in farm_1.animals:
    print(animal.hunger)


