package Chapter02.item02.src;

public class BuilderPattern {

  private int param01;
  private int param02;
  private int param03;
  private int param04;
  private int param05;

  private BuilderPattern(Builder builder) {
    this.param01 = builder.param01;
    this.param02 = builder.param02;
    this.param03 = builder.param03;
    this.param04 = builder.param04;
    this.param05 = builder.param05;
  }

  public static class Builder {
    private int param01 = 0;
    private int param02 = 0;
    private int param03 = 0;
    private int param04 = 0;
    private int param05 = 0;

    public Builder() {}

    public Builder param01(int param01) {
      this.param01 = param01;
      return this;
    }

    public Builder param02(int param02) {
      this.param02 = param02;
      return this;
    }

    public Builder param03(int param03) {
      this.param03 = param03;
      return this;
    }

    public Builder param04(int param04) {
      this.param04 = param04;
      return this;
    }

    public Builder param05(int param05) {
      this.param05 = param05;
      return this;
    }

    public BuilderPattern build() {
      return new BuilderPattern(this);
    }
  }
}
