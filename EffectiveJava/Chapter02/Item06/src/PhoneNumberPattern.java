package Chapter02.Item06.src;

import java.util.regex.Pattern;

public class PhoneNumberPattern {

  // 불변 인스턴스를 생성해 캐싱해두고 인스턴스 재사용
  // 코드의 의미도 잘 드러나는 장점
  private static final Pattern PHONE = Pattern.compile("[0-9]{3}-[0-9]{4}-[0-9]{4}");

  public static void main(String[] args) {
    String test1 = "010-1234-5678";
    String test2 = "01-1234-5678";
    String test3 = "010-123-4567";
    String test4 = "01012345678";
    String test5 = "010-a234-5678";
    System.out.println(isPhoneNumber(test1));
    System.out.println(isPhoneNumber(test2));
    System.out.println(isPhoneNumber(test3));
    System.out.println(isPhoneNumber(test4));
    System.out.println(isPhoneNumber(test5));

    System.out.println("=======================");

    System.out.println(isPhoneNumberWithFinal(test1));
    System.out.println(isPhoneNumberWithFinal(test2));
    System.out.println(isPhoneNumberWithFinal(test3));
    System.out.println(isPhoneNumberWithFinal(test4));
    System.out.println(isPhoneNumberWithFinal(test5));
  }

  public static boolean isPhoneNumber(String s) {
    // 메서드 내부의 Pattern 인스턴스는 한번 쓰고 버려져서 매번 가비지 컬렉터의 대상
    return s.matches("[0-9]{3}-[0-9]{4}-[0-9]{4}");
  }

  public static boolean isPhoneNumberWithFinal(String s) {
    return PHONE.matcher(s).matches();
  }
}
