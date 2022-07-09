package Chapter04.Item15.src;

import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    // 변경 가능성 존재
    ThingArray thingArray = new ThingArray();
    System.out.println(thingArray);
    thingArray.VALUES[0] = new Thing("mouse");
    System.out.println(thingArray);

    ThingFinalList thingFinalList = new ThingFinalList();
    System.out.println(thingFinalList.VALUES);
    thingFinalList.setValues();
    System.out.println(thingFinalList.VALUES);

    ThingFinalListWithOf thingFinalListWithOf = new ThingFinalListWithOf();
    System.out.println(thingFinalListWithOf.VALUES);
    thingFinalListWithOf.setValues();
    System.out.println(thingFinalListWithOf.VALUES);

    ThingArrayCopy thingArrayCopy = new ThingArrayCopy();
    System.out.println(Arrays.toString(thingArrayCopy.values()));
    thingArrayCopy.setValues();
    System.out.println(Arrays.toString(thingArrayCopy.values()));
  }

}
