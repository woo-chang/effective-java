package Chapter02.Item02.src;

public class TelescopingConstructorPattern {
  private int param01;
  private int param02;
  private int param03;
  private int param04;
  private int param05;

  public TelescopingConstructorPattern(int param01) {
    this(param01, 0);
  }

  public TelescopingConstructorPattern(int param01, int param02) {
    this(param01, param02, 0);
  }

  public TelescopingConstructorPattern(int param01, int param02, int param03) {
    this(param01, param02, param03, 0);
  }

  public TelescopingConstructorPattern(int param01, int param02, int param03, int param04) {
    this(param01, param02, param03, param04, 0);
  }

  public TelescopingConstructorPattern(int param01, int param02, int param03, int param04, int param05) {
    this.param01 = param01;
    this.param02 = param02;
    this.param03 = param03;
    this.param04 = param04;
    this.param05 = param05;
  }
}
