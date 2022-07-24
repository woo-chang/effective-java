package Chapter04.Item33.src;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Favorites {
  //?가 알 수 없는 타입
  //중첩되어 있기에 Map이 매개변수화 된 것이 아닌 Key가 매개변수화
  //모든 키가 서로 다른 매개변수화 타입일 수 있다!
  private Map<Class<?>, Object> favorites = new HashMap<>();

  //value가 Object이므로 타입 링크 정보를 버려진다.
//  public <T> void putFavorite(Class<T> type, T instance) {
//    favorites.put(Objects.requireNonNull(type), instance);
//  }

  //로타입으로 주게되면 타입 안정성이 깨질 수 있기에 명시한 타입과 같은지 확인 후 넣도록 변경
  public <T> void putFavorite(Class<T> type, T instance) {
    favorites.put(Objects.requireNonNull(type), type.cast(instance));
  }

  //T를 반환해야 하기에 cast 메서드를 사용해서 T로 동적 형변환
  public <T> T getFavorite(Class<T> type) {
    return type.cast(favorites.get(type));
  }

}
