package Chapter03.Item14.src;

public class SuperCar extends Car {

  private int boost;

  public SuperCar(int wheel, int boost) {
    super(wheel);
    this.boost = boost;
  }

  @Override
  public String toString() {
    return "wheel : " + this.wheel + "/boost : " + this.boost;
  }

}
