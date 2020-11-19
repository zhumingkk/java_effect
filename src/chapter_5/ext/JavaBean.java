package chapter_5.ext;

import java.lang.reflect.Method;

/**
 *  注解测试
 * @author zhu_ming
 * @since v_1.0 2020-11-19
 */
@FirstAnnotation
@ThirdAnnotation(name="this is third annotation")
public class JavaBean {

  @SencodAnnotation("this is annotation")
  public void get(){
    System.out.println("使用了注解");
  }


  public static void main(String[] args) {
    // 反射获取注解
    try {
      // 获取javaBean的Class对象
      Class<?> javaBean = Class.forName("chapter_5.ext.JavaBean");

      Method method = javaBean.getMethod("get");

      if(method.isAnnotationPresent(SencodAnnotation.class)){
        System.out.println("javaBean类上配置了SencodAnnotation注解！");
        SencodAnnotation sencodAnnotation =  method.getAnnotation(SencodAnnotation.class);
        System.out.printf("sencodAnnotation value=== %s ", sencodAnnotation.value());
      }else{
        System.out.print("没有使用注解");
      }

    } catch (ClassNotFoundException | NoSuchMethodException e) {
      e.printStackTrace();
    }
  }
}
