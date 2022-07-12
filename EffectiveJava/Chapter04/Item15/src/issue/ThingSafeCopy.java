package Chapter04.Item15.src.issue;

public class ThingSafeCopy {

  private static final Thing[] PRIVATE_VALUES = { new Thing("tv"), new Thing("phone") };
  public static final Thing[] values() {
    Thing[] things = new Thing[PRIVATE_VALUES.length];
    for (int i = 0; i < PRIVATE_VALUES.length; i++) {
      things[i] = PRIVATE_VALUES[i].clone();
    }
    return things;
    //return PRIVATE_VALUES.clone();
  }

  public Thing[] getThings() {
    return PRIVATE_VALUES;
  }

}