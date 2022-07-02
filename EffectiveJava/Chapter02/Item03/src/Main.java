package Chapter02.Item03.src;

public class Main {

  public static void main(String[] args) {
    StaticField staticField = StaticField.INSTANCE;
    System.out.println(staticField.getIntValue());
    System.out.println(staticField.getStringValue());
    StaticFactoryMethod staticFactoryMethod = StaticFactoryMethod.getInstance();
    System.out.println(staticFactoryMethod.getIntValue());
    System.out.println(staticFactoryMethod.getStringValue());
    SingletonEnum singletonEnum = SingletonEnum.INSTANCE;
    System.out.println(singletonEnum.getIntValue());
    System.out.println(singletonEnum.getStringValue());
  }
}
