package jdk8;

/**
 * 类型推断
 * @author zhu_ming
 * @since v_1.0 2020-11-20
 */
public class Value<T> {

  public static <T> T defaultValue(){
    return null;
  }

  public T getOrdefault(T value ,T defaultValue){
    return (value !=null ) ? value : defaultValue;
  }
}
