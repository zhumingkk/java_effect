package jdk8;

import java.util.function.Supplier;

/**
 * @author zhu_ming
 * @since v_1.0 2020-11-20
 */
public class Car {

  public static Car create(final Supplier<Car> supper) {
    return supper.get();
  }

  public static void  xiaofei(final Car car) {
    System.out.println(car.toString());
  }


  public void repair() {
    System.out.println( "Repaired " + this.toString() );
  }

}