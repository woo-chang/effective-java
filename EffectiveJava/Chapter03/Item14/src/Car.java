package Chapter03.Item14.src;

public class Car implements Comparable<Car> {

  protected int wheel;

  public Car(int wheel) {
    this.wheel = wheel;
  }

  @Override
  public int compareTo(Car car) {
    return this.wheel - car.wheel;
  }

  @Override
  public String toString() {
    return "wheel : " + this.wheel;
  }
}
