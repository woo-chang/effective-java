package Chapter02.Item01.src;

public class House implements Thing {
  private String color;

  private House(String color) {
    this.color = color;
  }

  public static House from(String color) {
    return new House(color);
  }

  public void printColor() {
    System.out.println("House Color : " + this.color);
  }
}
