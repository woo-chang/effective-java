package Chapter04.Item15.src;

public class Thing {

  private final String name;

  public Thing(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return this.name;
  }
}
