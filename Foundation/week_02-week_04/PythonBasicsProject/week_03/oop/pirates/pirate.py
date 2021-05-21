import secrets
import typing
from typing import *


class Pirate:
    def __init__(self):
        self.toxicity = 0
        self.is_alive = True
        self.have_parrot = False



    def drink_some_rum(self):
        if not self.is_alive:
            print("he's dead")
            return
        self.toxicity += 1

    def hows_it_going_mate(self):
        if not self.is_alive:
            print("he's dead")
            return
        if self.toxicity < 4:
            print("Pour me anudder.")
        else:
            print("Arghh, I'ma Pirate. How d'ya d'ink its goin?")
            self.toxicity = 0

    def brawl(self, opponent: str):
        if not self.is_alive or not opponent.is_alive:
            return
        rand = secrets.randbelow(3)
        if rand == 0:
            opponent.die()
        if rand == 1:
            self.die()
        if rand == 2:
            opponent.die()
            self.die()

    def die(self):
        self.is_alive = False

    def change_necklace_to_a_parrot(self):
        if not self.is_alive:
            print("he's dead")
            return
        self.have_parrot = True


class Ship:
    def __init__(self):
        self.crew = []
        self.captain = None
        self.max_men_capacity = 133

    def fill_ship(self):
        rand = secrets.randbelow(self.max_men_capacity - 1) + 1
        self.captain = Pirate()
        for i in range(rand):
            if len(self.crew) < self.max_men_capacity:
                self.crew.append(Pirate())

    def captain_status(self):
        if self.captain.is_alive:
            return "alive"
        else:
            return "dead"

    def count_alive(self):
        alive = 0
        for pirate in self.crew:
            if pirate.is_alive:
                alive += 1
        return alive

    def calculate_score(self):
        return self.count_alive() - self.captain.toxicity

    def battle(self, enemy_ship):
        print("--------------------------")
        print(" # attacker:")
        print(self)
        print(" # defender:")
        print(enemy_ship)
        print()
        if self.calculate_score() > enemy_ship.calculate_score():
            print("     *attacker won*")
            winner = self
            looser = enemy_ship
        else:
            print("     *defender won*")
            winner = enemy_ship
            looser = self

        looser.captain.brawl(winner.captain)

        # kill loosers
        rand_killer = secrets.randbelow(looser.count_alive())
        kill_counter = 0
        for pirate in looser.crew:
            if pirate.is_alive and kill_counter < rand_killer:
                pirate.is_alive = False
                kill_counter += 1

        # winners party
        if winner.captain.is_alive:
            rand_drinker = 1 + secrets.randbelow(4)
            for i in range(rand_drinker):
                winner.captain.drink_some_rum()
        for pirate in winner.crew:
            rand_drinker = 1 + secrets.randbelow(4)
            for i in range(rand_drinker):
                pirate.drink_some_rum()
        print()
        print(" # attacker:")
        print(self)
        print(" # defender:")
        print(enemy_ship)
        print("--------------------------")
        return winner == self

    def __str__(self):
        return str("This ship's captain is " + str(self.captain_status()) + "\n"
                   + "He consumed " + str(self.captain.toxicity) + " bottles of rum.\n"
                   + "There are " + str(self.count_alive()) + " alive pirates on this ship.")


class Armada:
    def __init__(self):
        self.fleet = []

    def war(self, enemy):
        s = 0
        e = 0
        while s < len(self.fleet) and e < len(enemy.fleet):
            result = self.fleet[s].battle(enemy.fleet[e])

            if result:
                e += 1
            else:
                s += 1
