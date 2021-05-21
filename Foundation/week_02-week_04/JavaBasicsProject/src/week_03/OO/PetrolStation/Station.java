package week_03.OO.PetrolStation;

public class Station {
  int gasAmount;

  public void refill(Car car) {
    gasAmount -= car.capacity - car.gasAmount;
    car.gasAmount = car.capacity;
  }
}
