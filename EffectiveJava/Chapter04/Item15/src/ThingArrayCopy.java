package Chapter04.Item15.src;

public class ThingArrayCopy {

  private static final Thing[] PRIVATE_VALUES = {new Thing("momitor"), new Thing("computer")};
  // 방어적 복사
  public static final Thing[] values() {
    return PRIVATE_VALUES.clone();
  }

  public void setValues() {
    PRIVATE_VALUES[0] = new Thing("mouse");
  }

}
