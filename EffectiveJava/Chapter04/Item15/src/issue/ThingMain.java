package Chapter04.Item15.src.issue;

public class ThingMain {

  public static void main(String[] args) {
    Thing[] copyThings = ThingSafeCopy.values();
    Thing[] originalThings = new ThingSafeCopy().getThings();

    System.out.println(copyThings);
    System.out.println(originalThings);

    copyThings[0].setName("book");
    System.out.println(copyThings[0]);
    System.out.println(originalThings[0]);

    copyThings[0] = new Thing("book");
    System.out.println(copyThings[0]);
    System.out.println(originalThings[0]);

    System.out.println(ThingNotSafe.VALUES[0]);
    ThingNotSafe.VALUES[0] = new Thing("book");
    System.out.println(ThingNotSafe.VALUES[0]);
  }

}
