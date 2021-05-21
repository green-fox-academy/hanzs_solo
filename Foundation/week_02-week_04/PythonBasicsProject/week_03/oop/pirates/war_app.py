from pirate import Armada, Ship
import secrets

armada1 = Armada()
armada2 = Armada()

for i in range(200):
    rand = secrets.randbelow(100)
    ship = Ship()
    ship.fill_ship()

    if rand % 2 == 0:
        armada1.fleet.append(ship)
    else:
        armada2.fleet.append(ship)

armada1.war(armada2)
