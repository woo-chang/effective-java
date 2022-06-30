package Chapter02.Item01.src;

public class Car implements Thing {
  private String color;

  private Car(String color) {
    this.color = color;
  }
  public static Car from(String color) {
    return new Car(color);
  }

  public void printColor() {
    System.out.println("Car color : " + this.color);
  }

}
