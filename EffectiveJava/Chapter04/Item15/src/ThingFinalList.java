package Chapter04.Item15.src;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ThingFinalList {

  private static final Thing[] PRIVATE_VALUES = {new Thing("momitor"), new Thing("computer")};
  public static final List<Thing> VALUES = Collections.unmodifiableList(Arrays.asList(PRIVATE_VALUES));

  public void setValues() {
    PRIVATE_VALUES[0] = new Thing("mouse");
  }

}
