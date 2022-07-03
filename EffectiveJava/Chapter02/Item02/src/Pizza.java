package Chapter02.item02.src;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

public abstract class Pizza {
  public enum Topping { HAM, MUSHROOM, ONION, PEPPER, SAUSAGE }
  final Set<Topping> toppings;

  // 상한 제한을 두는 것
  // 나의 Builder를 구현한 Builder
  abstract static class Builder<T extends Builder<T>> {
    // EnumSet은 abstract 클래스이기 때문에 객체 생성 불가능
    // noneOf(Class) : Enum을 다루는 Set으로 비어있는 Set 반환
    // allOf(Class) : Enum을 다루는 Set으로 모든 값을 담고있는 Set 반환
    EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);
    // 제네릭 타입을 이용해 구현 빌더를 반환할 수 있도록 한다.
    public T addTopping(Topping topping) {
      // null인 경우 NullPointerException
      // 아닌 경우 해당 Object 리턴
      // 명시성과 빠른 실패를위해서 사용
      toppings.add(Objects.requireNonNull(topping));
      return self();
    }

    // 상위 타입으로 지정하여 하위 타입이 반환할 수 있도록 하는 것이 공변 반환 타이핑
    abstract Pizza build();

    // 하위 클래스는 이 메서드를 재정의 하여 this를 반환하도록
    protected abstract T self();
  }

  Pizza(Builder<?> builder) {
    toppings = builder.toppings.clone();
  }

}
