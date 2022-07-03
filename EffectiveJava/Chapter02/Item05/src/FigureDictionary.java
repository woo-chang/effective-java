package Chapter02.Item05.src;

import java.util.function.Supplier;

public class FigureDictionary {

  private final Figure figure;

  public FigureDictionary(Supplier<? extends Figure> supplier) {
    this.figure = supplier.get();
  }

  public String colorMix() {
    return "Mixed Color : " + this.figure.getColor() + " + black";
  }

  public Figure getFigure() {
    return this.figure;
  }

}
