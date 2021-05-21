from fleet import Fleet
from thing import Thing

# - You have the `Thing` class
# - You have the `Fleet` class
# - You have the `fleet_of_things.py` file
# - Download those, use those
# - In the `fleet_of_things` file create a fleet
fleet = Fleet()

# Create a fleet of things to have this output:
# 1. [ ] Get milk
# 2. [ ] Remove the obstacles
# 3. [x] Stand up
# 4. [x] Eat lunch
thing1 = Thing("Get milk")
fleet.add(thing1)

thing2 = Thing("Remove obstacles")
fleet.add(thing2)

thing3 = Thing("Stand up")
thing3.complete()
fleet.add(thing3)

thing4 = Thing("Eat lunch")
thing4.complete()
fleet.add(thing4)

print(fleet)
