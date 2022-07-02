package Chapter02.Item03.src;

public class StaticField {

  public static final StaticField INSTANCE = new StaticField();

  private int intValue;
  private String stringValue;
  private StaticField() {
    this.intValue = 1;
    this.stringValue = "hello1";
  }

  public int getIntValue() {
    return this.intValue;
  }

  public String getStringValue() {
    return this.stringValue;
  }
}
