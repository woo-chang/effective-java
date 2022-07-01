package Chapter02.item02.src;

import Chapter02.item02.src.Pizza.Builder;

public class Calzone extends Pizza {
  private final boolean sauceInside;

  public static class Builder extends Pizza.Builder<Builder> {
    private boolean sauceInside = false;

    public Builder sauceInside() {
      sauceInside = true;
      return this;
    }

    @Override
    public Calzone build() {
      return new Calzone(this);
    }

    @Override
    protected Builder self() {
      return this;
    }
  }

  private Calzone(Builder builder) {
    super(builder);
    sauceInside = builder.sauceInside;
  }

  public String toString() {
    String str = "";
    for (Topping topping : toppings) {
      str += topping + "/";
    }
    str += sauceInside;
    return str;
  }
}
