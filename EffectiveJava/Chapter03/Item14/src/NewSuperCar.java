package Chapter03.Item14.src;

public class NewSuperCar implements Comparable<NewSuperCar> {

  private Car car;
  private int boost;

  public NewSuperCar(Car car, int boost) {
    this.car = car;
    this.boost = boost;
  }

  @Override
  public int compareTo(NewSuperCar newSuperCar) {
    if (this.car.compareTo(newSuperCar.car) == 0) {
      return boost - newSuperCar.boost;
    } else {
      return this.car.compareTo(newSuperCar.car);
    }
  }

  @Override
  public String toString() {
    return "wheel : " + this.car.wheel + "/boost : " + this.boost;
  }

}
