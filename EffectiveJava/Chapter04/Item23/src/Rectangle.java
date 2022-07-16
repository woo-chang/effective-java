package Chapter04.Item23.src;

public class Rectangle extends Figure {

  private final double length;
  private final double width;

  public Rectangle(double length, double width) {
    this.length = length;
    this.width = width;
  }

  @Override
  public double area() {
    return length * width;
  }

}
