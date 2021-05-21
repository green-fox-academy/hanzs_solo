from car import Car
from station import Station

station = Station(172)
car1 = Car()
car2 = Car()

station.refill(car1)
station.refill(car2)

print(car1.gas_amount)
print(car2.gas_amount)
print(station.gas_amount)