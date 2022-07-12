package Chapter04.Item15.src.issue;

public class Thing implements Cloneable {

  private String name;

  public Thing(String name) {
    this.name = name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "name : " + this.name;
  }

  @Override
  public Thing clone() {
    return new Thing(this.name);
  }
}
