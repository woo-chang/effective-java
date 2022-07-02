package Chapter02.Item03.src;

public enum SingletonEnum {
  INSTANCE(3, "hello3");

  private final int intValue;
  private final String stringValue;

  SingletonEnum(int intValue, String stringValue) {
    this.intValue = intValue;
    this.stringValue = stringValue;
  }

  public int getIntValue() {
    return this.intValue;
  }

  public String getStringValue() {
    return this.stringValue;
  }
}
