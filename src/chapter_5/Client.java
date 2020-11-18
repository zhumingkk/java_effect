package chapter_5;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhu_ming
 * @since v_1.0 2020-11-18
 */
public class Client {

 @Test
  public static void get(){
   System.out.println("get");

  }

  @Test
  public static void getExcption(){
    System.out.println("getExcption");
    throw new RuntimeException("crash");

  }

  @ExceptionTest({IndexOutOfBoundsException.class,NullPointerException.class})
  public static void doublyBad(){
    List<String> list = new ArrayList<>();
    list.addAll(4,null);
  }

  public static void main(String[] args) {
//    get();
//    getExcption();
    doublyBad();
  }

}
