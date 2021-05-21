# # Animal
#
# - Create an `Animal` class
class Animal:
    #   - Every animal has a `hunger` value, which is a whole number
    #   - Every animal has a `thirst` value, which is a whole number
    #   - When creating a new animal instance these values must be set to the
    #     default `50` value
    def __init__(self):
        self.hunger = 50
        self.thirst = 50

    #   - Every animal can `eat()` which decreases its hunger by one
    #   - Every animal can `drink()` which decreases its thirst by one
    #   - Every animal can `play()` which increases both its hunger and thirst by one
    def eat(self):
        self.hunger -= 1

    def drink(self):
        self.thirst -= 1

    def play(self):
        self.hunger += 1
        self.thirst += 1
