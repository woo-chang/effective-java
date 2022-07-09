package Chapter04.Item15.src;

import java.util.List;

public class ThingFinalListWithOf {

  private static final Thing[] PRIVATE_VALUES = {new Thing("momitor"), new Thing("computer")};
  // 복사본이므로 변경에 영향을 받지 않는다.
  public static final List<Thing> VALUES = List.of(PRIVATE_VALUES);

  public void setValues() {
    PRIVATE_VALUES[0] = new Thing("mouse");
  }
}
