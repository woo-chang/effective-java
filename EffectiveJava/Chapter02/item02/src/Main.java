package Chapter02.item02.src;

import Chapter02.item02.src.NyPizza.Size;
import Chapter02.item02.src.Pizza.Topping;

public class Main {

  public static void main(String[] args) {
    Pizza pizza1 = new NyPizza.Builder(Size.SMALL).addTopping(Topping.SAUSAGE).build();
    System.out.println(pizza1);
    Pizza pizza2 = new Calzone.Builder().addTopping(Topping.HAM).build();
    System.out.println(pizza2);
  }
}
