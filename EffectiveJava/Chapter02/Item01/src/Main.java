package Chapter02.Item01.src;

public class Main {

  public static void main(String[] args) {
    Thing thing = Thing.getInstance("car", "red");
    thing.printColor();
    thing = Thing.getInstance("house", "blue");
    thing.printColor();
    // NullPointerException
    // thing = Thing.getInstance("cloth", "yellow");
    // thing.printColor();
  }
}
