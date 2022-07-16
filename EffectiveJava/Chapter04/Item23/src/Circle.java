package Chapter04.Item23.src;

public class Circle extends Figure {

  private final double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  @Override
  public double area() {
    return Math.PI * (radius * radius);
  }
}
