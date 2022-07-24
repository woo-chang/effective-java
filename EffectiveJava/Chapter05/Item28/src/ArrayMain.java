package Chapter05.Item28.src;

public class ArrayMain {

  public static void main(String[] args) {
    Object[] objectArr = new Long[1];
    // 런타임에 실패한다.
    // ArrayStoreException
    objectArr[0] = "타입이 다르다!";
  }

}
