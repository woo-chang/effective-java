package Chapter04.Item15.src;

public class ThingArray {

  public static final Thing[] VALUES = {new Thing("monitor"), new Thing("computer")};

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < VALUES.length; i++) {
      sb.append(VALUES[i].toString() + "/");
    }
    return sb.toString();
  }

}
