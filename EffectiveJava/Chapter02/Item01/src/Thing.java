package Chapter02.Item01.src;

public interface Thing {

  public static Thing getInstance(String type, String color) {
    if (type.equals("car")) {
      return Car.from(color);
    } else if (type.equals("house")) {
      return House.from(color);
    } else {
      return null;
    }
  }

  public void printColor();

}
