package Chapter02.Item05.src;

public class Triangle extends Figure {

  private final String name = "triangle";

  public Triangle(String color) {
    super(color);
  }

  public String getName() {
    return this.name;
  }

}
