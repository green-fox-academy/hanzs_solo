# - `Station`
#   - it stores how much gas is avaliable: `gas_amount`
#   - it can refill a car: `refill(car)`:
#     - decreases the gas_amount by the capacity of the car
#       (let us suppose that the car is empty) and
#     - increases the car's gas_amount

class Station():
    def __init__(self, gas_amount):
        self.gas_amount = gas_amount

    def refill(self, car):
        if (car.capacity - car.gas_amount) < self.gas_amount:
            self.gas_amount -= car.capacity - car.gas_amount
            car.gas_amount = car.capacity
        else:
            car.gas_amount += self.gas_amount
            self.gas_amount = 0
