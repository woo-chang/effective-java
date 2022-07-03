package Chapter02.Item05.src;

public class ResouceFactory {

  public static void main(String[] args) {
    FigureDictionary figureDictionary1 = new FigureDictionary(() -> new Circle("red"));
    FigureDictionary figureDictionary2 = new FigureDictionary(() -> new Square("blue"));
    FigureDictionary figureDictionary3 = new FigureDictionary(() -> new Triangle("yellow"));
    System.out.println(figureDictionary1.colorMix());
    System.out.println(figureDictionary2.colorMix());
    System.out.println(figureDictionary3.colorMix());

    System.out.println(((Circle)figureDictionary1.getFigure()).getName());
    System.out.println(((Square)figureDictionary2.getFigure()).getName());
    System.out.println(((Triangle)figureDictionary3.getFigure()).getName());
  }

}