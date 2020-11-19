package chapter_5.ext;

import java.lang.reflect.Method;

/**
 *  ע�����
 * @author zhu_ming
 * @since v_1.0 2020-11-19
 */
@FirstAnnotation
@ThirdAnnotation(name="this is third annotation")
public class JavaBean {

  @SencodAnnotation("this is annotation")
  public void get(){
    System.out.println("ʹ����ע��");
  }


  public static void main(String[] args) {
    // �����ȡע��
    try {
      // ��ȡjavaBean��Class����
      Class<?> javaBean = Class.forName("chapter_5.ext.JavaBean");

      Method method = javaBean.getMethod("get");

      if(method.isAnnotationPresent(SencodAnnotation.class)){
        System.out.println("javaBean����������SencodAnnotationע�⣡");
        SencodAnnotation sencodAnnotation =  method.getAnnotation(SencodAnnotation.class);
        System.out.printf("sencodAnnotation value=== %s ", sencodAnnotation.value());
      }else{
        System.out.print("û��ʹ��ע��");
      }

    } catch (ClassNotFoundException | NoSuchMethodException e) {
      e.printStackTrace();
    }
  }
}
