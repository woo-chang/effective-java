package Chapter02.Item05.src;

public class Circle extends Figure {

  private final String name = "circle";
  public Circle(String color) {
    super(color);
  }

  public String getName() {
    return this.name;
  }

}
