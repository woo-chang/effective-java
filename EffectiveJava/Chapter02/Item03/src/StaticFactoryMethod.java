package Chapter02.Item03.src;

public class StaticFactoryMethod {

  private static final StaticFactoryMethod INSTANCE = new StaticFactoryMethod();

  private int intValue;
  private String stringValue;

  private StaticFactoryMethod() {
    this.intValue = 2;
    this.stringValue = "hello2";
  }

  public static StaticFactoryMethod getInstance() {
    return INSTANCE;
  }

  public int getIntValue() {
    return this.intValue;
  }

  public String getStringValue() {
    return this.stringValue;
  }
}
